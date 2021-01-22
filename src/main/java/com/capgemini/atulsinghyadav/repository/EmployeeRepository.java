package com.capgemini.atulsinghyadav.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.atulsinghyadav.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
