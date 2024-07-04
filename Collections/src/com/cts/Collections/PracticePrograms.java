package com.cts.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticePrograms {
	//public static void main(String[] args) {
/*
        List<Integer> n = new ArrayList<Integer>();
        n.add(0,2);
        n.add(1,3);
        n.add(2,4);
        n.add(3,1);
       // n.add(7);
       int first_score = 0;
       int second_score = 0;
  /*     Vishal Approach
       //for(int i=0; i < n.size() ;i++)
       while(n.size()!=0)
       {
    	   
    	   if(i % 2==0) 
    	   {
//    		   for (int k = 0, j = n.size() - 1; k < j; k++) 
//    	           {
//    	               n.add(k, n.remove(j));
//    	               
//    	           }
 //   		   Collections.reverse(n);
    		   n.remove(i);
    		   // Collections.reverse(n);
    		   System.out.println(n);
    	   }
    		   
    		   //first_score  = first_score + i;
    		   
//    	   for (int k = 0, j = n.size() - 1; k < j; k++) 
//           {
//               n.add(k, n.remove(j));
//           }\
    	   
       }
       
       System.out.println(first_score);
       
       f=2 
       [1,4,3]
       s=1
       
       [4,3]
       f=4   6
       s=3   4
       
       
       
	}
	
	
	Srikar approach
       while(n.size()!=0) 
       {
    	   first_score = first_score + n.get(0); //2  //4 = 6 //7 = 13
    	   n.remove(0);
    	   if(first_score%2==0)
    		   Collections.reverse(n);
    	   
    	   if(n.size()==0)
    		   break;
    	   second_score = second_score + n.get(0); //3 //1 = 4 
    	   if(second_score%2==0)
    		   Collections.reverse(n);
    	   n.remove(0);
    	   
    	   
       }
       System.out.println(first_score - second_score );
       */
		
		/* Replace words in string
		String str = "Virat is great batsmen";
		//char[] s = str.
		String i = str.replace("great", "greatest");
		System.out.println(i);
       */
		
		/*
		 * Write a function that takes in a string of lower case english alphabet letters and returns the index of the strings first non repeating character
		 * the non repeating character is the first character in the string that occurs only once.
		 * if the input string doesn't have a non repeating character the function should return -1
		 * 
		 * input : abcdcaf
		 * output : 1
		 */
	public static int findOccurrance(String s) {

		int[] count = new int[26] ;
		/*
		 * What i missed
		 */
		for(char ch: s.toCharArray()) 
		{
			count[ch - 'a']++;
		}
		/*above loop i missed
		 * above loop is used to store the count of the occurrence of the each letter
		 *  [ch - 'a'] this is used as 
		 *  'a'- 'a' = 0
		 *  'b' - 'a' = 1
		 *  .... 'z'-'a'= 25
		 */
		for(int i=0; i<s.length();i++)
		{
			if(count[s.charAt(i) - 'a']==1) {
				return i+1; // adding 1 to get 1- based index as per example.
			}
		}
		return -1;
	}
	public static void main(String args[])
	{
		String s = "abcdcaf";
		int result = findOccurrance(s);
		System.out.println(result);
	}
	
}
