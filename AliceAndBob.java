package com.condition.WebExcercises;

public class AliceAndBob {
	public static void main(String args[])
	{
		int alice=0,bob=0;
		int hh=0,th=0;
		int c1=0,c2=0;
		double d=Math.random();
		if(d<0.5)
		{
			if(hh==0)
			{
			hh++;
			c1++;
			}
			if(c1==1)
			{
				hh++;
				alice=1;
				c1++;
			}
		}else
		{
			if(th==0)
			{
			th++;
			c2++;
			}
		}
		
	}

}
