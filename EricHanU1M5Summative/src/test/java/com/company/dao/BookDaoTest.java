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

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BookDaoTest {

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
        author.setPhone("555-345-2256");
        author.setEmail("realmail@gmail.com");
        author = AuthorDao.addAuthor(author);

        Author author1 = new Author();
        author1.setFirstName("Han");
        author1.setLastName("Solo");
        author1.setStreet("Star Wars Road");
        author1.setCity("Cloud City");
        author1.setState("CA");
        author1.setPostalCode("90210");
        author1.setPhone("555-421-9083");
        author1.setEmail("HanSolo@MillenniumFalcon.com");
        author1 = AuthorDao.addAuthor(author1);

        Author author2 = new Author();
        author2.setFirstName("Lando");
        author2.setLastName("Calrissian");
        author2.setStreet("Geroge Lucas Road");
        author2.setCity("Cloud City");
        author2.setState("TX");
        author2.setPostalCode("54321");
        author2.setPhone("555-444-2222");
        author2.setEmail("Lando@CloudCity.com");
        author2 = AuthorDao.addAuthor(author2);

        Publisher pub = new Publisher();
        pub.setName("Fin");
        pub.setStreet("Court Street");
        pub.setCity("Solo City");
        pub.setState("NJ");
        pub.setPostalCode("07936");
        pub.setPhone("555-999-3456");
        pub.setEmail("Fin@NewEmpire.com");
        pub = PublisherDao.addPublisher(pub);


        Book book = new Book();
        book.setIsbn("11111111");
        book.setPublish_date(LocalDate.of(1990, 9, 11));
        book.setAuthorId(author.getAuthor_id()); //access to authorID
        book.setTitle("A New Hope");
        book.setPublisherId(pub.getPublisherId()); //access to publisherID
        book.setPrice(new BigDecimal("17.99"));

        book = BookDao.addBook(book);

        Book book1 = new Book();
        book1.setIsbn("2222222222");
        book1.setPublish_date(LocalDate.of(2010, 11, 28));
        book1.setAuthorId(author1.getAuthor_id());
        book1.setTitle("Young Justice");
        book1.setPublisherId(pub.getPublisherId());
        book1.setPrice(new BigDecimal("3.50"));

        book1 = BookDao.addBook(book1);

        book1 = new Book();
        book1.setIsbn("7774488");
        book1.setPublish_date(LocalDate.of(2013, 12, 11));
        book1.setAuthorId(author1.getAuthor_id());
        book1.setTitle("The Jedi");
        book1.setPublisherId(pub.getPublisherId());
        book1.setPrice(new BigDecimal("9.99"));

        book1 = BookDao.addBook(book1);

        List<Book> bList = BookDao.getBooksByAuthor(author.getAuthor_id());
        assertEquals(bList.size(), 1);

        bList = BookDao.getBooksByAuthor(author1.getAuthor_id());
        assertEquals(bList.size(), 2);

        bList = BookDao.getBooksByAuthor(author2.getAuthor_id());
        assertEquals(bList.size(), 0);

    }
}