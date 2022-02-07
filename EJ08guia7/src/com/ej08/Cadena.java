package com.ej08;



public class Cadena {
    private String cadena;

    public Cadena(String cadena) {
        this.cadena = cadena;
    }

    public Cadena() {
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }


    public void mostrarVocales() {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if ((cadena.charAt(i) == 'a') || (cadena.charAt(i) == 'e') || (cadena.charAt(i) == 'i') || (cadena.charAt(i) == 'o') || (cadena.charAt(i) == 'u')) {
                {
                    contador++;

                }
            }
        }
        System.out.println("La frase o palabra ingresada contiene " + contador + " vocales");
    }

    public void invertirFrase() {
        //Para usar el método reverse() de la clase StringBuilder y obtener la cadena en orden inverso,
        StringBuilder frase = new StringBuilder(cadena);
        //y usamos el método toString() para obtener el objeto cadena del objeto StringBuilder
        String cadenaInvertida = frase.reverse().toString();
        System.out.println("Frase o palabra ingresada: "+ cadena );
        System.out.println("Frase o palabra invertida: "+ cadenaInvertida );
    }

    public String vecesRepetido(String letra) {
        int contadorLetra = 0;
        int posicionLetra = 0;
        posicionLetra = cadena.indexOf(letra);

        while (posicionLetra != -1) { //mientras se encuentre el caracter
            contadorLetra++;           //se cuenta
            //se sigue buscando a partir de la posición siguiente a la encontrada
            posicionLetra = cadena.indexOf(letra, posicionLetra + 1);
        }
        return String.valueOf(contadorLetra);
    }

    public String compararLongitud(String frase, String frase2) {

        int longF1 = frase.length();
        int longF2 = frase2.length();
        if (longF1 == longF2) {
            System.out.println("Las frases o palabras son iguales");
        } else {
            if (longF1 > longF2) {
                System.out.println("La primer frase o palabra es mayor");
            } else {
                System.out.println("La primer frase o palabra es menor");
            }
        }return frase + frase2;

    }

    public String unirFrase(String frase, String frase2){
        return frase.concat(frase2);
    }

    public String reemplazar(String letra){
        return cadena.replace("a",letra);
    }

    public boolean contiene(String letra){
       return cadena.contains(letra);

    }


}




