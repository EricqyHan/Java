package com.company.EHanU1Capstone.controller;

import com.company.EHanU1Capstone.model.TShirt;
import com.company.EHanU1Capstone.service.ServiceLayer;
import com.company.EHanU1Capstone.viewmodel.TShirtViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/tshirt")
public class TShirtController {

    @Autowired
    ServiceLayer serviceLayer;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<TShirtViewModel> getAllTShirts() {
        return serviceLayer.findAllTShirts();
    }

    @PostMapping//Another way to set the Rest API Post mapping
    @ResponseStatus(HttpStatus.CREATED)
    public TShirtViewModel createTShirts(@RequestBody @Valid TShirtViewModel tShirts) {
        return serviceLayer.saveTShirt(tShirts);
    }

    @GetMapping("{id}")//Another way to set the Rest API Get mapping
    @ResponseStatus(HttpStatus.OK)
    public TShirtViewModel getTShirts(@PathVariable("id") int tShirtsId) {
        TShirtViewModel tshirtsViewModel = serviceLayer.findTShirtsbyId(tShirtsId);
        if (tshirtsViewModel == null)
            throw new IllegalArgumentException("TShirts could not be retrieved with id " + tShirtsId);
        return tshirtsViewModel;
    }

    @DeleteMapping("{id}")//Another way to set the Rest API Delete mapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTShirts(@PathVariable("id") int tShirtsId) {
        serviceLayer.removeTShirt(tShirtsId);
    }

    @PutMapping("{id}")//Another way to set the Rest API Put mapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateTShirts(@PathVariable("id") int tShirtsId, @RequestBody @Valid TShirtViewModel tshirtsViewModel) {
        if (tshirtsViewModel.gettShirtID() == 0)
            tshirtsViewModel.settShirtID(tShirtsId);
        if (tShirtsId != tshirtsViewModel.gettShirtID()) {
            throw new IllegalArgumentException("Customer ID on path must match the ID in the Customer object");
        }
        serviceLayer.updateTShirt(tshirtsViewModel);
    }

    @GetMapping("/color/{color}")
    @ResponseStatus(HttpStatus.OK)
    public List<TShirtViewModel> getTShirtsByColor(@PathVariable("color") String color) {
        List<TShirtViewModel> tShirts = serviceLayer.findTShirtsByColor(color);
        if (tShirts != null && tShirts.size() == 0)
            throw new IllegalArgumentException("TShirts could not be retrieved for customer " + color);
        return tShirts;
    }

    @GetMapping("/size/{size}")
    @ResponseStatus(HttpStatus.OK)
    public List<TShirtViewModel> getTShirtsBySize(@PathVariable("size") String size) {
        List<TShirtViewModel> tShirts = serviceLayer.findTShirtsBySize(size);
        if (tShirts != null && tShirts.size() == 0)
            throw new IllegalArgumentException("TShirts could not be retrieved for customer " + size);
        return tShirts;
    }


}
