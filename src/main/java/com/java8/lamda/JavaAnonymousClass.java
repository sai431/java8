package com.java8.lamda;

public class JavaAnonymousClass {
	private static void greet(Greetings greetingsInstance, String name) {
		greetingsInstance.sayHello(name);
	}

	public static void main(String[] args) {
		Greetings greet = new Greetings() {

			@Override
			public void sayHello(String name) {
				System.out.println("Hello World " + name);

			}
		};
		greet(greet,"Sai");
	}

}
