package com.java.其它流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

public class My8Properties集合 {

	/**
	 * @param args
	 * Properties是hashtable的子类双列集合
	 *                * Properties 类表示了一个持久的属性集。
	 *                  Properties 可保存在流中或从流中加载。
	 *                  属性列表中每个键及其对应值都是一个字符串
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
//		方法1();
		Properties pr = new Properties();
		pr.load(new FileInputStream("config.properties"));  //从配置文件中导入数据
		
		System.out.println(pr);
		
		pr.setProperty("tel", "15226715663");   //在内存中修改配置文件
		pr.store(new FileOutputStream("config.properties"), "修改配置");   //将修改后的内容写入配置文件中  第二个是对这次修改的描述
		
		System.out.println(pr);
		
		
	}

	private static void 方法1() {
		// TODO Auto-generated method stub
		Properties pr = new Properties();
//		pr.put("abc", 123);
//		pr.put("k", 2);
		pr.setProperty("姓名", "张三");
		pr.setProperty("tel", "123456789098");
		
	//	System.out.println(pr);     //大印双列集合
		//通过集合Enumeration进行遍历
		Enumeration<String> en = (Enumeration<String>) pr.propertyNames();  //强制转换
		while(en.hasMoreElements()) {
			String key = en.nextElement();  //将键值赋给key 
			String value = pr.getProperty(key); //通过键值获得值
			System.out.println(key + "=" + value);
		}
	}

}
