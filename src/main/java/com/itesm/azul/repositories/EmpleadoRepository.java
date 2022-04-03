package com.itesm.azul.repositories;

import com.itesm.azul.models.Empleado;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmpleadoRepository {
    public List<Empleado> findAll(){
        Empleado e1 = new Empleado();
        e1.setName("Paola");
        e1.setRole("Agente");
        Empleado e2 = new Empleado();
        e2.setName("Carlos");
        e2.setRole("Supervisor");
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(e1);
        empleados.add(e2);
        return empleados;
    }

    public Empleado findOne(String name){
        Empleado e1 = new Empleado();
        e1.setName(name);
        e1.setRole("Agente");
        e1.setLastname("Juárez");
        e1.setEmail(name+"@gmail.com");
        e1.setSupervisor_id("S01");
        return e1;
    }

    public Empleado update(String name, Empleado updates){
        Empleado e1 = new Empleado();
        e1.setName(name);
        e1.setRole("Manager");
        e1.setLastname("González");
        e1.setEmail(name+"@gmail.com");
        if (updates.getEmail() != null) {
            e1.setEmail(updates.getEmail());
        }
        if (updates.getRole() != null) {
            e1.setRole(updates.getRole());
        }
        if (updates.getSupervisor_id() != null) {
            e1.setSupervisor_id(updates.getSupervisor_id());
        }
        return e1;
    }

    public Empleado create(Empleado newEmployee) {
        Empleado e1 = new Empleado();
        e1.setName(newEmployee.getName());
        e1.setLastname(newEmployee.getLastname());
        e1.setRole(newEmployee.getRole());
        e1.setEmail(newEmployee.getEmail());
        e1.setSupervisor_id(newEmployee.getSupervisor_id());
        return e1;
    }

    public Boolean delete(String name) {
        // Delete from database the selected employee
        return true;
    }

}
