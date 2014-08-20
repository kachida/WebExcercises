package com.condition.WebExcercises;

import java.util.Scanner;

public class Optimal_Five_Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the A");
		int A=s.nextInt();
		System.out.println("Enter the B");
		int B=s.nextInt();
		System.out.println("Enter the C");
		int C=s.nextInt();
		System.out.println("Enter the D");
		int D=s.nextInt();
		System.out.println("Enter th E");
		int E=s.nextInt();
		
		
		int t=0;
		
		if(A>B)
		{
			 t = A; A = B; B = t; 
		}if(D>E)
		{
			t = D; D = E; E = t;
			
		}
		if(B>C)
		{
			t = B; B = C; C = t;
			
		}if(C>D)
		{
			 t = C; C = D; D = t;
			
		}
		if(D>E)
		{
			t = D; D = E; E = t;
			
		}
		if(A>B)
		{
			t = A; A = B; B = t; 
		}
		
		if(B>C)
		{t = B; B = C; C = t;
		
		}
		if(C>D)
		{
			 t = C; C = D; D = t;
			
		}
		if(A>B)
		{
			t = A; A = B; B = t; 
		}
		if(B>C)
		{t = B; B = C; C = t;
		
		}
		
		
		System.out.println("A B C D E "+A+" "+B+" "+C+" "+D+" "+E);

	}

}
