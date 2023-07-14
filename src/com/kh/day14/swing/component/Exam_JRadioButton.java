package com.kh.day14.swing.component;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

import com.kh.day13.swing.basic.Exam_BorderLayout;

public class Exam_JRadioButton extends JFrame {
		
		public Exam_JRadioButton() {
		setTitle(" Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon charryIcon = new ImageIcon("image/cherry.jpg");
		ImageIcon selectedCharryIcon = new ImageIcon("image/cherry.jpg");

		JRadioButton apple = new JRadioButton("사과",true);
		JRadioButton pear = new JRadioButton("배");
		JRadioButton charry = new JRadioButton("체리");
		charry.setBorderPainted(true);
		charry.setSelectedIcon(selectedCharryIcon);
		
		ButtonGroup g = new ButtonGroup();
		g.add(apple);
		g.add(pear);
		g.add(charry);
		
		g.add(apple);
		g.add(pear);
		g.add(charry);


		setSize(300, 200);
		setVisible(true);
		
	}
		public static void main(String[] args) {
			new Exam_JRadioButton();
		}
	}

