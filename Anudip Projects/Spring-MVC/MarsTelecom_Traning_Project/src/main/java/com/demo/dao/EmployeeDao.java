package com.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.demo.model.Employee;

@Component
public class EmployeeDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	// create
	@Transactional
	public void createEmployee(Employee emp) {

		this.hibernateTemplate.saveOrUpdate(emp);
	}

	// get all employee
	public List<Employee> getEmployees() {
		List<Employee> empl = this.hibernateTemplate.loadAll(Employee.class);
		return empl;
	}

	// delete single employee
	@Transactional
	public void deleteEmployee(int eid) {
		Employee e = this.hibernateTemplate.load(Employee.class, eid);
		this.hibernateTemplate.delete(e);

	}
	// get single employee

	public Employee getEmployee(int eid) {
		return this.hibernateTemplate.get(Employee.class, eid);
	}
}
