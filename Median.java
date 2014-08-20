package com.condition.WebExcercises;

import java.util.ArrayList;
import java.util.Collections;

public class Median {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(40);
		al.add(10);
		al.add(20);
		al.add(50);
		Collections.sort(al);
		System.out.println("list sorted");
		double value=0;
		System.out.println(al.size());
		System.out.println((al.get(al.size()/2)));
		System.out.println(al.get((al.size()/2)-1));
		if(al.size()%2==0)
		{
			value=((al.get(al.size()/2))+al.get((al.size()/2)-1))/2;
			
			
		}else
		{
			value=al.get(al.size()/2);
		}
		System.out.println("value is "+value);

	}

}
