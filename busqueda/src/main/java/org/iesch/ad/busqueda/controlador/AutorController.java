package org.iesch.ad.busqueda.controlador;

import org.iesch.ad.busqueda.servicio.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutorController {

    @Autowired
    AutorService autorService;

    @GetMapping("/api/autores")
    public ResponseEntity<?> devuelveTodos(){
        return ResponseEntity.ok(autorService.devuelveTodos());
    }
}
