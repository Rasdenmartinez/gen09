package com.ejercicio1SpringBoot.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "departamento")
public class Departamento {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name ="m2")
    private Long m2;
    @Column(name = "precio")
    private Long precio;
}
