package com.company;

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class Cuenta {
    int numeroCuenta;
    long DNI;
    double saldo;

    public Cuenta(int numeroCuenta, long DNI, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldo = saldo;
    }

    public Cuenta() {

    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void crearCuenta() {
        Scanner ingresoDatos = new Scanner(System.in, StandardCharsets.ISO_8859_1).useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese su número de cuenta");
        numeroCuenta = ingresoDatos.nextInt();
        System.out.println("Ingrese su DNI");
        DNI = ingresoDatos.nextLong();
        System.out.println("Ingrese el saldo");
        saldo = ingresoDatos.nextDouble();
    }


    public void extraccionRapida() {
        Scanner ingresoDatos = new Scanner(System.in, StandardCharsets.ISO_8859_1).useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Seleccionó extracción rápida, ingrese el monto que desea retirar");
        double extraccionR = ingresoDatos.nextDouble();
        if (extraccionR > saldo * 0.20) {
            System.out.println("No se puede extraer un monto mayor al 20% en extracciones rápidas");
        } else {
            saldo = saldo - extraccionR;
        }
    }

    public void consultarSaldo() {
        System.out.println("Su saldo es " + saldo);
    }

    public void consultarDatos() {
        System.out.println("Los datos ingresado son: \n" + " Número de cuenta: " + numeroCuenta + "\n DNI: " + DNI + "\n Saldo: " + saldo);
    }

    public double ingresar(double ingreso) {
        return saldo += ingreso;
    }

    public double retirar(double retiro) {
        if (saldo < retiro || saldo < 0) {
            saldo = 0;
            System.out.println("Su saldo es insuficiente");
        }
            return saldo -= retiro;
    }

}
