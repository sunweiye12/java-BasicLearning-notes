package com.java.text;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class 试用计时器 {

	/**
	 * @param args
	 * @throws IOException 
	 * 可以试用10次
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("num.txt"));
		
		String line = br.readLine();
		int times = Integer.parseInt(line);
		
		if(times >0) {
			System.out.println("您的使用次数还有" + times-- + "次");
			FileWriter fw = new FileWriter("num.txt");
			fw.write(times + "");
			fw.close();
			
		} else {
			System.out.println("您的试用次数已到,请购买正版");
		}
		br.close();
	}

}
