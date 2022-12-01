package com.example.springfisrtproject.controller;

import com.example.springfisrtproject.model.Account;
import com.example.springfisrtproject.service.AccountService;
import com.example.springfisrtproject.service.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/main/accounts")
public class AccountController {
    @Autowired
    private AccountService service;
    @Autowired
    private Authorization auth;

    @PostMapping("/save")
    public Account save(@RequestBody Account account) {
        return service.save(account);
    }

    @GetMapping("/get")
    public Account findById(@RequestParam Long id) {
        return service.findById(id);
    }

    @GetMapping("get/all")
    public List<Account> findAll() {
        return service.findAll();
    }
    @PostMapping("signIn")
    public String signIn(@RequestBody Account account){

        return auth.signIn(account.getLogin(), account.getPassword());

    }
}
