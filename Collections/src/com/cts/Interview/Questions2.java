package com.cts.Interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Questions2 {

	public static void main(String[] args) {
		
	/*
		//1. java program to find the max and min number using stream API
		
		List<Integer> list = Arrays.asList(20,27,45,63,98,44,1,9, 189, 350);
		
		int maxNum = list.stream().max(Comparator.naturalOrder()).get(); //Max returns the maximun element of the stream, this is special reduction operation which is terminal operation.
		System.out.println(maxNum);
		
		int minNum = list.stream().min(Comparator.naturalOrder()).get(); //Min returns the minimun element of the stream, this is special reduction operation which is terminal operation.
		System.out.println(minNum);
		
	*/
		
	/*
		
		//2.Java program to find first two or three max numbers using stream API
		
		List<Integer> min2Numbers = list.stream().sorted(Comparator.naturalOrder()).limit(2).toList();
		//Here we are sorting using Comparator in natural order or ascending order, limit -> no.of elements to be printed
		System.out.println(min2Numbers);
		
		List<Integer> max2Numbers = list.stream().sorted(Comparator.reverseOrder()).limit(2).toList();
		//Here we are sorting using Comparator in reverse order or descending order, limit -> no.of elements to be printed
		System.out.println(max2Numbers);
		
		List<Integer> max2Numbers1 = list.stream().sorted(Comparator.reverseOrder()).skip(2).limit(3).toList(); //skip -> skips the number of elements
		System.out.println("max 2 numbers by skipping first 2 larger numbers: "+max2Numbers1); 
		
		List<Integer> min2Numbers1 = list.stream().sorted(Comparator.naturalOrder()).skip(2).limit(3).toList();
		System.out.println("min 2 numbers by skipping first 2 smaller numbers: "+min2Numbers1);
		
	*/
		
	/*
		
		//3. Java Program to merge two unsorted arrays into single sorted array without duplicates.
		int arr1[] = {1,45,77,3,9,0,12};
		int arr2[] = {35,3,10, 12, 67, 4, 9, 99};
		
		int resultArr[] = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)) //using Concat in IntStream, we first merge the arrays
				.sorted() //sort in ascending order
				.distinct() //unique elements
				.toArray(); //stores in Arrays
		System.out.println(Arrays.toString(resultArr));
	
	*/
		
	/*
		
		//4. Java program to find the given strings are anagram or not
		
		//Anagram - two string should form a meaningful word when they are shuffled (or) two string with same chars but in different order
		// ex: teacher - cheater 
		//each character should be repeated only once
		
		// Anagram without java8
		
		String s1 = "teacher";
		String s2 = "cheater";
		
		//check if the length is same
		if(s1.length()==s2.length()) {
			
			//Convert them to char Array
			char[] charArray1 = s1.toCharArray();
			char[] charArray2 = s2.toCharArray();
			
			//Sort the char array
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			//if sorted char arrays are same
			//then the string is anagram
			boolean result = Arrays.equals(charArray1, charArray2);
			
			if(result) {
				//System.out.println("Given strings are anagram");
			}
			else {
				//System.out.println("Given strings are not anagrams");
			}
		}
		else {
			System.out.println("Given strings are not equal");
		}
		
		
		//Anagram with java8
		s1 = Stream.of(s1.split("")) //split() - splits the chars in the string
				.map(s->s.toLowerCase()) //map() - to convert all the chars to lowercase
				.sorted() //sorts the characters
				.collect(Collectors.joining()); //joining() - concatenates input elements to string
		
		s2 = Stream.of(s2.split(""))
				.map(s->s.toLowerCase())
				.sorted()
				.collect(Collectors.joining());
		
		if(s1.equals(s2)) {
			System.out.println("Given strings are anagrams in java8");
		}
		else {
			System.out.println("Given strings are not anagrams in java8");
		}
	
	*/
	
	/*	
		//5. java program to sort the array of elements according to increasing order by using streams
		
		List<String> list = Arrays.asList("java", "oracle", "Hibernate", "Microservices","Advancejava", "python");
		List<String> list1 = list.stream()
				.sorted(Comparator.comparing(String::length)) //sort the element accord to its length
				//.forEach(System.out::println);
				.toList();
		System.out.println(list1);
		
	*/
		
		//6. java program to find the sum of given number
		
		//Without streams
		int num = 1234567;
		int sum = 0;
		
		//Convert to String
		String st = Integer.toString(num); //Integer is a wrapper class, wraps the int to object
		
		String strArr[] = st.split("");
//		for(String s: strArr) {
//			System.out.println(s);
//		}
		
		for(int i=0;i<strArr.length;i++) {
			sum+=Integer.parseInt(strArr[i]); //Here we are paring the string into integer
		}
		//System.out.println("Total sum of numbers is: "+sum);
		
		
		//Using stream API
		Integer sumOfDigits = Stream.of(String.valueOf(num).split("")).collect(Collectors.summingInt(Integer::parseInt));
		System.out.println("Sum of numbers using Stream API: "+sumOfDigits);
		
	}

}
