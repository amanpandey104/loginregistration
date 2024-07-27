package com.loginregistration.loginregistration.EmployeeController;
import com.loginregistration.loginregistration.Dto.EmployeeDTO;
import com.loginregistration.loginregistration.Service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController //To denote Restful API
@CrossOrigin //To connect frontend with backend
@RequestMapping("api/v1/employee")
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public String saveEmployee(@RequestBody EmployeeDTO emplyeeDTO) {
        String id = employeeService.addEmployee(emplyeeDTO);
        return id;
    }
    /* 
    @PostMapping("/login")
    public ResponseEntity<?> loginEmployee(@RequestBody LoginDTO loginDTO) {
        LoginResponse loginResponse = employeeService.loginEmployee(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }
    */
}
