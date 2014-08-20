package com.condition.WebExcercises;

import java.util.Set;
import java.util.TreeSet;

public class DistinctValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]=new int[3];
		nums[0]=4;
		nums[1]=6;
		nums[2]=7;
		
		
		Set<Integer> s=new TreeSet<Integer>();
		s.add(1);
		s.add(1);
		s.add(1);
		int count=s.size();
		System.out.println("Distinct values are "+count);
		

	}

}
