// package com.company;
// A Class that represents use-defined exception
// import java.util.*;
// constructor in java
import java.util.Scanner;
class MyException extends Exception {
	public MyException(int s)
	{

		// Call constructor of parent Exception
	System.out.println("result: "+s);
		// super(s);
	}
}

// A Class that uses above MyException
public class exception_constructor {
	// Driver Program
	public static void main(String [] args)
	{
		try(Scanner scanner=new Scanner(System.in)) {
			
            
			System.out.println("enter the num1 ");
			int num1=scanner.nextInt();
			System.out.println("enter the num2: ");
			int num2=scanner.nextInt();
			int result= num1 / num2;

			// new MyException(result);
			// Throw an object of user defined exception
			throw new MyException(result);
		}
		catch (MyException ex) {
			System.out.println("can't divide by zero Caught");

			// Print the message from MyException object
			// System.out.println(ex.getMessage());
		}

		catch(ArithmeticException ex){
			System.out.println("arthmetic exception");
			System.out.println(ex.getMessage());

			
		}
	}
	
}
