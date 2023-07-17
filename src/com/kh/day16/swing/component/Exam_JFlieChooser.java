package com.kh.day16.swing.component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Exam_JFlieChooser extends JFrame {
	private JLabel imgLable;
	public Exam_JFlieChooser() {
		
		// TODO Auto-generated constructor stub
		
		setTitle("메뉴와 파일 Chooser 활용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		imgLable = new JLabel();
		//c.setLayout(new FlowLayout());
		//c.add(new createMenu(), BorderLayout.)
		c.add(imgLable);
		createMenu();
		
		
		setSize(350,200);
		setVisible(true);
	}

	private void createMenu() {
		JMenuBar bar  =new JMenuBar();
		JMenu menu = new  JMenu("FLIE");
		JMenuItem item  = new JMenuItem("OPNE");
		// FLie
		//- > Open
		item.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFileChooser chooser = new JFileChooser();
				int chosen = 
				chooser.showOpenDialog(null);//파일 선택창을 띄움
				
				//JFileChooser 동작시 비정상적인 선택
			if(chosen != JFileChooser.APPROVE_OPTION) {
				//메시지 출력, 파일 선택 안햇는데요?
			JOptionPane.showConfirmDialog(null, 
					"파일을 선택하지 않았습니다.","경고",JOptionPane.WARNING_MESSAGE);	
				return;//밑에 있는 코드를 실행하면 NullpointerException 발생하기 떄문에 종료해줌.
			}
			
				String filePath = chooser.getSelectedFile().getPath();
				imgLable.setIcon(new ImageIcon(filePath));
			
			}
		});//Open이 클릭되었을 때 동작 
		
		menu.add(item);
		bar.add(menu);
		setJMenuBar(bar);
				
		
		// TODO Auto-generated method stub
		// FLie
		//- > Open
	}
	public static void main(String[] args) {
		new Exam_JFlieChooser();
	}
}

