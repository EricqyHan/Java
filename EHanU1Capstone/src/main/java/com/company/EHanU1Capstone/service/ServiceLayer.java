package com.company.EHanU1Capstone.service;

import com.company.EHanU1Capstone.dao.*;
import com.company.EHanU1Capstone.model.*;
import com.company.EHanU1Capstone.viewmodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class ServiceLayer {

    ConsoleDao consoleDao;
    GameDao gameDao;
    InvoiceDao invoiceDao;
    ProcessingFeeDao processingFeeDao;
    SalesTaxRateDao salesTaxRateDao;
    TShirtDao tShirtDao;

    @Autowired
    public ServiceLayer(ConsoleDao consoleDao, GameDao gameDao, InvoiceDao invoiceDao, ProcessingFeeDao processingFeeDao, SalesTaxRateDao salesTaxRateDao, TShirtDao tShirtDao) {
        this.consoleDao = consoleDao;
        this.gameDao = gameDao;
        this.invoiceDao = invoiceDao;
        this.processingFeeDao = processingFeeDao;
        this.salesTaxRateDao = salesTaxRateDao;
        this.tShirtDao = tShirtDao;
    }


    /////////////// API //////////////
    // Console API
    public ConsoleViewModel saveConsole(ConsoleViewModel consoleViewModel){
        Console console = new Console();
        console.setConsoleID(consoleViewModel.getConsoleID());
        console.setModel(consoleViewModel.getModel());
        console.setManufacturer(consoleViewModel.getManufacturer());
        console.setMemoryAmount(consoleViewModel.getMemoryAmount());
        console.setProcessor(consoleViewModel.getMemoryAmount());
        console.setPrice(consoleViewModel.getPrice());
        console.setQuantity(consoleViewModel.getQuantity());

        consoleViewModel.setConsoleID(console.getConsoleID());
        return consoleViewModel;

    }

    public void updateConsole(ConsoleViewModel consoleViewModel){
        Console console = new Console();
        console.setConsoleID(consoleViewModel.getConsoleID());
        console.setModel(consoleViewModel.getModel());
        console.setManufacturer(consoleViewModel.getManufacturer());
        console.setMemoryAmount(consoleViewModel.getMemoryAmount());
        console.setProcessor(consoleViewModel.getMemoryAmount());
        console.setPrice(consoleViewModel.getPrice());
        console.setQuantity(consoleViewModel.getQuantity());

        consoleDao.updateConsole(console);
    }

    public ConsoleViewModel findConsoleByid(int id) {
        Console console = consoleDao.getConsole(id);
        if(console == null)
            return null;
        else
            return buildConsoleViewModel(console);
    }

    public void removeConsole(int id) {
        consoleDao.deleteConsole(id);
    }


    //////////////////////
    // Game API
    public GameViewModel saveGame(GameViewModel gameViewModel) {
        Game game = new Game();
        game.setGameID(gameViewModel.getGameID());
        game.setTitle(gameViewModel.getTitle());
        game.setEsrbRating(gameViewModel.getEsrbRating());
        game.setDescription(gameViewModel.getDescription());
        game.setPrice(gameViewModel.getPrice());
        game.setStudio(gameViewModel.getStudio());
        game.setQuantity(gameViewModel.getQuantity());

        gameViewModel.setGameID(game.getGameID());
        return gameViewModel;
    }


    public void updateGame(GameViewModel gameViewModel){
        Game game = new Game();
        game.setGameID(gameViewModel.getGameID());
        game.setTitle(gameViewModel.getTitle());
        game.setEsrbRating(gameViewModel.getEsrbRating());
        game.setDescription(gameViewModel.getDescription());
        game.setPrice(gameViewModel.getPrice());
        game.setStudio(gameViewModel.getStudio());
        game.setQuantity(gameViewModel.getQuantity());

        gameDao.updateGame(game);
    }

    public GameViewModel findGameById(int id){
        Game game = gameDao.getGame(id);
        if(game == null)
            return null;
        else
            return buildGameViewModel(game);
    }

    public void removeGame(int id){
        gameDao.deleteGame(id);
    }

    /////////// Invoice ////////////

    public InvoiceViewModel saveInvoice(InvoiceViewModel invoiceViewModel) {
        Invoice invoice =  new Invoice();
        invoice.setName(invoiceViewModel.getName());
        invoice.setStreet(invoiceViewModel.getStreet());
        invoice.setCity(invoiceViewModel.getState());
        invoice.setState(invoiceViewModel.getZipcode());
        invoice.setZipcode(invoiceViewModel.getZipcode());
        invoice.setItemType(invoiceViewModel.getItemType());
        invoice.setItemID(invoiceViewModel.getItemID());
        invoice.setUnitPrice(invoiceViewModel.getUnitPrice());
        invoice.setQuantity(invoiceViewModel.getQuantity());
        invoice.setSubtotal(invoiceViewModel.getSubtotal());
        invoice.setTax(invoiceViewModel.getTax());
        invoice.setProcessingFee(invoiceViewModel.getProcessingFee());
        invoice.setTotal(invoiceViewModel.getTax());


        invoiceViewModel.setItemID(invoice.getItemID());
        return invoiceViewModel;

    }

    public void updateInvoice(InvoiceViewModel invoiceViewModel){
        Invoice invoice =  new Invoice();
        invoice.setName(invoiceViewModel.getName());
        invoice.setStreet(invoiceViewModel.getStreet());
        invoice.setCity(invoiceViewModel.getState());
        invoice.setState(invoiceViewModel.getZipcode());
        invoice.setZipcode(invoiceViewModel.getZipcode());
        invoice.setItemType(invoiceViewModel.getItemType());
        invoice.setItemID(invoiceViewModel.getItemID());
        invoice.setUnitPrice(invoiceViewModel.getUnitPrice());
        invoice.setQuantity(invoiceViewModel.getQuantity());
        invoice.setSubtotal(invoiceViewModel.getSubtotal());
        invoice.setTax(invoiceViewModel.getTax());
        invoice.setProcessingFee(invoiceViewModel.getProcessingFee());
        invoice.setTotal(invoiceViewModel.getTax());

        invoiceDao.updateInvoice(invoice);
    }


    public updateView





    /////////// TShirt ////////////
    public TShirtViewModel saveTShirt(TShirtViewModel tShirtViewModel) {
        TShirt tShirt = new TShirt();
        tShirt.settShirtID(tShirtViewModel.gettShirtID());
        tShirt.setSize(tShirtViewModel.getSize());
        tShirt.setColor(tShirtViewModel.getColor());
        tShirt.setDescription(tShirtViewModel.getDescription());
        tShirt.setPrice(tShirtViewModel.getPrice());
        tShirt.setQuantity(tShirtViewModel.getQuantity());

        tShirtViewModel.settShirtID(tShirt.gettShirtID());
        return tShirtViewModel;
    }

    public void updateTShirt(TShirtViewModel tShirtViewModel){
        TShirt tShirt = new TShirt();
        tShirt.settShirtID(tShirtViewModel.gettShirtID());
        tShirt.setSize(tShirtViewModel.getSize());
        tShirt.setColor(tShirtViewModel.getColor());
        tShirt.setDescription(tShirtViewModel.getDescription());
        tShirt.setPrice(tShirtViewModel.getPrice());
        tShirt.setQuantity(tShirtViewModel.getQuantity());

        tShirtDao.updateTShirt(tShirt);
    }


    public void removeTShirt(int id){
        tShirtDao.deleteTShirt(id);
    }


    public TShirtViewModel findTShirtById(int id){
        TShirt tshirt = tShirtDao.getTShirt(id);
        if(tshirt == null)
            return null;
        else
            return buildTShirtViewModel(tshirt);
    }




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

    private ProcessingFeeViewModel buildProcessingFeeViewModel(ProcessingFee processingFee) {
        ProcessingFeeViewModel processingFeeViewModel = new ProcessingFeeViewModel();
        processingFee.setProductType(processingFee.getProductType());
        processingFee.setFee(processingFee.getFee());

        return processingFeeViewModel;
    }

    private SalesTaxRateViewModel buildSalesTaxRateViewModel(SalesTaxRate salesTaxRate) {
        SalesTaxRateViewModel salesTaxRateViewModel = new SalesTaxRateViewModel();
        salesTaxRate.setState(salesTaxRate.getState());
        salesTaxRate.setRate(salesTaxRate.getRate());

        return salesTaxRateViewModel;
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
