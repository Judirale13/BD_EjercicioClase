package com.example.bd_ejercicioclase.model;


import javax.persistence.*;

@Entity
public class Municipio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY

    )
    private Long id_mun;
    private String nombre;
    private Long area;
    private Long presupuesto;

    public Municipio() {
    }

    public Municipio(String nombre, Long area, Long presupuesto) {
        this.nombre = nombre;
        this.area = area;
        this.presupuesto = presupuesto;
    }

    public Long getId_mun() {
        return id_mun;
    }

    public void setId_mun(Long id_mun) {
        this.id_mun = id_mun;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getArea() {
        return area;
    }

    public void setArea(Long area) {
        this.area = area;
    }

    public Long getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Long presupuesto) {
        this.presupuesto = presupuesto;
    }
}
