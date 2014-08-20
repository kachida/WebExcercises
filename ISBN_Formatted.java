package com.condition.WebExcercises;

public class ISBN_Formatted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="020131452";
		long n=Long.parseLong(s);
		
		long newn=n;
	
		long temp=0;
		int checksum=0;
		
		int sum=0;
		int z=2;
		while(n!=0)
		{
			sum=(int) (sum+((n%10)*z));
			n=n/10;
			z++;
		}
		
		
		for(int i=0;i<=11;i++)
		{
			if(((sum+i)%11)==0)
			{
				checksum=i;
				break;
			}
		}
		
		s=s+""+checksum;
		System.out.println("new isbn is "+s);
		s=s.charAt(0)+"-"+s.substring(1,4)+"-"+s.substring(4,s.length()-1)+"-"+s.substring(s.length()-1);
		System.out.println("Formatted Isbn is "+s);
		

	}

}
