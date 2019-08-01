package com.trilogyed.tasker.service;

import com.trilogyed.tasker.dao.TaskerDao;
import com.trilogyed.tasker.dao.TaskerDaoJdbcTemplateImpl;
import com.trilogyed.tasker.model.Task;
import com.trilogyed.tasker.model.TaskViewModel;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.DefaultServiceInstance;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.client.RestTemplate;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class TaskerServiceLayerTest {

    @Autowired
    private DiscoveryClient discoveryClient;

    private RestTemplate restTemplate ;

    @Value("${adServerServiceName}")
    private String adServerServiceName;

    @Value("${serviceProtocol}")
    private String serviceProtocol;

    @Value("${servicePath}")
    private String servicePath;

    private TaskerDao taskerDao;
    private TaskerServiceLayer service;

    @Before
    public void setUp() throws Exception {

        setUpTaskerDaoMock();
        setUpRestTemplateMock();
        setUpDiscoveryClientMock();

        service = new TaskerServiceLayer(taskerDao, discoveryClient, restTemplate, "adserver-service", "http://", "/ad");
    }

    private void setUpTaskerDaoMock() {
        taskerDao = mock(TaskerDaoJdbcTemplateImpl.class);
        Task task = new Task();
        task.setId(8);
        task.setDescription("Description");
        task.setCreateDate(LocalDate.of(2016, 6, 8));
        task.setDueDate(LocalDate.of(2019, 5, 24));
        task.setCategory("Important");

        Task task1 = new Task();
        //task1.setId(22);
        task1.setDescription("Description");
        task1.setCreateDate(LocalDate.of(2016, 6, 8));
        task1.setDueDate(LocalDate.of(2019, 5, 24));
        task1.setCategory("Important");

        List<Task> taskList = new ArrayList<>();
        taskList.add(task);

        doReturn(task).when(taskerDao).createTask(task1);
        doReturn(task).when(taskerDao).getTask(8);
        doReturn(taskList).when(taskerDao).getAllTasks();
        doReturn(taskList).when(taskerDao).getTasksByCategory("Important");
    }

    private void setUpRestTemplateMock() {
        restTemplate = mock(RestTemplate.class);

        doReturn("Empire Szechuan").when(restTemplate).getForObject("http://localhost:6107/ad", String.class);
    }

    private void setUpDiscoveryClientMock() {
        discoveryClient = mock(DiscoveryClient.class);

        List<ServiceInstance> instances = new LinkedList<>();

        DefaultServiceInstance defaultServiceInstance = new DefaultServiceInstance("", "", "localhost", 6107, true);
        instances.add(defaultServiceInstance);

        doReturn(instances).when(discoveryClient).getInstances("adserver-service");
    }

    @Test
    public void saveFetchTask() {
        TaskViewModel taskViewModel = new TaskViewModel();
        taskViewModel.setDescription("Description");
        taskViewModel.setCreateDate(LocalDate.of(2016, 6, 8));
        taskViewModel.setDueDate(LocalDate.of(2019, 5, 24));
        taskViewModel.setCategory("Important");
        taskViewModel.setAdvertisement("Empire Szechuan");

        taskViewModel = service.saveTask(taskViewModel);
        TaskViewModel fromService = service.fetchTask(8);
        assertEquals(taskViewModel, fromService);
    }


    @Test
    public void fetchAllTasks() {
        TaskViewModel serviceTask = new TaskViewModel();
        serviceTask = service.fetchTask(8);

        TaskViewModel task = new TaskViewModel();

        task.setId(8);
        task.setDescription("Description");
        task.setCreateDate(LocalDate.of(2016, 6, 8));
        task.setDueDate(LocalDate.of(2019, 5, 24));
        task.setCategory("Important");
        task.setAdvertisement("Empire Szechuan");

        task = service.saveTask(task);

        List<TaskViewModel> taskList = service.fetchAllTasks();
        assertEquals(1, taskList.size());
    }


    @Test
    public void fetchTasksByCategory() {
        TaskViewModel task = new TaskViewModel();
        task.setId(8);
        task.setDescription("Description");
        task.setCreateDate(LocalDate.of(2016, 6, 8));
        task.setDueDate(LocalDate.of(2019, 5, 24));
        task.setCategory("Important");
        task.setAdvertisement("Empire Szechuan");
        task = service.saveTask(task);

        List<TaskViewModel> tList = service.fetchTasksByCategory("Important");

        assertEquals(1, tList.size());
        assertEquals(task, tList.get(0));

//        assertEquals(tList.size(), 1);
//        assertEquals(tList.get(0), tList);
    }


    //    @Test
//    public void saveTask() {
//    }

//    @Test
//    public void deleteTask() {
//        taskerDao.deleteTask(task.setId());
//    }


//    @Test
//    public void updateTask() {
//        Task task = new Task();
//        task.setId(8);
//        task.setDescription("Description");
//        task.setCreateDate(LocalDate.of(2016, 6, 8));
//        task.setDueDate(LocalDate.of(2019, 5, 24));
//        task.setCategory("Important");
//
//        task = taskerDao.createTask(task);
//        task = new Task();
//        task.setId(32);
//        task.setDescription("Description");
//        task.setCreateDate(LocalDate.of(2016, 6, 8));
//        task.setDueDate(LocalDate.of(2019, 5, 24));
//        task.setCategory("Important");
//        task = taskerDao.createTask(task);
//        taskerDao.updateTask(task);
//
//        Task task2 = taskerDao.getTask(task.getId());
//        assertEquals(task2, task);
//    }






}