package com.unairobles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
    List<Tecnico> tecnicos = new ArrayList<>();
    List<Ordenador> ordenadores = new ArrayList<>();
    List<Aula> aulas = new ArrayList<>();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int opcion;
	do {
        System.out.println(" Ordenadores & Tecnicos ");
        System.out.println("__________________________");
        System.out.println(" 1. Nuevo Tecnico ");
        System.out.println(" 2. Nueva Aula ");
        System.out.println(" 3. Nuevo ordenador (asociado a un aula ");
        System.out.println(" 4. Asignar ordenador a tecnico para reparar ");
        System.out.println(" 5. Listado de ordenadores de un aula ");
        System.out.println(" 6. Listado de ordenadores de un tecnico y aula en la que esta cada uno ");
        System.out.println(" 7. Salir ");
        System.out.println(" Opción: ");
        opcion = Integer.parseInt(br.readLine());
        switch (opcion){
            case 1:
                System.out.println(" Nombre: ");
                String nombre = br.readLine();
                System.out.println(" DNI: ");
                String dni = br.readLine();
                System.out.println(" Años Experiencia ");
                int añosExperiencia = Integer.parseInt(br.readLine());
                Tecnico t = new Tecnico(nombre, dni, añosExperiencia);
                tecnicos.add(t);
                break;
            case 2:
                System.out.println(" Aula: ");
                String campus = br.readLine();
                System.out.println(" Numero Aula: ");
                int numero = Integer.parseInt(br.readLine());
                Aula a = new Aula(campus, numero);
                aulas.add(a);
                break;
            case 3:
                System.out.println(" Marca: ");
                String marca = br.readLine();
                System.out.println(" Modelo: ");
                String modelo = br.readLine();
                System.out.println(" Fecha De Compra");
                String fechaCompra = br.readLine();
                System.out.println("Selecciona aula: ");
                for (int i = 0; i < aulas.size(); i++) {
                    System.out.println(i + " - " + aulas.get(i).getNumero());
                }
                System.out.println(" Aula a la que pertenece ");
                numero = Integer.parseInt(br.readLine());
                Aula aulaSeleccionada = aulas.get(numero);

                Ordenador o = new Ordenador(marca, modelo, fechaCompra);
                ordenadores.add(o);

                aulaSeleccionada.no tienes ni idea mas te vale estudiar JAJAJAJAJA
                  LISTADOS! !!!!!!!!!!!!!!!!!!! repasa los ejercicios anda del girhub en kelo
                noseque pollas de los sets oa lgo asi que no ai que usarlos
                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
            default:

                break;
        }
    }while (opcion < 8);
    }
}
