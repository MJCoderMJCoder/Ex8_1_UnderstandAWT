package com.understandawt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class UnderstandAWT {

	public static void main(String[] args) {
		//�������������ò���
		Frame frm = new Frame("���AWT");	//�������ṹ��Frame
		frm.setLayout(new BorderLayout()); 	//ָ��BoederLayout���֣���������
		
		//�������������ӵ�������
		Button myBtn = new Button("��ť");
		frm.add(myBtn);
		
		//���ýṹ��Frame����λ�����С����ʾ
		frm.setBounds(400, 200, 400, 200);	//setBounds(x, y, width, height);
		frm.setVisible(true);
	}

}
