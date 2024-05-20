package com.tuuniversidad.libro.repositories;



import org.springframework.stereotype.Repository;

import com.tuuniversidad.libro.modelos.Libro;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LibroRepository {
    private static List<Libro> libros = new ArrayList<>();

    static {
        // Aquí puedes agregar objetos quemados de libros
        libros.add(new Libro(1L, "Libro 1", "Autor 1", "Editorial 1", 2010));
        libros.add(new Libro(2L, "Libro 2", "Autor 2", "Editorial 2", 2015));
    }

    public List<Libro> findAll() {
        return libros;
    }

    public Libro findById(Long id) {
        return libros.stream()
                .filter(libro -> libro.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void save(Libro libro) {
        libros.add(libro);
    }
}