package com.company.dao;

import com.company.model.Author;
import com.company.model.Book;
import com.company.model.Publisher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class PublisherDaoJdbcTemplateImplTest {
    @Autowired
    protected AuthorDao AuthorDao;
    @Autowired
    protected BookDao BookDao;
    @Autowired
    protected PublisherDao PublisherDao;


    @Before
    public void setUp() throws Exception {
        List<Book> bList = BookDao.getAllBooks();

        bList.stream()
                .forEach(book -> BookDao.deleteBook(book.getBookId()));

        List<Publisher> pList = PublisherDao.getAllPublishers();

        pList.stream()
                .forEach(publisher -> PublisherDao.deletePublisher(publisher.getPublisherId()));

        List<Author> aList = AuthorDao.getAllAuthors();

        aList.stream()
                .forEach(author -> AuthorDao.deleteAuthor(author.getAuthor_id()));

    }

     @After
     public void tearDown() throws Exception{

     }

    @Test
    public void addGetDeletePublisher(){

        Publisher publisher = new Publisher();
        publisher.setPublisherId(2222222);
        publisher.setName("The Empire");
        publisher.setStreet("Skywalker Street");
        publisher.setCity("Coruscant");
        publisher.setState("Texas");
        publisher.setPostalCode("07936");
        publisher.setPhone("555-666-8888");
        publisher.setEmail("Palpatine@gloriousleader.com");

        publisher = PublisherDao.addPublisher(publisher);

        Publisher publisher2 = PublisherDao.getPublisher(publisher.getPublisherId());

        assertEquals(publisher, publisher2);

        PublisherDao.deletePublisher(publisher.getPublisherId());

        publisher2 = PublisherDao.getPublisher(publisher.getPublisherId());

        assertNull(publisher2);

    }

    @Test
    public void getAllPublishers() {
        Publisher publisher = new Publisher();
        publisher.setPublisherId(2222222);
        publisher.setName("The Empire");
        publisher.setStreet("Skywalker Street");
        publisher.setCity("Coruscant");
        publisher.setState("Texas");
        publisher.setPostalCode("07936");
        publisher.setPhone("555-666-8888");
        publisher.setEmail("Palpatine@gloriousleader.com");

        PublisherDao.addPublisher(publisher);

        publisher = new Publisher();
        publisher.setPublisherId(2222222);
        publisher.setName("The Rebellion");
        publisher.setStreet("Han Solo Drive");
        publisher.setCity("Yalvin");
        publisher.setState("New Jersey");
        publisher.setPostalCode("90210");
        publisher.setPhone("111-222-4321");
        publisher.setEmail("DarthVader@gloriousleader.com");

        PublisherDao.addPublisher(publisher);

        List<Publisher> publisherList = PublisherDao.getAllPublishers();

        assertEquals(publisherList.size(), 2);


    }


    @Test
    public void updatePublisher() {
        Publisher publisher = new Publisher();
        publisher.setPublisherId(2222222);
        publisher.setName("The Empire");
        publisher.setStreet("Skywalker Street");
        publisher.setCity("Coruscant");
        publisher.setState("Texas");
        publisher.setPostalCode("07936");
        publisher.setPhone("555-666-8888");
        publisher.setEmail("Palpatine@gloriousleader.com");

        publisher = PublisherDao.addPublisher(publisher);

        publisher.setPublisherId(3333333);
        publisher.setName("Darth Vader");
        publisher.setStreet("Hoth");
        publisher.setCity("C3PO City");
        publisher.setState("Alaska");

        PublisherDao.updatePublisher(publisher);

        Publisher publisher2 = PublisherDao.getPublisher(publisher.getPublisherId());

        assertEquals(publisher2, publisher);
    }



}