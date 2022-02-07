package com.company;

public class Main {

    public static void main(String[] args) {
	Operacion operacion = new Operacion();
    operacion.crearOperacion();
    System.out.println("El resultado de la suma es igual a "+ operacion.sumar());
    System.out.println("El resultado de la resta es igual a "+ operacion.restar());
    System.out.println("El resultado de la multiplicación es igual a "+ operacion.multiplicar());
    System.out.println("El resultado de la división es igual a "+ operacion.dividir());
    }
}
