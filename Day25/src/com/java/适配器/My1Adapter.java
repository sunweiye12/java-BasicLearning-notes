package com.java.������;

public class My1Adapter {

	/**
	 * @param args
	 * �˴�����Ǿ���һ��������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface ���� {                //����һ���ӿ�,�ӿ��������ɷ���
	
	public void ����();
	public void �();
	public void ײ��();
	public void ϰ��();
	
}

 abstract class ����� implements ����{  //����һ����ȥʵ������Ľӿ�,��д����ķ���,
	 									//��������Ϊ������,Ϊ�˲��ñ���ȥ�����Ķ���,��Ϊ�������ǿյ�,����û����
	@Override							//�����������Ϊ���нӿڵ�������,��������ͨ���̳д�����ʵ�������ĳ��������
										//������ʡ�ļ̳�"����"�ӿ�ʱҪ��дȫ������
	public void ����() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void �() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ײ��() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ϰ��() {
		// TODO Auto-generated method stub
		
	}
	
}

 class ³���� extends ����� {
	 @Override
	public void ϰ��() {
		// TODO Auto-generated method stub
		System.out.println("���δ�����");
	}
 }
 