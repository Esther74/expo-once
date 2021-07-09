/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.expoonce.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author soporte
 */

@Entity

public class Foto implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    
    private String nombre;
    private String ruta;

    //Constructor
    public Foto() {
    }
    
    //Constructor
    public Foto(String nombre, String ruta) {
        this.nombre = nombre;
        this.ruta = ruta;
    }
    
    
    //setters
    
    //este es muy probable que no lo use
    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
    //getters

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRuta() {
        return ruta;
    }

    @Override
    public String toString() {
        return "Foto{" + "id=" + id + ", nombre=" + nombre + ", ruta=" + ruta + '}';
    }
}
