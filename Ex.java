package com.condition.WebExcercises;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int w=n-1;
		for(int i=0;i<n;i++)
		{
			int p=i;
			p=p+w;
			
			for(int j=0;j<n;j++)
			{
				if(j==i||p==j)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			w=w-2;
			
			System.out.println();
		}

	}

}
