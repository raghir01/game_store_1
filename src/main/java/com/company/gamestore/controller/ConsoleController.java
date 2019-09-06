package com.company.gamestore.controller;

import com.company.gamestore.service.InvoiceService;
import com.company.gamestore.viewmodel.ConsoleViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/store")
public class ConsoleController {
    @Autowired
    private InvoiceService service;


    @PostMapping("/consoles")
    @ResponseStatus(value = HttpStatus.CREATED)
    public ConsoleViewModel addConsole(@RequestBody @Valid ConsoleViewModel consoleViewModel){
        return service.addConsole(consoleViewModel);
    }

    @GetMapping("/consoles/{consoleId}")
    @ResponseStatus(value = HttpStatus.OK)
    public ConsoleViewModel getConsole(@PathVariable int consoleId){
        return service.getConsole(consoleId);
    }

    @GetMapping("/consoles")
    @ResponseStatus(value = HttpStatus.OK)
    public List<ConsoleViewModel> getAllConsole() {
        return service.getAllConsole();
    }


    @PutMapping("/consoles")
    @ResponseStatus(value = HttpStatus.OK)
    public ConsoleViewModel updateConsole(@RequestBody @Valid ConsoleViewModel consoleViewModel){
        return service.updateConsole(consoleViewModel);
    }

    @DeleteMapping("/consoles/{consoleId}")
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteConsole(@PathVariable int consoleId){
        service.deleteConsole(consoleId);
    }

    @GetMapping("/consoles/manufacturer/{manufacturer}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<ConsoleViewModel> findConsolesByManufacturers(@PathVariable String manufacturer) {
        return service.findConsolesByManufacturer(manufacturer);
    }

}
