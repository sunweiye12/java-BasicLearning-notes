package com.java.�ֽ���;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class My2FileOutputStream {

	/**
	 * д�ļ�
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("yyy.txt",false);  //����֮ǰ������yyy.txt�ļ�.��·���������(�Զ������ļ�)
//		fos.write(97);                                         //������falseʱ ����׷��,������trueʱ Ϊ��ԭ��������׷��
//		fos.write(98);
//		fos.write(99);
		fos.write(103);
		fos.close();                                            //���������ڽ���ʱ��Ҫ�ر�

	}

}
