package io.github.fernandoferreiratbe.employees.persistence;

import java.sql.Connection;
import java.sql.SQLException;

public interface JDBCConnectionFactory {

    Connection getConnection() throws SQLException;

}
