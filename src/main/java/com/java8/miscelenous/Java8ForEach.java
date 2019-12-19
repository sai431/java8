package com.java8.miscelenous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Java8ForEach {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Java 8 forEach over stream elements

        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        Consumer<Integer> action = System.out::println;
        numberList.stream().filter(n -> n % 2 == 0).forEach(action);
        // Java 8 forEach list elements
        System.out.println("-----------------------------");
        ArrayList<Integer> numberListforeach = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        Consumer<Integer> actionForEach = System.out::println;

        numberList.forEach(System.out::println);

        // Java 8 forEach map entries
        System.out.println("-----------------------------");
        HashMap<String, Integer> map = new HashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        // 1. Map entries
        Consumer<Map.Entry<String, Integer>> action1 = System.out::println;

        map.entrySet().forEach(action1);

        // 2. Map keys
        Consumer<String> actionOnKeys = System.out::println;

        map.keySet().forEach(actionOnKeys);

        // 3. Map values
        Consumer<Integer> actionOnValues = System.out::println;

        map.values().forEach(actionOnValues);
        System.out.println("-----------------------------");

        // Create custom action method
        HashMap<String, Integer> mapCustom = new HashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        Consumer<Map.Entry<String, Integer>> actionCustom = entry -> {
            System.out.println("Key is : " + entry.getKey());
            System.out.println("Value is : " + entry.getValue());
        };

        map.entrySet().forEach(actionCustom);
        map.keySet().forEach(key -> System.out.println("key :" + key.length()));

    }

}
