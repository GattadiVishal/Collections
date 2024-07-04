package com.cts.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsExample {

	public static void main(String[] args) {
		//System.out.println("Hello World!");
		
		//Collection - is a interface
//		Collection<Integer> nums = new ArrayList<Integer>();
//		nums.add(6);
//		nums.add(5);
//		nums.add(8);
//		nums.add(2);
		
	
//		System.out.println(nums);
		
		//For Collection we don't have indexing
		/*For any value we declare the type of it.
		 * Here for nums we haven't declared any type, so when we pass the values into collections
		 * without declaring the type then it will consider as values as objects.
		 * To solve this problem we use generics type.
		 * Beacuse collection work with objects not the primitive types.
		 */
//		for(int n:nums) { //without generic type, the for loop will give error.
//			System.out.println(n);
//		}
		/*
		 * Without generic type we can perform the operation, if we add different data type, that might 
		 * lead a runtime exception.
		 */
//		Collection<Integer> nums = new ArrayList<Integer>();
//		nums.add(6);
//		nums.add(5);
//		nums.add(8);
//		nums.add(2);
//		//nums.add("5");
//		
//		for(Object n:nums) { //here we have objects, so we declare it as object type
//			int num = (Integer)n; //we are type casting collection objects to integer.
//			System.out.println(num*2); //here we are multiplying  with 2
//		}
		/*
		 * Here Without generic type we can perform the operation, if we a different data type, that might 
		 * lead a runtime exception.
		 * So, in this case when we use generic we get compile time exception when we try to add string type to integer type.
		 */
		
		
		/*
		 * ArrayList is a class which implements a List, and it does have a method called get().
		 * Which can be used to work with indexes.
		 */
//		List<Integer> nums = new ArrayList<Integer>();
//		nums.add(6);
//		nums.add(5);
//		nums.add(8);
//		nums.add(2);
//		//nums.add("5");
//		
//		System.out.println(nums.get(2)); //get(index) is used to retrieve, value present at index.
		
		
		/*
		 * When we want a collection of unique elements, we use Set.
		 * Set implements collection interface but extends the HashSet() .
		 */
//		Set<Integer> nums = new HashSet<Integer>();
//		nums.add(6);
//		nums.add(5);
//		nums.add(8);
//		nums.add(2);
//		nums.add(5);
//		
//		for(int n:nums) {
//			System.out.println(n); 
			/*
			 * here output will print in unsorted non-repeated elements only.
			 * Because set accepts only unique elements
			 * Set doesn't support working with index value. 
			 */
		
		//TreeSet() - when we want output in sorted format we use TreeSet().
		/*
		 * TreeSet() - extends AbstractSet
		 * implements interface NavigableSet
		 * NavigableSet extends SortedSet
		 */
//		Set<Integer> nums = new TreeSet<Integer>();
//		Collection<Integer> nums = new TreeSet<Integer>(); //Because Set implements Collection
//		nums.add(6);
//		nums.add(5);
//		nums.add(8);
//		nums.add(2);
//		nums.add(5);
//		
//		for(int n:nums) {
//			System.out.println(n);
//		}
		
		/*
		 * We can also use Iterator interface for iteration
		 * Iterator has iterator() method.
		 */
//		Collection<Integer> nums = new TreeSet<Integer>(); 
//		nums.add(6);
//		nums.add(5);
//		nums.add(8);
//		nums.add(2);
//		nums.add(5);
//		Iterator<Integer> value = nums.iterator();
//		while(value.hasNext()) {
//		//value.next();
//		System.out.println(value.next());
//		}
		
		
		/*
		 * Map - It is not implementation or doesn't extend Collection interface.
		 * It is part of Collection API
		 * 
		 * As w.k.t Array elements have indexes and we fetch them using indexes.
		 * What if we want to call it by name.
		 * So, that concept is key and value pair, which can be achieved by using MAP data type.
		 * Map is a interface, which takes parameters as Key and Value.
		 * Key value can be replaced with any datatype.
		 */
		
//		Map<String, Integer> student = new HashMap<>(); //Hashmap is a class which implements Map.
		/*the working of Hashmap is same as hashtable, but the only thing is 
		 * hashmap should be synchronized externally.
		 */
//		student.put("Navin", 56); 
//		student.put("Harsh", 23);
//		student.put("Sushil", 67);
//		student.put("Kiran", 92);
//		student.put("Harsh", 45);
		/*
		 * Here we are using put instead of using add.
		 * add is used to add the elements.
		 * put is used to check the element is present, if present replace nor else add that element.
		 */
		
		Map<String, Integer> student = new Hashtable<>(); 
		/*
		 * the working of Hashtable is same as hashmap, but the only thing is 
		 * hashtable is synchronized.
		 * synchronized is used when multiple threads are working, then use hashtable.
		 */
		student.put("Navin", 56); 
		student.put("Harsh", 23);
		student.put("Sushil", 67);
		student.put("Kiran", 92);
		student.put("Harsh", 45);
		
		//System.out.println(student); //it doesn't print in sequential order.
		//System.out.println(student.get("Harsh")); //get() method takes key as parameter. Key is case sensitive.
		/*
		 * Here When we added same key name Harsh and changed the value, it got replaced, because key is unique and values can be repeated.
		 */
		
		/*
		 * Here we have to print all the key values using a loop, but there is a problem, here we have 2 things, keys and values.
		 * earlier in arrays, list we used to past the index to iterate.
		 */
		System.out.println(student.keySet());//keySet() is a method that prints all the key values.
		/*
		 * By using keySet() we iterate the Key value and print them.
		 */
		
		for(String key:student.keySet()) { //string is data type for key
			System.out.println(key + " : " + student.get(key)); //here we first print the key and get() methods prints the value present at that key.
		}
	}

}
