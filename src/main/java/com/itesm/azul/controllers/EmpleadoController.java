package com.itesm.azul.controllers;

import com.itesm.azul.models.Empleado;
import com.itesm.azul.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/empleado")
public class EmpleadoController {
    @Autowired
    EmpleadoService empleadoService;

    @GetMapping("/get/{name}")
    public Empleado getOne(@PathVariable String name){
        return empleadoService.getOne(name);
    }

    @GetMapping("/list")
    public List<Empleado> getAll(){
        return empleadoService.getAll();
    }
    
    @PutMapping("/edit/{name}")
    public Empleado editEmployee(@PathVariable String name, @RequestBody Empleado updates) throws Exception {
        return empleadoService.editEmployee(name, updates);
    }

    @PostMapping("/add")
    public Empleado addNewEmployee(@RequestBody Empleado addedEmployee) throws Exception {
        return empleadoService.addNewEmployee(addedEmployee);
    }

    @DeleteMapping("/delete/{name}")
    public Boolean deleteEmployee(@PathVariable String name) throws Exception {
        return empleadoService.deleteEmployee(name);
    }
    
}
