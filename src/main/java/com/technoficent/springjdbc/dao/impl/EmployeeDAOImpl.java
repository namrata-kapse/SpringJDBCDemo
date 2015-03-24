package com.technoficent.springjdbc.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Component;

import com.technoficent.springjdbc.beans.Employee;
import com.technoficent.springjdbc.dao.factory.AbstractDAOConnection;
import com.technoficent.springjdbc.dao.interfaces.EmployeeDAO;

@Component
@SuppressWarnings("all")
public final class EmployeeDAOImpl extends AbstractDAOConnection implements EmployeeDAO {

	@Override
	public void insert(Employee employee) {

		String strSql = "INSERT INTO Employee " + "(EmployeeID, EmployeeName, EmployeeDept) VALUES (?, ?, ?)";

		getJdbcTemplate().update(strSql, new Object[] { employee.getEmpID(), employee.getEmpName(), employee.getEmpDept() });

	}

	@Override
	public Employee findById(int id) {

		String strSql = "SELECT * FROM Employee WHERE EmployeeID = ?";

		Employee employee = (Employee) getJdbcTemplate().queryForObject(strSql, new Object[] { id }, new BeanPropertyRowMapper(Employee.class));

		return employee;
	}

	@Override
	public List<Employee> findAll() {

		String strSql = "SELECT * FROM Employee";

		List<Employee> employees = new ArrayList<Employee>();

		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(strSql);
		for (final Map<String, Object> row : rows) {
			Employee employee = new Employee();
			employee.setEmpID(Integer.parseInt(String.valueOf(row.get("EmployeeID"))));
			employee.setEmpName(String.valueOf(row.get("EmployeeName")));
			employee.setEmpDept(String.valueOf(row.get("EmployeeDept")));
			employees.add(employee);
		}

		return employees;
	}

	@Override
	public void insertBatch1(List<Employee> employees) {

		// TODO Auto-generated method stub

	}

	@Override
	public void insertBatch2(String sql) {

		// TODO Auto-generated method stub

	}

	public void deleteEmployee(Integer empID) {

		String strSql = "DELETE from Employee WHERE EmployeeID = ?";
		getJdbcTemplate().update(strSql, empID);
	}

}
