package org.iesch.ad.busqueda.repositorio;

import org.iesch.ad.busqueda.modelo.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository  extends JpaRepository<Autor, Long> {
}
