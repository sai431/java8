package com.java8.miscelenous;

import java.util.Arrays;
import java.util.List;

public class ForEachOrdered {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 4, 9, 8, 10);

		list.stream().parallel().forEach(System.out::println); // 1

		/*
		 * 6 4 2 8 10 246810
		 */
		System.out.println("****************");
		list.stream().parallel().forEachOrdered(System.out::println); // 2
		/*
		 * 2 4 9 8 10
		 */
		System.out.println("****************");
		list.stream().forEach(System.out::println);
		System.out.println("****************");
		list.stream().forEachOrdered(System.out::println);

	}

	/*
	 * The behavior of forEach() operation is explicitly non-deterministic. For
	 * parallel stream pipelines, this operation does not guarantee to respect the
	 * encounter order of the stream.
	 *
	 * While the forEachOrdered() operation respects the the encounter order of the
	 * stream if the stream has a defined encounter order whether it is parallel
	 * stream or sequential.
	 */

}
