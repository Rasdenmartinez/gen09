package com.tienda.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "empleado")
public class Empleado {

    @Id
    @Column(name = "id_empleado")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "puesto")
    private String puesto;

    @Column(name = "salario")
    private Double salario;

    @Column(name = "fecha_contrato")
    private Date fecha;

}
