package com.condition.WebExcercises;

import java.util.Scanner;

public class DaysOfTheWeek {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
System.out.println("enter the month");
		int m=s.nextInt();
		System.out.println("enter the date");
		int d=s.nextInt();
		System.out.println("enter the year");
		int y=s.nextInt();
		int y0 = y - (14 - m) / 12;
			int 	x = y0 + y0/4 - y0/100 + y0/400;
			int 	m0 = m + 12 * ((14 - m) / 12) - 2;
			int 	d0 = (d + x + (31*m0)/ 12) % 7;
			
			System.out.println(d0);
			//d=0---> sunday
			//d=1---> monday
			//...d=6--->saturday
	}

}
