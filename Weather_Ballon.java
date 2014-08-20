package com.condition.WebExcercises;

public class Weather_Ballon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double h[]=new double[50];
		for(int i=0;i<=48;i++)
		{
			h[i]=(-0.12)*(i*i*i*i) + 12*(i*i*i) - 380*(i*i) + 4100*(i) + 220;
		}
		double max=Integer.MIN_VALUE;
		double t=0;
		for(int i=1;i<48;i++)
		{
			if(h[i]>max)
			{
				max=h[i];
				t=i;
			}
			System.out.println(h[i]);
		}
		System.out.println("Max height  is and  t is "+max+" m  "+t+"hr");

	}

}
