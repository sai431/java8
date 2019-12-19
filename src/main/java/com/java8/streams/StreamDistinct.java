package com.java8.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDistinct {
	public static void main(String[] args) {
		Collection<String> list = Arrays.asList("A", "B", "C", "D", "A", "B", "C");

		// Get collection without duplicate i.e. distinct only
		Set<String> distinctElements = list.stream().distinct().collect(Collectors.toSet());
		// Let's verify distinct elements
		System.out.println(distinctElements);
	}

}
