package com.condition.WebExcercises;

public class CarLoan_Zero_Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double P=300000;
		double R=14;
		double Y=5;
		double n=0;
		double r=0;
		if(R!=0)
		{
		n=Y*12;
		r=R/(12*100);
		double payment=(P*r)/(1-(Math.pow(1+r, (-1*n))));
		System.out.println("Monthly payment is :: "+payment);
		System.out.println("Total Amount paid is "+(payment*n));
		System.out.println("total Interest is "+((payment*n)-P));
		System.out.println("Per month Iterest is ::"+(((payment*n)-P)/n));
		System.out.println("Per month main amount paid is "+(payment-(((payment*n)-P)/n)));
		}
		else
		{
		System.out.println("Rate of Interest is Zero ");	
		}
		

	}

}
