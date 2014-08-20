package com.condition.WebExcercises;

public class Standard_Deviation_Normal_D {

	public static void main(String args[])
	{
		double n[]=new double[5];
		for(int i=0;i<n.length;i++)
		{
			n[i]=Math.random();
		}
		for(int i=0;i<n.length;i++)
		{
			//System.out.println(n[i]);
		}
		double min=Integer.MAX_VALUE;
		double max=Integer.MIN_VALUE;
		for(int i=0;i<n.length;i++)
		{
			if(n[i]<min)
			{
				min=n[i];
			}
			if(n[i]>max)
			{
				max=n[i];
			}
		}

double sum=0;
for(int i=0;i<n.length;i++)
{
	sum=sum+n[i];
}
double avg=sum/n.length;
System.out.println("avg"+avg);

double y[]=new double[n.length];
for(int i=0;i<n.length;i++)
{
	y[i]=Math.pow(avg-n[i],2);
}
double s=0;
for(int i=0;i<y.length;i++)
{
	s=s+y[i];
}
System.out.println(s);
double av=s/y.length;
System.out.println(Math.sqrt(av));
	}

}
