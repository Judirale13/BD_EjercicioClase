package com.example.bd_ejercicioclase.model;

import javax.persistence.*;

@Entity


public class Vivienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_viv;
    private String direccion;
    private  Long capacidad;
    private Long niveles;
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Municipio municipio;

    public Vivienda() {
    }

    public Vivienda(String direccion, Long capacidad, Long niveles, Municipio municipio) {
        this.direccion = direccion;
        this.capacidad = capacidad;
        this.niveles = niveles;
        this.municipio = municipio;
    }



    public Long getId_viv() {
        return id_viv;
    }

    public void setId_viv(Long id_viv) {
        this.id_viv = id_viv;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Long getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Long capacidad) {
        this.capacidad = capacidad;
    }

    public Long getNiveles() {
        return niveles;
    }

    public void setNiveles(Long niveles) {
        this.niveles = niveles;
    }
}
