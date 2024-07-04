package com.cts.Collections;

/*Quiz 1*/
/*
interface A{
	default void display() {
		System.out.println("A");
	}
}

class Demo implements A{
	public void display() {
		System.out.println("Demo");
	}
}

*/

/*Quiz 3*/
/*
class A{
	static {
		System.out.println("A - static");
	}
}

class B extends A{
	static {
		System.out.println("B - static");
	}
}
*/
public class Quizes {
	/* Quiz 3
	 * public class Test{
	static {
		System.out.println("Test - static");
	}
	*/
	public static void main(String[] args) {
		
		/* Quiz 1
		A ref = new Demo(); 
		//Here it is method overriding , at execution method resoln takes place with object , not for reference method, 
		//means inreface is just used as reference to create an object to call the Demo Class.
		ref.display(); //op: Demo
		*/
		
		/*Quiz 2 */
		/*
		int i;
		for(i=1;i<12;i+=2) {
			if(i==8) {
				System.out.println(i); 
				break;
			}
		}
		//op: Nothing is printed, coz loop is iterating by 2 times, i.e., 1, 1+2=3, 3+2=5, 5+2=7, 7+2=9....it will never go to if condition.
		*/
		/* Quiz 3
		A a1 = null;
		A a2 = new A();
		B b1 = new B();
		op: Test - static
			A - static
			B - static
			When the class is loaded, first Test is executed, then Object creation of A and B is executed. 

		*/
		
		/*Quiz 4*/
		
		//   \u000d System.out.println("Hi Champs"); //here the code should be in comment only
		
		/*op: In java, unicode sequence are processed before the code is compiled.
		 * \u000d - is a representation for a new line character
		 */
		
		/* Before unicode is processed
		 *  //  \u000d System.out.println("Hi Champs");
		 * 
		 * After unicode is processed
		 * //  \u000d (represents a new line)
		 * System.out.println("Hi Champs");
		 */
		
	}

}
