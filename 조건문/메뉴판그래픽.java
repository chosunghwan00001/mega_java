package 조건문;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class 메뉴판그래픽 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(1000, 400);
		f.setTitle("메뉴판");
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(124, 252, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("우동을 선택했네요");
				f.setTitle("우동을 선택했네요");
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\cho83\\day02\\우동.PNG"));
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(new Color(255, 215, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("짜장면을 선택했네요");
				f.setTitle("짜장면을 선택했네요");
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("D:\\cho83\\day02\\짜장.PNG"));
		f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBackground(new Color(250, 128, 114));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("짬뽕을 선택했네요");
				f.setTitle("짬뽕을 선택했네요");
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("D:\\cho83\\day02\\짬뽕.PNG"));
		f.getContentPane().add(btnNewButton_2, BorderLayout.EAST);
		f.setVisible(true);
	}

}
