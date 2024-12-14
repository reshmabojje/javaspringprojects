package com.jdbcspringmavenpro;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MyRowMapper implements RowMapper<Emp> {
    @Override
    public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
        Emp employee = new Emp();
        // Map columns from the ResultSet to the Emp object
        employee.setId(rs.getInt("id"));
        employee.setName(rs.getString("name"));
        employee.setSal(rs.getInt("sal"));
        return employee;
    }
}
