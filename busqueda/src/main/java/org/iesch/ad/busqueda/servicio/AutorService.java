package org.iesch.ad.busqueda.servicio;


import org.iesch.ad.busqueda.modelo.Autor;
import org.iesch.ad.busqueda.repositorio.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AutorService {

    @Autowired
    AutorRepository autorRepository;
    public List<Autor> devuelveTodos() {
        return autorRepository.findAll();
    }


}
