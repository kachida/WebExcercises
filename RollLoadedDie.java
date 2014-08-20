package com.condition.WebExcercises;

public class RollLoadedDie {
//an integer between 1 and 5 with probability 1/4 and the integer 6 with probability 3/4
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num= Math.random();
		if(num<=0.12)
		{
			int n=(int) (Math.random()*(6-0)+1);
			System.out.println(n);
		}
		{
			System.out.println("6");
		}
		
		

	}

}
