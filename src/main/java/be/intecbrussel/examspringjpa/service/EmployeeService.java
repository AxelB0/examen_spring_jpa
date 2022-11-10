package be.intecbrussel.examspringjpa.service;

import be.intecbrussel.examspringjpa.model.Employee;
import be.intecbrussel.examspringjpa.model.EmployeeProfile;
import be.intecbrussel.examspringjpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    public void create(Employee employee){
        employeeRepository.save(employee);
    }

    public void updateEmployeeEmailById(Long id, String email ) throws ResourceNotFoundException{
        Optional<Employee> employee1 = employeeRepository.findById(id);
        if (employee1.isPresent()){
            Employee employee2 = employee1.get();
            employee2.setEmail(email);
            employeeRepository.save(employee2);
        }else {throw new ResourceNotFoundException();}

    }

    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }




}
