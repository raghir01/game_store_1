package com.company.RaghiRamachandranU1Capstone.dao;
import com.company.RaghiRamachandranU1Capstone.model.Console;

import java.util.List;

public interface ConsoleDao {

    Console addConsole(Console console);

    Console getConsole(int consoleId);

    List<Console> getAllConsoles();

    Console updateConsole(Console console);

    void deleteConsole(int consoleId);

    List<Console> findConsolesbyManufacturer(String manufacturer);

}

