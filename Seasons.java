package com.condition.WebExcercises;

public class Seasons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=4;
		int d=23;
		if(m==3&&(d>=21&&d<=31))
		{
			System.out.println("spring");
		}else if((m==4||m==5)&&(d>=1&&d<=31))
		{
			System.out.println("spring");
		}else if(m==6&&(d>=1&&d<=20))
		{
			System.out.println("spring");
		}
		
		if(m==6&&(d>=21&&d<=30))
		{
			System.out.println("summer");
		}else if((m==7||m==8)&&(d>=1&&d<=31))
		{
			System.out.println("summer");
		}else if(m==9&&(d>=1&&d<=22))
		{
			System.out.println("summer");
		}
		
		if(m==9&&(d>=23&&d<=30))
		{
			System.out.println("Fall");
		}else if((m==11||m==10)&&(d>=1&&d<=31))
		{
			System.out.println("Fall");
		}else if(m==12&&(d>=1&&d<=20))
		{
			System.out.println("Fall");
		}
		
		if(m==12&&(d>=21&&d<=31))
		{
			System.out.println("Winter");
		}else if((m==1||m==2)&&(d>=1&&d<=31))
		{
			System.out.println("Winter");
		}else if(m==3&&(d>=1&&d<=20))
		{
			System.out.println("Winter");
		}

	}

}
