package com.cts.Collections;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {
	public static void main(String[] args) {
		/*
		 * FunctionalInterface - It is an interface that has exactly 1 abstract method
		 * 
		 * 4 types
		 * 
		 * 1.Consumer - BiConsumer
		 * 2.Predicate - BiPredicate
		 * 3.Function - BiFunction, Unary Operator, Binary Operator
		 * 4.Supplier
		 * 
		 */
		
		//Consumer Interface - Single Argument and No result
		/*
		Consumer<String> c1 = (s) -> {
			System.out.println(s.toUpperCase());
			
		};
		c1.accept("java");
		*/
		
		//BiConsumer Interface - 2 Arguments and No result
		/*
		BiConsumer<String, String> c2 = (s1, s2) -> {
			System.out.println("1: "+s1.toUpperCase()+", 2: "+s2);
		};
		c2.accept("java7", "java8");
		*/
		////////////////////////////////////////////////////////////
		//Predicate - 1 Input and Output in boolean
		/*
		Predicate<Integer> p1 = i ->  (i%2 == 0);
			System.out.println(p1.test(2));
		}
		 */
		//BiPredicate - 2 Inputs and Output in boolean
		/*
		BiPredicate<Integer, Integer> p2 = (i, j) -> {
			if (i > j) {
				return true;
			}
			return false;
		};
		*/
		//////////////////////////////////////////////////////////////
		/*
		 * Function Interface - 1 input and 1 output
		 * 3 methods
		 * apply() - take/pass/give input
		 * compose() - executes first parameter, then executes outer function
		 * andThen() - executes first function, then parameter function
		 */
		
	/*	
		Function<String, String> f1 = (name) -> name.toUpperCase();
		Function<String, String> f2 = (name) -> name.toUpperCase().concat(" Default");
		System.out.println(f1.apply("java7"));
		
		System.out.println(f1.compose(f2).apply("java8"));  //here first concat() operation is done, then toUpperCase() is applied.
		System.out.println(f1.andThen(f2).apply("java8"));  //here first toUpperCase() operation is done, then concat() is applied.
	*/
	
		/*
		Supplier - No input, only output  - It has only 1 method get()
		Supplier<Double> s1 = () -> Math.random();
		System.out.println(s1.get());
		*/
		
	}

}
