package com.trilogyed.adserver.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RefreshScope
public class AdserverController {

//    private String[] ads = {
//            "Home Equity Loans @ 3.87% APR",
//            "Click HERE to qualify for a new car loan!",
//            "Super Sale on summer clothes!",
//            "Summer Show Blowout!!! 30% to 50% off!!!!",
//            "Get a new phone NOW!",
//            "Alaskan Cruises for as low as $700!",
//            "BOGO large 2 topping pizzas!",
//            "Free installation with the purchase of 100 square feet of carpet!"
//    };

    // something to hold our greetings
    private List<String> adList = new ArrayList<>();
    // so we can randomly return a greeting
    private Random rnd = new Random();

    //private Random rnd = new Random();
    public AdserverController() {

        // ads
        adList.add("Free phone with 5 year contract!");
        adList.add("Tuition as low as $15,000 for University of Phoenix");
        adList.add("Free solar panels with purchase of coal plant");
        adList.add("Free wind turbine with purchase of solar panels");
        adList.add("New car loan with APR as low as 30% APR");
        adList.add("Flights to North Korea with 6 night hotel as low as $2,000!");
        adList.add("Buy 8 LARGE PIZZAS and a FREE DRINK");
        adList.add("Refinance UR COLLAGE loans for as low as 119% APR");

    }


    @RequestMapping(value = "/ad", method = RequestMethod.GET)
    public String getAd() {
        int whichAnswer = rnd.nextInt(8);
        return adList.get(whichAnswer);
    }

}
