package com.example.springfisrtproject.service.impl;

import com.example.springfisrtproject.model.Positions;
import com.example.springfisrtproject.repository.PositionsRep;
import com.example.springfisrtproject.service.PositionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PositionsServiceImpl implements PositionsService {
    @Autowired
    private PositionsRep rep;
    @Override
    public Positions save(Positions positions) {
        return rep.save(positions);
    }

    @Override
    public Positions findById(Long id) {
        return rep.findById(id).orElseThrow(()->new RuntimeException("id  не найдено!!!"));
    }

    @Override
    public List<Positions> findAll() {
        return rep.findAll();
    }
}
