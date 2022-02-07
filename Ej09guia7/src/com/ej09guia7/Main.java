package com.ej09guia7;

public class Main {

    public static void main(String[] args) {
        Matematica matematica = new Matematica();
        matematica.setNum1(Math.random()*11);
        matematica.setNum2(Math.random()*11);
        System.out.println("********************");
        System.out.printf("El mayor valor entre los dos números aleatorios es %.2f%n",matematica.devolverMayor());
        System.out.println("********************");
        matematica.calcularPotencia();
        System.out.println("********************");
        matematica.calcularRaiz();
        System.out.println("********************");
    }
}
