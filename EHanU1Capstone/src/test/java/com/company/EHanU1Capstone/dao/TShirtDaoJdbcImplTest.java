package com.company.EHanU1Capstone.dao;

import com.company.EHanU1Capstone.model.Game;
import com.company.EHanU1Capstone.model.TShirt;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TShirtDaoJdbcImplTest {

//    @Autowired
//    ConsoleDao consoleDao;
//    @Autowired
//    GameDao gameDao;
   @Autowired
    TShirtDao tshirtDao;
//    @Autowired
//    InvoiceDao invoiceDao;
//    @Autowired
//    ProcessingFeeDao processingFeeDao;
//    @Autowired
//    SalesTaxRateDao salesTaxRateDao;

    @Before
    public void setUp() throws Exception {
//        List<Game> game = Game.getAllGames();
//        for(Game g : game) {
//            gameDao.deleteGame(g.getGameID());
//        }
//
//        List<Console> console = consoleDao.getAllConsoles();
//        for(Console c : console) {
//            consoleDao.deleteConsole(c.getConsoleID());
//        }
//
        List<TShirt> tShirts = tshirtDao.getAllTShirts();
        for(TShirt t : tShirts) {
            tshirtDao.deleteTShirt(t.gettShirtID());
        }
//
//        List<Invoice> Invoice = invoiceDao.getAllInvoices();
//        for(Invoice i : Invoice) {
//            invoiceDao.deleteInvoice(i.getInvoiceID());
//        }
    }

    @Test
    public void addGetDeleteTshirt() {
        TShirt tshirt = new TShirt();
        tshirt.setSize("Medium");
        tshirt.setColor("Pink");
        tshirt.setDescription("Tough guys wear pink");
        tshirt.setPrice(new BigDecimal("200.00"));
        tshirt.setQuantity(222);

        tshirt = tshirtDao.addTShirt(tshirt);

        TShirt tShirt1 = tshirtDao.getTShirt(tshirt.gettShirtID());
        assertEquals(tshirt, tShirt1);

        tshirtDao.deleteTShirt(tshirt.gettShirtID());
        tShirt1 = tshirtDao.getTShirt(tshirt.gettShirtID());
        assertNull(tShirt1);
    }


    @Test
    public void getAllTShirts() {
        TShirt tshirt = new TShirt();
        tshirt.setSize("Small");
        tshirt.setColor("Pink");
        tshirt.setDescription("Tough guys wear pink");
        tshirt.setPrice(new BigDecimal("300.00"));
        tshirt.setQuantity(19);

        tshirt = tshirtDao.addTShirt(tshirt);

        tshirt = new TShirt();
        tshirt.setSize("Small");
        tshirt.setColor("yellow");
        tshirt.setDescription("Ugly yellow shirt");
        tshirt.setPrice(new BigDecimal("5.00"));
        tshirt.setQuantity(33);

        tshirtDao.addTShirt(tshirt);

        List<TShirt> tList = tshirtDao.getAllTShirts();
        assertEquals(2, tList.size());

    }

    @Test
    public void updateTShirt() {
        TShirt tshirt = new TShirt();
        tshirt.setSize("Large");
        tshirt.setColor("Green");
        tshirt.setDescription("Green Shirt");
        tshirt.setPrice(new BigDecimal("20.00"));
        tshirt.setQuantity(111);

        tshirt = tshirtDao.addTShirt(tshirt);

        tshirt.setSize("x-Large");
        tshirt.setColor("Black");
        tshirt.setDescription("Some Goth Shirt");
        tshirt.setPrice(new BigDecimal("10.00"));
        tshirt.setQuantity(99);
        tshirtDao.updateTShirt(tshirt);

        TShirt tShirt1 = tshirtDao.getTShirt(tshirt.gettShirtID());
        assertEquals(tShirt1, tshirt);
    }

    @Test
    public void gettShirtByColor() {
        TShirt tshirt = new TShirt();
        tshirt.setSize("Large");
        tshirt.setColor("Green");
        tshirt.setDescription("Green Shirt");
        tshirt.setPrice(new BigDecimal("20.00"));
        tshirt.setQuantity(111);

        tshirt = tshirtDao.addTShirt(tshirt);

        TShirt tShirt1 = new TShirt();
        tshirt.setSize("x-Large");
        tshirt.setColor("Black");
        tshirt.setDescription("Some Goth Shirt");
        tshirt.setPrice(new BigDecimal("10.00"));
        tshirt.setQuantity(99);
        tshirtDao.updateTShirt(tshirt);

        List<TShirt>tShirtList = tshirtDao.gettShirtByColor(tshirt.getColor());
        assertEquals(1, tShirtList.size());
    }

    @Test
    public void gettShirtBySize() {
        TShirt tshirt = new TShirt();
        tshirt.setSize("Large");
        tshirt.setColor("Green");
        tshirt.setDescription("Green Shirt");
        tshirt.setPrice(new BigDecimal("20.00"));
        tshirt.setQuantity(111);

        tshirt = tshirtDao.addTShirt(tshirt);

        TShirt tShirt1 = new TShirt();
        tshirt.setSize("x-Large");
        tshirt.setColor("Black");
        tshirt.setDescription("Some Goth Shirt");
        tshirt.setPrice(new BigDecimal("10.00"));
        tshirt.setQuantity(99);
        tshirtDao.updateTShirt(tshirt);

        List<TShirt>tShirtList = tshirtDao.gettShirtBySize(tshirt.getColor());
        assertEquals(0, tShirtList.size());

    }
}