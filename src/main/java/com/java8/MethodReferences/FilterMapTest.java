package com.java8.MethodReferences;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMapTest {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3);
		List<Integer> list2 = Arrays.asList(4, 5, 6);
		List<Integer> list3 = Arrays.asList(7, 8, 9);
		List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);
		listOfLists.stream().flatMap(mapper -> mapper.stream()).forEach(System.out::println);
		List<Integer> listOfAllIntegers = listOfLists.stream().flatMap(mapper -> mapper.stream())
				.collect(Collectors.toList());
		System.out.println(listOfAllIntegers);
	}

}
