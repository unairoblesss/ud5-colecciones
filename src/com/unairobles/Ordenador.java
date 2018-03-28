package com.unairobles;

import java.util.ArrayList;
import java.util.List;

public class Ordenador {
    String marca;
    String modelo;
    String fechaCompra;

    public Ordenador(List<Tecnico> tecnicos, List<Aula> aulas) {
        Tecnicos = tecnicos;
        Aulas = aulas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ordenador ordenador = (Ordenador) o;

        if (marca != null ? !marca.equals(ordenador.marca) : ordenador.marca != null) return false;
        if (modelo != null ? !modelo.equals(ordenador.modelo) : ordenador.modelo != null) return false;
        if (fechaCompra != null ? !fechaCompra.equals(ordenador.fechaCompra) : ordenador.fechaCompra != null)
            return false;
        if (Tecnicos != null ? !Tecnicos.equals(ordenador.Tecnicos) : ordenador.Tecnicos != null) return false;
        return Aulas != null ? Aulas.equals(ordenador.Aulas) : ordenador.Aulas == null;
    }

    @Override
    public int hashCode() {
        int result = marca != null ? marca.hashCode() : 0;
        result = 31 * result + (modelo != null ? modelo.hashCode() : 0);
        result = 31 * result + (fechaCompra != null ? fechaCompra.hashCode() : 0);
        result = 31 * result + (Tecnicos != null ? Tecnicos.hashCode() : 0);
        result = 31 * result + (Aulas != null ? Aulas.hashCode() : 0);
        return result;
    }

    private List<Tecnico> Tecnicos = new ArrayList<>();
        private List<Aula> Aulas = new ArrayList<>();

    public List<Tecnico> getTecnicos() {
        return Tecnicos;
    }

    public List<Aula> getAulas() {
        return Aulas;
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fechaCompra='" + fechaCompra + '\'' +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Ordenador(String marca, String modelo, String fechaCompra) {

        this.marca = marca;
        this.modelo = modelo;
        this.fechaCompra = fechaCompra;
    }
}
