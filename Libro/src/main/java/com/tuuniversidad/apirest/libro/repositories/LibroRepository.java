package com.tuuniversidad.apirest.libro.repositories;

import java.util.List;

import com.tuuniversidad.apirest.libro.modelos.Libro;

public interface LibroRepository {

    Libro getLibro(Long id);
    List<Libro> getLibros(Long id);
    List<Libro> getLibros();
    Libro crearLibro(Libro nuevoLibro);
}
