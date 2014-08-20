package com.condition.WebExcercises;

public class Universal_product_Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="04850000102";
				int  n=0;
		double odd=0;
		double even=0;
		double checkdigit=0;
		int temp=0;
		for(int i=0;i<str.length();i++)
		{temp=Integer.parseInt(str.substring(i,i+1));
		
			if(i%2==0)
			{//odd part
				odd=odd+temp;
			}
			else
			{//even part
				even=even+temp;
			}
		}
		checkdigit=10-((((3*odd)+even)%10)%10);
		System.out.println((int)checkdigit);
int check=(int)checkdigit;
str=str+String.valueOf(check);
System.out.println("Final Upc with check digit "+str);
	}

}
