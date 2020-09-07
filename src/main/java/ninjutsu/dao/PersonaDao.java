package ninjutsu.dao;

import ninjutsu.dominio.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaDao extends JpaRepository<Persona, Long>{
    
}
