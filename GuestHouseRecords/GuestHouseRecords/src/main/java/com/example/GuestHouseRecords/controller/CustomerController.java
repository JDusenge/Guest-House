package com.example.GuestHouseRecords.controller;

import com.example.GuestHouseRecords.entity.Customer;
import com.example.GuestHouseRecords.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class CustomerController {
    @Autowired
    private CustomerRepository repository;

    @GetMapping("/Customer")
    public String viewCustomer(Model model) {
        model.addAttribute("CustomerList", repository.findAll());
        return "Customer";
    }
    @PostMapping("/addCust")
    public String addCusto(Customer customer, Model model) {
        model.addAttribute("customer", new Customer());
        repository.save(customer);
        return "redirect:/Customer";
    }

    @GetMapping("/delete2/{id}")
    public String deleteCusto(@PathVariable("id") Integer id){
        repository.deleteById(id);
        return"redirect:/Customer";
    }

    @GetMapping("/edit2/{id}")
    public String editCusto(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("customer", repository.findById(id).get());
        model.addAttribute("CustomerList", repository.findAll());
        return "editCustomer";
    }
}