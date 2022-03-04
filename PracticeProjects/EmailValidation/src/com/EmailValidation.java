package com;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailValidation{
 public static boolean isValidEmail(String email) {
 String regex = "^(.+)@(.+)$";
///initialize the Pattern object
 Pattern pattern = Pattern.compile(regex);
 Matcher matcher = pattern.matcher(email);
 return matcher.matches(); 
 }
 public static void main(String[] args) {
 List<String> emails = new ArrayList<String>();
 /// valid email addresses
 emails.add("ramsheyadav@example.com");
 emails.add("kohli.virat@example.me.org");
 //invalid email addresses
 emails.add("gupta.example.com");
 emails.add("myname is..bob@example.com");
 emails.add("abcdefg@.example.com");
 for (String value : emails) {
 System.out.println("The Email address " + value + " is:" + (isValidEmail(value) ? 
"valid" : "invalid"));
 } 
 System.out.println("ENTER YOUR MAIL TO CHECK :");
 try (Scanner sc = new Scanner(System.in)) {
String input = sc.nextLine(); 
System.out.println("The Email Address " + input + " is:" + (isValidEmail(input) ? 
"valid" : "invalid"));
}
 }
}