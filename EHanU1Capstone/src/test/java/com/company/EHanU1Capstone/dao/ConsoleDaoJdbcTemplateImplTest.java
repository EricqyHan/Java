package com.company.EHanU1Capstone.dao;

import com.company.EHanU1Capstone.model.Console;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ConsoleDaoJdbcTemplateImplTest {

    @Autowired
    ConsoleDao consoleDao;

    @Before
    public void setUp() throws Exception {

//        List<GameDao> game = gameDao.getAllGames();
//        for(GameDao g : game) {
//            gameDao.deleteGame(g.getGameID());
//        }
//
      List<Console> console = consoleDao.getAllConsoles();
        for(Console c : console) {
            consoleDao.deleteConsole(c.getConsoleID());
        }
//
//        List<TShirt> tShirts = tshirtDao.getAllTShirts();
//        for(TShirt t : tShirts) {
//            tshirtDao.deleteTShirt(t.gettShirtID());
//        }
//
//        List<Invoice> Invoice = invoiceDao.getAllInvoices();
//        for(Invoice i : Invoice) {
//            invoiceDao.deleteInvoice(i.getInvoiceID());
//        }
    }

    @Test
    public void addGetDeleteConsole() {
        Console console = new Console();
        console.setModel("Dreamcast");
        console.setManufacturer("Sega");
        console.setMemoryAmount("16 MB RAM");
        console.setProcessor("Hitachi SH-4");
        console.setPrice(new BigDecimal("199.99"));
        console.setQuantity(33);

        console = consoleDao.addConsole(console);

        Console console1 = consoleDao.getConsole(console.getConsoleID());
        assertEquals(console1, console);

        consoleDao.deleteConsole(console.getConsoleID());
        console1 = consoleDao.getConsole(console.getConsoleID());

        assertNull(console1);
    }

    @Test
    public void getAllConsoles() {
        Console console = new Console();
        console.setModel("N64");
        console.setManufacturer("Nintendo");
        console.setMemoryAmount("4 MB Rambus RDRAM");
        console.setProcessor("64-bit micro");
        console.setPrice(new BigDecimal("199.99"));
        console.setQuantity(55);

        console = consoleDao.addConsole(console);

        console = new Console();
        console.setModel("Super Nintendo");
        console.setManufacturer("Nintendo");
        console.setMemoryAmount("544 bytes OAM");
        console.setProcessor("16-bit WDC");
        console.setPrice(new BigDecimal(199).setScale(2));
        console.setQuantity(44);

        consoleDao.addConsole(console);

        List<Console> cList = consoleDao.getAllConsoles();
        assertEquals(2, cList.size());
    }


    @Test
    public void getConsoleByManufacturer() {
        Console console = new Console();
        console.setModel("N64");
        console.setManufacturer("Nintendo");
        console.setMemoryAmount("4 MB Rambus RDRAM");
        console.setProcessor("64-bit processor");
        console.setPrice(new BigDecimal(199).setScale(2));
        console.setQuantity(33);

        console = consoleDao.addConsole(console);

        Console console1 = new Console();
        console.setModel("Play Station");
        console.setManufacturer("Sony");
        console.setMemoryAmount("4 MB RDRAM");
        console.setProcessor("64-bit processor");
        console.setPrice(new BigDecimal(199).setScale(2));
        console.setQuantity(46);

        consoleDao.addConsole(console);

        List<Console>consoleList = consoleDao.getConsoleByManufacturer(console.getManufacturer());
        assertEquals(1, consoleList.size());



    }

    @Test
    public void updateConsole() {
        Console console = new Console();
        console.setModel("N64");
        console.setManufacturer("Nintendo");
        console.setMemoryAmount("4 MB Rambus RDRAM");
        console.setProcessor("64-bit processor");
        console.setPrice(new BigDecimal(199).setScale(2, RoundingMode.HALF_UP));
        console.setQuantity(33);

        console = consoleDao.addConsole(console);

        console.setModel("Super Nintendo");
        console.setManufacturer("Nintendo");
        console.setMemoryAmount("544 bytes OAM");
        console.setProcessor("16-bit WDC");
        console.setPrice(new BigDecimal(199).setScale(2, RoundingMode.HALF_UP));
        console.setQuantity(31);

        consoleDao.updateConsole(console);

        Console console1 = consoleDao.getConsole(console.getConsoleID());
        assertEquals(console1, console);
    }

}