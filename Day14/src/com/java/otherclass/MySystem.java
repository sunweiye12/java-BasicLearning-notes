package com.java.otherclass;

public class MySystem {

	/**
* A:System��ĸ���
	* System �����һЩ���õ����ֶκͷ����������ܱ�ʵ������ 
* B:��Ա����
	* public static void gc()
	* public static void exit(int status)
	* public static long currentTimeMillis()   //������������ʱ��
	* pubiic static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
	 */
	public static void main(String[] args) {
		//ϵͳ����������();
		//�˳�java�����();
		//��ȡ��ǰʱ��ĺ���ֵ_�����������ʱ��();
		
		/* pubiic static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
		
		src - Դ���顣                                                   (�����Ƶ�����)
		srcPos - Դ�����е���ʼλ�á�
		dest - Ŀ�����顣                                            (���Ƶ�������)
		destPos - Ŀ�������е���ʼλ�á�
		length - Ҫ���Ƶ�����Ԫ�ص�������
		*/
		
	}



	private static void ��ȡ��ǰʱ��ĺ���ֵ_�����������ʱ��() {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			System.out.print("����");
		}
		long end = System.currentTimeMillis();
		System.out.println("-----------------");
		System.out.println(end - start);   //��ȡ������������ʱ��(���뵥λ)
	}



	private static void �˳�java�����() {
		System.exit(0);                     //�˳�java�����,,ִ�к󽫲���ִ�к���ĳ���
		System.out.println("111111111111111");
	}

	
	
	private static void ϵͳ����������() {
		for(int i = 0;i < 2; i++) {
			new XinDeduixiang();
			System.gc();      //����ϵͳ������������,�൱�ں������ఢ��
		}
	}
}

class XinDeduixiang {

	@Override
	public void finalize() throws Throwable {    //����object����һ�����������������ķ��� ,����ֻ���������߹����ʱ�����Ż��Զ�����
		System.out.println("������������");
	}
	
	
}