package com.condition.WebExcercises;

import java.util.Scanner;

public class Number_To_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ones[]={"","one","two","three","four","five","six","seven","eight","nine"};
		String tens[]={"","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
		String teens[]={"","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n=s.nextInt();
		int temp=0;
		if(n>0)
		{
		while(n>0)
		{
			if(n==100000)
			{
				System.out.println(" one "+" lakh");
				break;
			}
			else if(n>=20000&&n<=99999)
			{
				temp=n/10000;
				System.out.println(" "+tens[temp]);
				n=n%10000;
			}
			
		else if(n>10000&&n<=19999)
			{
				temp=n/1000;
				temp=temp%10;
				System.out.println(" "+teens[temp]+" thounsand");
				n=n%1000;
			}
		else if(n==10000)
			{
				temp=n/10000;
				System.out.print("  "+tens[temp]+" thounsand");
				n=n%10000;
			}
			else if(n>=1000&&n<=9999)
			{
				temp=n/1000;
				System.out.print("  "+ones[temp]+" Thousand");
				n=n%1000;
				
			}else if(n>=100&&n<=999)
			{
				temp=n/100;
				System.out.print(" "+ones[temp]+" Hundred");
				n=n%100;	
			}else if(n>=20&&n<=99)
			{
				temp=n/10;
				System.out.print(" "+tens[temp]);
				n=n%10;
				
				
			}else if(n>10&&n<=19)
			{
				temp=n%10;
				System.out.print(" "+teens[temp]);
				n=n%10;
				break;
				
			}
			else if(n==10)
			{
				System.out.print("ten");
				n=n/10;
				break;
			}
			else if(n<10)
			{
				System.out.print(" "+ones[n]);
				break;
			}
		}
		}
		else
		{
			System.out.println("Negative number");
		}

	}

}
