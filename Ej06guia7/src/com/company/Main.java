package com.company;

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cafetera cafetera = new Cafetera();
        cafetera.llenarCafetera();
        Scanner opciones = new Scanner(System.in, StandardCharsets.ISO_8859_1).useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese la opción que desea: \n 1-Servir Taza \n 2-Vaciar cafetera \n 3-Agregar café");
        int opcion = opciones.nextInt();

        switch (opcion) {

            case 1 :
                cafetera.servirTaza(0);
                break;
            case 2 :
                cafetera.vaciarCafetera();
                break;
            case 3 :
                System.out.println("La cantidad que posee la cafetera es " + cafetera.agregarCafe(0) + " cc");
                break;
        }
    }
}
