package ej12guia7;



public class Main {

    public static void main(String[] args) {
	Persona persona1 = new Persona();
    persona1.crearPersona();
    System.out.println("La edad de la persona ingresada es "+persona1.calcularEdad());
    System.out.println(persona1.menorQue(persona1.calcularEdad()));
    persona1.mostrarPersona();




    }

}
