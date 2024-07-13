package com.loginregistration.loginregistration.Entity;

import org.hibernate.annotations.IdGeneratorType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
    @Id
    @Column(name="employee_id", length = 45)
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int employeeId;

    @Column(name = "employee_name", length = 255)
    private String emplyeeName;

    @Column(name = "employee_email", length = 255)
    private String employeeEmail;

    @Column(name = "employee_password", length = 255)
    private String employeePassword;
    
}
