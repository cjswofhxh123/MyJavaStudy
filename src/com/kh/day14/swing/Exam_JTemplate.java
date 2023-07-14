package com.kh.day14.swing;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Exam_JTemplate extends JFrame {

	public Exam_JTemplate() {
		
		setTitle("메뉴만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		setSize(250,200);
		setVisible(true);
	}
		private void createMenu() {
			JMenuBar bar =new JMenuBar();   //메뉴바
			JMenu screenMenu = new JMenu("screen"); //메뉴 (screen)
			
			screenMenu.add(new JMenuItem("Load")); //메뉴아이템
			screenMenu.add(new JMenuItem("Hide"));
			screenMenu.add(new JMenuItem("ReShow"));
			screenMenu.add(new JMenuItem("Exit"));

			bar.add(screenMenu);
			bar.add(new JMenu("Edit"));
			bar.add(new JMenu("Source"));
			bar.add(new JMenu("Project"));
			bar.add(new JMenu("Run"));

			setJMenuBar(bar);//프레임에 추가
		}
		
		
	
	public static void main(String[] args) {
		new Exam_JTemplate();
	}
}






