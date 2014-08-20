package com.condition.WebExcercises;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="debit card";
		char c[]=str.toCharArray();
		String s="bad credit";
		StringBuffer sb=new StringBuffer(s);
		char c1[]=s.toCharArray();
		int index=0;
		boolean ret=false;
		char ch='0';
		int count=0;
		for(int i=0;i<str.length();i++)
		{count=0;
			ch=str.charAt(i);
		System.out.println("ch value is "+ch);
			for(int j=0;j<sb.length();j++)
			{
				System.out.println(" j value is "+j);
				if(sb.charAt(j)==ch)
				{
					System.out.println("char at j is "+sb.charAt(j));
					sb.deleteCharAt(j);
					count++;
					
				}
				
			}
			if(count==0)
			{
				ret=false;
				break;
			}
		}
		System.out.println(sb.length());
		if(sb.length()==0)
		{
			System.out.println("anagram pair");
		}
		

	}

}
