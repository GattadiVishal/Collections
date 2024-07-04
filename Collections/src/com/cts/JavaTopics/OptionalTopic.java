package com.cts.JavaTopics;

import java.util.Optional;

public class OptionalTopic {

	public static void main(String[] args) {
//		String str = "Hello";
//		Optional<String> optStr = Optional.ofNullable(str);
//		
//		String result = optStr.orElse("World");
//		
//		System.out.println(result);
		
		String[] str = new String[5];
		
		str[2] = "Optional";
		
		Optional<String> optStr = Optional.ofNullable(str[2]);
		
		System.out.println(optStr.hashCode());
		System.out.println(optStr.get());

	}

}
