package com.ejercicio1SpringBoot.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "departamento")
public class Departamento {
    //ORM
    //DAO
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name ="m2")
    private Long m2;
    @Column(name = "precio")
    private Long precio;

    public Departamento(Long id, Long m2, Long precio) {
        this.id = id;
        this.m2 = m2;
        this.precio = precio;
    }

    public Departamento() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getM2() {
        return m2;
    }

    public void setM2(Long m2) {
        this.m2 = m2;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "id=" + id +
                ", m2=" + m2 +
                ", precio=" + precio +
                '}';
    }
}
