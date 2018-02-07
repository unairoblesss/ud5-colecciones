package com.unairobles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
        // Habria que ver si lo has hecho bien jajajajajaja//
        //Te faltan otros 4 puntos//
        //Punto 1: Crear un grupo con todos los elementos sin duplicados  //
        Set<Persona> copia = new HashSet<>(Personas);
        copia.addAll(masPersonas);

        for (Persona b : copia) {
            System.out.println(b);
        }
        //Punto 2: Crear un grupo con todos los elementos y duplicados //
        List<Persona> copia2 = new ArrayList<>(Personas);
        copia2.addAll(masPersonas);

        for (Persona b : copia2) {
            System.out.println(b);
        }
        //Punto 3: Conjunto de personas que esten en Personas pero no en masPersonas //
        Set<Persona> copia3 = new HashSet<>(Personas);
        copia.removeAll(masPersonas);

        for (Persona b : copia3) {
            System.out.println(b);
        }
        //Punto 4: Personas de los dos grupos //
        Set<Persona> copia4 = new HashSet<>(Personas);
        copia.retainAll(masPersonas);

        for (Persona b : copia4) {
            System.out.println(b);
        }
    }
}
