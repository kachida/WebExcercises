package com.condition.WebExcercises;

public class TriangleFormation {

	public static void main(String[] args) {
		
		double a=Math.random();
		double b=Math.random();
		double c=Math.random();
		if(a+b>c)
		{
			System.out.println("Triangle is formed");
			
		}else if(b+c>a)
		{
			System.out.println("Triangle is formed");
		}else if(c+a>b)
		{
			System.out.println("Triangle is formed");
			
		}
		else
		{
			System.out.println("triangle cannot be formed");
		}

	}

}
