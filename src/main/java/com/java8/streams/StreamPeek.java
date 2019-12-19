package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPeek {
//Using Stream.peek() without any terminal operation does nothing.
	// Stream<T> peek(Consumer<? super T> action)
	// This method exists mainly to support debugging, where we want to see the
	// elements as they flow past a certain point in a pipeline
	// It returns a stream consisting of the elements of current stream.

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		list.stream().peek(System.out::println);

		List<Integer> newList = list.stream().peek(System.out::println).collect(Collectors.toList());

		System.out.println(newList);
	}

}
/*
 * 1 2 3 4 5 [1, 2, 3, 4, 5]
 */