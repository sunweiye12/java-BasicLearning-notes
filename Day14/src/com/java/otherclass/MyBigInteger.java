package com.java.otherclass;

import java.math.BigDecimal;
import java.math.BigInteger;

public class MyBigInteger {

	/**
 A:BigInteger�ĸ���
	* �����ó���Integer��Χ�ڵ����ݽ�������
* B:���췽��
	* public BigInteger(String val)
* C:��Ա����
	* public BigInteger add(BigInteger val)
	* public BigInteger subtract(BigInteger val)
	* public BigInteger multiply(BigInteger val)
	* public BigInteger divide(BigInteger val)
	* public BigInteger[] divideAndRemainder(BigInteger val)
-------------------------------------------------------------------
 A:BigDecimal�ĸ���
	* �����������ʱ��float���ͺ�double�����׶�ʧ���ȣ���ʾ������
	* ���ԣ�Ϊ���ܾ�ȷ�ı�ʾ�����㸡������Java�ṩ��BigDecimal

	* ���ɱ�ġ����⾫�ȵ��з���ʮ��������
* B:���췽��
	* public BigDecimal(String val)
* C:��Ա����
	* public BigDecimal add(BigDecimal augend)
	* public BigDecimal subtract(BigDecimal subtrahend)
	* public BigDecimal multiply(BigDecimal multiplicand)
	* public BigDecimal divide(BigDecimal divisor)
	 */
	
	
	public static void main(String[] args) {
		BigDecimal d1 = new BigDecimal("12.5");
		BigDecimal d2 = new BigDecimal("2.2");      //������ַ���    ------> �ȷ  ������������
		
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
