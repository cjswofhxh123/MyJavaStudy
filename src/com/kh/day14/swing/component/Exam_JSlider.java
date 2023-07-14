package com.kh.day14.swing.component;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JSlider;

public class Exam_JSlider  extends Frame{
	
	public Exam_JSlider() {
		setTitle("JSlider 만들기 예제 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL,0,200,100);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(50);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		c.add(slider);
		
		setSize(300, 200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Exam_JSlider();
	}
}
