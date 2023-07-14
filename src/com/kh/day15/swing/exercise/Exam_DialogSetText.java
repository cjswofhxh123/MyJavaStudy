package com.kh.day15.swing.exercise;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

class MyModalDialog extends JDialog {
	private JTextField field;
	private JButton btn;
	public MyModalDialog() {}
	public MyModalDialog(JFrame frame, String title, JButton jBtn) {
		super(frame, title);
		setLayout(new FlowLayout());
		field = new JTextField(10);
		add(field);
		btn = new JButton("OK");
		btn.addActionListener(new ActionListener() { //ok 버튼 눌렀을때
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false); //   다이얼 로그 사라짐 
				if(field.getText().length() == 0) return;
				else jBtn.setText(field.getText());
				field.setText(""); 				//다이얼로그 호출될때 필드를 비워줌
			}
		});
		
		add(btn);
		setSize(200,100);
	}
//	public String getInput() {
//		if(field.getText().length() == 0) return null;
//		else return field.getText();
//	}
}

public class Exam_DialogSetText extends JFrame {
	private MyModalDialog dialog;

	public Exam_DialogSetText() {
		super("다이얼로그 텍스트 셋팅 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("SHOW MODAL DIALOG");
		btn.setSize(200, 50);
		btn.setLocation(20, 50);
		dialog = new MyModalDialog(this, "show modal dialog", btn);
		btn.addActionListener(new ActionListener() { // ok 버튼 누르면 사라짐 

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dialog.setVisible(true);
//				String text = dialog.getInput();
//				if(text == null) return;
//				JButton btn = (JButton)e.getSource();
//				btn.setText(text);
			}
		});

		// dialog.setVisible(true);

		Container c = getContentPane();
		c.setLayout(null);
		c.add(btn);

		setSize(250, 200);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Exam_DialogSetText();
	}
}