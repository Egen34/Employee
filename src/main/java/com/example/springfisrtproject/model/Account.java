package com.example.springfisrtproject.model;



import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.sql.Timestamp;

@Entity
@Table(name="tb_account")
@Getter
@Setter
@ToString
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String login;
    String password;
    Timestamp timestamp;
    Integer attempts;

}

