package com.company.EHanU1Capstone.service;

import com.company.EHanU1Capstone.dao.*;
import com.company.EHanU1Capstone.model.*;
import com.company.EHanU1Capstone.viewmodel.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

import static org.junit.Assert.*;

public class ServiceLayerTest {

    GameDao gameDao;
    TShirtDao tShirtDao;
    ConsoleDao consoleDao;
    ProcessingFeeDao processingFeeDao;
    SalesTaxRateDao salesTaxRateDao;
    InvoiceDao invoiceDao;
    ServiceLayer serviceLayer;


    @Before
    public void setUp() throws Exception {
        setUpConsoleDaoMock();
        setUpGameDaoMock();
        setUpInvoiceDaoMock();
        setUpProcessingFeeDaoMock();
        setUpSalesTaxDaoMock();
        setUpTShirtsDaoMock();


        serviceLayer = new ServiceLayer(consoleDao, gameDao,invoiceDao,processingFeeDao, salesTaxRateDao, tShirtDao);
    }


    ///////// Mocks //////////
    ///////// Console //////////


    @Test
    public void findAllConsoles() {
        ConsoleViewModel consolesViewModel =new ConsoleViewModel();

        consolesViewModel.setModel("Xbox 360");
        consolesViewModel.setManufacturer("Microsoft");
        consolesViewModel.setMemoryAmount("512 mb");
        consolesViewModel.setProcessor("PowerPC 970");
        consolesViewModel.setPrice(new BigDecimal(47.00).setScale(2, RoundingMode.HALF_UP));
        consolesViewModel.setQuantity(22);

        List<ConsoleViewModel> consoleViewModels = serviceLayer.findAllConsoles();
        assertEquals(consoleViewModels.size(),1);
    }

    @Test
    public void saveFindConsoles(){

        ConsoleViewModel consoleViewModel = new ConsoleViewModel();

        consoleViewModel.setModel("Xbox 360");
        consoleViewModel.setManufacturer("Microsoft");
        consoleViewModel.setMemoryAmount("512 mb");
        consoleViewModel.setProcessor("PowerPC 970");
        consoleViewModel.setPrice(new BigDecimal(88.88).setScale(2, RoundingMode.HALF_UP));
        consoleViewModel.setQuantity(88);

        consoleViewModel = serviceLayer.saveConsole(consoleViewModel);
        ConsoleViewModel fromService = serviceLayer.findConsolesbyId(consoleViewModel.getConsoleID());
        assertEquals(consoleViewModel, fromService);
    }

    @Test
    public void findConsoleByManufacture(){
        ConsoleViewModel consoleViewModel = new ConsoleViewModel();

        consoleViewModel.setModel("Xbox 360");
        consoleViewModel.setManufacturer("Microsoft");
        consoleViewModel.setMemoryAmount("512 mb");
        consoleViewModel.setProcessor("PowerPC 970");
        consoleViewModel.setPrice(new BigDecimal(88.88).setScale(2, RoundingMode.HALF_UP));
        consoleViewModel.setQuantity(88);

        consoleViewModel = serviceLayer.saveConsole(consoleViewModel);
        List<ConsoleViewModel> consoleViewModels = serviceLayer.findConsolesByManufacturer("sony");
        assertEquals(consoleViewModels.size(),1);
        assertEquals(consoleViewModels.get(0), consoleViewModel);
    }

    ///////// Game //////////


    @Test
    public void findAllGames() {

        GameViewModel gamesViewModel =new GameViewModel();

        gamesViewModel.setGameID(1);
        gamesViewModel.setTitle("Halo");
        gamesViewModel.setEsrbRating("Teen");
        gamesViewModel.setDescription("Master Chief");
        gamesViewModel.setPrice(new BigDecimal(15.00).setScale(2, RoundingMode.HALF_UP));
        gamesViewModel.setStudio("343 Industries");
        gamesViewModel.setQuantity(2);

        List<GameViewModel> gamesViewModels = serviceLayer.findAllGames();
        assertEquals(gamesViewModels.size(),1);
    }

    @Test
    public void saveFindGame() {

        GameViewModel gamesViewModel = new GameViewModel();


        gamesViewModel.setTitle("Halo");
        gamesViewModel.setEsrbRating("Teen");
        gamesViewModel.setDescription("Master Chief");
        gamesViewModel.setPrice(new BigDecimal(10.00).setScale(2, RoundingMode.HALF_UP));
        gamesViewModel.setStudio("343 Industries");
        gamesViewModel.setQuantity(5);

        gamesViewModel = serviceLayer.saveGame(gamesViewModel);
        GameViewModel fromService = serviceLayer.findGamesbyId(gamesViewModel.getGameID());
        assertEquals(gamesViewModel, fromService);
    }


