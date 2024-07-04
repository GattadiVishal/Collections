package com.cts.Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Questions1 {

	public static void main(String[] args) {
		//1. Java program to find occurrence of duplicate words in string without using MAP or Collections.
		//String str = "Java developer writes many java programs and writes Api also";
		
		//String[] strArray = str.toLowerCase().trim().split(" "); //here convert to lowercase and trim() the white spaces and split string according to whitespace.
	
	/*
		int count;
		String duplicates="";
		
		for(int i=0; i<strArray.length; i++) {
			count =1; //The count should be initialized here only, else we will get more count because of the iterations.
			for(int j=i+1; j<strArray.length; j++) { //In this loop, we are comparing with next element 
				
				 // Java developer writes
				 // i	 j				= because we will compare with i with j to find the duplicates.
				
		
				if(strArray[i].equals(strArray[j])) {
					count++;
				}
			}
			if(duplicates.isEmpty()) {
				duplicates= duplicates+" "+strArray[i]+" : "+count;
			}
			else if(!duplicates.matches("(.*)"+strArray[i]+"(.*)")) { //this regex matches the data(Words) character present in the string
				//this regular expression is used to find more than 1 record in the string.
				duplicates= duplicates+" "+strArray[i]+" : "+count;
			}
		}
		
		System.out.println(duplicates);
	*/	
		
		//2. Java program to find occurrence of duplicate words in string with using MAP
	/*	
		//Here we are using Map because, map don't allow duplicate keys.
		//So here we are taking Words<String> as keys, Count<Integer> as values, as w.k.t keys can't be modified, but values can be modified
		Map<String, Integer> map = new HashMap<>();
		for(String s: strArray) { //iteration through array
			if(map.containsKey(s)) {  
				//Initially the value doesn't come in this loop, because initially the map will be empty.
				//  containsKey() method returns false.
				
				 // After initial storage, for the next iteration when the count will increased, for that map.get() return the count of that word and after that it will be incremented.
				 
				map.put(s, map.get(s)+1);
			}
			else {
				 // Initially the values come here to store and count will be initialized.
				map.put(s, 1);
			}
		}
		
		Set<String> keys = map.keySet(); //Here we are get keys i.e., Words
		for(String s1: keys) {
			System.out.println(s1 + " : "+ map.get(s1));  //Here we get he Word i.e., s1 and Count of word i.e., map.get(s1).
		}
	*/
		
	/*	
		//3. Java program to find occurrence of duplicate words in string using Java8 streams
		List<String> list = Arrays.asList(strArray);
		Map<String, Long> result = list.stream().map(str1 -> str1).collect(Collectors.groupingBy(str1 -> str1, Collectors.counting()));
		// here we are groupingBy(same string, counting the no.of times repeated) and storing in Map, coz we need word and its count.
		result.forEach((k,v)->
		System.out.println(k+" : "+v));
	*/
		
	/*
		//4. Filter the employees based on gender and without using java8
		List<Employee> allEmployees = new ArrayList<>();
		allEmployees.add(new Employee("Sachin",47,"male"));
		allEmployees.add(new Employee("Virat",38,"male"));
		allEmployees.add(new Employee("Julan",35,"female"));
		allEmployees.add(new Employee("Smrithi",23,"female"));
		allEmployees.add(new Employee("Rohit",39,"male"));
		allEmployees.add(new Employee("Jemimah",22,"female"));
		
		List<Employee> maleEmployees = new ArrayList<>();
		List<Employee> femaleEmployees = new ArrayList<>();
		
		for(Employee emp : allEmployees) {
			if(emp.getGender().equals("male")) {
				maleEmployees.add(emp);
			}
			else {
				femaleEmployees.add(emp);
			}
		}
		
		for(Employee list: maleEmployees) {
			//System.out.println("Male :"+ list);
		}
		
		for(Employee list: femaleEmployees) {
			//System.out.println("Female :"+ list);
		}
		
		//5. Filter the employees based on gender and with using java8
		List<Employee> males = allEmployees.stream().filter(m -> m.getGender().equals("male")).collect(Collectors.toList());
		//System.out.println("Male :"+ males);
		
		List<Employee> females = allEmployees.stream().filter(m -> m.getGender().equals("female")).collect(Collectors.toList());
		//System.out.println("Female :"+ females);
		
		//6. Filter the employees based on gender and with using java8 Map
		Map<String, List<Employee>> employeeByGender = allEmployees.stream().collect(Collectors.groupingBy(Employee::getGender));
		//System.out.println(employeeByGender);
		employeeByGender.forEach((k,v)->System.out.println(k+" : "+v));
		
	*/

	/*
		//5.Java program to find the duplicate numbers in the given array without streams.
		
		Integer arr[] =  {11,22,33,11,44,55,77,88,66,88,99};
		int count;
		
//		for(int i=0;i<arr.length;i++) {
//			count=1;
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					count++;
//					//System.out.println("Duplicate numbers are :"+arr[j]+" : "+count);
//				}
//			}
			
			//Java program to find the duplicate numbers in the given array with using streams.
			Set<Integer> dupSet = new HashSet<>(); //Here we are using Set(), coz set doesn't allow the duplicate elements
			
			
			Set<Integer> outputSet = Arrays.asList(arr).stream().filter(k -> !dupSet.add(k)).collect(Collectors.toSet());
			//!dupSet.add(k) -> condition is used to check the duplicate elements
			//outputSet.forEach(x -> System.out.println(x));
			//System.out.println(outputSet);
			
			//	Java program to find the duplicate numbers in the given array with using streams using frequency() in Collections.
			Set<Integer> outputSet1 = Arrays.asList(arr).stream().filter(k -> Collections.frequency(Arrays.asList(arr), k)>1).collect(Collectors.toSet());
			//Collections.frequency() -> Returns the number of elements in the specified collection equal to the specified object, Collections.frequency(Collection c,object o)
			System.out.println(outputSet1);
		}
	*/
		

	/*
		//6. Java Program to find sum of odd and even numbers without streams
	
		Integer arr[] =  {11,22,33,11,44,55,77,88,66,88,99};
		int evenArr = 0;
		int oddArr= 0;
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evenArr = evenArr+arr[i];
			}
			else {
				oddArr = oddArr+arr[i];
			}
		}
//		System.out.println("Sum of even is: "+evenArr);
//		System.out.println("Sum of odd is: "+oddArr);
		
		// Java Program to find sum of odd and even numbers with streams
		List<Integer> result = Arrays.asList(arr);
		
		//Here we are taking  Map<Boolean, Integer> to use Collectors, boolean is to check the number%2==0 mean even(true) or odd(false
		Map<Boolean,Integer> output = result.stream().collect(Collectors.partitioningBy(x -> x%2==0, Collectors.summingInt(Integer::intValue)));
		// Collectors.partitioningBy() -> partitioningBy() method is used to partition the stream of elements based on given predicate,
		// Collectors.summingInt() -> summingInt() method is used to sum the returned result.
		// Integer::intValue(Class::method) -> Method reference which is Integer is class and intValue() is a method , intValue() returns the output in int format.
		System.out.println(output);
		//We get output as: {false=286, true=308}, false represents the odd numbers and true represents the even numbers
		 
	 
	*/
		
	/*
		
		//7. Java Program to find all the numbers starting with given number
		
		List<Integer> list = Arrays.asList(11,21,34,54,44,41,47,49);
		List<String> collect = list.stream().map(s->s+"").filter(s->s.startsWith("4")).collect(Collectors.toList());
		//System.out.println(collect);
		
		// Java Program to find all the words starting with given character
		
		List<String> strList = Arrays.asList("Akkay","Kohli","Anushka","Srikar","Vasu");
		List<String> collect2 = strList.stream().filter(s->s.startsWith("A")).collect(Collectors.toList());
		System.out.println(collect2);
		
	*/
	
	/*
		
		//8. Java program top find the frequency of each character count using java8 streams
		
		String input = "Java Programming program";
		
		Map<Character, Long> result = input.chars() // returns the stream char values from sequence
											.mapToObj(c -> (char)c) //here we are converting string to char object
											.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); //We are grouping them acc to Function.identity() i.e., input character and count of that character
		System.out.println(result); // op: {p=1, P=1,  =2, a=4, r=4, v=1, g=3, i=1, J=1, m=3, n=1, o=2}, here =2 is white spaces
					//collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) instead of Function.identify()
					// we can also use as collect(Collectors.groupingBy(s->s, Collectors.counting())), which is same as taking the input character.
		
	*/
	
	
	/*
		
		//9. Java program to reverse the given integers without streams.
		Integer arr[] =  {11,22,33,11,44,55,77,88,66,88,99};
		int temp = 0;
		//Using bubble sort technique
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {		//for descending order if(arr[i]<arr[j]), we use this condition
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		//System.out.println("After sorting in ascending order");
		for(int i =0;i<arr.length;i++) {
			//System.out.println(arr[i] + "  ");
		}
		
		//Java program to reverse the given integers with streams.
		List<Integer> numList= Arrays.asList(arr);
		System.out.println("Using Streams");
		// numList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); //1 type
		 // or
		 List<Integer> result = numList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());//2 type  - reverseOrder() is used to print in descending order
		 System.out.println("Desending order using streams: "+ result);
		 
		 List<Integer> result1 = numList.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()); //3 type - naturalOrder() is used to print in ascending order
		 System.out.println("Ascending order using streams: "+ result1);
		 
	*/
	}
}

