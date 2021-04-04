package javaPact;

import java.util.Scanner;

public class CountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=sc.nextLine();
		
//		int count=s.length()-s.replace("e", "").length();
//		System.out.println(count);
		
		char c='e';
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)==c) {
				count++;
			}
			
		}
		System.out.println("Occurance of "+c+"in the given string is: "+count);
	}

}
