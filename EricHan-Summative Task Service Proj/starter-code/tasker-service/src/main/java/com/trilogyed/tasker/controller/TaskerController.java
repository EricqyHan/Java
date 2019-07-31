package com.trilogyed.tasker.controller;

import com.trilogyed.tasker.dao.TaskerDao;
import com.trilogyed.tasker.model.Task;
import com.trilogyed.tasker.service.TaskerServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RefreshScope
public class TaskerController {

//    @Autowired
//    TaskerDao taskerDao;
//
//    @Autowired
//    TaskerServiceLayer service;
//
//    public TaskerController(TaskerServiceLayer service) {
//        this.service = service;
//    }
//
//    @RequestMapping(value = "/tasks{id}", method = RequestMethod.DELETE)
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void deleteTask(@PathVariable int id) {
//        taskerDao.deleteTask(id);
//    }
//
//    @RequestMapping (value = "/task{id}", method = RequestMethod.GET)
//    @ResponseStatus(HttpStatus.OK)
//    public Task getTask(@PathVariable int id) {
//        return taskerDao.getTask(id);
//    }
//
//    @RequestMapping (value = "/task{id}", method = RequestMethod.GET)
//    @ResponseStatus(HttpStatus.OK)
//    public List<Task> getAllTasks() {
//        return taskerDao.getAllTasks();
//    }
//
//    @RequestMapping (value = "/tasks{id}", method = RequestMethod.GET)
//    @ResponseStatus (HttpStatus.OK)
//    public  List<Task> getTasksByCategory(String category) {
//        return taskerDao.getTasksByCategory(category);
//    }
//
//
//    @RequestMapping(value = "/tasks", method = RequestMethod.POST)
//    @ResponseStatus(value = HttpStatus.CREATED)
//    public Task createdTask(@RequestBody @Valid Task task) {
//        taskerDao.createTask(task);
//
//        return task;
//    }
//
//    @RequestMapping(value = "/tasks{id}", method = RequestMethod.DELETE)
//    @ResponseStatus(HttpStatus.OK)
//    public void updateTask(@PathVariable Task task) {
//        taskerDao.updateTask(task);
//    }

}
