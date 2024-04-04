package com.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.example.beans.Employee;

public class EmpDao {

	JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	public int save(Employee e) {
		
		String sql = "INSERT INTO employee(name, salary, designation) VALUES('"+ e.getName() +"', "
				+ "'" + e.getSalary() + "', '" + e.getDesignation() + "')";
		
		return jt.update(sql);
	}
	
	public int update(Employee e) {
		
		String sql = "UPDATE employee SET name=?, salary=?, designation=? WHERE id=?";
		
		return jt.update(sql, e.getName(), e.getSalary(), e.getDesignation(), e.getId());
	}
	
	public int delete(int id) {
		
		String sql = "DELETE FROM employee WHERE id=?";
		
		return jt.update(sql, id);
	}
	
	public Employee getEmpById(int id) {
		
		String sql = "SELECT * FROM employee WHERE id=?";
		
		return jt.queryForObject(sql, new Object[] {id}, new BeanPropertyRowMapper<Employee>(Employee.class));
	}
	
	public List<Employee> getEmployees() {
		
		return jt.query("SELECT * FROM employee", new RowMapper<Employee>() {
			
			public Employee mapRow(ResultSet rs, int row) throws SQLException {
				Employee e = new Employee();
				
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getFloat(3));
				e.setDesignation(rs.getString(4));
				
				return e;
			}
			
		});
		
	}
	
}
