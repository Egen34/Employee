package com.example.springfisrtproject.service.impl;

import com.example.springfisrtproject.model.Employee;
import com.example.springfisrtproject.repository.EmployeeRep;
import com.example.springfisrtproject.service.AccountService;
import com.example.springfisrtproject.service.EmployeeService;
import com.example.springfisrtproject.service.PositionsService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRep rep;
    private AccountService accountService;
    private PositionsService positionsService;

    public EmployeeServiceImpl(EmployeeRep rep, AccountService accountService, PositionsService positionsService) {
        this.rep = rep;
        this.accountService = accountService;
        this.positionsService = positionsService;
    }

    @Override
    public Employee save(Employee employee) {
        accountService.save(employee.getAccount());
        return rep.save(employee) ;
    }

    @Override
    public Employee findById(Long id) {
        return rep.findById(id).orElseThrow(()->new RuntimeException("id  не найдено!!!"));
    }

    @Override
    public List<Employee> findAll() {
        return rep.findAll();
    }
}
