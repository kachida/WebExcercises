package com.condition.WebExcercises;

public class Pepys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n=100000;
		int count1=0;
		for(int i=0;i<n;i++)
		{
			int ones=0;
			for(int j=1;j<=6;j++)
			{
				if(6*Math.random()<1)
				{
					ones++;
				}
			}
			if(ones>=1)
			{
				count1++;
			}
		}
		
		
		//atleast two times
		int count2=0;
		
		for(int i=0;i<n;i++)
		{
			int ones=0;
			for(int j=0;j<=12;j++)
			{
				if(6*Math.random()<1)
				{
					ones++;
				}
			}
			if(ones>=2)
			{
				count2++;
			}
		}
		
		System.out.println((1.0*count1)/n);
		System.out.println((1.0*count2)/n);

	}

}
