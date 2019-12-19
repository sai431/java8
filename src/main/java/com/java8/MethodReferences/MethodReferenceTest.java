package com.java8.MethodReferences;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceTest {
	public static void main(String[] args) {
		List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
		System.out.println("-------Using Lambda Functions--------");
		// Using Lambda function to call system.out.println()
		myList.stream().map(s -> s.toUpperCase()).forEach(x -> System.out.println(x));
		System.out.println("-------Using Lambda and method ref at terminal opeartions --------");
		myList.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
		System.out.println("-------Using Method Reference--------");
		myList.stream().map(String::toUpperCase).forEach(System.out::println);
	}

}
