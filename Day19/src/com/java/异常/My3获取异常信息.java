package com.java.�쳣;

/*
 * * A:Throwable�ļ�����������
	* a:getMessage()
		* ��ȡ�쳣��Ϣ�������ַ�����
	* b:toString()
		* ��ȡ�쳣�������쳣��Ϣ�������ַ�����
	* c:printStackTrace()
		* ��ȡ�쳣�������쳣��Ϣ���Լ��쳣�����ڳ����е�λ�á�����ֵvoid��
		* 
	finally��ʵ��

 */
public class My3��ȡ�쳣��Ϣ {
	public static void main(String[] args) {
		
//		try {
//			System.out.println(1/0);
//		} catch (Exception e) {				//�൱��Exception e = new ArithmeticException: /(" by zero")();
//			System.out.println("������");
////			System.out.println(e.getMessage());        //��ȡ�쳣�Ǹ���Ϣ
////			System.out.println(e.toString());          //��ȡ�쳣�Ǹ���Ϣ���� �� �쳣��Ϣ
//			e.printStackTrace();						//��ȡ�쳣�Ǹ���Ϣ���� �� �쳣��Ϣ �Լ��ڴ����е�λ�� û�з���ֵ
//		}                                                //JVMĬ�ϴ���ʽ
		
		
		try {
			System.out.println(1/0);
		} catch (Exception e) {
			System.out.println("������");
		} finally {
			System.out.println(10/2);           //��������Ϣ�ĳɴ˴�ִ�е����(���ܶԴ� ����ִ��)
		}
	}

}
