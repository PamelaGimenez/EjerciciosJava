package com.company;

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta();
        cuenta1.crearCuenta();
        String respuesta;
        int opcion;
        do {
            Scanner ingresoDatos = new Scanner(System.in, StandardCharsets.ISO_8859_1).useDelimiter("\n").useLocale(Locale.US);
            String menu = "Ingrese la operación que desea realizar: \n 1-Ingresar dinero \n 2-Retirar dinero \n 3-Extracción rápida \n 4-Consultar Saldo \n 5-Consultar datos \n 6-Salir";
            System.out.println(menu);
            opcion = ingresoDatos.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el monto que desea ingresar");
                    double montoIngresar = ingresoDatos.nextDouble();
                    System.out.println("Su saldo actual es " + cuenta1.ingresar(montoIngresar));
                    break;
                case 2:
                    System.out.println("Ingrese el monto que desea retirar");
                    double montoRetirar = ingresoDatos.nextDouble();
                    System.out.println("Su saldo actual es "+cuenta1.retirar(montoRetirar));
                    break;
                case 3:
                    cuenta1.extraccionRapida();
                    break;
                case 4:
                    cuenta1.consultarSaldo();
                    break;
                case 5:
                    cuenta1.consultarDatos();
                    break;
                case 6:
                    System.out.println("Gracias por utilizar el servicio");
            }

        }while (opcion != 6);

    }
}
