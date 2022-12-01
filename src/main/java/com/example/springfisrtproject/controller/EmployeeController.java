package com.example.springfisrtproject.controller;

import com.example.springfisrtproject.model.Employee;
import com.example.springfisrtproject.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/main/empl")
public class EmployeeController {

    @Autowired
    private BaseService<Employee> service;

    @PostMapping("/save")
    public Employee save(@RequestBody Employee employee) {
        return service.save(employee);
    }

    @GetMapping("/get")
    public Employee findById(@RequestParam Long id) {
        return service.findById(id);
    }

    @GetMapping("get/all")
    public List<Employee> findAll() {
        return service.findAll();
    }
}
