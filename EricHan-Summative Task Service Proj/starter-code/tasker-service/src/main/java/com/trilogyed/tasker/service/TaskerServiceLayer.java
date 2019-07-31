package com.trilogyed.tasker.service;

import com.trilogyed.tasker.dao.TaskerDao;
import com.trilogyed.tasker.model.Task;
import com.trilogyed.tasker.viewmodel.TaskViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Component
public class TaskerServiceLayer {
    TaskerDao taskerDao;
    @Autowired
    private DiscoveryClient discoveryClient;
    private RestTemplate restTemplate = new RestTemplate();
    @Value("${myAdServiceName}")
    private String myAdServiceName;
    @Value("${serviceProtocol}")
    private String serviceProtocol;
    @Value("${servicePath}")
    private String servicePath;
    public String makeAd(){
        List<ServiceInstance> instances = discoveryClient.getInstances(myAdServiceName);
        String randomAdServiceUri = serviceProtocol + instances.get(0).getHost() + ":" + instances.get(0).getPort() + servicePath;
        System.out.println(instances.get(0).getHost());
        String ad = restTemplate.getForObject(randomAdServiceUri, String.class);
        return ad;
    }


    @Autowired
    public TaskerServiceLayer(TaskerDao taskerDao) {
        this.taskerDao = taskerDao;
    }


    public TaskViewModel fetchTask(int id) {
        Task task = taskerDao.getTask(id);
        TaskViewModel tvm = new TaskViewModel();
        tvm.setId(task.getId());
        tvm.setDescription(task.getDescription());
        tvm.setCreateDate(task.getCreateDate());
        tvm.setDueDate(task.getDueDate());
        tvm.setCategory(task.getCategory());
        // TODO - get ad from Adserver and put in tvm
        return tvm;
    }


    public List<TaskViewModel> fetchAllTasks() {
        List<Task> taskList = taskerDao.getAllTasks();
        List<TaskViewModel> taskViewModelList = new ArrayList<>();
        taskList.stream()
                .forEach(task -> {
                    TaskViewModel tvm = buildTaskViewModel(task);
                    taskViewModelList.add(tvm);
                });
        return taskViewModelList;
    }


    public List<TaskViewModel> fetchTasksByCategory(String category) {
        List<Task> taskList = taskerDao.getTasksByCategory(category);
        List<TaskViewModel> taskViewModelList = new ArrayList<>();
        taskList.stream()
                .forEach(task -> {
                    TaskViewModel tvm = buildTaskViewModel(task);
                    taskViewModelList.add(tvm);
                });
        return taskViewModelList;
    }


    public TaskViewModel saveTask(TaskViewModel taskViewModel) {
        Task task = new Task();
        task.setDescription(task.getDescription());
        task.setCreateDate(taskViewModel.getCreateDate());
        task.setDueDate(taskViewModel.getDueDate());
        task.setCategory(taskViewModel.getCategory());
        task = taskerDao.createTask(task);
        taskViewModel.setId(task.getId());
        // TODO - get ad from Adserver and put in taskViewModel
        return taskViewModel;
    }


    public void deleteTask(int id) {
        taskerDao.deleteTask(id);
    }


    public void updateTask(TaskViewModel taskViewModel) {
        Task task = new Task();
        task.setId(taskViewModel.getId());
        task.setDescription(taskViewModel.getDescription());
        task.setCreateDate(taskViewModel.getCreateDate());
        task.setDueDate(taskViewModel.getDueDate());
        task.setCategory(taskViewModel.getCategory());
        taskerDao.updateTask(task);
    }


    private TaskViewModel buildTaskViewModel(Task task) {
        TaskViewModel taskViewModel = new TaskViewModel();
        taskViewModel.setId(task.getId());
        taskViewModel.setDescription(task.getDescription());
        taskViewModel.setCreateDate(task.getCreateDate());
        taskViewModel.setDueDate(task.getDueDate());
        taskViewModel.setCategory(task.getCategory());
        return taskViewModel;
    }

}
