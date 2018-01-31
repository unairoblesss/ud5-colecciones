package com.unairobles;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

import javax.jws.soap.SOAPBinding;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Titular> titulars = new ArrayList<>();
        List<CuentaBancaria> cuentaBancarias = new ArrayList<>();
        List<Apunte> apuntes = new ArrayList<>();
        int opcion;
        do {
            System.out.println(" ELIGE OPCION ");
            System.out.println(" 1 - TITULAT ");
            System.out.println(" 2 - CUENTA BANCARIA ");
            System.out.println(" 3 - CONSULTAS ");
            System.out.println(" 4 - SALIR ");
            opcion = Integer.parseInt(br.readLine());
            switch (opcion) {
                case 1:
                    System.out.println(" Nuevo Titular - Pulsa cualquier tecla. ");
                    System.out.println(" Nombre: ");
                    String nombre = br.readLine();
                    System.out.println(" Apellidos: ");
                    String apellidos = br.readLine();
                    System.out.println(" DNI ");
                    String dni = br.readLine();
                    System.out.println(" Fecha Alta ");
                    String fechaAlta = br.readLine();
                    System.out.println(" Cuenta Asociada ");
                    String codCuenta = br.readLine();
                    //FALTA VINCULAR EL TITULAR A UN NUMERO DE CUENTA//
                    Titular t = new Titular(nombre,apellidos,dni,fechaAlta);
                    titulars.add(t);
                    break;
                case 2:
                    System.out.println(" Elige opcion: ");
                    System.out.println(" 1 - Nueva Cuenta ");
                    System.out.println(" 2 - Nuevo Apunte ");
                    System.out.println(" 3 - Borrar Cuenta ");
                    opcion = Integer.parseInt(br.readLine());
                    switch (opcion) {
                        case 1:
                            System.out.println(" Escribe codigo de cuenta ");
                            String codigoCuenta = br.readLine();
                            System.out.println(" Escribe titular ");
                            String nombreTitular = br.readLine();
                            //FALTA VINCULAR CUENTA BANCARIA A UN TITULAR//
                            CuentaBancaria c = new CuentaBancaria(codigoCuenta);
                            cuentaBancarias.add(c);
                            break;
                        case 2:
                            System.out.println(" Escribe fecha ");
                            String fecha = br.readLine();
                            System.out.println(" Escribe cantidad ");
                            int cantidad = Integer.parseInt(br.readLine());
                            System.out.println(" Cuenta en la que apuntar ");
                            codigoCuenta = br.readLine();
                            //FALTA VINCULAR APUNTE A CUENTA BANCARIA//
                            Apunte a = new Apunte(fecha,cantidad);
                            apuntes.add(a);
                            break;
                        case 3:

                            break;
                        default:
                            System.out.println(" ERROR ESCRIBE UNA OPCION VALIDA ");
                            break;
                    }
                    break;
                case 3:
                    System.out.println(" Elige opcion: ");
                    System.out.println(" 1 - Saldo de cuentas de un titular ");
                    System.out.println(" 2 - Titulares asociados a una cuenta ");
                    opcion = Integer.parseInt(br.readLine());
                    switch (opcion) {
                        case 1:

                            break;
                        case 2:

                            break;
                        default:
                            System.out.println(" ERROR ESCRIBE UNA OPCION VALIDA ");
                            break;
                    }
                case 4:
                    break;
                default:
                    System.out.println(" ERROR ESCRIBE UNA OPCION VALIDA ");
                    break;
            }
        } while (opcion != 4);
    }
}
