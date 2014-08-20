package com.condition.WebExcercises;

import java.util.Scanner;

public class NPerLineAdvanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the N value ");
		int n=s.nextInt();
		int temp=n;
		
		for(int i=1;i<=999;i++)
		{
			n=temp;
			while(n>0)
			{
				if(i>=1&&i<=9)
				{
				System.out.print(i+"   ");
								n--;
								i++;
				}
				else if(i>=10&&i<=99)
				{
					System.out.print(i+"  ");
					n--;
					i++;
				}
				else if(i>=100&&i<=999)
				{
					System.out.print(i+" ");
					n--;
					i++;
				}
				if(n==0&&i==999)
				{System.out.println();
					System.out.println(99);
					break;
				}
			}
			System.out.println();

	}
		
		

}
}
