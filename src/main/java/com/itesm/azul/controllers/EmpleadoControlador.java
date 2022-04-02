package com.itesm.azul.controllers;

import com.itesm.azul.models.Empleado;
import com.itesm.azul.models.Persona;
import com.itesm.azul.services.EmpleadoService;
import com.itesm.azul.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/empleado")
public class EmpleadoControlador {
    @Autowired
    EmpleadoService empleadoService;

    @GetMapping("/get")
    public Empleado getOne(){
        Empleado e = new Empleado();
        e.setEmail("karen@tec.mx");
        e.setName("Karen");
        e.setLastname("Macias");
        e.setRole("Manager");
        return e;
    }

    @GetMapping("/getAll")
    public List<Empleado> getAll(){
        return empleadoService.getAll();
    }
}
