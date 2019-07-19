package com.trilogyed.EricHanrandomquoteservice.controller;

import com.trilogyed.EricHanrandomquoteservice.models.Quote;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomQuoteService {
    @Value("${RandomQuote}")
    private String randomQuote;
    @RequestMapping(value="/quote", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)

    public Quote randomQuote(){
        Quote quote1 = new Quote("To me programming is more than an important practical art. It is also a gigantic" +
                " undertaking in the foundations of knowledge.", "Grace Hopper");
        Quote quote2 = new Quote("Programs must be written for people to read, and only incidentally for machines to execute.",
                " Hal Ableson");
        Quote quote3 = new Quote("Don't call me the mother of the internet", "Radia Perlman");
        Quote quote4 = new Quote("When I first started using the phrase software engineering, it was considered to be quite amusing. " +
                "They used to kid me about my radical ideas. Software eventually and necessarily gained the same respect as any other discipline."
                , "Margaret Hamilton");
        Quote quote5 = new Quote("Machines take me by surprise with great frequency.", "Alan Turing");
        Quote quote6 = new Quote("The function of good software is to make complex appear simple", "Grady Booch");
        Quote quote7 = new Quote("An API that isn't comprehensible isn't usable", "James Gosling");
        Quote quote8 = new Quote("I'm not a great programmer; I'm just a good programmer with great habits", "Martin Fowler");

        List<Quote> qList = new ArrayList<>();
        qList.add(quote1);
        qList.add(quote2);
        qList.add(quote3);
        qList.add(quote4);
        qList.add(quote5);
        qList.add(quote6);
        qList.add(quote7);
        qList.add(quote8);
        Random random = new Random();
        Quote quote = qList.get(random.nextInt(8));

        return quote;

    }

}
