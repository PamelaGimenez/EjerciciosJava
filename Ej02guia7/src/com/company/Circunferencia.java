package com.company;

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class Circunferencia {
    private float radio;

    public Circunferencia(float radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    public void crearCircunferencia(){
        Scanner ingresoDatos = new Scanner(System.in, StandardCharsets.ISO_8859_1).useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el radio");
        radio = ingresoDatos.nextFloat();
    }
    public void area (){
        System.out.println("El area es "+ (Math.PI * Math.pow(radio,2)));

    }
    public void perimetro(){
        System.out.println("El perimetro es  "+ (2* Math.PI*radio));
    }
}
