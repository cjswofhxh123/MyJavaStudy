package com.kh.day13.swing.basic;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_BorderLayout extends JFrame {

	public Exam_BorderLayout() {
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout(30, 30));
		// 수평간겨(hGap) 30, 수직간격(vGap) 20 픽셀로 하는 BorderLayout
		c.add(new JButton("Calculate"), BorderLayout.CENTER);
		c.add(new JButton("add"), BorderLayout.NORTH);
		c.add(new JButton("sub"), BorderLayout.SOUTH);
		c.add(new JButton("multi"), BorderLayout.EAST);
		c.add(new JButton("div"), BorderLayout.WEST);

		setSize(300, 200);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Exam_BorderLayout();
	}
}
