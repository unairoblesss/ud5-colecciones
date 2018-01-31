package com.unairobles;

import java.util.ArrayList;
import java.util.List;

public class Ticket {

    private int numero;
    private String fecha;
    private String hora;

    public Ticket()

    private List<LineaTicket> lineas = new ArrayList<>();

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public List<LineaTicket> getLineas() {
        return lineas;
    }
}
