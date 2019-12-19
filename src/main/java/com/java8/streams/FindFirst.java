package com.java8.streams;

import java.util.stream.Stream;

public class FindFirst {
	public static void main(String[] args) {
		// stream.of ---- put elements into stream
		// sequential stream
		Stream.of("one", "two", "three", "four").findFirst().ifPresent(System.out::println);
		System.out.println("************");
		// parallel stream
		Stream.of("one", "two", "three", "four").parallel().findFirst().ifPresent(System.out::println);

		// sequential stream
		Stream.of("one", "two", "three", "four").findAny().ifPresent(System.out::println);
		System.out.println("************");

		// parallel stream
		Stream.of("one", "two", "three", "four").parallel().findAny().ifPresent(System.out::println);
	}

}
/*
 * Let�s take a scenario where you have a list of employee objects and you have
 * to count the employees whose salary is above 15000. Generally, to solve this
 * problem you will iterate over list going through each employee and checking
 * if employee�s salary is above 15000. This takes O(N) time since you go
 * sequentially.
 *
 * Streams give us the flexibility to iterate over the list in a parallel
 * pattern and can give the total in quick fashion. Stream implementation in
 * Java is by default sequential unless until it is explicitly mentioned in
 * parallel. When a stream executes in parallel, the Java runtime partitions the
 * stream into multiple sub-streams. Aggregate operations iterate over and
 * process these sub-streams in parallel and then combine the results.
 */