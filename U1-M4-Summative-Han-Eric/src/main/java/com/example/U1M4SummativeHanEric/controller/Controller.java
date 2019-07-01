package com.example.U1M4SummativeHanEric.controller;

import com.example.U1M4SummativeHanEric.model.Answer;
import com.example.U1M4SummativeHanEric.model.Definition;
import com.example.U1M4SummativeHanEric.model.Quote;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//CLA - Class-Level Annotation
//MLA - Method-Level Annotation

@RestController //Class-level annotation. Marks class as Rest Controller & makes Spring aware of existence
// Configures Spring so it treats all returned values from methods as JSON and sends those values back to the client
public class Controller {

    @RequestMapping(value = "/quote", method = RequestMethod.GET) // MLA - Maps endpoint to method that hands request tp endpoint. It is unique.
    // the value contains URI path, Method contains HTTP method
    @ResponseStatus(HttpStatus.OK) // MLA - status code that is sent back when method successfully handles incoming request.

    public Quote randomQuote() {
        Quote quote1 = new Quote("Les Brown", "If you don't program in life, life will program you.");
        Quote quote2 = new Quote("Eloquent JavaScript", "Learning is hard work, but everything you learn is yours and will make subsequent learning easier");
        Quote quote3 = new Quote("Ursula K. LeGuin", "When actions grow unprofitable, gather information; when information grows unprofitable, sleep.");
        Quote quote4 = new Quote("Ryan Dahl", "You can never understand everything. But, you should push yourself to understand the system.");
        Quote quote5 = new Quote("Jon Pall Sigmarsson", "There is no reason to be alive if you can't do deadlift");
        Quote quote6 = new Quote("Steve Wozniak", "Never trust a computer you can't throw out the window.");
        Quote quote7 = new Quote("Tyler Durden", "This is your life and it'e ending one minute at a time");
        Quote quote8 = new Quote("Admiral Adama", "SO SAY WE ALL");
        Quote quote9 = new Quote("Tony Stark", "I am Iron Man");
        Quote quote10 = new Quote("Steve Wozniak", "Your first projects aren’t the greatest things in the world, and they may have no money value, they may go nowhere, but that is how you learn – you put so much effort into making something right if it is for yourself.");

        List<Quote> qList = new ArrayList<>();
        qList.add(quote1);
        qList.add(quote2);
        qList.add(quote3);
        qList.add(quote4);
        qList.add(quote5);
        qList.add(quote6);
        qList.add(quote7);
        qList.add(quote8);
        qList.add(quote9);
        qList.add(quote10);
        Random random = new Random();
        Quote quote = qList.get(random.nextInt(10));

        return quote;
    }


    @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)

    public Definition randomWord() {
        Definition definition1 = new Definition("API", "Application Programming Interface. The specification of how a programmer writing an application accesses the behavior and state of classes and objects. ");
        Definition definition2 = new Definition("ACID", "The acronym for the four properties guaranteed by transactions: atomicity, consistency, isolation, and durability.");
        Definition definition3 = new Definition("Bit", "The smallest unit of intormation in a computer, with a value of either 0 or 1.");
        Definition definition4 = new Definition("Casting", "Explicit conversion from one data type to another.");
        Definition definition5 = new Definition("Const", "A reserved Java keyword not used by current versions of the Java programming language.");
        Definition definition6 = new Definition("Delegation", "An act whereby one principal authorizes another principal to use its identity or privileges with some restrictions.");
        Definition definition7 = new Definition("Final", "A Java keyword. You define an entity once and cannot change it or derive from it later. More specifically: a final class cannot be subclassed, a final method cannot be overridden and a final variable cannot change from its initialized value.");
        Definition definition8 = new Definition("FTP", "File Transfer Protocol. FTP, which is based on TCP/IP, enables the fetching and storing of files between hosts on the Internet. See also TCP/IP.");
        Definition definition9 = new Definition("Implements", "A Java keyword included in the class declaration to specify any interfaces that are implemented by the current class.");
        Definition definition10 = new Definition("Java", "Sun's trademark for a set of technologies for creating and safely running software programs in both stand-alone and networked environments. ");


        List<Definition> randomDefinition = new ArrayList<>();
        randomDefinition.add(definition1);
        randomDefinition.add(definition2);
        randomDefinition.add(definition3);
        randomDefinition.add(definition4);
        randomDefinition.add(definition5);
        randomDefinition.add(definition6);
        randomDefinition.add(definition7);
        randomDefinition.add(definition8);
        randomDefinition.add(definition9);
        randomDefinition.add(definition10);

        Random random2 = new Random();
        Definition definition = randomDefinition.get(random2.nextInt(10));

        return definition;

    }


    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK) // MLA - HTTP status code that is sent back when method successfuly handles incoming request

    public Answer answers(@RequestBody Answer question) { //RequestBody - Method Parameter annotation. Maps JSON in request body to a method parameter.
        Answer answer1 = new Answer();
        Answer answer2 = new Answer();
        Answer answer3 = new Answer();
        Answer answer4 = new Answer();
        Answer answer5 = new Answer();
        Answer answer6 = new Answer();
        Answer answer7 = new Answer();
        Answer answer8 = new Answer();
        Answer answer9 = new Answer();
        Answer answer10 = new Answer();

        List<Answer> answersEightBall = new ArrayList<>();
        answer1.setAnswer("It is certain");
        answer2.setAnswer("Yes - Definitely");
        answer3.setAnswer("You may rely on it");
        answer4.setAnswer("Ask again later");
        answer5.setAnswer("Cannot predict now");
        answer6.setAnswer("Concentrate and ask later");
        answer7.setAnswer("Outlook not so good");
        answer8.setAnswer("My sources say no");
        answer9.setAnswer("Very doubtful");
        answer10.setAnswer("There's always Wal-mart");

        Random randomEightBall = new Random();
        answersEightBall.add(answer1);
        answersEightBall.add(answer2);
        answersEightBall.add(answer3);
        answersEightBall.add(answer4);
        answersEightBall.add(answer5);
        answersEightBall.add(answer6);
        answersEightBall.add(answer7);
        answersEightBall.add(answer8);
        answersEightBall.add(answer9);
        answersEightBall.add(answer10);
        Answer answer = answersEightBall.get(randomEightBall.nextInt(10));

        answer.setQuestion(question.getQuestion());
        return answer;
    }

}


