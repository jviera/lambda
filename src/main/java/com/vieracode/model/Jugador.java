package com.vieracode.model;


import com.vieracode.common.Posicion;
import java.time.LocalDate;

public class Jugador {

    private String nombre;
    private LocalDate fechaNacimiento;
    private Posicion posicion;

    public Jugador() {
    }

    public Jugador(String nombre, LocalDate fechaNacimiento, Posicion posicion) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.posicion = posicion;
    }   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }    
}