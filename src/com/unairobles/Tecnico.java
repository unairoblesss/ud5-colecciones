package com.unairobles;

import java.util.ArrayList;
import java.util.List;

public class Tecnico {
    String nombre;
    String dni;



    public List<Ordenador> getOrdenadores() {
        return ordenadores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tecnico tecnico = (Tecnico) o;

        if (!dni.equals(tecnico.dni)) return false;
        return ordenadores != null ? ordenadores.equals(tecnico.ordenadores) : tecnico.ordenadores == null;
    }

    @Override
    public int hashCode() {
        int result = dni.hashCode();
        result = 31 * result + (ordenadores != null ? ordenadores.hashCode() : 0);
        return result;
    }

    private List<Ordenador> ordenadores = new ArrayList<>();


    public Tecnico(String nombre, String dni, int añosExperiencia) {
        this.nombre = nombre;
        this.dni = dni;
        this.añosExperiencia = añosExperiencia;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", añosExperiencia=" + añosExperiencia +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    int añosExperiencia;
     {
    }
}
