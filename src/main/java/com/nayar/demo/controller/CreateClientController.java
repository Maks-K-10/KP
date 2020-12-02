package com.nayar.demo.controller;

import com.nayar.demo.DAO.ClientRepository;
import com.nayar.demo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CreateClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/CreateClient")
    public String create(Model model) {
        return "CreateClient";
    }

    @PostMapping("/CreateClient")
    public String addClient(@RequestParam String customerName,
                            @RequestParam String customerSurname,
                            @RequestParam String customerSecondName,
                            @RequestParam String groupName,
                            @RequestParam String phoneNumber,
                            @RequestParam String login,
                            @RequestParam String customerPassword,
                            Model model) {
        Customer customer = new Customer(customerName, customerSurname, customerSecondName, groupName, phoneNumber, login, customerPassword);
        customer.setPayment(true);
        customer.setAccountRole("user");
        clientRepository.save(customer);
        return "redirect:/Info";
    }
}
