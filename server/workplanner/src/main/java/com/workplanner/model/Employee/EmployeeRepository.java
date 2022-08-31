package com.workplanner.model.Employee;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    // List<Employee> findByLastName(String lastName);

    // Employee findById(Integer id);
}
