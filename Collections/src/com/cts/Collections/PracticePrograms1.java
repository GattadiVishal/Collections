package com.cts.Collections;

import java.util.Arrays;

public class PracticePrograms1 {
	
	//public static int subArray() {
		/*Find the total no.of sub arrays that is equal to sum 3
		 * Problem: Input is  Array as [1,2,3]
		 * 
		 * Sum k=3
		 * 
		 * Ex: [1,2] - 1+2=3
		 * [3] is also equals to 3
		 * 
		 * Output: No.of sub arrays that has  elements equals 3 is 2
		 * 
		 */
	/* Vishal Approach
		int a[] = {1,2,3};
		int sum = 0;
		int k=0;
		for(Integer i:a) 
		{
			sum = sum+i;
			System.out.println("Sum is :"+sum);
			if(sum==3 || i==3) 
			{
				k+=1;
			}
			
		}
		return k;
	}
	
	*/
	
	/*3rd question parent class: inheritance example */
/*
	class Base{
		public void print() {
			System.out.println("Base");
		}
	}
	
	class Derived extends Base {
		public void print() {
			System.out.println("Derived");
		}
	}
	
	class Main{
		public static void Doprint(Base o) {
			o.print();
	}
	
*/
	/*4th question */
/*
	public static String largestNum(String arr[]) {
		
		Arrays.sort(arr, (num1,num2)-> (num2+num1).compareTo(num1+num2));
		/*
		 * Here we are using Arrays.sort(input array, Comparator)
		 * Comparator checking the largest of 2 numbers passed i.e., ["3","30","34","5","9"]
		 * Here num1="3", num2="30"
		 * (num1,num2)-> (num2+num1).compareTo(num2+num1)
		 * ("3","30") -> ("30"+"3").compareTo("3"+"30")...here it is doing concat operation.
		 * ("3","30") -> ("303").compareTo("330") .. here it prints the greatest value of two values i.e., "330"
		 
	
		String str="";
		for(String s: arr) {
			str=str+s;  //The returned sorted numbers is stored in arr and it is iterated and stored in a single String for final output.
		}
		return str;
	}
*/
/*	6th Factorial With Recursion 
 
	public static int  intFact(int n) 
	{
		if(n==0)
			return 1;
		
		return n*intFact(n-1);
	}
*/
	public static void main(String[] args) {
		
	/* Vishal Approach 
		int result = subArray();
		System.out.println(result);
	*/
	//	https://www.youtube.com/watch?v=KsK5pHOvvWg
		/* Video Approach */
		
	/*	
		int a[] = {1,2,3};
		int k =3;
		int n = a.length;
		
		int result = 0;
		for(int i=0;i<n;i++) {
			int sum = 0;
			for(int j =i;j<n;j++) {
				sum = sum + a[j];
				if(sum == k) {
					result++;
				}
			}
			System.out.println("sum is : " + k + "is " + result);
		}
	*/
		/* 2nd question:  https://www.youtube.com/watch?v=s5nHUitVIyc */
	
	/*
		Integer sum1 = 100;
		Integer sum2 = 100;
		Integer sum3 = 500;
		Integer sum4 = 500;
		if(sum1 == sum2) {
			System.out.println("Fine");
		}else {
			System.out.println("Not fine");
		}
		
		if(sum3 == sum4) {
			System.out.println("Fine");
		}else {
			System.out.println("Not fine");
		}
		
		/*
		 * Solution: Fine, Not fine
		 * Because Integer is Wrapper class and has cache memory(Same like some temp storage) which can store from -127 to 128 only
		 */
	
		/* 3rd question */
	/*
		Base x = new Base();
		Base y = new Derived();
		Derived z = new Derived();
		Doprint(x); //Here it is straight one, which is creating a obj of Base and printing i.e., "Base"
		Doprint(y);
		//Here it is method overriding , at execution method resoln takes place with object , not for reference method.. so o/p is: "Derived"
		Doprint(z); //Here it is straight one, which is creating a obj of Derived and printing i.e., "Derived"
		
	*/
		
		/* 4th question: Form a largest number from an array ["3","30","34","5","9"]
		 * 
		 * Largest number that can be formed is 9534330
		 * 
		 * https://www.youtube.com/watch?v=s5nHUitVIyc
		 *   
		*/
	/*
		String arr[] = {"3","30","34","5","9"};
		System.out.println(largestNum(arr));
	*/
		/*5th Factorial Program 
		int n=5;
		int result = 1;
		for(int i=1;i<=n;i++) {
			result = result*i;
		}
		System.out.println(result);
		*/
		
		/*	6th Factorial With Recursion 
		int result =5;
		System.out.println(intFact(result));
		*/
	}

}
