package com.java.���߳�;

public class My7����߳� {

	/**
	 * @param args
	 * * join(), ��ǰ�߳���ͣ, �ȴ�ָ�����߳�ִ�н�����, ��ǰ�߳��ټ���
	 * join(int), ���Եȴ�ָ���ĺ���֮�����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Thread t1 = new Thread() {                    //�����߳�t1
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(getName() + "....aaaaaa");
				}
			}
		};
		
		Thread t2 = new Thread() {                    //�����߳�t2
			public void run() {
				for (int i = 0; i < 10; i++) {
					if (i == 2) {
						try {
							//t1.join();          //�������ڲ�����ʹ�þֲ�����,��˱��뽫t1����Ϊfinal����
							//�����߳������ڲ�Ӳ���,��t2ִ�����ε�ʱ��t1���,ʹt1ִ�����Ժ���ִ��t2
							t1.join(10); //��������Ǻ���ֵ,Ҳ���ǲ��10�������.  Ȼ���������ִ��t1��t2
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					System.out.println(getName() + "....bb");
				}
			}
		};
		
		t1.start();
		t2.start();
		
	}

}
