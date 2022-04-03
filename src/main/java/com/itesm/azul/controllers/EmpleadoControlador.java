package com.itesm.azul.controllers;

import com.itesm.azul.models.Empleado;
import com.itesm.azul.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/empleado")
public class EmpleadoControlador {
    @Autowired
    EmpleadoService empleadoService;

    @GetMapping("/get/{id}")
    public Empleado getOne(@PathVariable String id){
        return empleadoService.getOne(id);
    }

    @GetMapping("/list")
    public List<Empleado> getAll(){
        return empleadoService.getAll();
    }
    
    @PutMapping("/edit/{id}")
    public Empleado editEmployee(@PathVariable String id, @RequestBody Empleado updates) throws Exception {
        return empleadoService.editEmployee(id, updates);
    }

    @PostMapping("/add")
    public Empleado addNewEmployee(@RequestBody Empleado addedEmployee) throws Exception {
        return empleadoService.addNewEmployee(addedEmployee);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean deleteEmployee(@PathVariable String id) throws Exception {
        return empleadoService.deleteEmployee(id);
    }
    
}
