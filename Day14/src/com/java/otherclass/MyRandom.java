package com.java.otherclass;

import java.util.Random;

public class MyRandom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random r = new Random();   //							每次运行结果改变
		int x = r.nextInt();       //生成一个随机的int数                      
		System.out.println(x);
		
		System.out.println("------------------------");
		Random r2 = new Random(111111);   //	(加个种子)		每次运行结果不变
		int y = r2.nextInt();             //生成一个随机的int数                 
		System.out.println(y);            //随机生成n一个固定的随机数 
		
		System.out.println("------------------------");
		Random r3 = new Random();   
		int z = r3.nextInt(10);     //随机获得一个 0到9 的整数  ***************
		System.out.println(z);    
		
		//********加种子使每次的输出固定    在NextInt后加数字限定随机数的取值范围
	}

}
