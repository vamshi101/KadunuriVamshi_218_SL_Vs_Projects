package com;

public class DiamondProblem implements First, Second {
	public void show() 
    {  
        First.super.show(); 
        Second.super.show(); 
    } 

	public static void main(String[] args) {
		DiamondProblem ob = new DiamondProblem(); 
        ob.show(); 


	}

}
interface First 
{  
    default void show() 
    { 
        System.out.println("Default First"); 
    } 
} 
interface Second 
{  
    default void show() 
    { 
        System.out.println("Default Second"); 
    } 
}  