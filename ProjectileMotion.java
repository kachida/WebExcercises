package com.condition.WebExcercises;

public class ProjectileMotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double r=0;
		// velocity is in unit m/s
		long v=1250;
		double g=9.81;
		double thetha=Math.toRadians(45);
		r=((v*v)*Math.sin(2*thetha))/g;
		System.out.println(r/1000);
		
		

	}

}
