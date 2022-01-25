package com.example.GuestHouseRecords.controller;

import com.example.GuestHouseRecords.entity.Employee;
import com.example.GuestHouseRecords.entity.Staff;
import com.example.GuestHouseRecords.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class StaffController {
    @Autowired
    private StaffRepository repository;

    @GetMapping("/Staff")
    public String viewStaff(Model model) {
        model.addAttribute("StaffList", repository.findAll());
        return "Staff";
    }
    @PostMapping("/addSta")
    public String addSta(Staff staff, Model model) {
        model.addAttribute("staff", new Staff());
        repository.save(staff);
        return "redirect:/Staff";
    }
    @GetMapping("/delete1/{id}")
    public String deleteSta(@PathVariable("id") Integer id){
        repository.deleteById(id);
        return"redirect:/Staff";
    }

    @GetMapping("/edit1/{id}")
    public String editAthl(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("staff", repository.findById(id).get());
        model.addAttribute("StaffList", repository.findAll());
        return "editStaff";
    }
}