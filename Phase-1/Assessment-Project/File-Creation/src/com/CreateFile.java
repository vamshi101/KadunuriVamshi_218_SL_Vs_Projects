package com;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class CreateFile
{
	public static void main(String[] args) throws IOException 
	{
		String path = "D:\\Simpli_file\\";
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the file name to Create");
			String fname = path+sc.next();
			File f = new File(fname);
			boolean result = f.createNewFile();
			//boolean result=f.createNewFile();
			if(result==false) {
				System.out.println("file is not created");
			}
			else {
				// al.add(filename);
				System.out.println("file is created at : "+fname);
				//  System.out.println(f.getName());
			}
		}
	}
}