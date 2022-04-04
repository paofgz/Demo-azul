package com.itesm.azul.services;

import com.itesm.azul.models.Empleado;
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

    public Empleado getOne(String name){
        return empleadoRepo.findOne(name);
    }

    public Empleado editEmployee(String name, Empleado updates) throws Exception {
        if (updates.getRole() != null && !updates.getRole().equals("Agent") && !updates.getRole().equals("Manager") && !updates.getRole().equals("Supervisor")) {
            throw new Exception("The role must be Agent, Manager or Supervisor");
        } else if (updates.getRole() != null && updates.getRole().equals("Agent") && updates.getSupervisor_id() == null){
            throw new Exception ("Agents must be assigned to a Supervisor");
        }
        return empleadoRepo.update(name, updates);
    }

    public Empleado addNewEmployee(Empleado newEmployee) throws Exception {
        if (newEmployee.getName() == null || newEmployee.getLastname() == null) {
            throw new Exception("All employees must have a name and a lastname");
        } else if (newEmployee.getRole() == null) {
            throw new Exception("All employees must have a role");
        } else if (newEmployee.getEmail() == null) {
            throw new Exception("All employees must have an email");
        } else if (newEmployee.getRole() != null && !newEmployee.getRole().equals("Agent") && !newEmployee.getRole().equals("Manager") && !newEmployee.getRole().equals("Supervisor")) {
            throw new Exception("The role must be Agent, Manager or Supervisor");
        } else if (newEmployee.getRole().equals("Agent") && newEmployee.getSupervisor_id() == null) {
            throw new Exception("Agents must be assigned to a Supervisor");
        } else if (newEmployee.getRole() != null && !newEmployee.getRole().equals("Agent") && newEmployee.getSupervisor_id() != null){
            throw new Exception("Only Agents are assigned to a supervisor");
        } else if (newEmployee.getClient_id() == null) {
            throw new Exception("All employees must be assigned to a company");
        }
        return empleadoRepo.create(newEmployee);
    }

    public Boolean deleteEmployee(String name) throws Exception {
        if (name == null) {
            throw new Exception("Id is required");
        }

        return empleadoRepo.delete(name);
    }

}
