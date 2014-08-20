package com.condition.WebExcercises;
//Thue Morse Code Program

public class Thue_Morse_Sequence {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="0";
		int n=4;
		Thue_Morse_Sequence tm=new Thue_Morse_Sequence();
		
		System.out.println(s);
		for(int i=1;i<=n;i++)
		{
			s=s+tm.flip(s);
			System.out.println(s);
			
		}

	}
	
	public String flip(String s)
	{
		String str="";
		for(int i=0;i<s.length();i++)
		{
			
			if(s.charAt(i)=='1')
			{
				str=str+"0";
			}else if(s.charAt(i)=='0')
			{
				str=str+"1";
			}
		}
		return str;
	}

}
