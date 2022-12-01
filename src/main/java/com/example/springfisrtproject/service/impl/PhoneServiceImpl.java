package com.example.springfisrtproject.service.impl;

import com.example.springfisrtproject.model.Phones;
import com.example.springfisrtproject.repository.PhonesRep;
import com.example.springfisrtproject.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PhoneServiceImpl implements PhoneService {
    @Autowired
    private PhonesRep rep;
    @Override
    public Phones save(Phones phones) {
        return rep.save(phones);
    }

    @Override
    public Phones findById(Long id) {
        return rep.findById(id).orElseThrow(()->new RuntimeException("id  не найдено!!!"));
    }

    @Override
    public List<Phones> findAll() {
        return rep.findAll();
    }
}
