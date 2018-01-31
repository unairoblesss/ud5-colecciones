package com.unairobles;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Numeroo: ");
        int numero = Integer.parseInt(br.readLine());
        System.out.print("Fecha: ");
        String fecha = br.readLine();
        System.out.print("Hora: ");
        String hora = br.readLine();
        //Vinculo ticket con Main
        Ticket t = new Ticket();
        char continuar;
        do{ System.out.print("Fecha: ");
            String fecha = br.readLine();
            System.out.print("Hora: ");
            String hora = br.readLine();
            System.out.println("¿Quieres continuar? (s/n):");
        continuar = br.readLine().toLowerCase().charAt(0);}while ()
    }

}
