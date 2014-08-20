package com.condition.WebExcercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Gymnastics_Judging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 6 Numbers ");
		int temp=0;
		ArrayList<Integer> al=new ArrayList<Integer>();
	   for(int i=0;i<6;i++)
	   {
		   temp=s.nextInt();
		   al.add(temp);
		   
	   }
	   // sorting the collections
	   
	   Collections.sort(al);
	  // removing first and last item from collections
	   al.remove(0);
	   al.remove(al.size()-1);
	   double avg=0;
	   int sum=0;
	   for(int i:al)
	   {
		   System.out.print(i+"  ");
		   sum=sum+i;
	   }
	   avg=sum/(al.size()-2);
	   System.out.println("average value by gymnastics judges by removing min and max values "+avg);
	   
	   //Collections in reverse order or descending order
	   Collections.reverse(al);
	   for(int i:al)
	   {
		   System.out.print(i+"  ");
	   }
	   
	   
	   

	}

}
