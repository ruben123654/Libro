
package com.tuuniversidad.apirest.libro.servicios;

import java.util.List;
import com.tuuniversidad.apirest.libro.modelos.Libro;

public interface LibroService {

    Libro getLibro(Long id);
    List<Libro> getLibros(Long id);
    List<Libro> getLibros();
    Libro crearLibro(Libro nuevoLibro);

}
