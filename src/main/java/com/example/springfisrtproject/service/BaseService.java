package com.example.springfisrtproject.service;

import java.util.List;

public interface BaseService <T>{
    T save(T t);
    T findById(Long id);
    List<T> findAll();

}
