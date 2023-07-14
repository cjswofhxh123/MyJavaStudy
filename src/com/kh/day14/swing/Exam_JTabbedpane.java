package com.kh.day14.swing;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;

public class Exam_JTabbedpane extends JFrame {

	public Exam_JTabbedpane() {
		
		setTitle("탭팬 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTabbedPane pane = new JTabbedPane();
		c.add(pane,BorderLayout.CENTER);
		
		setSize(400,400);
		setVisible(true);
		
		Container c = getContentPane();
		JTabbedPane pane = new JTabbedPane();
		pane.addTab("superman", new JLabel(new ImageIcon("image/img1.jpg")));
		pane.addTab("wonder-woman", new JLabel(new ImageIcon("image/img1.jpg")));
		pane.addTab("spider-man", new JLabel(new ImageIcon("image/img1.jpg")));
		return pane;

	}

	public JTabbedPane creaTabbedPane() {
		JTabbedPane Pane = new JTabbedPane();
		Pane.addTab(, Pane);
	}
	
	public static void main(String[] args) {
		new Exam_JTabbedpane();
	}
	
}






