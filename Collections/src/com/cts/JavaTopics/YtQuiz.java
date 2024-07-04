package com.cts.JavaTopics;

import java.util.Arrays;

public class YtQuiz {

	public static void main(String[] args) {

		int[] sum1 = {0,1,2,3,4,5};
		
		/*Method-1
		 
		 
		int j =0;
		for(int s : sum1) {
			j+=s;
		}
		System.out.println("j is:"+j);
		
		*/
		
		/*Using Streams
		int sum = Arrays.stream(sum1).sum();
		System.out.println("sum is:"+sum);
		
		*/
		
	}

}
