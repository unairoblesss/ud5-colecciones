package com.unairobles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Persona> Personas = new HashSet<>();
        Set<Persona> masPersonas = new HashSet<>();


        int i = 0;
        do {
            i = i + 1;
            System.out.println("Introduce Nombre usuario: ");
            String nombre = br.readLine();
            System.out.println("Introduce DNI usuario: ");
            String DNI = br.readLine();

            Persona b = new Persona(DNI, nombre);
            masPersonas.add(b);

        } while (i < 6);
        do {
            i = i + 1;
            System.out.println("Introduce Nombre usuario: ");
            String nombre = br.readLine();
            System.out.println("Introduce DNI usuario: ");
            String DNI = br.readLine();

            Persona a = new Persona(DNI, nombre);
            Personas.add(a);
        }
        while (i < 11);
        //  hasta aqui pides usuarios al usuario valga la rebundancia xD//
        //Te faltan otros 4 puntos//



        //Punto 2: Con esto volcaria Personas en MasPersonas falta visualizarlo en pantalla//
        Set<Persona> Resultado = new HashSet<>(Personas);
        Resultado.addAll(masPersonas);
    }
}
