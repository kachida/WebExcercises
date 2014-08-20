package com.condition.WebExcercises;

public class Triangle_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int spaces=0;
		
		
		for(int i=1;i<=n;i++)
		{
			for(int k=0;k<spaces;k++)
			{
				System.out.print("."+" ");
			}
			for(int j=i;j<=n;j++)
			{
				
			System.out.print("*"+" ");
			spaces=i;
			}
			
			System.out.println();
		}
		
		

	}

}
