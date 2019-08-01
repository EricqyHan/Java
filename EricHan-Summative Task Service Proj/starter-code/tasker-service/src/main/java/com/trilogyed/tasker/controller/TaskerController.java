package com.trilogyed.tasker.controller;

import com.trilogyed.tasker.service.TaskerServiceLayer;
import com.trilogyed.tasker.model.TaskViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RefreshScope
public class TaskerController {

    @Autowired
    TaskerServiceLayer service;

    public TaskerController(TaskerServiceLayer service) {
        this.service = service;
    }

    @RequestMapping(value = "/tasks/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTask(@PathVariable("id") int id) {
        service.deleteTask(id);
    }

    @RequestMapping (value = "/tasks/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public TaskViewModel getTask(@PathVariable("id") int id) {
        if (id < 1) {
            throw new IllegalArgumentException("Task id must be greater than 0.");
        }
        return service.fetchTask(id);
    }

    @RequestMapping (value = "/tasks", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<TaskViewModel> getAllTasks() {
        return service.fetchAllTasks();
    }

    @RequestMapping (value = "/tasks/category/{category}", method = RequestMethod.GET)
    @ResponseStatus (HttpStatus.OK)
    public  List<TaskViewModel> getTasksByCategory(@PathVariable("category") String category) {
        return service.fetchTasksByCategory(category);
    }


    @RequestMapping(value = "/tasks", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public TaskViewModel createdTask(@RequestBody @Valid TaskViewModel taskViewModel) {
        service.saveTask(taskViewModel);

        return taskViewModel;
    }


    @RequestMapping(value = "/tasks/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void updateTask(@RequestBody TaskViewModel taskViewModel, @PathVariable int id) {
        if(id!=taskViewModel.getId()){
            throw new IllegalArgumentException();
        }
        service.updateTask(taskViewModel);
    }


}
