package com.example.ketocalculator.controller;

import com.example.ketocalculator.model.Calculation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.Console;

@Controller
public class HomeController {
    @GetMapping(path = "/")
    public String index(Model model, Calculation calculation) {
        model.addAttribute("calculation", calculation);

        return "index";
    }

    @PostMapping("/")
    public String submit(Calculation calculation) {
        System.out.print(calculation);
        return "index";
    }
}
