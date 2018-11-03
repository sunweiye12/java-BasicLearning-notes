package com.java.bean;

import java.util.Comparator;

public class Person implements Comparable<Person> {
	
	private String name;
	private int age;
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
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
		this.age = age;
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
//	public boolean equals(Object obj) {              //��дequal���� ʹ����Ϊͳͬ���� ͬ����Ϊͬһ����
//		System.out.println("ִ������?");
//		Person per = (Person)obj;
//		return this.name.equals(per.name) && this.age == per.age;
//	}
//
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return name.hashCode() * 38 + age;       //ÿ���´�������ʱ �������һ��hashcodeֵ  (Ϊ���������ظ�Ҳ��û˭��) 
//	}						//�����˼���� ��ͬ����ȥ��ͬ����λ ,�����ظ��ĸ���,�ͼ����˵���(��Ч)equals�����Ĵ���
	

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	
	public int compareTo(Person o) {
		// TODO Auto-generated method stub                     //����������������,�������������ͬ�Ļ��Ƚ�һ�������Ƿ���ͬ
		int length = this.name.length() - o.name.length();
		int num = length == 0? this.name.compareTo(o.name):length; //�������������ͬ�ͷ������ֵıȽ�ֵ,�����ֱͬ�ӷ����������Ȳ�ֵ
		return num ==0 ? this.age - o.age: num;                  //���Ƚ������Ƿ����
	}
//----------------------------------------------------------------------------------------
	/*public int compareTo(Person o) {
		// TODO Auto-generated method stub                //������������
		int num = this.name.compareTo(o.name);
		return num ==0 ? this.age - o.age:num;         //�����ǱȽϵ���Ҫ����,,�����Ǵ�Ҫ����
	}*/
//----------------------------------------------------------------------------------------
	/*compare to�� ��������Ϊ0��ʱ��,���ϴ洢1 ��Ԫ��
	  Ϊ������ʱ�򼯺ϰ����˳��洢,Ϊ������ʱ�򼯺ϰ����˳��ķ�˳��洢.*/
	/*public int compareTo(Person o) {
		// TODO Auto-generated method stub
		//return  this.age - o.age;                           //������������                 
		//	return  -1;            
		int num = this.age - o.age;                          //�����ǱȽϵ���Ҫ����
		return num ==0 ? this.name.compareTo(o.name):num;    //�����ǱȽϵ���Ҫ����,,�����Ǵ�Ҫ����		
	}*/
//----------------------------------------------------------------------------------------


}
