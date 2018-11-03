package com.java.其它流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import com.java.bean.Person;

public class My3对象操作流 {

	/**
	 * @param args
	 *  该流可以将一个对象写出, 或者读取一个对象到程序中. 也就是执行了序列化和反序列化的操作.
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		//将对象数据存储();
		//将对象数据提取出来();
		Person p1 = new Person("张三", 23);    //如果想叫此对象可以序列化 此对象就必须 实现Serializable接口
		Person p2 = new Person("李四", 24);
		Person p3 = new Person("王五", 25);
		Person p4 = new Person("赵六", 26);
		
		ArrayList<Person> arr = new ArrayList<>();   //将每个对象县都存到集合里,然后键将这个集合存好,最后提取的时候也拿集合接受就行了
		arr.add(p1);
		arr.add(p2);
		arr.add(p3);
		arr.add(p4);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e.txt"));
		oos.writeObject(arr);
		oos.close();
		//------------------------------------------------------------------------------
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e.txt"));  //从e.txt文件中将对象读取出来
		ArrayList<Person> arr1 = new ArrayList<>();
		arr1 = (ArrayList<Person>) ois.readObject();
		ois.close();
		for (Person person : arr1) {
			System.out.println(person);
		}
	}

	
	
	private static void 将对象数据提取出来() throws IOException, FileNotFoundException,
			ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e.txt"));  //从e.txt文件中将对象读取出来
		Person p1 = (Person) ois.readObject();                              //此处涉及到强制转换
		Person p2 = (Person) ois.readObject();
		
		ois.close();														//关流
		System.out.println(p1);
		System.out.println(p2);
	}

	private static void 将对象数据存储() throws IOException, FileNotFoundException {
		Person p1 = new Person("张三", 23);    //如果想叫此对象可以序列化 此对象就必须 实现Serializable接口
		Person p2 = new Person("李四", 24);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e.txt"));  //将对象存储到e.txt文件中 //但存储的是乱码.因为没有必要能看懂,只要可以顺利读出来就行
		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.close();
	}

}
