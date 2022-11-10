package be.intecbrussel.examspringjpa.service;

import be.intecbrussel.examspringjpa.repository.EmployeeProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeProfileService {

    @Autowired
    private EmployeeProfileRepository employeeProfileRepository;

}
