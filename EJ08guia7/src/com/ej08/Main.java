package com.ej08;

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cadena cadena = new Cadena();


        Scanner ingresoDatos = new Scanner(System.in, StandardCharsets.ISO_8859_1).useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese una frase o palabra");
        String frasePalabra = ingresoDatos.next().toLowerCase();
        cadena.setCadena(frasePalabra);
        cadena.mostrarVocales();
        cadena.invertirFrase();
        System.out.println("Ingrese la letra que desea saber cuantas veces se repite en la frase o palabra ingresada");
        String letra = ingresoDatos.next().toLowerCase(Locale.ROOT);
        System.out.println("La letra que ingresaste se repite "+cadena.vecesRepetido(letra)+ " veces.");
        System.out.println("Ingrese una nueva frase");
        String frasePalabra2 = ingresoDatos.next().toLowerCase();
        cadena.compararLongitud(frasePalabra,frasePalabra2);
        System.out.println("Las frases unidas quedan "+cadena.unirFrase(frasePalabra,frasePalabra2));
        System.out.println("Ingrese el caracter por el cual desea reemplazar la letra a de su frase");
        String caracter = ingresoDatos.next().toLowerCase();
        System.out.println(cadena.reemplazar(caracter));
        System.out.println("Ingrese el caracter que desea buscar");
        String caracterBuscado= ingresoDatos.next().toLowerCase();
        if(cadena.contiene(caracterBuscado)){
            System.out.println("Verdadero");
        }else {
            System.out.println("Falso");
        }







    }
}
