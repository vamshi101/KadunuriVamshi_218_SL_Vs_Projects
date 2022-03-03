package constructorprogram; 
public class Person 
 { 
// Declaration of Instance variables. 
     String name; 
     int age; 
     String address; 

// Declare a default constructor. 
     Person() 
     { 
// Initialization of values of Instance variables. 
       name = "Vamshi"; 
       age = 23; 
       address = "Hyderabad"; 

//Print the values on the console. 
     System.out.println(name+ " " +age+ " " +address); 
    } 
// Static method or the main method. 
     public static void main(String[] args) 
     { 
 // Create the object of the class using new keyword. 
       Person p = new Person(); // Calling default constructor. 
     } 
}