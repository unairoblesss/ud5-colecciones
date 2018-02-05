package com.unairobles;

import java.util.ArrayList;
import java.util.List;

public class Apunte {
    private double cantidad;
    private String fecha;
    private List<CuentaBancaria> cuentaBancarias = new ArrayList<>();

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public Apunte(double cantidad, String fecha) {
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Apunte{" +
                "cantidad=" + cantidad +
                ", fecha='" + fecha + '\'' +
                ", cuentaBancarias=" + cuentaBancarias +
                '}';
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public List<CuentaBancaria> getCuentaBancarias() {
        return cuentaBancarias;
    }

}
