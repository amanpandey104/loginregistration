package com.loginregistration.loginregistration.Dto;

public class EmployeeDTO {
    private int employeeId;
    private String emplyeeName;
    private String employeeEmail;
    private String employeePassword;

    public EmployeeDTO() {
    }

    public EmployeeDTO(int employeeId, String emplyeeName, String employeeEmail, String employeePassword) {
        this.employeeId = employeeId;
        this.emplyeeName = emplyeeName;
        this.employeeEmail = employeeEmail;
        this.employeePassword = employeePassword;
    }

    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmplyeeName() {
        return emplyeeName;
    }
    public void setEmplyeeName(String emplyeeName) {
        this.emplyeeName = emplyeeName;
    }
    public String getEmployeeEmail() {
        return employeeEmail;
    }
    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }
    public String getEmployeePassword() {
        return employeePassword;
    }
    public void setEmployeePassword(String employeePassword) {
        this.employeePassword = employeePassword;
    }

    @Override
    public String toString() {
        return "EmployeeDTO {employeeId=" + employeeId + ", emplyeeName=" + emplyeeName + ", employeeEmail="
                + employeeEmail + ", employeePassword=" + employeePassword + "}";
    }

}
