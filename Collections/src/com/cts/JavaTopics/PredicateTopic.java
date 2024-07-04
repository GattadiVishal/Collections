package com.cts.JavaTopics;

import java.util.function.Predicate;

public class PredicateTopic {

	public static void main(String[] args) {
		
		String text = "Apple";
		
		Predicate<String> letterA = str -> str.startsWith("A");
		
		Predicate<String> letterB = str -> str.endsWith("B");
		
		boolean result = letterA.or(letterB).test(text);
		
		System.out.println(result);

	}

}
