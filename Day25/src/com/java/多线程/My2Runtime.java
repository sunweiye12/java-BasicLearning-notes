package com.java.���߳�;

import java.io.IOException;

public class My2Runtime {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Runtime r1 = Runtime.getRuntime();		//��ȡ����ʱ����
		//r1.exec("shutdown -s -t 3000");         //�ػ�����ʱ3000����
		r1.exec("shutdown -a"); 				  //ȡ���ػ��ƻ�
	}

}