    @Test
    public void findGamesByStudio() {

        GameViewModel gamesViewModel = new GameViewModel();

        gamesViewModel.setTitle("Halo");
        gamesViewModel.setEsrbRating("Teen");
        gamesViewModel.setDescription("Master Chief");
        gamesViewModel.setPrice(new BigDecimal(10.00).setScale(2, RoundingMode.HALF_UP));
        gamesViewModel.setStudio("343 Industries");
        gamesViewModel.setQuantity(22);

        gamesViewModel = serviceLayer.saveGame(gamesViewModel);
        List<GameViewModel> gamesViewModels = serviceLayer.findGamesByStudio("IDK");
        assertEquals(gamesViewModels.size(),1);
        assertEquals(gamesViewModels.get(0), gamesViewModel);
    }

    @Test
    public void findGamesByErsb() {

        GameViewModel gamesViewModel = new GameViewModel();

        gamesViewModel.setTitle("Halo");
        gamesViewModel.setEsrbRating("Teen");
        gamesViewModel.setDescription("Master Chief");
        gamesViewModel.setPrice(new BigDecimal(10.00).setScale(2, RoundingMode.HALF_UP));
        gamesViewModel.setStudio("343 Industries");
        gamesViewModel.setQuantity(22);

        gamesViewModel = serviceLayer.saveGame(gamesViewModel);
        List<GameViewModel> gamesViewModels = serviceLayer.findGamesByErsb("Everyone");
        assertEquals(gamesViewModels.size(),1);
        assertEquals(gamesViewModels.get(0), gamesViewModel);
    }

    @Test
    public void findGamesByTitle() {

        GameViewModel gamesViewModel = new GameViewModel();

        gamesViewModel.setTitle("Halo");
        gamesViewModel.setEsrbRating("Teen");
        gamesViewModel.setDescription("Master Chief");
        gamesViewModel.setPrice(new BigDecimal(10.00).setScale(2, RoundingMode.HALF_UP));
        gamesViewModel.setStudio("343 Industries");
        gamesViewModel.setQuantity(22);

        gamesViewModel = serviceLayer.saveGame(gamesViewModel);
        List<GameViewModel> gamesViewModels = serviceLayer.findGamesByTitle("The Sims");
        assertEquals(gamesViewModels.size(),1);
        assertEquals(gamesViewModels.get(0), gamesViewModel);
    }

    ///////// Console Mock //////////


    @Test
    public void findAllTShirts() {

        TShirtViewModel tshirtsViewModel =new TShirtViewModel();

        tshirtsViewModel.settShirtID(5);
        tshirtsViewModel.setSize("Large");
        tshirtsViewModel.setColor("pink");
        tshirtsViewModel.setDescription("short sleeve");
        tshirtsViewModel.setPrice(new BigDecimal(1.00).setScale(2, RoundingMode.HALF_UP));
        tshirtsViewModel.setQuantity(45);

        List<TShirtViewModel> tshirtsViewModels = serviceLayer.findAllTShirts();
        assertEquals(tshirtsViewModels.size(),1);

    }

    @Test
    public void saveFindTShirt() {

        TShirtViewModel tshirtsViewModel = new TShirtViewModel();

        tshirtsViewModel.setSize("Large");
        tshirtsViewModel.setColor("pink");
        tshirtsViewModel.setDescription("short sleeve");
        tshirtsViewModel.setPrice(new BigDecimal(1.00).setScale(2, RoundingMode.HALF_UP));
        tshirtsViewModel.setQuantity(12);

        tshirtsViewModel = serviceLayer.saveTShirt(tshirtsViewModel);
        TShirtViewModel fromService = serviceLayer.findTShirtsbyId(tshirtsViewModel.gettShirtID());
        assertEquals(tshirtsViewModel, fromService);

    }


    @Test
    public void findTShirtsByColor() {

        TShirtViewModel tshirtsViewModel = new TShirtViewModel();

        tshirtsViewModel.setSize("Large");
        tshirtsViewModel.setColor("pink");
        tshirtsViewModel.setDescription("short sleeve");
        tshirtsViewModel.setPrice(new BigDecimal(1.00).setScale(2, RoundingMode.HALF_UP));
        tshirtsViewModel.setQuantity(25);

        tshirtsViewModel = serviceLayer.saveTShirt(tshirtsViewModel);
        List<TShirtViewModel> tshirtsViewModels = serviceLayer.findTShirtsByColor("blue");
        assertEquals(tshirtsViewModels.size(),1);
        assertEquals(tshirtsViewModels.get(0), tshirtsViewModel);
    }

