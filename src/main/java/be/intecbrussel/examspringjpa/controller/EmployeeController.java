package be.intecbrussel.examspringjpa.controller;

import be.intecbrussel.examspringjpa.model.Employee;
import be.intecbrussel.examspringjpa.service.EmployeeProfileService;
import be.intecbrussel.examspringjpa.service.EmployeeService;
import be.intecbrussel.examspringjpa.service.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")

public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private EmployeeProfileService employeeProfileService;

    @PostMapping("/create")
    public void createEmployee(Employee employee) throws ResourceNotFoundException {
        employeeService.create(employee);
    }

    @PostMapping("/updateEmployeeEmailById")
    public void updateEmployeeEmailById(Long id, String email) throws RuntimeException{
        employeeService.updateEmployeeEmailById(id, email);
    }

    @GetMapping("/findAllEmployees")
    public List<Employee> findAllEmployees(){
        return employeeService.findAllEmployees();
    }






}
