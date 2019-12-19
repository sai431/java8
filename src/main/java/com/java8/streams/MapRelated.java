package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.MethodReferences.Employee;

public class MapRelated {
	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");
		List<Integer> listOfIntegers = listOfStrings.stream().map(Integer::valueOf).collect(Collectors.toList());
		// here stream of strings is converted to stream of integer using map
		System.out.println(listOfIntegers);
		System.out.println("----------------------");

		List<Employee> employeesList = Arrays.asList(new Employee(1, "Alex", 100), new Employee(2, "Brian", 100),
				new Employee(3, "Charles", 200), new Employee(4, "David", 200), new Employee(5, "Edward", 300),
				new Employee(6, "Frank", 300));
		List<Integer> emplistof = employeesList.stream().map(elist -> elist.getSalary()).distinct()
				.collect(Collectors.toList());
		System.out.println(emplistof);
		System.out.println("----------------------");
	}
}
