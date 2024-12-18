package br.com.guilhermefausto.demo_spring.service;

import br.com.guilhermefausto.demo_spring.modal.Employee;

import java.util.List;

public interface EmployeeService {
	

	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);
	

}
