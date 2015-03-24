package com.technoficent.springjdbc.dao.interfaces;

import java.util.List;

import com.technoficent.springjdbc.beans.Employee;

public interface EmployeeDAO {

	public void insert(Employee employee);

	public Employee findById(int id);

	public List<Employee> findAll();

	public void insertBatch1(final List<Employee> employees);

	public void insertBatch2(final String sql);

	public void deleteEmployee(Integer empID);
}
