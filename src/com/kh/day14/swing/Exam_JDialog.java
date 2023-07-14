package com.kh.day14.swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

class MyDialog extends JDialog{
	
	private JButton btn;
	public MyDialog() {}
	public MyDialog(JFrame frame,String title) {
		super(frame,title);
		setLayout(new FlowLayout()); //레이아웃 설정
		add(new JTextField(10)); //텍스트 필드 추가

		btn = new JButton("ok"); // 버튼 추가
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false); //ok버튼을 누르면 닫히게 함
			}
		});
		add(btn);
		setSize(200,100 ); //다이알로그 크기 셋팅 => 완료
	}
}


public class Exam_JDialog extends JFrame {
	private MyDialog dialog;
	public Exam_JDialog() {
		
		//setTitle("Dialog 만들기 예제");
		super("Dialog 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("show Dialog"); //버튼 생성 (누르면 다이얼로그)
		dialog = new MyDialog(this, "Test Dialog");//다이얼로그 생성
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					dialog.setVisible(true); //
			}
		});
			
		Container c = getContentPane();
		c.add(btn);
		
		
		setSize(250,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam_JDialog();
	}
}






