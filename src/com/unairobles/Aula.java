package com.unairobles;


import java.util.ArrayList;
import java.util.List;

public class Aula {
    String campus;
    int numero;



    public List<Ordenador> getOrdenadores() {
        return Ordenadores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aula aula = (Aula) o;

        if (numero != aula.numero) return false;
        return Ordenadores != null ? Ordenadores.equals(aula.Ordenadores) : aula.Ordenadores == null;
    }

    @Override
    public int hashCode() {
        int result = numero;
        result = 31 * result + (Ordenadores != null ? Ordenadores.hashCode() : 0);
        return result;
    }

    private List<Ordenador> Ordenadores = new ArrayList<>();


    @Override
    public String toString() {
        return "Aula{" +
                "campus='" + campus + '\'' +
                ", numero=" + numero +
                '}';
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Aula(String campus, int numero) {

        this.campus = campus;
        this.numero = numero;
    }
}
