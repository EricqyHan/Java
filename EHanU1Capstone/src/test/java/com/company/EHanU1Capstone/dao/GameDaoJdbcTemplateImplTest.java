package com.company.EHanU1Capstone.dao;

import com.company.EHanU1Capstone.model.Game;
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
public class GameDaoJdbcTemplateImplTest {

    //    @Autowired
//    ConsoleDao consoleDao;
    @Autowired
    GameDao gameDao;
//    @Autowired
//    TShirtDao tshirtDao;
//    @Autowired
//    InvoiceDao invoiceDao;
//    @Autowired
//    ProcessingFeeDao processingFeeDao;
//    @Autowired
//    SalesTaxRateDao salesTaxRateDao;


    @Before
    public void setUp() throws Exception {

        List<Game> game = gameDao.getAllGames();
        for(Game g : game) {
            gameDao.deleteGame(g.getGameID());
        }
//
//        List<Console> console = consoleDao.getAllConsoles();
//        for(Console c : console) {
//            consoleDao.deleteConsole(c.getConsoleID());
//        }
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
    public void addGetDeleteGame() {
        Game game = new Game();
        game.setTitle("Sonic Adventures");
        game.setEsrbRating("Everyone");
        game.setDescription("Sonic Adventure is a 3D game with action and role-playing elements.");
        game.setPrice(new BigDecimal("30.00"));
        game.setStudio("Sega");
        game.setQuantity(44);

        game = gameDao.addGame(game);

        Game game1 = gameDao.getGame(game.getGameID());
        assertEquals(game1, game);

        gameDao.deleteGame(game.getGameID());
        game1 = gameDao.getGame(game.getGameID());
        assertNull(game1);
    }


    @Test
    public void getAllGames() {
        Game game = new Game();
        game.setTitle("Sonic Adventures");
        game.setEsrbRating("Everyone");
        game.setDescription("Sonic Adventure is a 3D game with action and role-playing elements.");
        game.setPrice(new BigDecimal("30.00"));
        game.setStudio("Sega");
        game.setQuantity(44);

        game = gameDao.addGame(game);

        game = new Game();
        game.setTitle("Sonic Adventures 2");
        game.setEsrbRating("Everyone");
        game.setDescription("Sonic Adventure 2 is a 4D game with action and role-playing elements.");
        game.setPrice(new BigDecimal("40.00"));
        game.setStudio("Segaa");
        game.setQuantity(55);

        gameDao.addGame(game);

        List<Game> gList = gameDao.getAllGames();
        assertEquals(2, gList.size());
    }

    @Test
    public void updateGame() {

        Game game = new Game();
        game.setTitle("Adventures Of Billy and Mandy");
        game.setEsrbRating("Teen");
        game.setDescription("Adventures of Billy and Mandy is a role-playing-game.");
        game.setPrice(new BigDecimal("30.00"));
        game.setStudio("Sega");
        game.setQuantity(44);

        game = gameDao.addGame(game);

        game.setTitle("Halo 5");
        game.setEsrbRating("Mature");
        game.setDescription("Master Chief's Adventures");
        game.setPrice(new BigDecimal("35.00"));
        game.setStudio("343 Industries");
        game.setQuantity(44);
        gameDao.updateGame(game);

        Game game1 = gameDao.getGame(game.getGameID());
        assertEquals(game1, game);


    }

    @Test
    public void getGameByTitle() {
        Game game = new Game();
        game.setTitle("Adventures Of Billy and Mandy");
        game.setEsrbRating("Teen");
        game.setDescription("Adventures of Billy and Mandy is a role-playing-game.");
        game.setPrice(new BigDecimal("30.00"));
        game.setStudio("Sega");
        game.setQuantity(44);

        game = gameDao.addGame(game);

        Game game1 = new Game();
        game.setEsrbRating("Mature");
        game.setDescription("Master Chief's Adventures");
        game.setPrice(new BigDecimal("35.00"));
        game.setStudio("343 Industries");
        game.setQuantity(44);
        gameDao.updateGame(game);

        List<Game>gameList = gameDao.getGameByStudio(game.getStudio());
        assertEquals(1, gameList.size());
    }

    @Test
    public void getGameByESRBRating() {
        Game game = new Game();
        game.setTitle("Adventures Of Eric and Michael");
        game.setEsrbRating("Mature");
        game.setDescription("Dumb adventures of Eric and Michael.");
        game.setPrice(new BigDecimal("30.00"));
        game.setStudio("Sega");
        game.setQuantity(44);

        game = gameDao.addGame(game);

        Game game1 = new Game();
        game.setTitle("Adventures of Perri");
        game.setEsrbRating("Mature");
        game.setDescription("Lt. Love Adventures");
        game.setPrice(new BigDecimal("35.00"));
        game.setStudio("343 Industries");
        game.setQuantity(44);
        gameDao.updateGame(game);

        List<Game>gameList = gameDao.getGameByESRBRating(game.getEsrbRating());
        assertEquals(0, gameList.size());
    }

    @Test
    public void getGameByStudio() {
        Game game = new Game();
        game.setTitle("Adventures Of Pikacuh");
        game.setEsrbRating("Teen");
        game.setDescription("Adventures of Pikachu");
        game.setPrice(new BigDecimal("30.00"));
        game.setStudio("Nintendo");
        game.setQuantity(44);

        game = gameDao.addGame(game);

        Game game1 = new Game();
        game.setTitle("Pokemno");
        game.setEsrbRating("Teen");
        game.setDescription("Gotta catch some pokemon");
        game.setPrice(new BigDecimal("35.00"));
        game.setStudio("343 Industroes");
        game.setQuantity(44);
        gameDao.updateGame(game);

        List<Game>gameList = gameDao.getGameByStudio(game.getStudio());
        assertEquals(1, gameList.size());
    }

}