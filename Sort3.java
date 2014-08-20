package com.condition.WebExcercises;

import java.util.Scanner;

public class Sort3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A");
		int a=s.nextInt();
		System.out.println("Enter B");
		int b=s.nextInt();
		System.out.println("Enter C");
		int c=s.nextInt();
int temp=0;
		if(a>b)
		{
			temp=a;
			a=b;
			b=temp;
		}
		if(a>c)
		{
			temp=a;
			a=c;
			c=temp;
			
		}
		if(b>c)
		{
			temp=b;
			b=c;
			c=temp;
		}
		
		System.out.println(" a b c "+a+" "+b+" "+c);
		
	}

}
