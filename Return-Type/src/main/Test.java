package main;
public class Test 
{
 int square(int num){
   return num * num; // return a square value.
 }
public static void main(String[] args) 
{
// Create an obejct of class Test.
  Test t = new Test();
  
// Call the method using object reference variable. Since the return type of this method is int, we will store it using a variable of type int.  
   int squareOfNumber = t.square(20); 
 
// Displaying the result.    
   System.out.println("Square of 20: " +squareOfNumber);
  }
}