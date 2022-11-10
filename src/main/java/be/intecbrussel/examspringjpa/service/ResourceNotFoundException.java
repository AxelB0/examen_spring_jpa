package be.intecbrussel.examspringjpa.service;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ResourceNotFoundException extends RuntimeException{
}
