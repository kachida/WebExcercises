package com.condition.WebExcercises;

public class MakingChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=76;
		int quarter=0,dime=0,nickel=0,penny=0;
		 
		while(n>0)
		{
			if(n>=25)
			{
				quarter++;
				n=n-25;
			}
			else if(n>=10&&n<25)
			{
				dime++;
				n=n-10;
				
			}
			else if(n>=5&&n<9)
			{
				nickel++;
				n=n-5;
			}else if(n>=1&&n<5)
			{
				penny++;
				n=n-1;
			}
			
		}
		if(quarter!=0)
		{
		System.out.println(quarter+"  Quarters ");
		}
		if(dime!=0)
		{
		System.out.println(dime+" Dime");
		}
		if(nickel!=0)
		{
		System.out.println(nickel+" Nickel");
		}
		if(penny!=0)
		{
		System.out.println(penny+" Pennies");
		}

	}

}
