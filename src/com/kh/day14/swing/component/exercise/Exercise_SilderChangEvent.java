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
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.kh.day13.swing.basic.Exam_BorderLayout;

public class Exercise_SilderChangEvent extends JFrame {

	private JLabel colorLabel;
	private JSlider [] sliders;

	public Exercise_SilderChangEvent() {
		setTitle(" 슬라이더와 ChangeEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());//BorderLayout사용 
		colorLabel  = new JLabel("SLIDER EXAMPLE");
		sliders = new JSlider[3];
		for(int i = 0; i < sliders.length; i++) {
		sliders[i] = 
				new JSlider(JSlider.HORIZONTAL ,0, 255,128);
		sliders[i].setPaintLabels(true);
		sliders[i].setPaintTicks(true);
		sliders[i].setMajorTickSpacing(50);
		sliders[i].setMajorTickSpacing(10);
		sliders[i].addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				int r = sliders[0].getValue();
				int g = sliders[1].getValue();
				int b = sliders[2].getValue();
				colorLabel.setOpaque(true);
				colorLabel.setBackground(new Color(r,g,b));

			}
		});
		c.add(sliders[i]);
	}
		
		sliders[0].setForeground(Color.red);
		sliders[1].setForeground(Color.green);
		sliders[2].setForeground(Color.BLUE);
		c.add(colorLabel);
		
		setSize(300, 200);
		setVisible(true);
}
	public static void main(String[] args) {
		new Exercise_SilderChangEvent();
	}
}
