package com.unairobles;

import java.util.ArrayList;
import java.util.List;

public class CuentaBancaria {
    private String codigoCuenta;
    private List<Titular> titulars =new ArrayList<>();
    private List<Apunte> apuntes = new ArrayList<>();
    public String getCodigoCuenta() {
        return codigoCuenta;
    }

    public double calcularSaldo(){return 0.0;}

    public void setApuntes(List<Apunte> apuntes) {
        this.apuntes = apuntes;
    }

    public void nuevoApunte(double cantidad) {
        Apunte a = new Apunte(cantidad, "hoy");
        apuntes.add(a);
        a.setCuentaBancaria();
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "codigoCuenta='" + codigoCuenta + '\'' +
                ", titulars=" + titulars +
                ", apuntes=" + apuntes +
                '}';
    }

    public void setCodigoCuenta(String codigoCuenta) {
        this.codigoCuenta = codigoCuenta;
    }

    public CuentaBancaria(String codigoCuenta) {

        this.codigoCuenta = codigoCuenta;
    }

    public List<Titular> getTitulars() {
        return titulars;
    }

    public List<Apunte> getApuntes() {
        return apuntes;
    }
}
