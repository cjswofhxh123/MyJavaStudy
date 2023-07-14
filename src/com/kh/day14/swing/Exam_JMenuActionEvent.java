package com.kh.day14.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Exam_JMenuActionEvent extends JFrame {
	private JLabel imgLabel;
	public Exam_JMenuActionEvent() {
		
		setTitle("메뉴만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		Container c =getContentPane(); // 컨텐츠팬
		imgLabel = new JLabel();		//이지미 들어갈 라벨
		c.setLayout(new BorderLayout()); //BorderLayout 사용, (TOP,BOTTOM, LEFT,RIGHT, CENTER)
		c.add(imgLabel, BorderLayout.CENTER);
		
		
		setSize(250,220);
		setVisible(true);
		
	
	}
	private void createMenu() { // 메뉴바
		JMenuBar bar = new JMenuBar(); //메뉴
		JMenu screenMenu = new JMenu("screen");
		String [] itemTitle = {"Load","Hide","ReShow","Exit"};
		for(int i=0; i<4; i++) {
			JMenuItem menuItem = new JMenuItem(itemTitle[i]);//아이템메뉴 밑에 들어감
			screenMenu.addActionListener(new ActionListener() {// 아이템이 선택되었을때
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String cmd    =  e.getActionCommand();
					switch (cmd) {
					case "Load":
						if(imgLabel.getIcon()!= null) { return; 
						imgLabel.setIcon(new ImageIcon("images/img.jpg"));
						
						break;
						
					case "Hide":
						//imgLabel.setIcon(null);
						imgLabel.setVisible(false);
						break;
					case "ReShow":
						imgLabel.setVisible(true);
						break;
					case "Exit":
						System.exit(0);
						break;

					default:
						break;
					}
//					if(cmd.equals("Load")) {
//						
//					}else if(cmd.equals("Hide")) {
//						
//					}else if(cmd.equals("ReShow")) {
//						
//					}else if(cmd.equals("Exit")) {
						setTitle(cmd);
				}
			});
			screenMenu.add(menuItem);
		}
//		screenMenu.add(new JMenuItem("Load"));
//		screenMenu.add(new JMenuItem("Hide"));
//		screenMenu.add(new JMenuItem("ReShow"));
//		screenMenu.add(new JMenuItem("Exit"));
		bar.add(screenMenu);
		setJMenuBar(bar);
	}
	
	
	public static void main(String[] args) {
		new Exam_JMenuActionEvent();
	}
}
