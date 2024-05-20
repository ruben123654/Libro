package com.tuuniversidad.apirest.libro.modelos;

public class Libro {
    private Long id;
    private String titulo;
    private String autor;
    private String editorial;
    

    // Constructor
    public Libro(int id, String titulo, String autor, String editorial) {
        this.id = (long) id;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }


    // Método toString para representación textual del objeto
    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                '}';
    }
}
