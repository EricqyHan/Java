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

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BookDaoJdbcTemplateImplTest {

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
    public void addGetDeleteBook() {

        Publisher publisher = new Publisher();
        publisher.setName("The Empire");
        publisher.setStreet("Skywalker Street");
        publisher.setCity("Coruscant");
        publisher.setState("TX");
        publisher.setPostalCode("07936");
        publisher.setPhone("555-666-8888");
        publisher.setEmail("Palpatine@gloriousleader.com");

        publisher = PublisherDao.addPublisher(publisher);

        Author author = new Author();
        author.setFirstName("Stephen");
        author.setLastName("King");
        author.setStreet("Evergreen Terrace");
        author.setCity("Springfield");
        author.setState("NJ");
        author.setPostalCode("90210");
        author.setPhone("555-555-5555");
        author.setEmail("TK421@EmpireStrikesBack.com");

        author = AuthorDao.addAuthor(author);

        Book book = new Book();
        book.setIsbn("97439148501");
        book.setPublish_date(LocalDate.of(2009, 11, 10));
        book.setAuthorId(author.getAuthor_id());
        book.setTitle("Under The Dome");
        book.setPublisherId(publisher.getPublisherId());
        book.setPrice(new BigDecimal("12.99"));

        book = BookDao.addBook(book);

        Book book2 = BookDao.getBook(book.getBookId());

        assertEquals(book2, book);

        BookDao.deleteBook(book.getBookId());

        book2 = BookDao.getBook(book.getBookId());

        assertNull(book2);

    }


    @Test
    public void getAllBooks() {
        //Book book = new Book();

        Publisher publisher = new Publisher();
        publisher.setName("The Empire");
        publisher.setStreet("Skywalker Street");
        publisher.setCity("Coruscant");
        publisher.setState("TX");
        publisher.setPostalCode("07936");
        publisher.setPhone("555-666-8888");
        publisher.setEmail("Palpatine@gloriousleader.com");

        publisher = PublisherDao.addPublisher(publisher);

        Author author = new Author();
        author.setFirstName("Stephen");
        author.setLastName("King");
        author.setStreet("Evergreen Terrace");
        author.setCity("Springfield");
        author.setState("NJ");
        author.setPostalCode("90210");
        author.setPhone("555-555-5555");
        author.setEmail("TK421@EmpireStrikesBack.com");

        author = AuthorDao.addAuthor(author);

        Book book = new Book();
        book.setIsbn("978143");
        book.setPublish_date(LocalDate.of(2009, 11, 10));
        book.setAuthorId(author.getAuthor_id());
        book.setTitle("Under The Dome");
        book.setPublisherId(publisher.getPublisherId());
        book.setPrice(new BigDecimal("12.99"));

        book = BookDao.addBook(book);

        book = new Book();
        book.setIsbn("2222222");
        book.setPublish_date(LocalDate.of(1990, 9, 11));
        book.setAuthorId(author.getAuthor_id());
        book.setTitle("Eric's Life");
        book.setPublisherId(publisher.getPublisherId());
        book.setPrice(new BigDecimal("3.50"));
        book = BookDao.addBook(book);

        List<Book> bList = BookDao.getAllBooks();
        assertEquals(bList.size(), 2);

    }


    @Test
    public void updateBook() {
        Publisher publisher = new Publisher();
        publisher.setName("The Empire");
        publisher.setStreet("Skywalker Street");
        publisher.setCity("Coruscant");
        publisher.setState("TX");
        publisher.setPostalCode("07936");
        publisher.setPhone("555-666-8888");
        publisher.setEmail("Palpatine@gloriousleader.com");

        publisher = PublisherDao.addPublisher(publisher);

        Author author = new Author();
        author.setFirstName("Stephen");
        author.setLastName("King");
        author.setStreet("Evergreen Terrace");
        author.setCity("Springfield");
        author.setState("NJ");
        author.setPostalCode("90210");
        author.setPhone("555-555-5555");
        author.setEmail("TK421@EmpireStrikesBack.com");

        author = AuthorDao.addAuthor(author);

        Book book = new Book();
        book.setIsbn("974314850");
        book.setPublish_date(LocalDate.of(2009, 11, 10));
        book.setAuthorId(author.getAuthor_id());
        book.setTitle("Under The Dome");
        book.setPublisherId(publisher.getPublisherId());
        book.setPrice(new BigDecimal("10.99"));

        book = BookDao.addBook(book);

        book.setIsbn("2222222");
        book.setPublish_date(LocalDate.of(1990, 9, 11));
        book.setTitle("Eric's Life");
        book.setPublisherId(publisher.getPublisherId());
        book.setPrice(new BigDecimal("3.50"));

        BookDao.updateBook(book);

        Book book2 = BookDao.getBook(book.getBookId());

        assertEquals(book2, book);
    }


    @Test
    public void getBooksByAuthor() {

        Author author = new Author();
        author.setFirstName("Eric");
        author.setLastName("Han");
        author.setStreet("Evergreen Terrace");
        author.setCity("Springfield");
        author.setState("NY");
        author.setPostalCode("90210");
        author.setPhone("555-555-2234");
        author.setEmail("realEmail@gmail.com");

        author = AuthorDao.addAuthor(author);

        Author author2 = new Author();
        author.setFirstName("Han");
        author.setLastName("Solo");
        author.setStreet("Star Wars Road");
        author.setCity("Corellian");
        author.setState("NY");
        author.setPostalCode("11111");
        author.setPhone("421-421-1977");
        author.setEmail("HanSolo@MillenniumFalcon.com");

        author2 = AuthorDao.addAuthor(author2);

        Author author3 = new Author();
        author.setFirstName("Lando");
        author.setLastName("Calrissian");
        author.setStreet("George Lucas Court");
        author.setCity("Cloud City");
        author.setState("KY");
        author.setPostalCode("54321");
        author.setPhone("555-678-1300");
        author.setEmail("HanSolo@MillenniumFalcon.com");

        author3 = AuthorDao.addAuthor(author3);

        Publisher publisher = new Publisher();
        publisher.setName("Fin");
        publisher.setStreet("Court Street");
        publisher.setCity("Solo City");
        publisher.setState("NJ");
        publisher.setPostalCode("07936");
        publisher.setPhone("555-999-4231");
        publisher.setEmail("MM@gmail.com");

        publisher = PublisherDao.addPublisher(publisher);

        Book book = new Book();
        book.setIsbn("111111");
        book.setPublish_date(LocalDate.of(1990, 1, 1));
        book.setAuthorId(author.getAuthor_id());
        book.setTitle("A New Hope");
        book.setPublisherId(publisher.getPublisherId());
        book.setPrice(new BigDecimal("3.50"));

        BookDao.addBook(book);

        book = new Book();
        book.setIsbn("222222");
        book.setPublish_date(LocalDate.of(1980, 5, 21));
        book.setAuthorId(author.getAuthor_id());
        book.setTitle("Empire Strikes Back");
        book.setPublisherId(publisher.getPublisherId());
        book.setPrice(new BigDecimal("18.50"));

        BookDao.addBook(book);

        Book book1 = new Book();
        book1.setIsbn("333333");
        book1.setPublish_date(LocalDate.of(1983, 5, 25));
        book1.setAuthorId(author2.getAuthor_id());
        book1.setTitle("Return of the Jedi");
        book1.setPublisherId(publisher.getPublisherId());
        book1.setPrice(new BigDecimal("9.50"));

        BookDao.addBook(book);

        List<Book> bList = BookDao.getBooksByAuthor(author.getAuthor_id());
        assertEquals(bList.size(), 2);

        List<Book> bList2 = BookDao.getBooksByAuthor(author2.getAuthor_id());
        assertEquals(bList2.size(), 1);

        List<Book> bList3 = BookDao.getBooksByAuthor(author3.getAuthor_id());
        assertEquals(bList3.size(), 0);

    }
}