package com.tuuniversidad.apirest.libro.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuuniversidad.apirest.libro.modelos.Libro;
import com.tuuniversidad.apirest.libro.repositories.LibroRepository;

@Service
public class LibroServiceImp implements LibroService{

    @Autowired
    private LibroRepository libroRepository;

    @Override
    public Libro getLibro(Long id) {
        return libroRepository.getLibro(id);
    }

    @Override
    public List<Libro> getLibros(Long id) {
        return libroRepository.getLibros();
    }

    @Override
    public List<Libro> getLibros() {
        return libroRepository.getLibros();
    }

    @Override
    public Libro crearLibro(Libro nuevoLibro) {
        return libroRepository.crearLibro(nuevoLibro);
    }

}
