package com.company;

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class Libro {
    private Integer isbn;
    private String titulo;
    private String autor;
    private Integer nroPaginas;

    public Libro(Integer ISBN, String titulo, String autor, Integer nroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nroPaginas = nroPaginas;
    }
    public Libro (){

    }


    public Integer getisbn() {
        return isbn;
    }

    public void setisbn(Integer ISBN) {
        this.isbn = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNroPaginas() {
        return nroPaginas;
    }

    public void setNroPaginas(Integer nroPaginas) {
        this.nroPaginas = nroPaginas;
    }
    public void cargarLibro(){
        Scanner solicitudDatos = new Scanner(System.in, StandardCharsets.ISO_8859_1).useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el ISBN");
        isbn = solicitudDatos.nextInt();
        System.out.println("Ingrese el título del libro");
        titulo = solicitudDatos.next();
        System.out.println("Ingrese el nombre del autor");
        autor = solicitudDatos.next();
        System.out.println("Ingrese el número de páginas");
        nroPaginas = solicitudDatos.nextInt();
    }
    public void mostrarLibro(){
        System.out.println("El ISBN del libro es "+ isbn);
        System.out.println("El título del libro es "+ titulo);
        System.out.println("El nombre del autor es "+ autor);
        System.out.println("El número de páginas es "+ nroPaginas);

    }
}
