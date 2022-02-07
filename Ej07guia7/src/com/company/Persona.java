package com.company;

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class Persona {

    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearPersona() {
        Scanner ingresoDatos = new Scanner(System.in, StandardCharsets.ISO_8859_1).useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese su nombre");
        this.nombre = ingresoDatos.next();
        System.out.println("Ingrese su edad");
        this.edad = ingresoDatos.nextInt();

        String opcion = "Incorrecto";
        while (opcion.equals("Incorrecto")) {
            System.out.println("Ingrese su sexo: 'H' (hombre), 'M' (mujer), 'O' (otro)");
            this.sexo = (ingresoDatos.next().toUpperCase().charAt(0));//lee el primer caracter del scanner.
            switch (this.sexo) {
                case 'H':
                case 'O':
                case 'M':
                    opcion = "Correcto";
                    break;
                default:
                    System.out.println("Sexo ingresado incorrectamente!");
                    break;

            }
        }
        System.out.println("Ingrese su peso en kg");
        this.peso = ingresoDatos.nextDouble();
        System.out.println("Ingrese su altura");
        this.altura = ingresoDatos.nextDouble();

    }


    public int imc() {
        double calculoImc;
        calculoImc = this.peso / Math.pow(this.altura, 2);
        if (calculoImc < 20) {
            return -1;
        }
        if (calculoImc > 25) {
            return 1;
        }
        return 0;
    }



    public boolean esMayorDeEdad(){
            return this.edad >=18;
    }

}



