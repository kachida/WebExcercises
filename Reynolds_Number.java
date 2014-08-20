package com.condition.WebExcercises;

import java.util.Scanner;

public class Reynolds_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the diameter");
		double d=s.nextDouble();
		System.out.println("Enter the velocity");
		double v=s.nextDouble();
		System.out.println("Enter the Rho Value");
		double rho=s.nextDouble();
		System.out.println("Enter the Mu Value");
		double mu=s.nextDouble();
		double reynolds=(d*v*rho)/mu;
		if(reynolds<=2000)
		{
			System.out.println("Laminar Flow");
		}else if(reynolds>2000&&reynolds<=4000)
		{
			System.out.println("Transient Flow");
		}
		else if(reynolds>4000)
		{
			System.out.println("Turbulent Flow");
		}
		

	}

}
