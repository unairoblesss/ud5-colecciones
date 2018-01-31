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
