package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamFilters {
	//Stream<T> filter(Predicate<? super T> condition)
	//find Even Numbers with  Predicate Class

	    public static void main(String[] args) {
	        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	        Predicate<Integer> condition = new Predicate<Integer>() {
	            @Override
	            public boolean test(Integer n) {
	                if (n % 2 == 0) {
	                    return true;
	                }
	                return false;
	            }
	        };

	        list.stream().filter(condition).forEach(System.out::println);
	        System.out.println("::::::::::::::::");


	        list.stream()
	                .filter(n -> n % 2 == 0)
	                .forEach(System.out::println);


	        // Filter even numbers and get squares
	        List<Integer> listEven = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	        List<Integer> evenNumbers = list.stream()
	                .filter(n -> n % 2 == 0)
	                .map(n -> n * n)
	                .collect(Collectors.toList());

	        System.out.println(evenNumbers);
	    }
}
