package com.nayar.demo.controller;

import com.nayar.demo.DAO.ClientRepository;
import com.nayar.demo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InfoController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/Info")
    public String home(Model model) {
        Iterable<Customer> clients = clientRepository.findAll();
        model.addAttribute("clients", clients);
        return "Info";
    }

}