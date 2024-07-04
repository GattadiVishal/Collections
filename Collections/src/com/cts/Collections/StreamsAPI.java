package com.cts.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsAPI {

	public static void main(String[] args) {
		
		/*
		 * Stream - Stream is a sequence of element which can be created out of a collections, such as List of Arrays or any kind of input resources.
		 */
	
	/*
		List<String> list =  Arrays.asList("Adam", "Bob", "Charles");
		List<String> list1 = new ArrayList<>();
		//list1 =  list.stream().toList();
		list1 =  list.parallelStream().toList();
		System.out.println(list1);
	}
	
	*/
		
/*
		//Collections VS Streams 
		 //Collection - traversal is n no.of times
		 // Streams is only 1 time
		
	
		List<String> list = new ArrayList<>();
		list.add("Adam");
		list.add("Bob");
		list.add("Jim");
		
		for(String s: list) {
			System.out.println("Iteration 1");
			System.out.println(s);
		}
		
		for(String s: list) {
			System.out.println("Iteration 2");
			System.out.println(s);
		}
		
		Stream<String> streams = list.stream();
		System.out.println("Iteration 1");
		streams.forEach(System.out::println);
		
		System.out.println("Iteration 2");
		streams.forEach(System.out::println); //This throws error as Illegal Exception
	
*/	
		/*
		 * Stream API: map()
		 * map() is different from collections map. Don't get confused.
		 * 
		 */
		
	 	//Here map() takes, Function Interface i.e., One i/p and 1 o/p
	 /*	
		List<String> list =  Arrays.asList("Adam", "Bob", "Charles", "Jim");
		List<String> studentList = list.stream().map(student -> student.toUpperCase()).toList();
		//here we  stream through String list, so map takes the input generic type as String and can apply the operation
		System.out.println(studentList);
		List<Integer> listInt = Arrays.asList(1,2,3,4,5,4,6,2,7,8,9, 10);
		List<Integer> studentList1 = listInt.stream().map(number -> number/2).collect(Collectors.toList());
		System.out.println(studentList1);
		
		List<String> list1 = Arrays.asList("Geeks", "FOR", "GEEKSQUIZ", "Computer", "Science", "gfg");
		list1.stream().map(str -> str.length()).forEach(System.out::println); //here we are printing in method reference format.
		System.out.println(list1); //Here we are printing the list1 as usual after the inserting
   */
		
	/* Converts one map to another map using stream 
		HashMap<String, Object> src = new HashMap<>();
		src.put("Navin", 56); 
		src.put("Harsh", 23);
		src.put("Sushil", 67);
		src.put("Kiran", 92);
		TreeMap<String, Object> dest = src.entrySet().stream()
		      .collect(Collectors.toMap(Map.Entry::getKey , Map.Entry::getValue, (a,b) -> a, TreeMap::new)); //As w.k.t that TreeMap is used to Sort in output.
				System.out.println(dest);					
	*/	
		/*
		 * flatMap() -  same as map, but one difference is
		 * map() - only mapping
		 * flatMap() -  map and flattening
		 * 
		 * flattening - converting lists of lists into a single list
		 * Ex: 
		 * [{1,2},{3,4},{5,6}]  -> stream.flatMap() -> {1,2,3,4,5,6}
		 */
	/*
		//Here we are apply flatMap on List<List<Type>>
		List<List<Integer>> lis1 = new ArrayList<>();
		lis1.add(Arrays.asList(1,2));
		lis1.add(Arrays.asList(3,4));
		lis1.add(Arrays.asList(5,6));
		System.out.println("Before");
		System.out.println(lis1);
		List<Integer> lis2 = lis1.stream().flatMap(i -> i.stream()).collect(Collectors.toList()); //here we apply stream for inside the list of a list
		System.out.println("After" + lis2);
	*/
		/*
		 * distinct() - return unique elements
		 * count() - returns the count of elements
		 * sort()- sorts the elements
		 */
		
		// List<Integer> listInt = Arrays.asList(1,2,3,4,5,4,6,2,7,8,9, 10);
		/* Returns the count of stream
		System.out.println(listInt.stream()
				.sorted()
				.distinct()
				.count());
		*/
		
		/*
		List<Integer> lis = listInt.stream().distinct().collect(Collectors.toList());
		System.out.println(lis);
		*/
		
		
		/*
		 * filter() - returns a stream elements, that matches the in the stream with given predicate
		 */
		
//		List<Integer> lis = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//		lis.stream().filter(i -> (i%2==0)||(i%5==0)).forEach(System.out::println);
		
		/*
		 * Here we are checking the Uppercase letter at index 1 using filter
		List<String> list = Arrays.asList("Abc","cDE", "FGH");
		list.stream().filter(s->Character.isUpperCase(s.charAt(1))).forEach(System.out::println);
		
		*/
		
		/*
		 * reduce() - perform operation where a stream is reduces to single value
		 * reduce operation applies a binary operator to each element in the stream 
		 * where the first argument to the operator is the return value of the previous application and second argument is the current stream element.
		 */
		
	/*
		List<Integer> list = Arrays.asList(2,3,5,7);
		int list1= list.stream().reduce(1,(a,b) -> a*b); //here we are passing to single variable of Integer type, coz reduce() returns a single value
		/*
		 * reduce() operation deduction
		 * 
		 * reduce(1,(a,b) -> a*b)  -  here primary value is 1 and a=2, b=3... first a*b is applied 2*3 = 6
		 * reduce(1,(2,3) -> 2*3) - returns 6
		 * 
		 * reduce(1,(a,b) -> a*b) - here, now the value of a=6 and b=5....here last stream value will be returned as input to next first input of next stream
		 * reduce(1,(6,5) -> 6*5) - returns 30
		 * 
		 * reduce(1,(a,b) -> a*b) -  now a=30, b=7
		 * reduce(1,(30,7) -> 30*7) - returns o/p as 210
		 
		System.out.println(list1);
	 */
		/* map() + filter() pattern example 
		 * map() + filter() + reduce() pattern example
		 */
		
	/*
		List<Integer> listInt = Arrays.asList(1,2,3,4,5,4,6,2,7,8,9, 10);
		//listInt.stream().map(m -> m*2).filter(f->f<=16).forEach(System.out::println);
		int studentList1 = listInt.stream().map(m -> m*2).filter(f->f<=16).reduce(1,(a,b) -> a+b);
		System.out.println(studentList1);
		
	*/
		
		/*
		 * anyMatch(), allMatch(), noneMatch()
		 */
		
	/* anyMatch() - returns true, if one of element is matched, else false

		List<Integer> listInt = Arrays.asList(1,2,3,4,5,4,6,2,7,8,9, 10);
		boolean n = listInt.stream().anyMatch(a->a>5);
		System.out.println(n);
		
	*/
		
	/*  allMatch() - returns true, if all of elements is matched, else false
		List<Integer> listInt = Arrays.asList(1,2,3,4,5,4,6,2,7,8,9, 10);
		boolean n = listInt.stream().allMatch(a->a>5);
		System.out.println(n);
		
	*/
		
	/*  noneMatch() - returns true, if none of elements is matched, if one element is matched it is false
		List<Integer> listInt = Arrays.asList(1,2,3,4,5,4,6,2,7,8,9, 10);
		boolean n = listInt.stream().noneMatch(a->a<5);
		System.out.println(n);
	*/
		
	}

}
