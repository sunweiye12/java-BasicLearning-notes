package com.java.���߳�;

public class My1������� {

	/**
	 * @param args
	 *  �������ģʽ����֤�����ڴ���ֻ��һ������
	 */
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1 == s2);

	}

}

//����ʽ                                   ֻ�ܴ���һ������
class Singleton {
			//1,˽�й��캯��
	private Singleton(){}
			//2,�����������
	private static Singleton s = new Singleton();   //���󴴽�����,�������淽����ʱ�����ٴ���
			//3,�����ṩ�����ķ��ʷ���
	public static Singleton getInstance() {
		return s;
	}
			
	public static void print() {
		System.out.println("11111111111");
	}
}

//����ʽ,�������ӳټ���ģʽ   ����
class Singletonh {
	     	//1,˽�й��캯��
	private Singletonh(){}
			//2,����һ�����������
	private static Singletonh s;
			//3,�����ṩ�����ķ��ʷ���
	public static Singletonh getInstance() {   //����ÿ�ε��õ�ʱ�����ڴ�������
		if(s == null)
			//�߳�1,�߳�2
			s = new Singletonh();
		return s;
	}
	
	public static void print() {
		System.out.println("11111111111");
	}
}

class Singletonhh {
	private Singletonhh() {}

	public static final Singletonhh s = new Singletonhh();  //final�����յ���˼,��final���εı��������Ա�����
}