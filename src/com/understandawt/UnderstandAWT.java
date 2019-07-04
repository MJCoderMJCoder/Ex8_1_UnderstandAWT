package com.understandawt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class UnderstandAWT {

	public static void main(String[] args) {
		//创建容器和设置布局
		Frame frm = new Frame("理解AWT");	//容器：结构类Frame
		frm.setLayout(new BorderLayout()); 	//指定BoederLayout布局（管理器）
		
		//创建组件，并添加到容器中
		Button myBtn = new Button("按钮");
		frm.add(myBtn);
		
		//设置结构（Frame）的位置与大小并显示
		frm.setBounds(400, 200, 400, 200);	//setBounds(x, y, width, height);
		frm.setVisible(true);
	}

}
