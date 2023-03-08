package com.test;

import java.util.function.BiFunction;

public class Functions {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> function = (Integer x, Integer y) -> x+y;
		System.out.println(function.apply(10, 20));

	}

}