    @Test
    public void findTShirtsBySize() {
        TShirtViewModel tshirtsViewModel = new TShirtViewModel();

        tshirtsViewModel.setSize("Large");
        tshirtsViewModel.setColor("pink");
        tshirtsViewModel.setDescription("short sleeve");
        tshirtsViewModel.setPrice(new BigDecimal(1.00).setScale(2, RoundingMode.HALF_UP));
        tshirtsViewModel.setQuantity(25);

        tshirtsViewModel = serviceLayer.saveTShirt(tshirtsViewModel);
        List<TShirtViewModel> tshirtsViewModels = serviceLayer.findTShirtsBySize("small");
        assertEquals(tshirtsViewModels.size(),1);
        assertEquals(tshirtsViewModels.get(0), tshirtsViewModel);

    }

    @Test
    public void saveInvoice() {
        //input
        PurchasingViewModel purchasingViewModel = new PurchasingViewModel();
        purchasingViewModel.setName("The");
        purchasingViewModel.setStreet("Rock");
        purchasingViewModel.setCity("Jersey City");
        purchasingViewModel.setState("NJ");
        purchasingViewModel.setZipCode("07307");
        purchasingViewModel.setItemType("Games");
        purchasingViewModel.setItemId(1);
        purchasingViewModel.setQuantity(1);
        //service
        InvoiceViewModel fromService = serviceLayer.saveInvoice(purchasingViewModel);

        //output
        InvoiceViewModel invoiceViewModel = new InvoiceViewModel();
        invoiceViewModel.setInvoiceID(1);
        invoiceViewModel.setName("The");
        invoiceViewModel.setStreet("Rock");
        invoiceViewModel.setCity("Jersey City");
        invoiceViewModel.setState("NJ");
        invoiceViewModel.setZipcode("07307");
        invoiceViewModel.setItemType("Games");
        invoiceViewModel.setItemID(1);
        invoiceViewModel.setUnitPrice(new BigDecimal(10.00).setScale(2, RoundingMode.HALF_UP));
        invoiceViewModel.setQuantity(1);
        invoiceViewModel.setSubtotal(new BigDecimal(10.00).setScale(2, RoundingMode.HALF_UP));
        invoiceViewModel.setTax(new BigDecimal(0.5).setScale(2, RoundingMode.HALF_UP));
        invoiceViewModel.setProcessingFee(new BigDecimal(1.49).setScale(2, RoundingMode.HALF_UP));
        invoiceViewModel.setTotal(new BigDecimal(11.99).setScale(2, RoundingMode.HALF_UP));
        //assert
        assertEquals(invoiceViewModel,fromService);


    }


    ///////// Console Mock //////////
    private void setUpConsoleDaoMock() {
        consoleDao = mock(ConsoleDaoJdbcTemplateImpl.class);
        Console console = new Console();

        console.setConsoleID(9);
        console.setModel("Xbox 360");
        console.setModel("Microsoft");
        console.setMemoryAmount("512 mb");
        console.setProcessor("PowerPC 970");
        console.setPrice(new BigDecimal(88.88).setScale(2, RoundingMode.HALF_UP));
        console.setQuantity(88);

        Console console1 = new Console();
        console.setModel("Xbox 360");
        console.setModel("Microsoft");
        console.setMemoryAmount("512 mb");
        console.setProcessor("PowerPC 970");
        console.setPrice(new BigDecimal(88.88).setScale(2, RoundingMode.HALF_UP));
        console.setQuantity(93);

        List<Console> consoleList = new ArrayList<>();
        consoleList.add(console);

        doReturn(console).when(consoleDao).addConsole(console1);
        doReturn(console).when(consoleDao).getConsole(5);
        doReturn(console).when(consoleDao).getAllConsoles();
        doReturn(console).when(consoleDao).getAllConsoles();
        doReturn(consoleList).when(consoleDao).getConsoleByManufacturer(console.getManufacturer());

    }


    ///////// Game Mock //////////

    private void setUpGameDaoMock(){
        gameDao = mock(GameDaoJdbcTemplateImpl.class);

            Game game = new Game();
            game.setGameID(1);
            game.setTitle("Halo");
            game.setEsrbRating("Teen");
            game.setDescription("Master Chief");
            game.setPrice(new BigDecimal(10).setScale(2, RoundingMode.HALF_UP));
            game.setStudio("343 Industries");
            game.setQuantity(44);

            Game game1 = new Game();

            game1.setTitle("Halo");
            game1.setEsrbRating("Teen");
            game1.setDescription("Master Chief");
            game1.setPrice(new BigDecimal(10).setScale(2, RoundingMode.HALF_UP));
            game1.setStudio("343 Industries");
            game1.setQuantity(99);

            List<Game> gameList = new ArrayList<>();
            gameList.add(game);

            doReturn(game).when(gameDao).addGame(game1);
            doReturn(game).when(gameDao).getGame(1);
            doReturn(gameList).when(gameDao).getAllGames();
            doReturn(gameList).when(gameDao).getGameByESRBRating(game.getEsrbRating());
            doReturn(gameList).when(gameDao).getGameByStudio(game.getStudio());
            doReturn(gameList).when(gameDao).getGameByTitle(game.getTitle());
        }




