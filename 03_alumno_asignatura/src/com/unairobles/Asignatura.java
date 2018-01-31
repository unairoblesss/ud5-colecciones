package com.unairobles;

import java.util.ArrayList;
import java.util.List;

public class Asignatura {
    private String nombre1;
    private int horasSemanales;
    private List<Alumno> alumnos = new ArrayList<>();

    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre1='" + nombre1 + '\'' +
                ", horasSemanales=" + horasSemanales +
                ", alumnos=" + alumnos +
                '}';
    }

    public Asignatura(String nombre1, int horasSemanales) {
        this.nombre1 = nombre1;
        this.horasSemanales = horasSemanales;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }
}
