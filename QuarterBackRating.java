package com.condition.WebExcercises;

public class QuarterBackRating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x=0;
		double w=0;
		double y=0;
		double z=0;
		double a=324;
		double b=461,c=3969,d=35,e=10;
		
		w=Math.ceil(250/3 * ((a / b) - 0.3));
		x = Math.ceil(25/6 * ((c / b) - 3));
		y = 1000/3 * (d / b);
		z = 1250/3 * (0.095 - (e / b));
	String s1=String.format("%.2f", w);
	String s2=	String.format("%.2f", x);
	String s3=	String.format("%.2f", y);
	String s4=	String.format("%.2f", z);
	
	w=Double.parseDouble(s1);
	x=Double.parseDouble(s2);
	
	y=Double.parseDouble(s3);
	z=Double.parseDouble(s4);
		System.out.println("w is "+w);
		System.out.println("x is "+x);
		System.out.println("y is "+y);
		System.out.println("z is "+z);
		System.out.println(x+y+w+z);

	}

}
