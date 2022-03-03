package com;
import java.util.*;

public class ArithematicCalculator
{
	public static void main(String[] args)
	{
		 double n1,n2; 
		 
		 try (var s = new Scanner(System.in)) {
			System.out.println("Enter the numbers");
			 
			 n1=s.nextDouble();
			 n2=s.nextDouble();
			 
			 System.out.println("Enter the operator(+,-,*,/)");
			 
			 char op=s.next().charAt(0);
			 double o=0;
			 
			 switch(op)
			 {
			 case '+':
				 o=n1+n2;
				 break;
			 case '-':
				 o=n1-n2;
				 break;
			 case '*':
				 o=n1*n2;
				 break;
			 case '/':
				 o=n1/n2;
				 break;
			 }
			 System.out.println("The final output is");
			 System.out.println();
			 System.out.println(n1+" "+op+" "+n2+" = "+o);
		}
	}

}