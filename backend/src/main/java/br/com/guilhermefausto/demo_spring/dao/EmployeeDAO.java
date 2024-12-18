package br.com.guilhermefausto.demo_spring.dao;

import br.com.guilhermefausto.demo_spring.modal.Employee;

import java.util.List;


public interface EmployeeDAO {
	
	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);
	

}
