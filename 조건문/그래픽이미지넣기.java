package 조건문;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class 그래픽이미지넣기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(1800, 800);
		f.setTitle("그래픽이미지넣기");
		
		JButton btnNewButton = new JButton("이미지넣기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("가위를 눌렀군요");
				Random r = new Random();
				//System.out.println(r.nextInt(3));// 0~2까지 발생
				//0:가위, 1:바위, 2:보
				int computer = r.nextInt(3);
				if (computer == 0) {
					System.out.println("무승부");	
				}else if (computer == 1) {
					System.out.println("컴퓨터승");
				}
				else {
					System.out.println("내가 승");
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\cho83\\day02\\가위.png"));
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("바위");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("바위를 눌렀군요");
				Random r = new Random();
				//System.out.println(r.nextInt(3));// 0~2까지 발생
				//0:가위, 1:바위, 2:보
				int computer = r.nextInt(3);
				if (computer == 0) {
					System.out.println("내가 승");	
				}else if (computer == 1) {
					System.out.println("무승부");
				}
				else {
					System.out.println("컴퓨터 승");
				}
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("D:\\cho83\\day02\\바위.png"));
		f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("보");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("보자기를 눌렀군요");
				Random r = new Random();
				//System.out.println(r.nextInt(3));// 0~2까지 발생
				//0:가위, 1:바위, 2:보
				int computer = r.nextInt(3);
				if (computer == 0) {
					System.out.println("컴퓨터 승");	
				}else if (computer == 1) {
					System.out.println("내가 승");
				}
				else {
					System.out.println("무승부");
				}
			
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("D:\\cho83\\day02\\보자기.png"));
		f.getContentPane().add(btnNewButton_2, BorderLayout.EAST);
		f.setVisible(true);
	}

}
