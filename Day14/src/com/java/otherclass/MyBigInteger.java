package com.java.otherclass;

import java.math.BigDecimal;
import java.math.BigInteger;

public class MyBigInteger {

	/**
 A:BigInteger的概述
	* 可以让超过Integer范围内的数据进行运算
* B:构造方法
	* public BigInteger(String val)
* C:成员方法
	* public BigInteger add(BigInteger val)
	* public BigInteger subtract(BigInteger val)
	* public BigInteger multiply(BigInteger val)
	* public BigInteger divide(BigInteger val)
	* public BigInteger[] divideAndRemainder(BigInteger val)
-------------------------------------------------------------------
 A:BigDecimal的概述
	* 由于在运算的时候，float类型和double很容易丢失精度，演示案例。
	* 所以，为了能精确的表示、计算浮点数，Java提供了BigDecimal

	* 不可变的、任意精度的有符号十进制数。
* B:构造方法
	* public BigDecimal(String val)
* C:成员方法
	* public BigDecimal add(BigDecimal augend)
	* public BigDecimal subtract(BigDecimal subtrahend)
	* public BigDecimal multiply(BigDecimal multiplicand)
	* public BigDecimal divide(BigDecimal divisor)
	 */
	
	
	public static void main(String[] args) {
		BigDecimal d1 = new BigDecimal("12.5");
		BigDecimal d2 = new BigDecimal("2.2");      //里面放字符串    ------> 最精确  放其它都不好
		
		BigInteger b1 = new BigInteger("100");
		BigInteger b2 = new BigInteger("200");
		
		
		System.out.println(d1.add(d2));
		
		System.out.println(b1.add(b2));
		System.out.println(b1.subtract(b2));
		System.out.println(b1.multiply(b2));
		System.out.println(b1.divide(b2));
		System.out.println(b1.divideAndRemainder(b2));
	
		

	}

}
