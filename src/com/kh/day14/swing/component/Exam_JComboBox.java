package com.kh.day14.swing.component;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.kh.day13.swing.basic.Exam_BorderLayout;

public class Exam_JComboBox extends JFrame {
		
		
	private String [] fruits = {"apple","banana","kiwi","mango",
			"pear","peach","berry","strawberry","blackbrerry"};
	private String [] names = {"일용자","이용자","삼용자","사용자"};
	
		public Exam_JComboBox() {
		setTitle("텍스트 필드 만들기 예제 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JComboBox<String> strCombo  =  new JComboBox<String>(fruits);
		c.add(strCombo);
		JComboBox<String> nameCombo  =  new JComboBox<String>();
		for(int i =0; i <names.length; i++) {
			if(i )
			
			
			(nameCombo);

		}
		setSize(300, 200);
		setVisible(true);
		
	}
		public static void main(String[] args) {
			new Exam_JComboBox();
		}
	}

