package com.java.�쳣;

public class My4�׳��쳣 {

	/**
	 * �ڹ��ܷ����ڲ�����ĳ������������ܼ������У���Ҫ������תʱ������throw���쳣�����׳���
	 * throw new RuntimeException("����Ƿ�");                   //�׳�����ʱ�쳣(ִ�е���ʱ����ִ��)
	 * 
	 * throws��throw������
	* a:throws
		* ���ڷ����������棬�������쳣����
		* ���Ը�����쳣�������ö��Ÿ���
		* ��ʾ�׳��쳣���ɸ÷����ĵ�����������
	* b:throw
		* ���ڷ������ڣ��������쳣������
		* ֻ���׳�һ���쳣������
		* ��ʾ�׳��쳣���ɷ������ڵ���䴦��
	 */
	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(-17);                                            //�ڵ����Ÿ�����ʱ���׳��쳣
		System.out.println(p.getAge());

	}

}

class Person {
	private String name;
	private int age;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age > 0 && age <= 100) {
			this.age = age;
		} else {
			//�ڴ˴��׳��쳣ʱ,���׳����쳣ֱ�Ӷ���ΪExceptionʱӦ���ڷ����͵��ô˷���ʱ��ע��(throws Exception)
			//�����׳�RuntimeExceptionʱ�����ڷ����б��,��˶���RuntimeException////
			throw new RuntimeException("����Ƿ�");                   //�׳�����ʱ�쳣(ִ�е���ʱ����ִ��) �������Ҫ�������
			
	//		throw new ���䳬���쳣("����Ƿ�");						  //�ⶨ����Ҫ�������
		}
	}
}