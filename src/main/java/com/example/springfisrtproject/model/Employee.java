package com.example.springfisrtproject.model;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Table(name="tb_employee")
@Getter
@Setter
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;

    @OneToOne
    @JoinColumn(name = "account_id")
    Account account;

    @OneToOne
    @JoinColumn(name = "position_id")
    Positions positions;

    @OneToMany
    @JoinColumn(name = "employee_id")
    List<Phones> phones;

}
