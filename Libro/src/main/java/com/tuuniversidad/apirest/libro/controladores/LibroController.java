package com.tuuniversidad.apirest.libro.controladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tuuniversidad.apirest.libro.modelos.Libro;
import com.tuuniversidad.apirest.libro.servicios.LibroService;

@RestController
public class LibroController {


    @Autowired
    private LibroService libroService;

    @GetMapping ("/LIBRO_libro")
    
    public List<Libro> getLibros() {
        List<Libro> libros = new ArrayList<>();
        libros.add(new Libro(1 , "Cien años de soledad", "Gabriel García Márquez", "Bloomsbury Publishing Scholastic"));
        libros.add(new Libro(2 , "En busca del tiempo perdido", "Marcel Proust","Editorial Planeta "));
        libros.add(new Libro(3 ,  "Alicia en el país de las maravillas", "Lewis Carroll", "Jan Romein"));
        return libros;
    }

    // Endpoint para obtener todos los libros
    @GetMapping
    public List<Libro> ObtenerTodosLosLibros() {
        return libroService.getLibros();
    }
    // Endpoint para obtener un libro por su ID
    @GetMapping("/{id}")
    public Libro ObtenerLibroPorId(@PathVariable Long id) {
        return libroService.getLibro(id);
    }

    // Endpoint para crear un nuevo libro
    @PostMapping("/Crear_Libro")
    public Libro crearLibro(@RequestBody Libro nuevoLibro) {
        return libroService.crearLibro(nuevoLibro);
    }
}

    
