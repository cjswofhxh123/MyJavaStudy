package com.kh.day14.swing.component;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.ScrollPane;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.Scrollable;

import com.kh.day13.swing.basic.Exam_BorderLayout;

public class Exam_JList extends JFrame {
		
		private String [] fruits = {"apple","banana","kiwi","mango",
				"pear","peach","berry","strawberry","blackbrerry"};
		private ImageIcon [] images = {
			new ImageIcon("images/icon1.png"),
			new ImageIcon("images/icon2.png"),
			new ImageIcon("images/icon3.png"),
			new ImageIcon("images/icon4.png");

		};
		
		private String ScrollPane;
		public Exam_JList() {
		setTitle("텍스트 필드 만들기 예제 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JList<String> strList = new JList<String>(fruits);
		c.add(strList);
		
		JList<ImageIcon> imJList = new JList<ImageIcon>();
		imJList.setListData(images);
		c.add(imJList);
		
		JList<Stirng> ScrollPane = new JList<ImageIcon>();
		ScrollPane = new JScrollPane(ScrollPane);
		c.add(ScrollPane);

		setSize(300, 200);
		setVisible(true);
		
	}
		
		public static void main(String[] args) {
			new Exam_JList();
		}
	}

