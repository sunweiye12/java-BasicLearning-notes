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
		Frame f = new Frame("��һ�����ڵ�����");      		//����һ�����ɼ��Ĵ���,������
		
		f.setSize(400, 500);								//���ô��ڵĴ�С
		f.setLocation(300, 50);								//���ô��ڵ�λ��
		f.setIconImage(Toolkit.getDefaultToolkit().createImage("����.png"));   //��Ӵ���ͼ��
		
		Button b1 = new Button("��ť1");						//���ð�ť������
		Button b2 = new Button("��ť2");						//���ð�ť������
		f.add(b1);											//����ť����봰����
		f.add(b2);
		f.setLayout(new FlowLayout());             		 	//����FlowLayout()���͵Ĳ��ֹ�����//���������ڲ���
		
		f.addWindowListener(new MyWindowAdapter()); 				//��Ӵ��ڼ�����//��Ҫ����
		//��ΪWindowListenerΪ�ӿ����Բ�����ֱ�Ӵ���ֻ�ܹ�������������,����������Ҫ��д���з����Ƚ��鷳,�����WindowAdapter()������
		//����WindowListener��������,��������������ֻ��д��Ҫ�ĵķ���
		
		b1.addMouseListener(new MouseAdapter() {          //�ڰ�ť������������,�����ϴ��ڼ���һ��,������õ����ڲ���
//			@Override
//			public void mouseClicked(MouseEvent e) {  //�����
//				// TODO Auto-generated method stub
//				super.mouseClicked(e);
//			}
			@Override
			public void mouseReleased(MouseEvent e) {  //����ͷ�
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});								
		
		b1.addKeyListener(new KeyAdapter() {    			//�ڰ�ť����Ӽ���������
			@Override
			public void keyReleased(KeyEvent e) {
				//System.exit(0);
				System.out.println(e.getKeyCode());  //�����������Ӧ����ֵ
				if (e.getKeyCode() == 27) {				//������Esc��ʱִ��
					System.exit(0);
				}
			}
		});
		
		b2.addActionListener(new ActionListener() {		//�ڰ�ť2����Ӷ�������,��������  ���� �ո��ʱ��ִ�д�����
			//Ӧ�ó�����ͣ��Ƶ
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		f.setVisible(true);									//ʹ�˴��ڿɼ�

	}

}

class MyWindowAdapter extends WindowAdapter{
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
}