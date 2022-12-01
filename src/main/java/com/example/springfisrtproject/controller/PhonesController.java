package com.example.springfisrtproject.controller;

import com.example.springfisrtproject.model.Phones;
import com.example.springfisrtproject.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1/main/phones")
public class PhonesController  {
    @Autowired
    private BaseService<Phones> service;


    @PostMapping("/save")
    public Phones save(@RequestBody Phones phones) {
        return service.save(phones);
    }

    @GetMapping("/get")
    public Phones findById(@RequestParam Long id) {
        return service.findById(id);
    }

    @GetMapping("get/all")
    public List<Phones> findAll() {
        return service.findAll();
    }
}
