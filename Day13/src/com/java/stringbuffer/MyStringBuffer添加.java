package com.java.stringbuffer;

public class MyStringBuffer��� {

	/**
	 *  A:StringBuffer����ӹ���
	 	* public StringBuffer append(String str):
	 		* ���԰���������������ӵ��ַ�������������,�������ַ�������������
	 	* public StringBuffer insert(int offset,String str):
	 		* ��ָ��λ�ð��������͵����ݲ��뵽�ַ�������������,�������ַ�������������
	 */
	public static void main(String[] args) {
		//demo1();
		demo2();
	
		

	}

	private static void demo2() {
		StringBuffer sb = new StringBuffer("1234");
		sb.insert(3,"java");  //�ڵ������ַ������(�����ס,���е���Ӷ�����Դ����Ķ�����Ե�,��û�д����µĶ���)
		System.out.println(sb);
	}

	private static void demo1() {
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = sb.append(true);
		StringBuffer sb2 = sb.append("java");
		System.out.println(sb2.toString());
		StringBuffer sb3 = sb.append(100);
		StringBuffer sb4 = sb.append('w');
		//����Ӷ���ʱ���ᴴ���µĶ���,���ǲ��ϵ���ӵ�ԭ������,���õ��Ķ��Ƕ�������Ľ��(4�ĸ�����ָ�����һ������)
		System.out.println(sb.toString());
	}

}
