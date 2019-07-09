package com.company.dao;

import com.company.model.Author;
import com.company.model.Book;
import com.company.model.Publisher;
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
public class AuthorDaoTest {
    @Autowired
    AuthorDao AuthorDao;
    @Autowired
    BookDao BookDao;
    @Autowired
    PublisherDao PublisherDao;

    @Before
    public void setUp() throws Exception {

        List<Book> bList = BookDao.getAllBooks();
        for (Book b : bList) {
            BookDao.deleteBook(b.getBookId());
        }

        List<Publisher> pList = PublisherDao.getAllPublishers();
        for (Publisher p : pList) {
            PublisherDao.deletePublisher(p.getPublisherId());
        }

        List<Author> aList = AuthorDao.getAllAuthors();
        for (Author a : aList) {
            AuthorDao.deleteAuthor(a.getAuthor_id());
        }
    }


    @Test
    public void addGetDeletePublisher() {
        Author author = new Author();
        author.setFirstName("Stephen");
        author.setLastName("Strange");
        author.setStreet("Bleecker Street");
        author.setCity("NY");
        author.setState("NJ");
        author.setPostalCode("12344");
        author.setPhone("555-919-9111");
        author.setEmail("DoctorStrange@SanctumSanctorum.com");

        author = AuthorDao.addAuthor(author);
        Author author1 = AuthorDao.getAuthor(author.getAuthor_id());

        assertEquals(author1, author);

        AuthorDao.deleteAuthor(author.getAuthor_id());

        author1 = AuthorDao.getAuthor(author.getAuthor_id());

        assertNull(author1);


    }

    @Test
    public void getAllAuthors() {
        Author author = new Author();
        author.setFirstName("Stephen");
        author.setLastName("Strange");
        author.setStreet("Bleecker Street");
        author.setCity("NY");
        author.setState("NM");
        author.setPostalCode("12344");
        author.setPhone("555-919-9111");
        author.setEmail("DoctorStrange@SanctumSanctorum.com");

        AuthorDao.addAuthor(author);

        author = new Author();
        author.setFirstName("Jasper");
        author.setLastName("Sitwell");
        author.setStreet("Mjolnir Street");
        author.setCity("Shield City");
        author.setState("NJ");
        author.setPostalCode("22222");
        author.setPhone("481-516-2342");
        author.setEmail("JSitwell@SHIELD.com");

        AuthorDao.addAuthor(author);

        List<Author> authorList = AuthorDao.getAllAuthors();

        assertEquals(authorList.size(), 2);

    }

    @Test
    public void updateAuthor() {
        Author author = new Author();
        author.setFirstName("Stephen");
        author.setLastName("Strange");
        author.setStreet("Bleecker Street");
        author.setCity("NY");
        author.setState("NY");
        author.setPostalCode("12344");
        author.setPhone("555-919-9111");
        author.setEmail("DoctorStrange@SanctumSanctorum.com");


        author = AuthorDao.addAuthor(author);

        author.setFirstName("Karl");
        author.setLastName("Mordo");
        author.setStreet("Walt Disney Street");
        author.setCity("Orlando");
        author.setState("NM");

        AuthorDao.updateAuthor(author);

        Author author2 = AuthorDao.getAuthor(author.getAuthor_id());

        assertEquals(author2, author);
    }


}