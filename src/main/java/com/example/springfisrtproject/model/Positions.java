package com.example.springfisrtproject.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level= AccessLevel.PRIVATE)
@Getter
@Setter
@Entity
@Table(name="tb_position")
public class Positions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String def;

}
