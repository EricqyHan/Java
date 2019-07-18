package com.company.EHanU1Capstone.controller;

import com.company.EHanU1Capstone.model.Console;
import com.company.EHanU1Capstone.service.ServiceLayer;
import com.company.EHanU1Capstone.viewmodel.ConsoleViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/console")
public class ConsoleController {

    @Autowired
    ServiceLayer serviceLayer;

    @PostMapping//Another way to set the Rest API Post mapping
    @ResponseStatus(HttpStatus.CREATED)
    public ConsoleViewModel createConsole(@RequestBody @Valid ConsoleViewModel console) {
        return serviceLayer.saveConsole(console);
    }

    @GetMapping// to see the REST API
    @ResponseStatus(HttpStatus.OK)
    public List<ConsoleViewModel> getAllconsole(){
        return serviceLayer.findAllConsoles();
    }

    @GetMapping("/{id}")//Another way to set the Rest API Get mapping
    @ResponseStatus(HttpStatus.OK)
    public ConsoleViewModel getConsole(@PathVariable("id") int consoleId) {
        ConsoleViewModel customerViewModel = serviceLayer.findConsolesbyId(consoleId);
        if (customerViewModel == null)
            throw new IllegalArgumentException("Customer could not be retrieved for id " + consoleId);
        return customerViewModel;
    }

    @DeleteMapping("/{id}")//Another way to set the Rest API Delete mapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteConsole(@PathVariable("id") int customerId) {
        serviceLayer.removeConsole(customerId);
    }

    @PutMapping("/{id}")//Another way to set the Rest API Put mapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateConsole(@PathVariable("id") int consoleId, @RequestBody @Valid ConsoleViewModel consoleViewModel) {
        if (consoleViewModel.getConsoleID() == 0)
            consoleViewModel.setConsoleID(consoleId);
        if (consoleId != consoleViewModel.getConsoleID()) {
            throw new IllegalArgumentException("Customer ID on path must match the ID in the Customer object");
        }
        serviceLayer.updateConsole(consoleViewModel);
    }

    @GetMapping("/manufacturer/{manufacturer}")
    @ResponseStatus(HttpStatus.OK)
    public List<ConsoleViewModel> getConsoleByManufacturer(@PathVariable("manufacturer") String manufacturer) {
        List<ConsoleViewModel> consoles = serviceLayer.findConsolesByManufacturer(manufacturer);
        if (consoles != null && consoles.size() == 0)
            throw new IllegalArgumentException("Game could not be retrieved for customer " + manufacturer);
        return consoles;
    }


}
