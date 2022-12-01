package com.example.springfisrtproject.service.impl;

import com.example.springfisrtproject.model.Account;
import com.example.springfisrtproject.repository.AccountRep;
import com.example.springfisrtproject.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRep rep;
    @Override
    public Account save(Account account) {
        account.setAttempts(0);
        account.setTimestamp(new Timestamp(System.currentTimeMillis()));
        return rep.save(account) ;
    }

    @Override
    public Account findById(Long id) {
        return rep.findById(id).orElseThrow(()->new RuntimeException("id  не найдено!!!"));
    }

    @Override
    public List<Account> findAll() {
        return rep.findAll();
    }

//    public Account LogIN(String userName,String password){
//        Account account =new Account();
//        account.setLogin(userName);
//        account.setPassword(password);
//        return rep.findOne(Example.of(account)).orElse(null);
//    }
}
