package com.cts.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingExamples {

	public static void main(String[] args) {

		//Sorting with Collection
		
		//List<Integer> nums = new ArrayList<>(); 
		/*After 1.7 the generic type made optional to declare on right side
		 * Before 1.7 we declare on both sides.
		 */
//		nums.add(4);
//		nums.add(3);
//		nums.add(7);
//		nums.add(9);
//		
//		System.out.println(nums); //This prints as usual and unsorted list.
//		
//		Collections.sort(nums); //Collections is a class and has a method sort().
//		System.out.println(nums); //prints sorted list.
		
		
		/*
		 * Here Collections class has a sort() method which sorts,
		 * but i want to sort based on own sort method.
		 * Then we will use Comparator - which is a interface.
		 * Using comparator we can write our own logic for sorting.
		 */
		
//		Comparator<Integer> comp = new Comparator<Integer>() {
//			
//			//Here we declare class name, coz collection work with wrapper class, Integer wrapper as parameter
//			public int compare(Integer i, Integer j) 
//			{
//				if(i%10 > j%10)
//					return 1; //1 returns if swap is possible
//				else
//					return -1;//-1 returns if swap is not possible
//			}
//		};
		
//		List<Integer> nums = new ArrayList<>(); 
//		nums.add(43);
//		nums.add(31);
//		nums.add(72);
//		nums.add(29);
//
//		Collections.sort(nums, comp);
//		System.out.println(nums);//This prints the sorted value at units place.
		//Try this: take a list of string and sort them with length of string.
		
		
		//class Student implements Comparable<Student>
		class Student
		{
			int age;
			String name;

			public Student(int age, String name) {
				super();
				this.age = age;
				this.name = name;
			}

			public String toString() {
				return "Student [age=" + age + ", name=" + name + "]";
			}

//			public int compareTo(Student that) {
//				
//				if(this.age > that.age)
//					/*
//					 * Here we are using this, because this reference to current object of student 
//					 * and we are comparing with other student object.
//					 */
//					return 1; 
//				else
//					return -1;
//			}
			
		}
		
//		Comparator<Student> comp = new Comparator<Student>() {
//			//Here we declare class name, coz collection work with wrapper class, Integer wrapper as parameter
//			public int compare(Student i, Student j) 
//			{
//				if(i.age > j.age)
//					return 1; //1 returns if swap is possible
//				else
//					return -1;//-1 returns if swap is not possible
//			}
//		};
		
		
		Comparator<Student> comp = (i, j) -> i.age>j.age ? 1:-1;
		/*
		 * Since, comparator is a functional interface, we can use lambda expressions also.
		 */
		
		List<Student> studs = new ArrayList<>(); 
		studs.add(new Student(21, "Navin"));
		studs.add(new Student(12, "John"));
		studs.add(new Student(18, "Parul"));
		studs.add(new Student(20, "kiran"));

		Collections.sort(studs, comp); //prints the data according to age in ascending order.
		//Collections.sort(studs); 
		/*we can now directly sort without comparing, because we are adding comapreTo() method
		 * and Student implements Comparable interface.
		 * And we don't use comparator interface.
		 */
		for(Student s: studs)
			System.out.println(s);//Prints the student data
		
		/*
		 * Comparable - giving a class a power to itself to compare it object itself.
		 */
		
	}

}
