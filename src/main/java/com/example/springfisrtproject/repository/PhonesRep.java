package com.example.springfisrtproject.repository;

import com.example.springfisrtproject.model.Phones;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhonesRep extends JpaRepository<Phones,Long> {
}
