package com.java.File;

import java.io.File;
import java.io.IOException;

public class My2File���� {

	/**
��������
    * public boolean createNewFile():�����ļ� ��������������ļ����Ͳ�������
	* public boolean mkdir():�����ļ��� ��������������ļ��У��Ͳ�������
	* public boolean mkdirs():�����ļ���,������ļ��в����ڣ�����㴴������
��������ɾ������
	* public boolean renameTo(File dest):���ļ�������Ϊָ�����ļ�·��
	* public boolean delete():ɾ���ļ������ļ��� (�ļ��ڲ������԰�������)
�жϹ���
	* public boolean isDirectory():�ж��Ƿ���Ŀ¼(Ŀ¼�����ļ���)
	* public boolean isFile():�ж��Ƿ����ļ�
	* public boolean exists():�ж��Ƿ����
	* public boolean canRead():�ж��Ƿ�ɶ�
	* public boolean canWrite():�ж��Ƿ��д
	* public boolean isHidden():�ж��Ƿ�����
��ȡ����
	* public String getAbsolutePath()����ȡ����·��
	* public String getPath():��ȡ���췽���е�·��
	* public String getName():��ȡ�ļ����ļ��е�����
	* public long length():��ȡ�ļ����ݵĳ��ȡ��ֽ���
	* public long lastModified():��ȡ���һ�ε��޸�ʱ�䣬����ֵ
	* public String[] list():��ȡָ��Ŀ¼�µ������ļ������ļ��е���������
	* public File[] listFiles():��ȡָ��Ŀ¼�µ������ļ������ļ��е�File���� 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		����();
		
		File file1 = new File("xxx.txt");
		File file2 = new File("zzz.txt");
		System.out.println(file1.renameTo(file2));   //�޸��ļ���
		
//		File file3 = new File("zzz.txt");
//		File file4 = new File("D\\z.txt");
//		System.out.println(file2.renameTo(file4));   //���в��޸��ļ���

	}

	private static void ����() throws IOException {
		// �����ļ�		
		File file = new File("yyy.txt");
//		file.createNewFile();                       //����һ��file(ǰ���Ѿ������)���ļ�!������Դ�������true
		System.out.println(file.createNewFile());
		
		File dir1 = new File("aaa");
		System.out.println(dir1.mkdir());     //����һ��dir1(ǰ���Ѿ������)���ļ���!������Դ�������true
		
		File dir2 = new File("ccc\\ddd");
		System.out.println(dir2.mkdirs());   //����һ���༶���ļ���!������Դ�������true
	}

}
