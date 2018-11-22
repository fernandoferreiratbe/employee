package io.github.fernandoferreiratbe.employees.persistence.mysql;

import io.github.fernandoferreiratbe.employees.persistence.JDBCConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionFactory implements JDBCConnectionFactory {
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost/staff", "root", "root123");
    }
}
