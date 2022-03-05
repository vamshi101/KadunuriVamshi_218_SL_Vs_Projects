package com;
import java.io.File;
import java.util.Scanner;
public class DeleteFile {
	public static void main(String[] args) {
		 String path="D:\\simpli_file\\";
		 try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the file name to delete");
			 String filename=sc.next();
			 String finalfilename=path+filename;
			 File f=new File(finalfilename);
			 f.delete();
		}
	}
}