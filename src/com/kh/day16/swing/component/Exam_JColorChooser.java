package com.kh.day16.swing.component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class Exam_JColorChooser  extends JFrame{
	
	private JLabel lable;
	
	
	public Exam_JColorChooser() {
		lable = new JLabel("Hello");
		setTitle("Exam_JColorChooser 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		lable.setHorizontalAlignment(SwingConstants.CENTER);
		lable.setFont(new Font("Ravie",Font.ITALIC,30));
		c.add(lable, BorderLayout.CENTER);
		createMenu();
		
		
		
		
		
		
		
		setSize(300,300);
		setVisible(true);
	}
	
	private void createMenu() {
	JMenuBar bar = new JMenuBar();
	JMenu menu = new  JMenu("text");
	JMenuItem item = new JMenuItem("Color");
	item.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Color chosenColor = 
			JColorChooser.showDialog(null, "ColorPicker", Color.YELLOW);
			if(chosenColor != null) {
				lable.setForeground(chosenColor); //선택한 색으로 글씨색 설정
			}
		}
	});
		menu.add(item);
		bar.add(menu);
		setJMenuBar(bar);
	}

	
	public static void main(String[] args) {
		new Exam_JColorChooser();
	}
}
