package com.java.text;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

import com.java.bean.Student;

public class 录入考试信息并排名 {

	/**
	* 需求：键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低输出到控制台。
			
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入5个学生成绩格式是:(姓名,语文成绩,数学成绩,英语成绩)");
		TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				int num = s2.getSum() - s1.getSum();			//根据学生的总成绩降序排列
				return num == 0 ? 1 : num;
			}
		});
		
		while(ts.size() < 5) {        //允许录入五个学生信息
			String line = sc.nextLine();
			try {
				String[] arr = line.split(",");              //利用,(逗号)截取字符串
				int chinese = Integer.parseInt(arr[1]);				//转换语文成绩
				int math = Integer.parseInt(arr[2]);				//转换数学成绩
				int english = Integer.parseInt(arr[3]);				//转换英语成绩
				ts.add(new Student(arr[0], chinese, math, english));
			} catch (Exception e) {
				System.out.println("录入格式有误,输入5个学生成绩格式必须是:(姓名,语文成绩,数学成绩,英语成绩");
			}
			
		}
		
		System.out.println("排序后的学生成绩是:");
		for (Student s : ts) {
			System.out.println(s);
		}

	}

}
