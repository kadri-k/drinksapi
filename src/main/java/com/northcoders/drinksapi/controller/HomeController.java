package com.northcoders.drinksapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.northcoders.drinksapi.model.Coffee;

@RestController
public class HomeController {

    @GetMapping(value = "/")
    public String home() {
        return "Welcome to the Drinks API!";
    }

    @GetMapping(value = "/coffeelover")
    public Coffee getCoffee(String coffeeName){
        return new Coffee(1, coffeeName);
    }
}
