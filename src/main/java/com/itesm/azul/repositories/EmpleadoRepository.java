package com.itesm.azul.repositories;

import com.itesm.azul.models.Empleado;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmpleadoRepository {
    public List<Empleado> findAll(){
        Empleado p1 = new Empleado();
        p1.setName("Paola");
        p1.setRole("Agente");
        Empleado p2 = new Empleado();
        p2.setName("Carlos");
        p2.setRole("Supervisor");
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(p1);
        empleados.add(p2);
        return empleados;
    }
}
