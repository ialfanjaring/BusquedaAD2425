package org.iesch.ad.busqueda.servicio;

import jakarta.transaction.Transactional;
import org.iesch.ad.busqueda.modelo.Autor;
import org.iesch.ad.busqueda.modelo.Libro;
import org.iesch.ad.busqueda.repositorio.AutorRepository;
import org.iesch.ad.busqueda.repositorio.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataService {

    @Autowired
    LibroRepository libroRepository;
    @Autowired
    AutorRepository autorRepository;

    public void crearDatos(){
        Autor autor = new Autor();

        autor.setName("Cervantes");
        autorRepository.save(autor);

        Libro libro1 = new Libro();
        libro1.setTitle("El quijote");
        libro1.setAutor(autor);
        libroRepository.save(libro1);

        Libro libro2 = new Libro();
        libro2.setTitle("La galatea");
        libro2.setAutor(autor);
        libroRepository.save(libro2);

        Libro libro3 = new Libro();
        libro3.setTitle("La gitanilla");
        libro3.setAutor(autor);
        libroRepository.save(libro3);

    }

    @Transactional
    public void testLazy(){

        System.out.println("MOSTRAR TODOS LOS LIBROS");


        libroRepository.findAll().forEach(book -> {
            System.out.println("Titulo del libro: " + book.getTitle());

            try {
                System.out.println("Me duermo");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Autor: " + book.getAutor().getName());

        });

    }
}
