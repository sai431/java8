package com.java8.MethodReferences;

public class Employee2 {

	String name;
	
	public Employee2(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}

}
