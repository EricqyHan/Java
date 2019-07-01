package com.example.U1M4SummativeHanEric.controller;

import com.example.U1M4SummativeHanEric.model.Answer;
import com.example.U1M4SummativeHanEric.model.Quote;

import com.example.U1M4SummativeHanEric.model.Word;
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
        Quote quote1 = new Quote();
        Quote quote2 = new Quote();
        Quote quote3 = new Quote();
        Quote quote4 = new Quote();
        Quote quote5 = new Quote();
        Quote quote6 = new Quote();
        Quote quote7 = new Quote();
        Quote quote8 = new Quote();
        Quote quote9 = new Quote();
        Quote quote10 = new Quote();


        quote1.setQuote("If you don't program in life, life will program you.");
        quote1.setAuthor("Les Brown");
        quote2.setQuote("Learning is hard work, but everything you learn is yours and will make subsequent learning easier");
        quote2.setAuthor("Eloquent JavaScript");
        quote3.setQuote("When actions grow unprofitable, gather information; when information grows unprofitable, sleep.");
        quote3.setAuthor("Ursula K. LeGuin");
        quote4.setQuote("You can never understand everything. But, you should push yourself to understand the system.");
        quote4.setAuthor("Ryan Dahl");
        quote5.setQuote("There is no reason to be alive if you can't do deadlift");
        quote5.setAuthor("Jon Pall Sigmarsson");
        quote6.setQuote("Never trust a computer you can't throw out the window.");
        quote6.setAuthor("Steve Wozniak");
        quote7.setQuote("This is your life and it's ending one minute at a time");
        quote7.setAuthor("Tyler Durden");
        quote8.setQuote("So Say We All");
        quote8.setAuthor("Admiral Adama");
        quote9.setQuote("I am Iron Man!");
        quote9.setAuthor("Tony Stark");
        quote10.setQuote("Your first projects aren’t the greatest things in the world, and they may have no money value, they may go nowhere, but that is how you learn – you put so much effort into making something right if it is for yourself.");
        quote10.setAuthor("Steve Wozniak");

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

    public Word randomWord() {
        Word word1 = new Word();
        Word word2 = new Word();
        Word word3 = new Word();
        Word word4 = new Word();
        Word word5 = new Word();
        Word word6 = new Word();
        Word word7 = new Word();
        Word word8 = new Word();
        Word word9 = new Word();
        Word word10 = new Word();


        word1.setWord("API");
        word1.setDefinition("Application Programming Interface. The specification of how a programmer writing an application accesses the behavior and state of classes and objects. ");
        word2.setWord("ACID");
        word2.setDefinition("The acronym for the four properties guaranteed by transactions: atomicity, consistency, isolation, and durability.");
        word3.setWord("Bit");
        word3.setDefinition("The smallest unit of information in a computer, with a value of either 0 or 1.");
        word4.setWord("Casting");
        word4.setDefinition("Explicit conversion from one data type to another.");
        word5.setWord("Const");
        word5.setDefinition("A reserved Java keyword not used by current versions of the Java programming language.");
        word6.setWord("Delegation");
        word6.setDefinition("An act whereby one principal authorizes another principal to use its identity or privileges with some restrictions.");
        word7.setWord("Final");
        word7.setDefinition("A Java keyword. You define an entity once and cannot change it or derive from it later. More specifically: a final class cannot be subclassed, a final method cannot be overridden and a final variable cannot change from its initialized value.");
        word8.setWord("FTP");
        word8.setDefinition("File Transfer Protocol. FTP, which is based on TCP/IP, enables the fetching and storing of files between hosts on the Internet. See also TCP/IP.");
        word9.setWord("Implements");
        word9.setDefinition("A Java keyword included in the class declaration to specify any interfaces that are implemented by the current class.");
        word10.setWord("Java");
        word10.setDefinition("Sun's trademark for a set of technologies for creating and safely running software programs in both stand-alone and networked environments. ");

        List<Word> randomWord = new ArrayList<>();
        randomWord.add(word1);
        randomWord.add(word2);
        randomWord.add(word3);
        randomWord.add(word4);
        randomWord.add(word5);
        randomWord.add(word6);
        randomWord.add(word7);
        randomWord.add(word8);
        randomWord.add(word9);
        randomWord.add(word10);

        Random random2 = new Random();
        Word word = randomWord.get(random2.nextInt(10));

        return word;

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
        Answer answer = answersEightBall.get(randomEightBall.nextInt(10));

        answer.setQuestion(question.getQuestion());
        return answer;

    }


}
