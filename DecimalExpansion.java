package com.condition.WebExcercises;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class DecimalExpansion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BigDecimal b1=new BigDecimal("8639");
BigDecimal b2=new BigDecimal("70000");
MathContext context=new MathContext(21,RoundingMode.DOWN);
BigDecimal result=b1.divide(b2,context);
System.out.println(result.toString());




	}

}
