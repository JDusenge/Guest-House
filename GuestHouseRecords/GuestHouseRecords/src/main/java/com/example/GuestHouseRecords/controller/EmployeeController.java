package com.example.GuestHouseRecords.controller;

import com.example.GuestHouseRecords.entity.Employee;
import com.example.GuestHouseRecords.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class EmployeeController {
    @Autowired
    private EmployeeRepository repository;

    @GetMapping("/Employee")
    public String viewEmployee(Model model) {
        model.addAttribute("EmployeeList", repository.findAll());
        return "Employee";
    }
    @PostMapping("/addEmp")
    public String addEmpl(Employee employee, Model model) {
        model.addAttribute("employee", new Employee());
        repository.save(employee);
        return "redirect:/Employee";
    }

    @GetMapping("/delete3/{id}")
    public String deleteEmp(@PathVariable("id") Integer id){
        repository.deleteById(id);
        return"redirect:/Employee";
    }

    @GetMapping("/edit3/{id}")
    public String editEmp(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("employee", repository.findById(id).get());
        model.addAttribute("EmployeeList", repository.findAll());
        return "editEmployee";
    }
}
