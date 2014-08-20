package com.condition.WebExcercises;

import java.util.Scanner;

public class WindChill_Advanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the temperature in range of -50farenheit to 50 Farenheit");
		double t=s.nextDouble();
		System.out.println("Enter the Velocity in range of 3Mph to 110Mph");
		double v=s.nextDouble();
		if((t>-50&&t<50)&&(v>=3&&v<=110))
		{
		double w=35.74+(0.6215*t)+(0.4275*t - 35.75)*Math.pow(v,0.16);
		}else
		{
			System.out.println("Input values are out of range");
		}
		
		

	}

}
