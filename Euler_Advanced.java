package com.condition.WebExcercises;

public class Euler_Advanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a1=0,b1=0,c1=0,d1=0,e1=0;
		long a5=0,b5=0,c5=0,d5=0,e5=0;
		
		int n=150;
			
		for(long e=0;e<=n;e++)
		{e5=e*e*e*e*e;
		for(long a=1;a<=n;a++)
		{
			a5=a*a*a*a*a;
			for(long b=a;b<=n;b++)
			{
				b5=b*b*b*b*b;
				for(long c=b;c<=n;c++)
				{
					c5=c*c*c*c*c;
					for(long d=c;d<=n;d++)
					{
						d5=d*d*d*d*d;
						if(a5+b5+c5+d5>e5)
						{
							break;
						}if(a5+b5+c5+d5==e5)
						{a1=a;
						b1=b;
						c1=c;
						d1=d;
						e1=e;
						break;
					
						}
					}
				}
			}
		}
			
		}
		
		System.out.println("a value is "+a1);
		System.out.println("b value is "+b1);
		System.out.println("c value is "+c1);
		System.out.println("d value is "+d1);
		System.out.println("e value is "+e1);
		

	}

}
