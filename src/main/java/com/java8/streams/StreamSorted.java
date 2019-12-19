package com.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorted {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);

		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());

		System.out.println(sortedList);
	}

	Comparator<Integer> reverseComparotor = new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {

			return o2.compareTo(o1);
		}
	};

}
