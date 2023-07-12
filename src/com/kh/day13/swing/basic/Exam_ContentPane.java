package com.kh.day13.swing.basic;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_ContentPane extends JFrame {
	public Exam_ContentPane() {
		// TODO Auto-generated constructor stub
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//실제로 종료하도록 함. 
			//		그전엔 안보이게만 햇음 

		Container contentPane = getContentPane();
		contentPane.setBackground(Color.pink);
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));

		setSize(300, 150);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Exam_ContentPane();
	}
}
