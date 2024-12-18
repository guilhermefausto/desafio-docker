package br.com.guilhermefausto.demo_spring.modal;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb_emp")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;

	@Column
	private String name;

	@Column
	private String department;

	@Column
	private LocalDate dob;

	@Column
	private String gender;

	@Override
	public String toString() {
		return "Employee [id=	" + id + ", name=" + name + ", department=" + department + ", dob=" + dob + ", gender="
				+ gender + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
