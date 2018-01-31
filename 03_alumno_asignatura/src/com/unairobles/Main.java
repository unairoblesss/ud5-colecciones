package com.unairobles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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

                asignaturas.add(new Asignatura(nombre1, HorasSemanales));
                break;
            case 3:
                Alumno alumnoEncontrado = buscarAlumno(alumnos, br);
                Asignatura asignaturaEncontrado = buscarAsignatura(asignaturas, br);

                asignaturaEncontrado.getAlumnos().add(alumnoEncontrado);
                alumnoEncontrado.getAsignaturas().add(asignaturaEncontrado);

                break;
            case 4:

                asignaturaEncontrado = buscarAsignatura(asignaturas, br);
                asignaturaEncontrado.getAlumnos().forEach(al -> {
                    System.out.println(al);
                });

                break;
            case 5:

                alumnoEncontrado = buscarAlumno(alumnos, br);
                alumnoEncontrado.getAsignaturas().forEach(asig -> {
                    System.out.println(asig);
                });


                break;
            case 6:
                break;
                default:
                    System.out.println(" ERROR ESCRIBE UNA OPCION VALIDA ");
                    break;
                }
        }while (opcion != 6);
    }

    private static Alumno buscarAlumno(List<Alumno> alumnos, BufferedReader br) throws IOException {
        System.out.println(" Alumnos ");
        for (Alumno aluTemp : alumnos){
        System.out.println(aluTemp);}
        System.out.println("Alumno a matricular: ");
        String nombreAlumno = br.readLine();
        int i = 0;
        while(i<alumnos.size()&&
                !nombreAlumno.equalsIgnoreCase(alumnos.get(i).getNombre())
                ){
            i++;
        }
        Alumno alumnoEncontrado = null;
        if (i<alumnos.size()){
            alumnoEncontrado = alumnos.get(i);
        }
        return alumnoEncontrado;
    }

    private static Asignatura buscarAsignatura(List<Asignatura> asignaturas, BufferedReader br) throws IOException {
        System.out.println(" Asignaturas ");
        for (Asignatura asiTemp : asignaturas){
            System.out.println(asiTemp);}
        System.out.println("Asignatura en la que matricular ");
        String nombreAsignatura = br.readLine();
        int j = 0;
        while(j<asignaturas.size()&&
                !nombreAsignatura.equalsIgnoreCase(asignaturas.get(j).getNombre1())
                ){
            j++;
        }
        Asignatura asignaturaEncontrado = null;
        if (j<asignaturas.size()){
            asignaturaEncontrado = asignaturas.get(j);
        }
        return asignaturaEncontrado;
    }
}

