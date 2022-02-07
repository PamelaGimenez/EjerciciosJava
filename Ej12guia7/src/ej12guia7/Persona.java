package ej12guia7;

import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;



public class Persona {
   private String nombre;
   private Date fechaDeNacimiento;

    public Persona(){
    }

    public Persona(String nombre, Date fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void crearPersona(){
        int dia;
        int mes;
        int anio;


        Scanner ingresoDatos = new Scanner(System.in, StandardCharsets.ISO_8859_1).useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese un nombre");
        nombre=ingresoDatos.next();
        System.out.println("Ingrese el día de nacimiento");
        dia = ingresoDatos.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        mes = ingresoDatos.nextInt();
        System.out.println("Ingrese el año de nacimiento");
        anio = ingresoDatos.nextInt();
        Date fechaNacimiento = new Date(anio-1900, mes -1, dia);
        setFechaDeNacimiento(fechaNacimiento);

        String fechaNacimientoFormateada = new SimpleDateFormat("dd-MM-yyyy").format(fechaNacimiento);



        System.out.println("La fecha de nacimiento ingresada es "+ fechaNacimientoFormateada);
    }


    public int calcularEdad() {
        Date fechaActual = new Date();
        int añoActual = fechaActual.getYear() + 1900;
        int añoNacimiento = getFechaDeNacimiento().getYear() + 1900;
        int edad = añoActual - añoNacimiento;

        return edad;
    }


    public boolean menorQue(int edadPersona1) {
        Scanner ingresoDatos = new Scanner(System.in, StandardCharsets.ISO_8859_1).useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingresa la edad que querés comparar");
        int edadPersona2 = ingresoDatos.nextInt();

        if ( edadPersona1<edadPersona2) {
            System.out.println("La primer edad ingresada es menor a la segunda");
            return true;
        }
        System.out.println("La edad ingresada para comparar es menor");
        return false;
    }
    public void mostrarPersona(){
        System.out.println("Estos son los datos de la persona:");
        String fechaActualFormateada = new SimpleDateFormat("dd-MM-yyyy").format(getFechaDeNacimiento());
        System.out.println("Nombre: "+getNombre()+"\n"+"Fecha de nacimiento: "+ fechaActualFormateada );

    }







}
