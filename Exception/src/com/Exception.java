package com;

import java.lang.module.FindException;

public class Exception
{

	public static void main(String[] args){
		int num1,num2,num3;
		num1=20;
		num2=10;
		
		try{
		  num3 = num1/num2;
		  System.out.println("Result is "+num3);		  
		}	
		catch(ArithmeticException ae){  // child
			System.out.println("Numbers cannot be divided by zero");
		}
		catch(FindException ae1) {// parent
		
			System.out.println("i am before the subclass exception");
		}
		finally
		{
			System.out.println(" this block will always executed");
		}
		
	num3=num1+num2;               // normal flow after catching exception
	System.out.println("Result after addition is "+num3);
	}
	

}