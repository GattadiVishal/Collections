package com.cts.Interview;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringQuiz {

	public static void main(String[] args) {
		String str = "aaabbcca";
		
//		Map<Character, Long> charCount = str.chars()
//				.mapToObj(c -> (char)c) //here we are converting int stream to char stream
//				.collect(Collec);
		
		Map<String, Long> charCount = str.codePoints()
				.mapToObj(Character::toString)
		        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(charCount);
		
		///////////////
		
//		Map<Character, Integer> count = new HashMap<>();
//		
//		for(int i =0;i<str.length();i++) {
//			
//			char currentChar = str.charAt(i);
//			int co = count.getOrDefault(currentChar, 0);
//			count.put(currentChar, count + ((i==str.length()-1) && (currentChar =='a'? 1 : 0)));
//		}
		
		
		// WIthout the streams
		/*
		
		String input = "aaabbcca";
		//String input = "aabbba";
 
		if(input == null || input.isEmpty() == true) {
			System.out.println(input);
		}
 
		StringBuilder sb = new StringBuilder();
		char currentChar = input.charAt(0);
		int charCounts = 1;
 
		for(int i = 1; i<=input.length()-1; i++) {
			char nextChar = input.charAt(i);
			if(currentChar == nextChar) {
				charCounts++;
			}
			else {
				sb.append(currentChar).append(charCounts);
				currentChar = nextChar;
				charCounts = 1;
			}
		}
		sb.append(currentChar).append(charCounts);
		System.out.println(sb);

		*/
		
		String input = "aaabbcca";
	/*
		List<String> result = new ArrayList<>();
		
		char prevChar = input.charAt(0);
		int count = 1;
		
		for(int i = 1; i<input.length();i++) {
			char currentChar = input.charAt(i);
			
			if(currentChar == prevChar) {
				count ++;
			}else {
				result.add(prevChar+ " "+count);
				prevChar = currentChar;
				count = 1;
			}
		}
		
		result.add(prevChar+ " "+count);
		result.forEach(System.out::println);
		*/
		
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
	       String txt = myObj.nextLine();
	       String result = Arrays.stream(input.split("(?<=(.))(?!\\1)")).map(s ->
	                        Character.toString(s.charAt(0))+(s.length() > 0 ? s.length() : "")).collect(Collectors.joining());
	       System.out.println(result);
	}

}
