package com.nayar.demo.controller;

import com.nayar.demo.DAO.ClientRepository;
import com.nayar.demo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class EditController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/Edit/{id}")
    public String edit(@PathVariable(value = "id") long id, Model model) {
        if(!clientRepository.existsById(id)){
            return "redirect:/Info";
        }
        Optional<Customer> customer = clientRepository.findById(id);
        ArrayList<Customer> res=new ArrayList<>();
        customer.ifPresent(res::add);
        model.addAttribute("customer", res);
        return "Edit";
    }

}
