package com.condition.WebExcercises;

import java.util.Scanner;

public class Hurricane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Wind Speed ");
		int n=s.nextInt();
		
		if(n>=74&&n<=95)
			
		{System.out.println("It is an Hurricane");
			System.out.println("Category 1");
		}
		else if(n>=96&&n<=110)
		{System.out.println("It is an Hurricane");
			System.out.println("Category 2");
		}
		else if(n>=111&&n<=130)
		{System.out.println("It is an Hurricane");
			System.out.println("Category 3");
		}else if(n>=133&&n<=155)
		{System.out.println("It is an Hurricane");
			System.out.println("category 4");
		}else if(n>=155)
		{System.out.println("It is an Hurricane");
			System.out.println("category 5");
		}
		

	}

}
