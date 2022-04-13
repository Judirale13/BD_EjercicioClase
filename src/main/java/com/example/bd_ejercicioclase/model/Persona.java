package com.example.bd_ejercicioclase.model;

import javax.persistence.*;
import java.util.*;

@Entity

public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long di;
    private String nombre;
    private Long teléfono;
    private Long edad;
    private  String sexo;
    @OneToOne( cascade = CascadeType.ALL)
    private Municipio municipio;
    /*
    @OneToMany(cascade = CascadeType.ALL)
    private List<Persona> persona;

     */
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "PERSONA_has_VIVIENDA",
            joinColumns = @JoinColumn(
                    name = "id_persona", referencedColumnName = "di"),
            inverseJoinColumns = @JoinColumn(
                    name = "id_viv", referencedColumnName = "id_viv"))
    private Collection< Vivienda > vivienda;



    public Persona() {
    }

    public Persona(String nombre, Long teléfono, Long edad, String sexo, Municipio municipio, List<Persona> persona, Collection<Vivienda> vivienda) {
        this.nombre = nombre;
        this.teléfono = teléfono;
        this.edad = edad;
        this.sexo = sexo;
        this.municipio = municipio;
        //this.persona = persona;
        this.vivienda = vivienda;
    }

    public Long getDi() {
        return di;
    }

    public void setDi(Long di) {
        this.di = di;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(Long teléfono) {
        this.teléfono = teléfono;
    }

    public Long getEdad() {
        return edad;
    }

    public void setEdad(Long edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }
/*
    public List<Persona> getPersona() {
        return persona;
    }

    public void setPersona(List<Persona> persona) {
        this.persona = persona;
    }

 */

    public Collection<Vivienda> getVivienda() {
        return vivienda;
    }

    public void setVivienda(Collection<Vivienda> vivienda) {
        this.vivienda = vivienda;
    }
}
