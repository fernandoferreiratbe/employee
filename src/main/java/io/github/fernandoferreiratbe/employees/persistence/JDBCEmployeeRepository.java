package io.github.fernandoferreiratbe.employees.persistence;

import io.github.fernandoferreiratbe.employees.domain.Employee;
import io.github.fernandoferreiratbe.employees.domain.EmployeeException;
import io.github.fernandoferreiratbe.employees.domain.EmployeeRepository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCEmployeeRepository implements EmployeeRepository {
    private JDBCConnectionFactory connectionFactory;

    private JDBCEmployeeRepository(JDBCConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    public List<Employee> all() {
        try (Connection connection = this.connectionFactory.getConnection()) {
            List<Employee> employees = new ArrayList<>();

            try (Statement statement = connection.createStatement()) {
                String sql = "select * from employees";

                try (ResultSet resultSet = statement.executeQuery(sql)) {
                    while (resultSet.next()) {
                        Employee employee = new Employee();

                        employee.setId(resultSet.getInt(1));
                        employee.setName(resultSet.getString(2));
                        employee.setSurname(resultSet.getString(3));
                        employee.setAddress(null);
                        employee.setSalary(resultSet.getDouble(5));

                        employees.add(employee);
                    }
                }
            }

            return employees;
        } catch (SQLException e) {
            throw new EmployeeException("Employees cannot be listed.", e);
        }
    }
}