    ///////// Invoice Mock //////////

    private void setUpInvoiceDaoMock(){

        invoiceDao = mock(InvoiceDaoJdbcTemplateImpl.class);

        Invoice invoice = new Invoice();

        invoice.setInvoiceID(1);
        invoice.setName("Han");
        invoice.setStreet("Solo");
        invoice.setCity("East Hanover");
        invoice.setState("NJ");
        invoice.setZipcode("07936");
        invoice.setItemType("Games");
        invoice.setItemID(1);
        invoice.setUnitPrice(new BigDecimal(14.00).setScale(2, RoundingMode.HALF_UP));
        invoice.setQuantity(1);
        invoice.setSubtotal(new BigDecimal(14.00).setScale(2, RoundingMode.HALF_UP));
        invoice.setTax(new BigDecimal(0.7).setScale(2, RoundingMode.HALF_UP));
        invoice.setProcessingFee(new BigDecimal(1.49).setScale(2, RoundingMode.HALF_UP));
        invoice.setTotal(new BigDecimal(16.19).setScale(2, RoundingMode.HALF_UP));

        Invoice invoice1 = new Invoice();

        invoice1.setName("John");
        invoice1.setStreet("Carter");
        invoice1.setCity("Mars");
        invoice1.setState("NJ");
        invoice1.setZipcode("90210");
        invoice1.setItemType("Games");
        invoice1.setItemID(1);
        invoice1.setUnitPrice(new BigDecimal(14.00).setScale(2, RoundingMode.HALF_UP));
        invoice1.setQuantity(1);
        invoice1.setSubtotal(new BigDecimal(14.00).setScale(2, RoundingMode.HALF_UP));
        invoice1.setTax(new BigDecimal(0.7).setScale(2, RoundingMode.HALF_UP));
        invoice1.setProcessingFee(new BigDecimal(1.49).setScale(2, RoundingMode.HALF_UP));
        invoice1.setTotal(new BigDecimal(16.19).setScale(2, RoundingMode.HALF_UP));

        doReturn(invoice).when(invoiceDao).addInvoice(invoice1);

    }

    private void setUpProcessingFeeDaoMock() {

        processingFeeDao = mock(ProcessingFeeDaoJdbcTemplateImpl.class);

        ProcessingFee processingFee = new ProcessingFee();

        processingFee.setProductType("Games");
        processingFee.setFee(new BigDecimal(1.49).setScale(2, RoundingMode.HALF_UP));

        doReturn(processingFee).when(processingFeeDao).getProcessingFee("Games");

    }

    private void setUpSalesTaxDaoMock() {

        salesTaxRateDao = mock(SalesTaxRateDaoJdbcTemplateImpl.class);

        SalesTaxRate salesTax = new SalesTaxRate();

        salesTax.setState("CA");
        salesTax.setRate(new BigDecimal(0.06).setScale(2, RoundingMode.HALF_UP));

        doReturn(salesTax).when(salesTaxRateDao).getSalesTaxRate("CA");

    }

    private void setUpTShirtsDaoMock() {

        tShirtDao = mock(TShirtDaoJdbcImpl.class);

        TShirt tShirt = new TShirt();

        tShirt.settShirtID(8);
        tShirt.setSize("Large");
        tShirt.setColor("Pink");
        tShirt.setDescription("Long sleeve");
        tShirt.setPrice(new BigDecimal(1.00).setScale(2, RoundingMode.HALF_UP));
        tShirt.setQuantity(45);

        TShirt tShirts1 = new TShirt();

        tShirts1.setSize("X-Large");
        tShirts1.setColor("Red");
        tShirts1.setDescription("button down");
        tShirts1.setPrice(new BigDecimal(1.00).setScale(2, RoundingMode.HALF_UP));
        tShirts1.setQuantity(42);

        List<TShirt> tShirtsList = new ArrayList<>();
        tShirtsList.add(tShirt);

        doReturn(tShirt).when(tShirtDao).addTShirt(tShirts1);
        doReturn(tShirt).when(tShirtDao).getTShirt(8);
        doReturn(tShirtsList).when(tShirtDao).getAllTShirts();
        doReturn(tShirtsList).when(tShirtDao).gettShirtByColor(tShirt.getColor());
        doReturn(tShirtsList).when(tShirtDao).gettShirtBySize(tShirt.getSize());
    }




}