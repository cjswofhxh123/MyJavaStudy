package com.kh.day16.swing.exersize;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.lang.model.element.UnknownAnnotationValueException;
import javax.management.ListenerNotFoundException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.kh.day16.swing.component.Exam_Audio;

public class Exercise_AudioLineEvent extends JFrame {

	private Clip clip;
	private JLabel label;

	public Exercise_AudioLineEvent() {
		label = new JLabel("애국가 1절");
		setTitle("오디오 제어 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.yellow);
		c.add(label);

		setSize(300, 150);
		setVisible(true);
		loadAudio("audio/애국가1절.wav");

	}

	private void loadAudio(String audioPath) {
		// TODO Auto-generated method stub
		try {
			clip = AudioSystem.getClip();
			File audioFile = new File(audioPath);
			AudioInputStream audioStream = 
					AudioSystem.getAudioInputStream(audioFile);
			clip.open(audioStream);
			clip.addLineListener(new LineListener() {

				@Override
				public void update(LineEvent event) {
					// TODO Auto-generated method stub
					if (event.getType() == LineEvent.Type.STOP) {// 노래가 멈추며ㅓㄴ
						getContentPane().setBackground(Color.orange);// 배경색 변경
						label.setText("연주끝"); // 텍스트 변경
					}
					try {
						audioStream.close();
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
			}); // 노래가 끝날때 동작
			clip.start(); // 프로그램 시작하자마자 노래시작
			
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	public static void main(String[] args) {
		new Exercise_AudioLineEvent();
	}
}
