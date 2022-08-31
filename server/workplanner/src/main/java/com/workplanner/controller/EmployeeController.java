package com.workplanner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.workplanner.model.Employee.Employee;
import com.workplanner.model.Employee.EmployeeRepository;

@Controller
@RequestMapping(path = "/employees")
// @CrossOrigin(origins = "http://localhost:8080")
public class EmployeeController {
    
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @PostMapping(path = "/create")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        try{
            employeeRepository.save(employee);
        }catch(Exception e){

            return new ResponseEntity<Employee>( employee , HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<Employee>( employee , HttpStatus.OK);
    }

}
