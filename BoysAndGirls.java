package com.condition.WebExcercises;

public class BoysAndGirls {
	public static void main(String args[])
	{
		
		double d=Math.random();
		int child=0;
		int b=0,g=0;
		
		while(b<2&&g<2)
		{
			d=Math.random();
			
		if(d<0.5)
		{
			b++;
			
		}
		else
		{
			g++;
		}
		
		
		}
		child=b+g;
		
		System.out.println("number of children "+child);
		
	}

}
