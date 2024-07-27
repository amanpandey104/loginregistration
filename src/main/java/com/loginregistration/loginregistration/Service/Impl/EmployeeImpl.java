package com.loginregistration.loginregistration.Service.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.loginregistration.loginregistration.Dto.EmployeeDTO;
import com.loginregistration.loginregistration.Entity.Employee;
import com.loginregistration.loginregistration.Repo.EmployeeRepo;
import com.loginregistration.loginregistration.Service.EmployeeService;

public class EmployeeImpl implements EmployeeService{

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String addEmployee(EmployeeDTO emplyeeDTO) {
        Employee employee = new Employee(
            emplyeeDTO.getEmployeeId(),
            emplyeeDTO.getEmplyeeName(),
            emplyeeDTO.getEmployeeEmail(),
            this.passwordEncoder.encode(emplyeeDTO.getEmployeePassword())
        );
        employeeRepo.save(employee);  //using default method to save the details of the employee
        return employee.getEmplyeeName();
    }
    
}
