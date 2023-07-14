package com.kh.day14.swing.component;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.kh.day13.swing.basic.Exam_BorderLayout;

public class Exam_JTxetArea extends JFrame {
		
	
		private JLabel textLable;
		private JTextField fieldLable;
		private JTextArea areaLable;
		private JScrollPane scrollPane;
		
		public Exam_JTxetArea() {
		setTitle("텍스트 필드 만들기 예제 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		textLable = new JLabel("입력후 <Enter> 키를 입력하세요");
		fieldLable = new JTextField(20);
		areaLable = new  JTextArea(7,20);
		scrollPane = new JScrollPane(areaLable);//텍스트영역 객체 전달하면서
												//스크롤팬 객체 생성
		c.add(textLable);
		c.add(fieldLable);
		c.add(scrollPane);						//콘텐트 팬에 스크롤팬 추가
		fieldLable.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JTextField jt = (JTextField)e.getSource();
				areaLable.append(jt.getText() +"\n");
				jt.setText("");
			}
		});
	
		setSize(300, 200);
		setVisible(true);
		
	}
		public static void main(String[] args) {
			new Exam_JTxetArea();
		}
	}

