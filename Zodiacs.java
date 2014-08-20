package com.condition.WebExcercises;

import java.util.Scanner;

public class Zodiacs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the month");
int m=s.nextInt();
System.out.println("Enter the date");
int d=s.nextInt();
if((m==12||m==1)&&((d>=22&&d<=31)||(d>=1&&d<=19)))
{
	System.out.println("caparicon");
	
}else if((m==2||m==1)&&((d>=20&&d<=31)||(d>=1&&d<=17)))
{
	System.out.println("Aquarius");
}else if((m==2||m==3)&&((d>=18&&d<=28)||(d>=1&&d<=19)))
{
	System.out.println("pisces");
}

	}

}
