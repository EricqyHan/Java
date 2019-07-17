package com.company.EHanU1Capstone.dao;

import com.company.EHanU1Capstone.model.Console;

import java.util.List;

public interface ConsoleDao {
    Console addConsole(Console console);

    Console getConsole(int consoleID);

    List<Console> getAllConsoles();

    Console updateConsole(Console console);

    void deleteConsole(int consoleID);

    List<Console> getConsoleByManufacturer(String string);
}
