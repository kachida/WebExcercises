package com.condition.WebExcercises;

import java.util.Scanner;

public class BMI_Index_Advanced {

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Weight is ");
		double weight=s.nextDouble();
		System.out.println("Height is ");
		double height=s.nextDouble();
		double bm=weight/(Math.pow(height, 2));
		
		if(bm<15)
		{
			System.out.println("Starvation");
		}
		else if(bm>15&&bm<=17.5)
		{
			System.out.println("Anorexic");
		}
		else if(bm>17.5&&bm<=18.5)
		{
			System.out.println("UnderWeight");
		}
		else if(bm>18.5&&bm<=25)
		{
			System.out.println("Ideal");
		}
		else if(bm>25&&bm<=30)
		{
			System.out.println("Over Weight");
		}else if(bm>=30&&bm<40)
		{
			System.out.println("Obese");
		}
		else if(bm>=40)
		{
			System.out.println("Morbidly Obese");
		}
		
		
	}
}
