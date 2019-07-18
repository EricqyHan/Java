package com.company.EHanU1Capstone.service;

import com.company.EHanU1Capstone.dao.*;
import com.company.EHanU1Capstone.model.Console;
import com.company.EHanU1Capstone.model.Game;
import com.company.EHanU1Capstone.model.Invoice;
import com.company.EHanU1Capstone.model.TShirt;
import com.company.EHanU1Capstone.viewmodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ServiceLayer {
    ConsoleDao consoleDao;
    GameDao gamesDao;
    InvoiceDao invoiceDao;
    ProcessingFeeDao processingFeeDao;
    SalesTaxRateDao salesTaxDao;
    TShirtDao tShirtsDao;

    @Autowired
    public ServiceLayer(ConsoleDao consoleDao, GameDao gamesDao, InvoiceDao invoiceDao, ProcessingFeeDao processingFeeDao, SalesTaxRateDao salesTaxDao, TShirtDao tShirtsDao) {
        this.consoleDao = consoleDao;
        this.gamesDao = gamesDao;
        this.invoiceDao = invoiceDao;
        this.processingFeeDao = processingFeeDao;
        this.salesTaxDao = salesTaxDao;
        this.tShirtsDao = tShirtsDao;
    }

    ///////// API //////////

    ///////// Console /////////
    public List<ConsoleViewModel> findAllConsoles(){
        List<Console> consoleList = consoleDao.getAllConsoles();
        List<ConsoleViewModel> consoleViewModelList = new ArrayList<>();

        consoleList.stream()
                .forEach(console -> {
                    ConsoleViewModel consoleViewModel = buildConsoleViewModel(console);
                    consoleViewModelList.add(consoleViewModel);
                });
        return consoleViewModelList;
    }

    public ConsoleViewModel saveConsole(ConsoleViewModel consoleViewModel) {

        Console console = new Console();
        console.setModel(consoleViewModel.getModel());
        console.setManufacturer(consoleViewModel.getManufacturer());
        console.setMemoryAmount(consoleViewModel.getMemoryAmount());
        console.setProcessor(consoleViewModel.getProcessor());
        console.setPrice(consoleViewModel.getPrice());
        console.setQuantity(consoleViewModel.getQuantity());
        console =  consoleDao.addConsole(console);

        consoleViewModel.setConsoleID(console.getConsoleID());
        return consoleViewModel;
    }

    public ConsoleViewModel findConsolesbyId(int id) {

        Console consoles =  consoleDao.getConsole(id);
        if(consoles == null)
            return null;
        else
            return buildConsoleViewModel(consoles);
    }


    public void removeConsole(int id) {

        consoleDao.deleteConsole(id);
    }


    public void updateConsole(ConsoleViewModel consoleViewModel){

        Console consoles = new Console();
        consoles.setConsoleID(consoleViewModel.getConsoleID());
        consoles.setModel(consoleViewModel.getModel());
        consoles.setManufacturer(consoleViewModel.getManufacturer());
        consoles.setMemoryAmount(consoleViewModel.getMemoryAmount());
        consoles.setProcessor(consoleViewModel.getProcessor());
        consoles.setPrice(consoleViewModel.getPrice());
        consoles.setQuantity(consoleViewModel.getQuantity());


        consoleDao.updateConsole(consoles);
    }

    public List<ConsoleViewModel> findConsolesByManufacturer(String manufacturer){

        List<Console> consolesList = consoleDao.getConsoleByManufacturer(manufacturer);
        List<ConsoleViewModel> consoleViewModelList = new ArrayList<>();

        consolesList.stream()
                .forEach(consoles -> {
                    ConsoleViewModel cvm = buildConsoleViewModel(consoles);
                    consoleViewModelList.add(cvm);
                });
        return consoleViewModelList;
    }


    ///////// Game /////////

    public List<GameViewModel> findAllGames(){

        List<Game> gamesList = gamesDao.getAllGames();
        List<GameViewModel> gamesViewModelList = new ArrayList<>();

        gamesList.stream()
                .forEach(games -> {
                    GameViewModel tvm = buildGameViewModel(games);
                    gamesViewModelList.add(tvm);
                });
        return gamesViewModelList;
    }

    public GameViewModel saveGame(GameViewModel gamesViewModel) {

        Game games = new Game();

        games.setTitle(gamesViewModel.getTitle());
        games.setEsrbRating(gamesViewModel.getEsrbRating());
        games.setDescription(gamesViewModel.getDescription());
        games.setPrice(gamesViewModel.getPrice());
        games.setStudio(gamesViewModel.getStudio());
        games.setQuantity(gamesViewModel.getQuantity());

        games =  gamesDao.addGame(games);

        gamesViewModel.setGameID(games.getGameID());
        return gamesViewModel;



    }

    public GameViewModel findGamesbyId(int id) {

        Game games =  gamesDao.getGame(id);
        if(games == null)
            return null;
        else
            return buildGameViewModel(games);

    }

    public void removeGame(int id){

        gamesDao.deleteGame(id);
    }

    public void updateGame(GameViewModel gamesViewModel){

        Game games = new Game();

        games.setGameID(gamesViewModel.getGameID());
        games.setTitle(gamesViewModel.getTitle());
        games.setEsrbRating(gamesViewModel.getEsrbRating());
        games.setDescription(gamesViewModel.getDescription());
        games.setPrice(gamesViewModel.getPrice());
        games.setStudio(gamesViewModel.getStudio());
        games.setQuantity(gamesViewModel.getQuantity());


        gamesDao.updateGame(games);

    }

    public List<GameViewModel> findGamesByStudio(String studio){

        List<Game> gamesList = gamesDao.getGameByStudio(studio);
        List<GameViewModel> gamesViewModelList = new ArrayList<>();

        gamesList.stream()
                .forEach(games -> {
                    GameViewModel gvm = buildGameViewModel(games);
                    gamesViewModelList.add(gvm);
                });
        return gamesViewModelList;
    }

    public List<GameViewModel> findGamesByErsb(String ersb){

        List<Game> gamesList = gamesDao.getGameByESRBRating(ersb);
        List<GameViewModel> gamesViewModelList = new ArrayList<>();

        gamesList.stream()
                .forEach(games -> {
                    GameViewModel gvm = buildGameViewModel(games);
                    gamesViewModelList.add(gvm);
                });
        return gamesViewModelList;
    }

    public List<GameViewModel> findGamesByTitle(String title){

        List<Game> gamesList = gamesDao.getGameByTitle(title);
        List<GameViewModel> gamesViewModelList = new ArrayList<>();

        gamesList.stream()
                .forEach(games -> {
                    GameViewModel gvm = buildGameViewModel(games);
                    gamesViewModelList.add(gvm);
                });
        return gamesViewModelList;
    }

    ////////////// TShirts ///////////////

    public List<TShirtViewModel> findAllTShirts(){

        List<TShirt> tShirtsList = tShirtsDao.getAllTShirts();
        List<TShirtViewModel> tshirtsViewModelList = new ArrayList<>();

        tShirtsList.stream()
                .forEach(tShirts -> {
                    TShirtViewModel tvm = buildTShirtViewModel(tShirts);
                    tshirtsViewModelList.add(tvm);
                });
        return tshirtsViewModelList;
    }



    public TShirtViewModel saveTShirt(TShirtViewModel tshirtsViewModel) {

        TShirt tShirts = new TShirt();

        tShirts.setSize(tshirtsViewModel.getSize());
        tShirts.setColor(tshirtsViewModel.getColor());
        tShirts.setDescription(tshirtsViewModel.getDescription());
        tShirts.setPrice(tshirtsViewModel.getPrice());
        tShirts.setQuantity(tshirtsViewModel.getQuantity());

        tShirts =  tShirtsDao.addTShirt(tShirts);

        tshirtsViewModel.settShirtID(tShirts.gettShirtID());
        return tshirtsViewModel;
    }

    public TShirtViewModel findTShirtsbyId(int id) {

        TShirt tShirts =  tShirtsDao.getTShirt(id);
        if(tShirts == null)
            return null;
        else
            return buildTShirtViewModel(tShirts);
    }

    public void removeTShirt(int id){

        tShirtsDao.deleteTShirt(id);
    }

    public void updateTShirt(TShirtViewModel tshirtsViewModel){

        TShirt tShirts = new TShirt();

        tShirts.settShirtID(tshirtsViewModel.gettShirtID());
        tShirts.setSize(tshirtsViewModel.getSize());
        tShirts.setColor(tshirtsViewModel.getColor());
        tShirts.setDescription(tshirtsViewModel.getDescription());
        tShirts.setPrice(tshirtsViewModel.getPrice());
        tShirts.setQuantity(tshirtsViewModel.getQuantity());

        tShirtsDao.updateTShirt(tShirts);
    }

    public List<TShirtViewModel> findTShirtsByColor(String color){

        List<TShirt> tShirtsList = tShirtsDao.gettShirtByColor(color);
        List<TShirtViewModel> tshirtsViewModelList = new ArrayList<>();

        tShirtsList.stream()
                .forEach(tShirts -> {
                    TShirtViewModel tvm = buildTShirtViewModel(tShirts);
                    tshirtsViewModelList.add(tvm);
                });
        return tshirtsViewModelList;
    }

    public List<TShirtViewModel> findTShirtsBySize(String size){

        List<TShirt> tShirtsList = tShirtsDao.gettShirtBySize(size);
        List<TShirtViewModel> tshirtsViewModelList = new ArrayList<>();

        tShirtsList.stream()
                .forEach(tShirts -> {
                    TShirtViewModel tShirtViewModel = buildTShirtViewModel(tShirts);
                    tshirtsViewModelList.add(tShirtViewModel);
                });
        return tshirtsViewModelList;
    }

    /////////////// Logic //////////////
//
//    public InvoiceViewModel saveInvoice(PurchasingViewModel purchasingViewModel) {
//        Invoice invoice = new Invoice();
//
//        invoice.setName(purchasingViewModel.getName());
//        invoice.setStreet(purchasingViewModel.getStreet());
//        invoice.setCity(purchasingViewModel.getCity());
//        invoice.setState(purchasingViewModel.getState());
//        invoice.setZipcode(purchasingViewModel.getZipCode());
//        invoice.setItemID(purchasingViewModel.getItemId());
//        invoice.setItemType(purchasingViewModel.getItemType());
//        invoice.setQuantity(purchasingViewModel.getQuantity());
//    }







    /////////////// Builders //////////////

    private ConsoleViewModel buildConsoleViewModel(Console console) {
        ConsoleViewModel consoleViewModel = new ConsoleViewModel();
        consoleViewModel.setConsoleID(console.getConsoleID());
        consoleViewModel.setModel(console.getModel());
        consoleViewModel.setManufacturer(console.getManufacturer());
        consoleViewModel.setMemoryAmount(console.getMemoryAmount());
        consoleViewModel.setProcessor(console.getModel());
        consoleViewModel.setPrice(console.getPrice());

        return consoleViewModel;
    }

    private GameViewModel buildGameViewModel(Game game) {
        GameViewModel gameViewModel = new GameViewModel();
        gameViewModel.setGameID(game.getGameID());
        gameViewModel.setTitle(game.getTitle());
        gameViewModel.setEsrbRating(game.getEsrbRating());
        gameViewModel.setDescription(game.getDescription());
        gameViewModel.setStudio(game.getStudio());
        gameViewModel.setQuantity(game.getQuantity());

        return gameViewModel;
    }

    private InvoiceViewModel buildInvoiceViewModel(Invoice invoice) {
        InvoiceViewModel invoiceViewModel = new InvoiceViewModel();
        invoiceViewModel.setInvoiceID(invoice.getInvoiceID());
        invoiceViewModel.setName(invoice.getName());
        invoiceViewModel.setStreet(invoice.getStreet());
        invoiceViewModel.setCity(invoice.getCity());
        invoiceViewModel.setState(invoice.getState());
        invoiceViewModel.setZipcode(invoice.getZipcode());
        invoiceViewModel.setItemType(invoice.getItemType());
        invoiceViewModel.setItemID(invoice.getItemID());
        invoiceViewModel.setUnitPrice(invoice.getUnitPrice());
        invoiceViewModel.setQuantity(invoice.getQuantity());
        invoiceViewModel.setSubtotal(invoice.getSubtotal());
        invoiceViewModel.setTax(invoice.getTax());
        invoiceViewModel.setProcessingFee(invoice.getProcessingFee());
        invoiceViewModel.setTotal(invoice.getTotal());

        return invoiceViewModel;
    }



    private TShirtViewModel buildTShirtViewModel(TShirt tShirt) {
        TShirtViewModel tShirtViewModel = new TShirtViewModel();
        tShirtViewModel.settShirtID(tShirt.gettShirtID());
        tShirtViewModel.setSize(tShirt.getSize());
        tShirtViewModel.setColor(tShirt.getColor());
        tShirtViewModel.setDescription(tShirt.getDescription());
        tShirtViewModel.setPrice(tShirt.getPrice());
        tShirtViewModel.setQuantity(tShirt.getQuantity());

        return tShirtViewModel;
    }



    }
