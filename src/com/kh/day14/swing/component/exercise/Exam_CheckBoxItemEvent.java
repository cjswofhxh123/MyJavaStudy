package com.kh.day14.swing.component.exercise;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.font.ImageGraphicAttribute;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

import com.kh.day13.swing.basic.Exam_BorderLayout;

public class Exam_CheckBoxItemEvent extends JFrame {
		
		private JRadioButton  [] fruits;
		private String [] names = {"사과", "배", "체리"};
		private ImageIcon [] images =
			{
					new ImageIcon("/apple.jpg"),
					new ImageIcon("/paer.jpg"),
					new ImageIcon("/cherry.jpg")
			};
		private JLabel imageJLabel;
	
		public Exam_CheckBoxItemEvent() {
		setTitle(" JCheckBox Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		JPanel radioPanel  = new JPanel(); // 라디오 
		radioPanel.setBackground(Color.LIGHT_GRAY);
		fruits = new JRadioButton[3];
		imageJLabel = new JLabel();
		ButtonGroup btnG = new ButtonGroup();
		
		for(int i =0; i<fruits.length; i++) {
			fruits[i] = new JRadioButton(names[i]);
			btnG.add(fruits[i]);//라디오 버튼 객체 배열 생성함
			radioPanel.add(fruits[i]);
			fruits[i].addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					// TODO Auto-generated method stub
					if(e.getStateChange() == ItemEvent.DESELECTED) {
						return;
					}
					if(fruits[0].isSelected()) {
						imageJLabel.setIcon(images[0]);
					}else if(fruits[1].isSelected()) {
						imageJLabel.setIcon(images[1]);
					}else if(fruits[2].isSelected()) {
						imageJLabel.setIcon(images[2]);

					}
				}
			});
		}
		
		c.add(radioPanel , BorderLayout.NORTH);
		c.add(imageJLabel , BorderLayout.CENTER);
		imageJLabel.setHorizontalAlignment(SwingConstants.CENTER);
		

		setSize(300, 200);
		setVisible(true);
		
	}
		public static void main(String[] args) {
			new Exam_CheckBoxItemEvent();
		}
	}

