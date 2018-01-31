package com.unairobles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        List<Alumno> alumnos = new ArrayList<>();
        List<Asignatura> asignaturas = new ArrayList<>();
        int opcion;
        do {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" ELIGE OPCION ");
        System.out.println(" 1 - Crear nuevo alumno ");
        System.out.println(" 2 - Crear nueva asignatura ");
        System.out.println(" 3 - Matricular alumno en asignatura ");
        System.out.println(" 4 - Listado de alumnos matriculados en una asignatura ");
        System.out.println(" 5 - Listado de sasignaturas en las que esta matriculado un alumno y total de horas ");
        System.out.println(" 6 - Salir ");
        opcion = Integer.parseInt(br.readLine());
        switch (opcion) {
            case 1:
                System.out.println(" Nombre: ");
                String nombre = br.readLine();
                System.out.println(" Apellidos: ");
                String apellidos = br.readLine();
                System.out.println(" Email ");
                String email = br.readLine();

                Alumno e = new Alumno(nombre,apellidos,email);
                alumnos.add(e);
                break;
            case 2:
                System.out.println(" Nombre: ");
                String nombre1 = br.readLine();
                System.out.println(" Horas Semanales: ");
                int HorasSemanales = Integer.parseInt(br.readLine());

                Asignatura o = new Asignatura(nombre1, HorasSemanales);
                asignaturas.add(o);
                break;
            case 3:
                System.out.println(" Selecciona una asignatura ");
            for (int i = 0;i < asignaturas.size();i++){
                System.out.println(i+" "+asignaturas.get(i).getNombre1());
            }
                System.out.println(" Elige la asignatura ");
                String  seleccion = br.readLine();
                System.out.println(" Selecciona un alumno ");
                for (int i = 0;i < alumnos.size();i++){
                    System.out.println(i+" "+alumnos.get(i).getNombre());
                }
                System.out.println(" Elige el nombre ");
                String  seleccion2 = br.readLine();
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
                default:
                    System.out.println(" ERROR ESCRIBE UNA OPCION VALIDA ");
                    break;
                }
        }while (opcion != 5);
    }
    }

