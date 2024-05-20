package com.tuuniversidad.libro.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tuuniversidad.libro.modelos.Libro;
import com.tuuniversidad.libro.servicios.LibroService;

import java.util.List;

@RestController
@RequestMapping("/libros")

public class LibroController {
    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<Libro> findAll() {
        return libroService.findAll();
    }

    @GetMapping("/{id}")
    public Libro findById(@PathVariable Long id) {
        return libroService.findById(id);
    }

    @PostMapping
    public void save(@RequestBody Libro libro) {
        libroService.save(libro);
    }
}