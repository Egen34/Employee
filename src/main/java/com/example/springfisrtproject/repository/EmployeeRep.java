package com.example.springfisrtproject.repository;

import com.example.springfisrtproject.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRep extends JpaRepository<Employee,Long> {
}
