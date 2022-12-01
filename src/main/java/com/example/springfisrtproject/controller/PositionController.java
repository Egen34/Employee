package com.example.springfisrtproject.controller;

import com.example.springfisrtproject.model.Positions;
import com.example.springfisrtproject.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1/main/positions")
public class PositionController {
    @Autowired
    private BaseService<Positions> service;

    @PostMapping("/save")
    public Positions save(@RequestBody Positions positions) {
        return service.save(positions);
    }

    @GetMapping("/get")
    public Positions findById(@RequestParam Long id) {
        return service.findById(id);
    }

    @GetMapping("get/all")
    public List<Positions> findAll() {
        return service.findAll();
    }
}
