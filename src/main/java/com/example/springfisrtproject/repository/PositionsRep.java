package com.example.springfisrtproject.repository;

import com.example.springfisrtproject.model.Positions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionsRep extends JpaRepository<Positions,Long> {
}
