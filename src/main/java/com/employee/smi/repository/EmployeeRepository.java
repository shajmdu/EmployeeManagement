package com.employee.smi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.smi.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
