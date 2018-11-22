package io.github.fernandoferreiratbe.employees.application;

import io.github.fernandoferreiratbe.employees.domain.EmployeeRepository;

public class JSONListEmployeesUseCase {
    private static final JSONEmployeeConverter JSON_EMPLOYEE_CONVERTER = new JSONEmployeeConverter();

    private final EmployeeRepository employeeRepository;

    public JSONListEmployeesUseCase(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public String execute() {
        return JSON_EMPLOYEE_CONVERTER.toJSON(this.employeeRepository.all());
    }
}
