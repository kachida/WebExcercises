package com.condition.WebExcercises;

public class Binary2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=104;
		int temp=n;
		String str="";
		while(n>0)
		{
			if(n%2==0)
			{
			str=str+"0";
			}else
			{
				str=str+"1";
			}
			n=n/2;
		}
		StringBuffer sb=new StringBuffer(str);
		System.out.println("value of n is "+temp+" binary format is "+sb.reverse());
		

	}

}
