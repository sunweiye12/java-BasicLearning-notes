package com.java.GUI;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class My1Frame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Frame f = new Frame("第一个窗口的名字");      		//构建一个不可见的窗口,并命名
		
		f.setSize(400, 500);								//设置窗口的大小
		f.setLocation(300, 50);								//设置窗口的位置
		f.setIconImage(Toolkit.getDefaultToolkit().createImage("聊聊.png"));   //添加窗口图标
		
		Button b1 = new Button("按钮1");						//设置按钮并命名
		Button b2 = new Button("按钮2");						//设置按钮并命名
		f.add(b1);											//将按钮添加入窗口中
		f.add(b2);
		f.setLayout(new FlowLayout());             		 	//设置FlowLayout()类型的布局管理器//用来管理窗口布局
		
		f.addWindowListener(new MyWindowAdapter()); 				//添加窗口监视器//需要创建
		//因为WindowListener为接口所以不可以直接创建只能够创建他的子类,但创建子类要重写所有方法比较麻烦,因此用WindowAdapter()的子类
		//这是WindowListener的适配器,利用它创建子类只需写需要改的方法
		
		b1.addMouseListener(new MouseAdapter() {          //在按钮上设置鼠标监听,和以上窗口监听一样,这里采用的是内部类
//			@Override
//			public void mouseClicked(MouseEvent e) {  //鼠标点击
//				// TODO Auto-generated method stub
//				super.mouseClicked(e);
//			}
			@Override
			public void mouseReleased(MouseEvent e) {  //鼠标释放
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});								
		
		b1.addKeyListener(new KeyAdapter() {    			//在按钮上添加键盘适配器
			@Override
			public void keyReleased(KeyEvent e) {
				//System.exit(0);
				System.out.println(e.getKeyCode());  //输出键盘所对应的码值
				if (e.getKeyCode() == 27) {				//当键盘Esc键时执行
					System.exit(0);
				}
			}
		});
		
		b2.addActionListener(new ActionListener() {		//在按钮2上添加动作监听,按鼠标左键  或者 空格键时会执行此命令
			//应用场景暂停视频
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		f.setVisible(true);									//使此窗口可见

	}

}

class MyWindowAdapter extends WindowAdapter{
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
}