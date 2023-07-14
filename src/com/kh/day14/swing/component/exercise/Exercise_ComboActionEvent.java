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

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

import com.kh.day13.swing.basic.Exam_BorderLayout;

public class Exercise_ComboActionEvent extends JFrame {

	private String[] fruits = { "apple", "banana", "kiwi","mango" };//라디오 버튼 이름 배열
	private ImageIcon[] images = { //이미지 라벨에 들어갈 이미지아이콘 배열
			new ImageIcon("images/apple.jpg"), 
			new ImageIcon("images/banana.jpg"),
			new ImageIcon("images/kiwi.jpg"), 
			new ImageIcon("images/mango.jpg") 
	};

	private JLabel imgLabel; //이미지 라벨 선언
	private JComboBox<String> strCombo;
	
	public Exercise_ComboActionEvent() {
		setTitle(" JCheckBox Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());//BorderLayout사용 
		imgLabel = new JLabel(images[0]);
		strCombo = new JComboBox<String>(fruits);
		c.add(strCombo);
		c.add(imgLabel);
		strCombo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JComboBox<String> strCb 
				=  (JComboBox<String>)e.getSource();//e.getSource는 이벤트가 발생한 콤포넌트가져옴(this와 비슷)
				int index = strCb.getSelectedIndex(); //선택된 아이템의 index값을 구해오는 
				imgLabel.setIcon(images[index]);
			}
		});

		setSize(300, 200);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Exercise_ComboActionEvent();
	}
}
