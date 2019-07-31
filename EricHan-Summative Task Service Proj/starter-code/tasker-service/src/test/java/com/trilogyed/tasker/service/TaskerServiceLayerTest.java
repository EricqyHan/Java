package com.trilogyed.tasker.service;

import com.trilogyed.tasker.dao.TaskerDao;
import com.trilogyed.tasker.dao.TaskerDaoJdbcTemplateImpl;
import com.trilogyed.tasker.model.Task;
import com.trilogyed.tasker.viewmodel.TaskViewModel;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TaskerServiceLayerTest {


    TaskerDao taskerDao;
    TaskerServiceLayer service;

    @Before
    public void setUp() throws Exception {
        setUpTaskerDaoMock();
        service = new TaskerServiceLayer(taskerDao);
    }


    @Test
    public void saveFetchTask() {
        TaskViewModel taskViewModel = new TaskViewModel();
        taskViewModel.setId(8);
        taskViewModel.setDescription("Description");
        taskViewModel.setCreateDate(LocalDate.of(2016, 6, 8));
        taskViewModel.setDueDate(LocalDate.of(2019, 5, 24));
        taskViewModel.setCategory("Important");

        taskViewModel = service.saveTask(taskViewModel);
        TaskViewModel fromService = service.fetchTask(taskViewModel.getId());
        assertEquals(taskViewModel, fromService);
    }


    @Test
    public void fetchAllTasks() {
        Task task = new Task();
        task.setDescription("Description");
        task.setCreateDate(LocalDate.of(2016, 6, 8));
        task.setDueDate(LocalDate.of(2019, 5, 24));
        task.setCategory("Important");
        taskerDao.createTask(task);

        task = new Task();
        task.setDescription("Description");
        task.setCreateDate(LocalDate.of(2016, 6, 8));
        task.setDueDate(LocalDate.of(2019, 5, 24));
        task.setCategory("Important");
        taskerDao.createTask(task);

        List<Task> taskList = taskerDao.getAllTasks();
        assertEquals(taskList.size(), 2);
    }


    @Test
    public void fetchTasksByCategory() {
        Task task = new Task();
        task.setDescription("Description");
        task.setCreateDate(LocalDate.of(2016, 6, 8));
        task.setDueDate(LocalDate.of(2019, 5, 24));
        task.setCategory("Important");
        taskerDao.createTask(task);

        task = new Task();
        task.setDescription("Description");
        task.setCreateDate(LocalDate.of(2016, 6, 8));
        task.setDueDate(LocalDate.of(2019, 5, 24));
        task.setCategory("Important");
        taskerDao.createTask(task);

        task = new Task();
        task.setDescription("Description");
        task.setCreateDate(LocalDate.of(2016, 6, 8));
        task.setDueDate(LocalDate.of(2019, 5, 24));
        task.setCategory("Important");

        taskerDao.createTask(task);
        List<Task> tList = taskerDao.getTasksByCategory("Important");
        assertEquals(2, tList.size());

        tList = taskerDao.getTasksByCategory("Not Important");
        assertEquals(0, tList.size());
    }


    //    @Test
//    public void saveTask() {
//    }

//    @Test
//    public void deleteTask() {
//        taskerDao.deleteTask(task.setId());
//    }


    @Test
    public void updateTask() {
        Task task = new Task();
        task.setId(8);
        task.setDescription("Description");
        task.setCreateDate(LocalDate.of(2016, 6, 8));
        task.setDueDate(LocalDate.of(2019, 5, 24));
        task.setCategory("Important");

        task = taskerDao.createTask(task);
        task = new Task();
        task.setId(32);
        task.setDescription("Description");
        task.setCreateDate(LocalDate.of(2016, 6, 8));
        task.setDueDate(LocalDate.of(2019, 5, 24));
        task.setCategory("Important");
        task = taskerDao.createTask(task);
        taskerDao.updateTask(task);
        Task task2 =  taskerDao.getTask(task.getId());
        assertEquals(task2, task);
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
        doReturn(task).when(taskerDao).getTask(5);
        doReturn(taskList).when(taskerDao).getAllTasks();
        doReturn(taskList).when(taskerDao).getTasksByCategory(task.getCategory());
    }

}