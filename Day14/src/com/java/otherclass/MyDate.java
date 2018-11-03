package com.java.otherclass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class MyDate {

	/**
* A:Date��ĸ���
	* �� Date ��ʾ�ض���˲�䣬��ȷ�����롣 
* B:���췽��
	* public Date()
	* public Date(long date)
* C:��Ա����
	* public long getTime()    ������ 1970 �� 1 �� 1 �� 00:00:00 GMT ������ Date �����ʾ�ĺ�������
	* public void setTime(long time)    ���ô� Date �����Ա�ʾ 1970 �� 1 �� 1 �� 00:00:00 GMT �Ժ� time �����ʱ��㡣
----------------------------------------------------------------------------------------------------------------------
 A:DateFormat��ĸ���
	* DateFormat ������/ʱ���ʽ������ĳ����࣬�����������޹صķ�ʽ��ʽ�����������ڻ�ʱ�䡣�ǳ����࣬����ʹ��������SimpleDateFormat
* B:SimpleDateFormat���췽��
	* public SimpleDateFormat()
	* public SimpleDateFormat(String pattern)
* C:��Ա����
	* public final String format(Date date)
	* public Date parse(String source)	
	* 
----------------------------------------------------------------------------------------------------------------------
###14.19_��������(Calendar��ĸ����ͻ�ȡ���ڵķ���)(����)
* A:Calendar��ĸ���
	* Calendar ����һ�������࣬��Ϊ�ض�˲����һ������ YEAR��MONTH��DAY_OF_MONTH��HOUR �������ֶ�֮���ת���ṩ��һЩ��������Ϊ���������ֶΣ������������ڵ����ڣ��ṩ��һЩ������
* B:��Ա����
	* public static Calendar getInstance()
	* public int get(int field)
* A:��Ա����
	* public void add(int field,int amount)
	* public final void set(int year,int month,int date)
*/
	public static void main(String[] args) {
		//����();
		//���ӻ�����();
		Calendar c = Calendar.getInstance();  //��ȡ��ǰ����
		
		System.out.println(c.get(Calendar.YEAR));  //�����ǰ��������  ���string����
		System.out.println(c.get(Calendar.MONTH));  //�����ǰ��������  ���Ǵ�0��ʼ��ŵ�
		System.out.println(c.get(Calendar.DAY_OF_MONTH));  //�����ǰ��������(����)
		System.out.println(c.get(Calendar.DAY_OF_WEEK));  //�����ǰ�������� (����)ÿ���������һ��
		
		//c.set(year, month, date)  �޸�������
		
	}

	private static void ���ӻ�����() {
		Date d1 = new Date();                          //������ǰʱ��
		
		SimpleDateFormat sd = new SimpleDateFormat();  //����ʱ���ʽ
		System.out.println(sd.format(d1));            //���ʱ��     18-1-26 ����8:40
		
		SimpleDateFormat sd1 = new SimpleDateFormat("yyyy��MM��dd��     HH:mm:ss");  //�����Լ���ʱ���ʽ
		System.out.println(sd1.format(d1));            //���ʱ��     18-1-26 ����8:40
	}

	private static void ����() {
		Date d1 = new Date();                	//������ʱ��ע�� ���������¶���Date��(��ȡʱ��)
		System.out.println(d1);             	//���ʱ��    Fri Jan 26 20:13:40 CST 2018
		
		Date d2 = new Date(0);                	//������Ϊ0
		System.out.println(d2); 				//1970��1��1��unix ��c���Ե�����
	}

}
