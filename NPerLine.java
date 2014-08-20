package com.condition.WebExcercises;

import java.util.Scanner;

public class NPerLine {
	
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the N value ");
		int n=s.nextInt();
		int temp=n;
		
		for(int i=10;i<99;i++)
		{
			n=temp;
			while(n>0)
			{
				System.out.print(i+" ");
								n--;
								i++;
				if(n==0&&i==99)
				{System.out.println();
					System.out.println(99);
					break;
				}
			}
			System.out.println();
			
		}
	}

}
