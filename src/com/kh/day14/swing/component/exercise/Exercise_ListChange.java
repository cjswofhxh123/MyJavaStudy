package com.kh.day14.swing.component.exercise;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.font.ImageGraphicAttribute;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.kh.day13.swing.basic.Exam_BorderLayout;

public class Exercise_ListChange extends JFrame {

	private JLabel guide;
	private JTextField input;
	private Vector<String> vector;
	private JList<String> nameList;

	public Exercise_ListChange() {
		setTitle(" JList 변경 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());//BorderLayout사용 
		guide = new JLabel("이름 입력후 <Enter> 키");
		input = new JTextField(10);
		vector = new Vector<String>();
		nameList = new JList<String>();
		c.add(guide);
		c.add(input);
		nameList.setVisibleRowCount(5); //행의 갯수 설정
		nameList.setFixedCellWidth(100); // 너비 설정
		c.add(new JScrollPane(nameList)); // 스크롤팬에 리스트를 담아서 스클롤 생기도록 함
		input.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					JTextField it  = (JTextField)e.getSource();
					vector.add(it.getText());  // 앤터 친 필드에 입력한 값 백터에 추가
					it.setText("");				//입력햇던 값 지워주기
					nameList.setListData(vector); //jList에 넣어주기 
				}
			
		});


		setSize(300, 200);
		setVisible(true);
}
	public static void main(String[] args) {
		new Exercise_ListChange();
	}
}
