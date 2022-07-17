package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeDao employeeDao;

	@RequestMapping("/")
	public String home(Model m) {
		List<Employee> empl = employeeDao.getEmployees();
		m.addAttribute("empl", empl);
		return "index";
	}

//add employee
	@RequestMapping("/addemp")
	public String addEmployee(Model m) {
		m.addAttribute("title", "Add Employee");
		return "add_emp_form";
	}

	// handle add employee form
	@RequestMapping(value = "/handle-emp", method = RequestMethod.POST)
	public RedirectView handleEmployee(@ModelAttribute Employee emp, HttpServletRequest request) {
		System.out.println(emp);
		employeeDao.createEmployee(emp);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}

	// update form
	@RequestMapping("update/{eid}")
	public String updateEmployee(@PathVariable("eid") int eid, Model m) {
		Employee emp = this.employeeDao.getEmployee(eid);
		m.addAttribute(emp);
		return "update_emp_form";
	}

	// delete
	@RequestMapping("/delete/{empid}")
	public RedirectView deleteEmployee(@PathVariable("empid") int empid, HttpServletRequest request) {
		this.employeeDao.deleteEmployee(empid);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}

}
