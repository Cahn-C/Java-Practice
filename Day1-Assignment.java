package FirstJavaDemo;

public class Assignments {

	public static void main(String[] args) {
		// Assignment 1
		// Write a Java Program to print 'Hello' on screen and then print your name on a separate line.
		
		System.out.println("Hello");
		System.out.println("Chaanyah Laborde");
		
		
		System.out.println("\n");
		
		// Assignment 2
		// Write a Java program to print the sum of two numbers
		
		int num1 = 10;
		int num2 = 20;
		int result = num1 + num2;
		
		System.out.println(result);
		
		
		System.out.println("\n");
		
		
		// Assignment 3
		// Write a Java Program to swap two numbers
		
		int a = 10;
		int b = 20;
		int c = 10;
		
		System.out.println("a = " + (a = b));
		System.out.println("b = " + (b = c));
		
		
		System.out.println("\n");
		
		// Assignment 4
		// Write a Java Program to swap two numbers without a third variable
		
		int x = 10;
		int y = 20;
		
//		System.out.println("y = " + (y = y - x)); // 20 - 10 ---> y = 10
//		System.out.println("x = " + (x = y + x)); // 10 + 10 ---> x = 20 
		
		// Or
		
		System.out.println("x = " + (x = x + y)); // 10 + 20 ---> x = 30
		System.out.println("y = " + (y = x - y)); // 20 - 10 ---> y = 10
		System.out.println("x = " + (x = x - y)); // 30 - 10 ---> x = 20

	}

}
