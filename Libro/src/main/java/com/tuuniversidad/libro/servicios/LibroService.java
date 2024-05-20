package com.tuuniversidad.libro.servicios;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuuniversidad.libro.modelos.Libro;
import com.tuuniversidad.libro.repositories.LibroRepository;

import java.util.List;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> findAll() {
        return libroRepository.findAll();
    }

    public Libro findById(Long id) {
        return libroRepository.findById(id);
    }

    public void save(Libro libro) {
        libroRepository.save(libro);
    }
}