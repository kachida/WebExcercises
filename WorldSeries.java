package com.condition.WebExcercises;

public class WorldSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x=Math.random()*(1-0.5)+0.1;
		double y=Math.random()*(1-0.5)+0;
		
		double win=0,count=0;
		int n=100;
		while(n>0)
		{
		if(x>Math.random())
		{
			count++;
			
		}else if(y>Math.random())
		{
			win++;
			count++;
		}
		n--;
		}
		System.out.println("*******For 100 matches********");
System.out.println("number of wins "+win);
System.out.println("Number of loses "+(count-win));
System.out.println("Number of matches "+count);
double prob=win/count;
System.out.println("probability is "+prob);


	}

}
