package com.example.springfisrtproject.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name="tb_phones")
@Getter
@Setter
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Phones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String number;
}
