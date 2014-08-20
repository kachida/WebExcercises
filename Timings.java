package com.condition.WebExcercises;

public class Timings {
	
	public static void main(String args[])
	{
		int i=12;
		int count=0;
		while(i>0)
		{
		
		
	
		if(count==0&&i==12)
		{
			System.out.print(i);
			System.out.print(" Midnight");
			i=1;
			
			
		}
		else if(count==0&&(i>=1&&i<=11))
		{
			System.out.print(i);
			System.out.print(" am");
			i=i+1;
			if(i==11)
			{System.out.println();
				System.out.print(i);
				System.out.print(" am");
				i=12;
				count=1;
			}
		
		}
		else if(count==1&&i==12)
		{
			System.out.print(i);
			System.out.print(" noon");
			i=1;
		}
		else if(count==1&&(i>=1&&i<=11))
		{
			System.out.print(i);
			System.out.print(" pm");
			i=i+1;
			if(i==11)
			{
				System.out.println();
				System.out.print(i);
				System.out.print(" pm");
				break;
			}
		}
		System.out.println();
		
	}
	}
		
	}


