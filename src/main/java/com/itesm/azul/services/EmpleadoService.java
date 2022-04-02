package com.itesm.azul.services;

import com.itesm.azul.models.Empleado;
import com.itesm.azul.models.Persona;
import com.itesm.azul.repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {
    @Autowired
    EmpleadoRepository empleadoRepo;

    public List<Empleado> getAll(){
        return empleadoRepo.findAll();
    }
}
