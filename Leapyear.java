package ProgramsList;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year;
		System.out.println("Enter the year: ");
		Scanner sc = new Scanner(System.in);
		
		
		year=sc.nextInt();
		
		if((year%400==0)||((year%4==0)&&(year%100!=0))){
			System.out.println("Year " + year + " is a leap year");
		}else
		{
			System.out.println("Year " + year + " is not a leap year");
		}
		
	}

}
