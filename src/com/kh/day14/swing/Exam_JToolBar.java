package com.kh.day14.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Exam_JToolBar extends JFrame {
	private Container contentPane;

	public Exam_JToolBar() {
		
		setTitle("툴바 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();

		createToobBar();
		setSize(250,200);
		setVisible(true);
	}
		private void createToobBar() {
			JMenuBar toolbar =new JMenuBar();   //메뉴바
			toolbar.setBackground(Color.LIGHT_GRAY);
			JButton newBtn = new JButton();
			newBtn.setToolTipText("파일 생성합니다");
			toolbar.add(newBtn);
			JButton openBtn = new JButton(new ImageIcon("images/open.jpg"));
			openBtn.setToolTipText("파일 엽니다");
			toolbar.add(openBtn);
			toolbar.addSeparator();
			JButton saveBtn = new JButton(new ImageIcon("images/save.jpg"));
			saveBtn.setToolTipText("파일 저장합니다");
			toolbar.add(saveBtn);
			
			toolbar.add(new JButton("New"));
			contentPane.add(toolbar,BorderLayout.NORTH);
		}
		
		
	
	public static void main(String[] args) {
		new Exam_JToolBar();
	}
}






