package ej11guia7;

import java.nio.charset.StandardCharsets;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int dia;
        int mes;
        int anio;


        Date fechaActual = new Date();
        String fechaActualFormateada = new SimpleDateFormat("dd-MM-yyyy").format(fechaActual);

        Scanner ingresoDatos = new Scanner(System.in, StandardCharsets.ISO_8859_1).useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el día");
        dia = ingresoDatos.nextInt();
        System.out.println("Ingrese el mes");
        mes = ingresoDatos.nextInt();
        System.out.println("Ingrese el año");
        anio = ingresoDatos.nextInt();
        Date fechaUsuario = new Date(anio-1900, mes -1, dia);
        String fechaUsuarioFormateada = new SimpleDateFormat("dd-MM-yyyy").format(fechaUsuario);


        System.out.println("La fecha actual es "+fechaActualFormateada);
        System.out.println("La fecha ingresada es "+fechaUsuarioFormateada);

        int diferenciaEntreFechas= fechaActual.getYear()- fechaUsuario.getYear();
        System.out.println("Los años entre la fecha actual y la fecha ingresada son "+diferenciaEntreFechas+ " años.");


















    }
}
