package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterRelated {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
		System.out.println("_________________________________");

		Predicate<Integer> condition = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				if (t % 2 == 0) {
					return true;
				}
				return false;
			}
		};
		list.stream().filter(condition).forEach(System.out::println);
		System.out.println("________Filter even numbers and get squares_________________________");
		List<Integer> evenNumbers = list.stream().filter(n -> n % 2 == 0).map(n -> n * n).collect(Collectors.toList());

		System.out.println(evenNumbers);

	}
}
