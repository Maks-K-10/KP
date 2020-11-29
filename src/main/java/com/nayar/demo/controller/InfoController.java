package com.nayar.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InfoController {

    @GetMapping("/info")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        return "Info";
    }

}