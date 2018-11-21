package io.github.fernandoferreiratbe.employees.domain;

public class EmployeeException extends RuntimeException {
    public EmployeeException() {
    }

    public EmployeeException(String message) {
        super(message);
    }

    public EmployeeException(String message, Throwable cause) {
        super(message, cause);
    }
}
