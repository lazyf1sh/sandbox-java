package com.github.lazyf1sh.sandbox.java.lambdas;

import java.util.Arrays;
import java.util.List;

public class Lambdas {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        numbers.forEach((Integer value) -> System.out.println(value));
        numbers.forEach(value -> System.out.println(value));
        numbers.forEach(System.out::println);
    }
}


