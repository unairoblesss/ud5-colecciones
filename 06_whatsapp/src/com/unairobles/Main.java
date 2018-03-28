package com.unairobles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {
        Map<String, Contacto> agenda = new HashMap<>();
    }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion;
        int opcion2;
        do {
        System.out.println("1. Gestión de contactos ");
        System.out.println("2. Busqueda ");
        System.out.println("3. Listados ");
        System.out.println("4. Salir ");
        opcion = Integer.parseInt(br.readLine());
        switch (opcion) {
            case 1:
                System.out.println("1. Nuevo contacto ");
                System.out.println("2. Eliminar Contacto ");
                opcion2 = Integer.parseInt(br.readLine());
                switch (opcion2){
                    case 1:
                        System.out.println("Introduce Numero de Teñlefono");
                        int telefono = Integer.parseInt(br.readLine());
                        System.out.println("Nombre: ");
                        String nombre = br.readLine();
                        System.out.println("Apellido: ");
                        String apellido = br.readLine();
                        System.out.println("Email: ");
                        String email = br.readLine();
                        agenda.put(telefono, new Contacto(nombre, apellido, email));
                        break;
                    case 2:
                        System.out.println("Numero a Borrar");
                        int borrame = Integer.parseInt(br.readLine());
                        if(agenda.remove(borrame) != null){
                        System.out.println(" Borrado OK ");
                    }else {System.out.println(" Borrado NULL");
                        break;}
                break;
            case 2:
                System.out.println("1. Buscar contacto por numero de telefono ");
                System.out.println("2. Buscar contacto por nombre ");
                opcion2 = Integer.parseInt(br.readLine());
                switch (opcion2){
                    case 1:
                        System.out.println("Introduce Numero de Teñlefono");
                        int numbuscar = Integer.parseInt(br.readLine());
                        System.out.println(agenda.get(numbuscar));
                        break;
                    case 2:
                        System.out.println("Introduce el Nombre: ");
                        String buscame = br.readLine();
                        agenda.forEach((k,v) -> {
                            if (v.getNombre().equalsIgnoreCase(buscame))
                                System.out.println(v);});
                        break;}
                break;
            case 3:
                System.out.println("1. Listado de todos los contactos, tal como se han añadido ");
                System.out.println("2. Listado de todos los contactos, ordenados por numero de telefono ");
                opcion2 = Integer.parseInt(br.readLine());
                switch (opcion2){
                    case 1:

                        break;
                    case 2:
                        SortedMap<String, Contacto> agendaOrdenada =  new TreeMap<>(agenda);

                        break;}
                break;
            case 4:
                break;
            default:

                break;
        }}while (opcion > 4);
    }
}
