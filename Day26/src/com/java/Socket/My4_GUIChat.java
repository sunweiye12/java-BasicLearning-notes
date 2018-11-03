package com.java.Socket;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.rmi.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class My4_GUIChat extends Frame { 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//让此类直接Frame对象就可以直接使用里面的方法  
	
	private TextField tf;  //一系列的成员变量
	private Button send;
	private Button log;
	private Button clear;
	private Button shake;
	//private Button clearlog;
	private TextArea viewText;
	private TextArea sendText;
	private BufferedWriter bw;
	private DatagramSocket socket;
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		new My4_GUIChat();
	}
	
	public My4_GUIChat() {   		//设计构造方法
		init(); 		//窗口基本设置
		southPanel();  	//南面的panel创建
		centerPanel(); 	//在中间创建panel对象
		event();		//添加事件
	}

	public void event() {
		this.addWindowListener(new WindowAdapter() {  //窗口监视器
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				try {
					socket.close();
				////bw.flush();
					bw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		send.addActionListener(new ActionListener() {  //给send按钮添加动作监听器 当左击是执行
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					send();//调用send方法
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}        
			}
		});
		
		//快捷键
		sendText.addKeyListener(new KeyAdapter() {
			
			public void keyReleased(KeyEvent e) {
//				System.out.println(e.getKeyCode());  	//输出键盘所对应的码值,,测试用
				if (e.getKeyCode() == 10) {				//当键盘Enter键时执行,发送
					try {
						send();							//调用send方法
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}							
				}   
			}
		});
		
//		send.addKeyListener(new  KeyAdapter() {   		//获取键盘监视器
//			public void keyReleased(KeyEvent e) {
//				System.out.println(e.getKeyCode());  	//输出键盘所对应的码值
//				if (e.getKeyCode() == 10) {				//当键盘Enter键时执行
//					try {
//						send();//调用send方法
//					} catch (IOException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					}   
//				}
//			}
//		});
		
		log.addActionListener(new ActionListener() {	//给log按钮添加监听
			public void actionPerformed(ActionEvent e) {
				try {
					logFIle();
				} catch (Exception e1) {
					e1.printStackTrace();
				}		
			}
			
		});
		
		clear.addActionListener(new ActionListener() {  	//给清屏添加动作监听
			
			@Override
			public void actionPerformed(ActionEvent e) {
				viewText.setText("");
				
			}
		});
		
		shake.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {//如果点击震动按钮就给对方发一个-1的字符,对方收到这个字符时就会调用震动方法
				try {
					DatagramPacket packet = 							
							new DatagramPacket(new byte[]{-1}, 1, InetAddress.getByName(tf.getText()), 6677);
					socket.send(packet);
				} catch (UnknownHostException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}  
				
			}

			
		});
		
	}
	
	private void shake() {
		int x = this.getLocation().x;   //获取窗口的x和y坐标
		int y = this.getLocation().y;
		
		for (int i = 0; i < 2; i++) {
			try {
				this.setLocation(x + 20,y - 20);
				Thread.sleep(30);
				this.setLocation(x - 20,y + 20);
				Thread.sleep(30);
				this.setLocation(x + 20,y + 20);
				Thread.sleep(30);
				this.setLocation(x - 20,y - 20);
				Thread.sleep(30);
				
				this.setLocation(x,y);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	private void logFIle() throws Exception {
		bw.flush();
		FileInputStream fis = new FileInputStream("config.txt");    //创建输入流
		ByteArrayOutputStream baos = new ByteArrayOutputStream();  	//创建一个内存区输出流
		
		int len;
		byte[] arr = new byte[8192];
		while((len = fis.read(arr)) != -1) {
			baos.write(arr,0,len);        //将输入流的内容转移到输出流
		} 
		
		String str = baos.toString();    //将内存输出流的内容转换成字符串
		viewText.setText(str);			//将聊天记录显示到记录区
		
		fis.close();						//关流
	}
	
	private void send() throws IOException {
		String message = sendText.getText();		//获取发送区的内容
		String ip = tf.getText();					//获取要发送的ip地址
	    ip = ip.trim().length() == 0 ? "255.255.255.255" : ip;  //如果发送的是空IP地址则代表向所有人对话trim是去掉前后空格
		System.out.println(ip+"测试1");//测试1&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		DatagramPacket packet = 							//创建packet相当于创建集装箱
				new DatagramPacket(message.getBytes(), message.getBytes().length, InetAddress.getByName(ip), 6677);
		socket.send(packet);  		//将数据发送出去
		System.out.println(ip+"测试2");//测试2
		String time = getCurrentTime();  	//调用获取当前时间的方法
		String str = time + " 我对 " + (ip.equals("255.255.255.255") ? "所有人" : ip) + "说:\r\n" + message + "\r\n\r\n";
		viewText.append(str);			//将发送的信息在显示区显示
		System.out.println(ip+"测试3");//测试3
		bw.write(str);
		bw.flush();
		sendText.setText("");					//发送后清除发送区的字符
		
	
	}
	
	private String getCurrentTime() {
		Date d = new Date();   
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");  //设置时间格式
		return sdf.format(d);
	}

	public void centerPanel() {
		
		Panel center = new Panel();  //创建panel对象
		viewText = new TextArea();   //创建记录文本区
		sendText = new TextArea(5,1);//创建发送文本区  (高度,宽度)(因为设置为边界布局只有上下两个panel因此此处设置宽没意义)
		center.setLayout(new BorderLayout());   //中间的panel设置为边界布局管理器
		center.add(viewText,BorderLayout.CENTER); //将记录区放到上方
		center.add(sendText,BorderLayout.SOUTH);  //将发送区放到下方
		viewText.setEditable(false);   //使记录区不可写
		viewText.setBackground(Color.WHITE); //将记录区的背景设置为白色
		sendText.setFont(new Font("xxx", Font.BOLD, 15));  //设置字体和字号
		viewText.setFont(new Font("xxx", Font.BOLD, 15));
		//clearlog = new Button("清除记录");
		
		//center.add(clearlog);
		
		
		this.add(center,BorderLayout.CENTER);  		//将此panel添加倒frame中
	}

	public void southPanel() {
		Panel south = new Panel();   //创建panel对象
		tf = new TextField(15);     //生成文本区域,存放ip地址         //将他们都生成成员变量,可以在别的方法中调用
		tf.setText("172.23.18.38");	//ip地址默认设置为本机地址
		send = new Button("发 送");
		log = new Button("记 录");
		clear = new Button("清 屏");
		shake = new Button("震 动");
		south.add(tf);
		south.add(send);
		south.add(log);
		south.add(clear);
		south.add(shake);
		this.add(south,BorderLayout.SOUTH);  		//将此panel放到frame的边界布局的南面(下面)
	}

	private void init()  {
		this.setLocation(700, 50);   	//设计窗口位置 
		this.setSize(400, 550);			//设计窗口大小	
		new Receive().start();			//在初始化时就启动接受线程
		this.setIconImage(Toolkit.getDefaultToolkit().createImage("Picture.png"));   //添加窗口图标
		try {
			socket = new DatagramSocket();
			bw = new BufferedWriter(new FileWriter("config.txt",true));   //创建此文本用来记录聊天记录
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setVisible(true);			//是窗口可见
	}
	
	private class Receive extends Thread {			//需要发送和接受同时进行 因此定义为多线程  //在创建时开始启动线程
		public void run() {
			
			try {
				DatagramSocket socket = new DatagramSocket(9999);						//创建socket相当于创建码头(端口号为6666)
				DatagramPacket packet = new DatagramPacket(new byte[8192], 8192);		//创建packet相当于创建集装箱
				
				while(true) {										//持续接受
					socket.receive(packet);							//接收货物
					byte[] arr = packet.getData();
					int len = packet.getLength();
					String message = new String(arr, 0,len);       //将接受到的数据整理成字符串
					if (arr[0] == -1 && len == 1) {  //当收到-1字符时代表对方发了一个震动过来
						shake();
						continue;  					//终止此次循环继续下次循环
					}
					
					String time = getCurrentTime();   		//调用此方法来获取时间
					String ip = packet.getAddress().getHostAddress();    //获取发送方的IP地址
					System.out.println(ip+"测试4");//测试1&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
					String str = time + " " + ip + " 对我说:\r\n" + message + "\r\n\r\n";
					viewText.append(str);				//将接受到的数据显示到viewtext中
					bw.write(str);
					bw.flush();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
