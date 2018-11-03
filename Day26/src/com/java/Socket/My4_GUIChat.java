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
//�ô���ֱ��Frame����Ϳ���ֱ��ʹ������ķ���  
	
	private TextField tf;  //һϵ�еĳ�Ա����
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
	
	public My4_GUIChat() {   		//��ƹ��췽��
		init(); 		//���ڻ�������
		southPanel();  	//�����panel����
		centerPanel(); 	//���м䴴��panel����
		event();		//����¼�
	}

	public void event() {
		this.addWindowListener(new WindowAdapter() {  //���ڼ�����
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
		
		send.addActionListener(new ActionListener() {  //��send��ť��Ӷ��������� �������ִ��
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					send();//����send����
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}        
			}
		});
		
		//��ݼ�
		sendText.addKeyListener(new KeyAdapter() {
			
			public void keyReleased(KeyEvent e) {
//				System.out.println(e.getKeyCode());  	//�����������Ӧ����ֵ,,������
				if (e.getKeyCode() == 10) {				//������Enter��ʱִ��,����
					try {
						send();							//����send����
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}							
				}   
			}
		});
		
//		send.addKeyListener(new  KeyAdapter() {   		//��ȡ���̼�����
//			public void keyReleased(KeyEvent e) {
//				System.out.println(e.getKeyCode());  	//�����������Ӧ����ֵ
//				if (e.getKeyCode() == 10) {				//������Enter��ʱִ��
//					try {
//						send();//����send����
//					} catch (IOException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					}   
//				}
//			}
//		});
		
		log.addActionListener(new ActionListener() {	//��log��ť��Ӽ���
			public void actionPerformed(ActionEvent e) {
				try {
					logFIle();
				} catch (Exception e1) {
					e1.printStackTrace();
				}		
			}
			
		});
		
		clear.addActionListener(new ActionListener() {  	//��������Ӷ�������
			
			@Override
			public void actionPerformed(ActionEvent e) {
				viewText.setText("");
				
			}
		});
		
		shake.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {//�������𶯰�ť�͸��Է���һ��-1���ַ�,�Է��յ�����ַ�ʱ�ͻ�����𶯷���
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
		int x = this.getLocation().x;   //��ȡ���ڵ�x��y����
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
		FileInputStream fis = new FileInputStream("config.txt");    //����������
		ByteArrayOutputStream baos = new ByteArrayOutputStream();  	//����һ���ڴ��������
		
		int len;
		byte[] arr = new byte[8192];
		while((len = fis.read(arr)) != -1) {
			baos.write(arr,0,len);        //��������������ת�Ƶ������
		} 
		
		String str = baos.toString();    //���ڴ������������ת�����ַ���
		viewText.setText(str);			//�������¼��ʾ����¼��
		
		fis.close();						//����
	}
	
	private void send() throws IOException {
		String message = sendText.getText();		//��ȡ������������
		String ip = tf.getText();					//��ȡҪ���͵�ip��ַ
	    ip = ip.trim().length() == 0 ? "255.255.255.255" : ip;  //������͵��ǿ�IP��ַ������������˶Ի�trim��ȥ��ǰ��ո�
		System.out.println(ip+"����1");//����1&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		DatagramPacket packet = 							//����packet�൱�ڴ�����װ��
				new DatagramPacket(message.getBytes(), message.getBytes().length, InetAddress.getByName(ip), 6677);
		socket.send(packet);  		//�����ݷ��ͳ�ȥ
		System.out.println(ip+"����2");//����2
		String time = getCurrentTime();  	//���û�ȡ��ǰʱ��ķ���
		String str = time + " �Ҷ� " + (ip.equals("255.255.255.255") ? "������" : ip) + "˵:\r\n" + message + "\r\n\r\n";
		viewText.append(str);			//�����͵���Ϣ����ʾ����ʾ
		System.out.println(ip+"����3");//����3
		bw.write(str);
		bw.flush();
		sendText.setText("");					//���ͺ�������������ַ�
		
	
	}
	
	private String getCurrentTime() {
		Date d = new Date();   
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");  //����ʱ���ʽ
		return sdf.format(d);
	}

	public void centerPanel() {
		
		Panel center = new Panel();  //����panel����
		viewText = new TextArea();   //������¼�ı���
		sendText = new TextArea(5,1);//���������ı���  (�߶�,���)(��Ϊ����Ϊ�߽粼��ֻ����������panel��˴˴����ÿ�û����)
		center.setLayout(new BorderLayout());   //�м��panel����Ϊ�߽粼�ֹ�����
		center.add(viewText,BorderLayout.CENTER); //����¼���ŵ��Ϸ�
		center.add(sendText,BorderLayout.SOUTH);  //���������ŵ��·�
		viewText.setEditable(false);   //ʹ��¼������д
		viewText.setBackground(Color.WHITE); //����¼���ı�������Ϊ��ɫ
		sendText.setFont(new Font("xxx", Font.BOLD, 15));  //����������ֺ�
		viewText.setFont(new Font("xxx", Font.BOLD, 15));
		//clearlog = new Button("�����¼");
		
		//center.add(clearlog);
		
		
		this.add(center,BorderLayout.CENTER);  		//����panel��ӵ�frame��
	}

	public void southPanel() {
		Panel south = new Panel();   //����panel����
		tf = new TextField(15);     //�����ı�����,���ip��ַ         //�����Ƕ����ɳ�Ա����,�����ڱ�ķ����е���
		tf.setText("172.23.18.38");	//ip��ַĬ������Ϊ������ַ
		send = new Button("�� ��");
		log = new Button("�� ¼");
		clear = new Button("�� ��");
		shake = new Button("�� ��");
		south.add(tf);
		south.add(send);
		south.add(log);
		south.add(clear);
		south.add(shake);
		this.add(south,BorderLayout.SOUTH);  		//����panel�ŵ�frame�ı߽粼�ֵ�����(����)
	}

	private void init()  {
		this.setLocation(700, 50);   	//��ƴ���λ�� 
		this.setSize(400, 550);			//��ƴ��ڴ�С	
		new Receive().start();			//�ڳ�ʼ��ʱ�����������߳�
		this.setIconImage(Toolkit.getDefaultToolkit().createImage("Picture.png"));   //��Ӵ���ͼ��
		try {
			socket = new DatagramSocket();
			bw = new BufferedWriter(new FileWriter("config.txt",true));   //�������ı�������¼�����¼
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setVisible(true);			//�Ǵ��ڿɼ�
	}
	
	private class Receive extends Thread {			//��Ҫ���ͺͽ���ͬʱ���� ��˶���Ϊ���߳�  //�ڴ���ʱ��ʼ�����߳�
		public void run() {
			
			try {
				DatagramSocket socket = new DatagramSocket(9999);						//����socket�൱�ڴ�����ͷ(�˿ں�Ϊ6666)
				DatagramPacket packet = new DatagramPacket(new byte[8192], 8192);		//����packet�൱�ڴ�����װ��
				
				while(true) {										//��������
					socket.receive(packet);							//���ջ���
					byte[] arr = packet.getData();
					int len = packet.getLength();
					String message = new String(arr, 0,len);       //�����ܵ�������������ַ���
					if (arr[0] == -1 && len == 1) {  //���յ�-1�ַ�ʱ����Է�����һ���𶯹���
						shake();
						continue;  					//��ֹ�˴�ѭ�������´�ѭ��
					}
					
					String time = getCurrentTime();   		//���ô˷�������ȡʱ��
					String ip = packet.getAddress().getHostAddress();    //��ȡ���ͷ���IP��ַ
					System.out.println(ip+"����4");//����1&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
					String str = time + " " + ip + " ����˵:\r\n" + message + "\r\n\r\n";
					viewText.append(str);				//�����ܵ���������ʾ��viewtext��
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
