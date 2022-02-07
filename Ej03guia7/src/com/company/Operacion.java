package com.company;

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class Operacion {
    private double numero1;
    private double numero2;

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    public Operacion (){
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    public void crearOperacion(){
        Scanner ingresoDatos = new Scanner(System.in, StandardCharsets.ISO_8859_1).useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese un número");
        numero1 = ingresoDatos.nextDouble();
        System.out.println("Ingrese otro numero");
        numero2 = ingresoDatos.nextDouble();
    }
    public double sumar(){
        return numero1 + numero2;
    }
    public double restar(){
        return numero1 - numero2;
    }
    public double multiplicar (){
        if (numero1== 0 || numero2 == 0){
            System.out.println("Error");
        }
        return numero1 * numero2;
    }
    public double dividir (){
        if (numero1 == 0 || numero2 == 0){
            System.out.println("Error");
        }
        return numero1 / numero2;
    }
}
