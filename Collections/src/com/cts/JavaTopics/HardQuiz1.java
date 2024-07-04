package com.cts.JavaTopics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class HardQuiz1 {

	public static void main(String[] args) {
		
		// The below code will give CompileTime Exception that ArithmeticException is already handled
		/*
		 try {
			System.out.println("1");
			System.out.println(1/0);
		}catch(Exception e) {
			System.out.println("2");
		}catch(ArithmeticException ae) {
			System.out.println("3");
		}
		 */
		
		//To Overcome this we should specify the More Specific to More Generic exception i.e., should follow the hierarchy
		
		/*
		 
		try {
			System.out.println("1");
			System.out.println(1/0);
		}catch(ArithmeticException e) {
			System.out.println("2");
		}catch(Exception ae) {
			System.out.println("3");
		}
		
		*/
		
		 List<String> str1 = new ArrayList<>();
	        str1.add("201");
	        str1.add("202");
	        str1.add("203");
	        str1.add("204");
	        str1.add("199");
//	        List<Long> str2 = str1.stream()
//	        		.flatMap(s->Arrays.stream(s.split(",")))
//	        		.mapToLong(Long::parseLong)
//	        		.flatMap(LongStream::of)
//	        		.collect(null, null, null)
	        		
	        
	        List<Integer> str2 = str1.stream().map(x -> Integer.valueOf(x))
	        		.filter(num -> num > 200)
	        		.collect(Collectors.toList());
	        
	        
	        System.out.println("Before");
	        System.out.println(str1);
	        System.out.println("\n");
	        System.out.println("After");
	        System.out.println(str2);
		

	}

}
