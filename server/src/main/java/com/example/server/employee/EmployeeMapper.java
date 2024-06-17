package com.example.server.employee;

public class EmployeeMapper {
    public static EmployeeDto mapToEmployeeDto(Employee savedEmployee) {

        return new EmployeeDto(
                savedEmployee.getId(),
                savedEmployee.getEmail(),
                savedEmployee.getFirstName(),
                savedEmployee.getLastName()
                );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto) {

        return new Employee(
                employeeDto.getId(),
                employeeDto.getEmail(),
                employeeDto.getFirstName(),
                employeeDto.getLastName()

        );
    }
}
