package ProgramsList;

import java.util.Scanner;

public class CountSameCharinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String s="Java is a programming Language";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=sc.nextLine();
		
		char c='k';
		
		
		int count=s.length()-s.replace("k", "").length();
		String s1=s.replace("k", " ");
		System.out.println(s1);
		System.out.println("The no. of occurance "+c+" in given String "+s+" is: "+count);

	}

}
