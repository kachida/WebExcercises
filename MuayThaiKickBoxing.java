package com.condition.WebExcercises;

import java.util.Scanner;

public class MuayThaiKickBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int weight=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the weight");
		weight=s.nextInt();
		if(isBetween(weight,1,112))
		{
			System.out.println("flyweight");
			
		}else if(isBetween(weight,112,115))
		{
			System.out.println("super flyweight");
		}else if(isBetween(weight,115,118))
		{
			System.out.println("bantam weight");
			
		}else if(isBetween(weight,118,122))
		{
			System.out.println("Super bantam weight");
		}else if(isBetween(weight,122,126))
		{System.out.println("Feather weight");
			
		}else if(isBetween(weight,126,130))
		{
			System.out.println("super feather weight");
		}else if(isBetween(weight,130,135))
		{
			System.out.println("light weight");
		}else if(isBetween(weight,135,140))
		{
			System.out.println("super light weight");
			
		}else if(isBetween(weight,140,147))
		{
			System.out.println("welter weight");
			
		}else if(isBetween(weight,147,154))
		{
			System.out.println("super welter weights");
		}
		else if(isBetween(weight,154,160))
		{
			System.out.println("middleweight");
		}
		else if(isBetween(weight,160,167))
		{
			System.out.println("super middleweight");
			
		}else if(isBetween(weight,167,175))
		{
			System.out.println("light heavy weight");
		}else if(isBetween(weight,175,183))
		{
			System.out.println("super light heavy weight");
		}
		else if(isBetween(weight,183,190))
		{
			System.out.println("cruiser weight");
		}
		else if(isBetween(weight,190,220))
		{
			System.out.println("heavy weight");
			
		}
		else if(isBetween(weight,220,1000))
		{
			System.out.println("super heavy weight");
		}

	}
	
	public static boolean isBetween(int num,int x,int y)
	{
		return num>=x&&num<=y;
	}

}
