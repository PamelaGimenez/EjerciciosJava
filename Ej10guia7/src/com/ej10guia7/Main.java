package com.ej10guia7;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

	double[] arrayA = new double [50];
    double [] arrayB = new double[20];



        //Recorre el array y asigna un valor random
        for (int i = 0; i < arrayA.length; i++) {
           arrayA [i] = (double) Math.round (Math.random() *51);
        }
        //Muestro por pantalla el arregloA, con los números asignados mediante el método Math.random().
        System.out.println("Array a: "+Arrays.toString(arrayA));

        //Ordeno el array a de menor a mayor utilizando el método Arrays.sort().
        Arrays.sort(arrayA);
        //Copio los números del arrayA.
         arrayB = Arrays.copyOfRange(arrayA,0,20);
         //Cargo el arrayB con los primeros 10 números del array a y los 10 restantes con 0.5.
         Arrays.fill(arrayB,10,20,0.5);

        //Imprimo por pantalla el array a y b
        System.out.println("Array a ordenado de menor a mayor: \n"+Arrays.toString(arrayA));
        System.out.println("Array b: \n"+Arrays.toString(arrayB));
    }
}
