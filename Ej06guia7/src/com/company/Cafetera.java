package com.company;

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class Cafetera {
    double capacidadMax;
    double cantActual;

    public Cafetera(double capacidadMax, double cantActual) {
        this.capacidadMax = capacidadMax;
        this.cantActual = cantActual;
    }
    public Cafetera (){
    }

    public double getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(double capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public double getCantActual() {
        return cantActual;
    }

    public void setCantActual(double cantActual) {
        this.cantActual = cantActual;
    }
    public void llenarCafetera(){
        Scanner ingresoDatos = new Scanner(System.in, StandardCharsets.ISO_8859_1).useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese la capacidad en cc que posee la cafetera");
        cantActual = ingresoDatos.nextDouble();
        capacidadMax = cantActual;
        System.out.println("La  cafetera se llenó con éxito, su capacidad es de "+ capacidadMax+ " cc");
    }
    public void servirTaza(int capacidad){
        Scanner ingresoDatos = new Scanner(System.in, StandardCharsets.ISO_8859_1).useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese la capacidad en cc de la taza que desea servir");
        capacidad = ingresoDatos.nextInt();

        if (capacidad>cantActual){
            System.out.println("La taza no se llenó, queda "+ (capacidad-cantActual) + "cc de su capacidad") ;
        }else {
            System.out.println("La taza se llenó");
        }
    }
    public void vaciarCafetera(){
        cantActual = 0;
        System.out.println("La cafetera se vació correctamente");
    }
    public int agregarCafe(int cantidadCafe){
        Scanner ingresoDatos = new Scanner(System.in, StandardCharsets.ISO_8859_1).useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese la cantidad de café en cc que desea agregar");
        cantidadCafe = ingresoDatos.nextInt();
        cantActual = cantActual + cantidadCafe;
        return (int) cantActual;
    }
}
