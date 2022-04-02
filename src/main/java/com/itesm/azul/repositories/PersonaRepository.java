package com.itesm.azul.repositories;

import com.itesm.azul.models.Persona;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonaRepository {

    public List<Persona> findAll(){
        Persona p1 = new Persona();
        p1.setNombre("Paola");
        p1.setEdad(21);
        Persona p2 = new Persona();
        p2.setNombre("Pepe");
        p2.setEdad(21);
        List<Persona> personas= new ArrayList<>();
        personas.add(p1);
        personas.add(p2);
        return personas;
    }
}
