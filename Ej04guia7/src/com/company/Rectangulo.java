package com.company;

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public Rectangulo(){

    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearRectangulo(){
            do {
                System.out.println("Un rectángulo posee dos lados que son opuestos paralelos entre sí tienen la misma longitud y los dos restantes tienen otra longitud.");
                Scanner ingresoDatos = new Scanner(System.in, StandardCharsets.ISO_8859_1).useDelimiter("\n").useLocale(Locale.US);
                System.out.println("Ingrese la base del rectángulo");
                base = ingresoDatos.nextDouble();
                System.out.println("Ingrese la altura del rectángulo");
                altura = ingresoDatos.nextDouble();
            }while (altura == base);
    }
    public void superficieRectangulo (){
        double superficie = base * altura;
        System.out.println("/// La superficie es de "+superficie+ " ///");
    }
    public void perimetroRectangulo(){
        double perimetro=(base+altura)*2;
        System.out.println("/// El perímetro es de "+ perimetro+" ///");
    }
    public void dibujarRectangulo(){
        System.out.println("/// Este es el dibujo del rectángulo con las medidas que ingresaste ///\n");
        for (int i = 0; i < altura; i++)
            { for (int j = 0; j < base ; j++)
                    System.out.print(" * ");
                    System.out.println("");
            }
        }
    }
