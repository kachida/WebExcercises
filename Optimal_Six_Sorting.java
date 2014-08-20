package com.condition.WebExcercises;

import java.util.Scanner;

public class Optimal_Six_Sorting {

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
		System.out.println("Enter the F");
		int F=s.nextInt();
		int t=0;
		
		if(A>B)
		{
			 t = A; A = B; B = t; 
		}
		if(C>D)
		{
			 t = C; C = D; D = t;
			
		}
		if(E>F)
		{
			t = E; E = F; F = t;
			
		}//next 6
		
		if(A>C)
		{
			t = A; A = C; C = t; 
		}
		
		if(B>D)
		{t = B; B = D; D = t;
		
		}
		
		if(C>E)
		{
			t = C; C = E; E = t;
			
		}
		
		
		if(D>F)
		{
			t = D; D = F; F = t;
			
		}
		if(B>C)
		{t = B; B = C; C = t;
		
		}
		if(D>E)
		{
			t = D; D = E; E = t;
			
		}
		if(A>D)
		{
			 t = A; A = D; D = t;
			
		}
		
		if(A>B)
		{
			t = A; A = B; B = t; 
		}
		
		if(C>D)
		{
			 t = C; C = D; D = t;
			
		}
		
		
		
		
		System.out.println("A B C D E F "+A+" "+B+" "+C+" "+D+" "+E+" "+F);

	}

}
