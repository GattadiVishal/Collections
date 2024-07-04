package com.cts.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionalProgramsPractice {
	
	
	public static void main(String[] args) {
	/*Imperative Style Programming
	 * Focus on how to do operation
	 * Lists down the step by step instructions on how to achieve an objective.
	 */
	/* Imperative Style Programming Example
	
	 
	
	{
		int sum = 0;
		for(int i=0;i<10;i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
	
	*/
	
	/*Declarative Style Programming 
	 * 
	 * Focus on result
	 * use the function already part of library to achieve an objective.
	 */
	
	/* Imperative Style Programming Example
	
	int sum1 = IntStream.range(0, 10).sum();   //here in the range 10 is also included
	System.out.println(sum1);
	
	 */
		
	/* Removing duplicates from the list */
	
		//Imperative Style
		/*
		List<Integer> list1 = Arrays.asList(1,2,3,3,4,5,6,7,8,6,4,9,10);
		List<Integer> uniqueList = new ArrayList<>();
		
		for(Integer i:list1) {
			if(!uniqueList.contains(i)) {  //here it checks uniqueList contains(), if it has value return true, with NOT operator it will become false and it is not added.
				uniqueList.add(i); //if value is present already, contains return true and NOT operator it is false
			}
		}
		System.out.println(uniqueList);
	*/
		//Declarative Style
		/*
		List<Integer> list1 = Arrays.asList(1,2,3,3,4,5,6,7,8,6,4,9,10);
		List<Integer> uniqueList =  list1.stream().distinct().collect(Collectors.toList()); //distinct - selects only unique objects
		System.out.println(uniqueList);
		*/
		
		//Lambda Expressions - Function without a name or Anonymous Function
		/*It has required things such as 
		 * Method parameters
		 * Method Body
		 * Return Type
		 * Syntax - () -> {}
		 */
		
	/*	
		// Normal Java8 code
		Runnable run1 = new Runnable() 
		{
			@Override
			public void run() {
				System.out.println("Inside 1");
			}
			
		};
		new Thread(run1).start();
		
		//Java8 with lambda
		Runnable run2 =() -> 
		{
			System.out.println("Inside 2");
		};
		new Thread(run2).start();
	*/	
		
		
	
}
}
