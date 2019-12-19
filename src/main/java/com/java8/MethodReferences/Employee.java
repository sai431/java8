package com.java8.MethodReferences;

public class Employee {

	String name;
	int id;
	Integer salary;

	public Employee(int id, String name, Integer salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}

}
