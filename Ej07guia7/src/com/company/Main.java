package com.company;

public class Main {

    public static void main(String[] args) {

        int bajoPeso =  0;
        int pesoIdeal = 0;
        int sobrepeso = 0;
        int mayorEdad = 0;
        int menorEdad = 0;

        Persona persona1 = new Persona();
        persona1.crearPersona();

        if (persona1.imc() == -1) {
            bajoPeso++;
        }
        if (persona1.imc() == 0) {
            pesoIdeal++;
        }
        if (persona1.imc() == 1) {
            sobrepeso++;
        }
        if (persona1.esMayorDeEdad()) {
            mayorEdad++;
        } else {
            menorEdad++;
        }


        Persona persona2 = new Persona();
        persona2.crearPersona();

        if (persona2.imc() == -1) {
            bajoPeso++;

        }
        if (persona2.imc() == 0) {
            pesoIdeal++;

        }
        if (persona2.imc() == 1) {
            sobrepeso++;

        }

        if (persona2.esMayorDeEdad()) {
            mayorEdad++;
        } else {
            menorEdad++;
        }

        Persona persona3 = new Persona();
        persona3.crearPersona();
        if (persona3.imc() == -1) {
            bajoPeso++;

        }
        if (persona3.imc() == 0) {
            pesoIdeal++;

        }
        if (persona3.imc() == 1) {
            sobrepeso++;

        }

        if (persona3.esMayorDeEdad() ) {
            mayorEdad++;
        } else {
            menorEdad++;
        }


        Persona persona4 = new Persona();
        persona4.crearPersona();

        if (persona4.imc() == -1) {
            bajoPeso++;

        }
        if (persona4.imc() == 0) {
            pesoIdeal++;

        }
        if (persona4.imc() == 1) {
            sobrepeso++;

        }
        if (persona4.esMayorDeEdad()) {
            mayorEdad++;
        } else {
            menorEdad++;
        }


        System.out.println("El porcentaje de personas con bajo peso es " + (100 * bajoPeso / 4) + " %");
        System.out.println("El porcentaje de personas con peso ideal es " + (100 * pesoIdeal / 4) + " %");
        System.out.println("El porcentaje de personas con sobrepeso es " + (100 * sobrepeso / 4) + " %");
        System.out.println("El porcentaje de personas mayores de edad es " + (100 * mayorEdad / 4) + " %");
        System.out.println("El porcentaje de personas menores de edad es " + (100 * menorEdad / 4) + " %");

        }
    }






