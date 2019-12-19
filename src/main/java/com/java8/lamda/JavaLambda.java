package com.java8.lamda;

public class JavaLambda {
	private static void greet(Greetings greetingsInstance, String name) {
		greetingsInstance.sayHello(name);
	}
	public static void main(String[] args) {
		Greetings greetingEach=N ->System.out.println("Hello World " + N);
		greet(greetingEach,"Sai");
	}
}
