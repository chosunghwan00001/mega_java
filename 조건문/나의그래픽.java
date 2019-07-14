package 조건문;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의그래픽 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.setTitle("나의 첫 그래픽");
		
		JButton btnNewButton = new JButton("나를 눌러줘");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("가운데 버튼을 눌렀군요");
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 255));
		btnNewButton.setBackground(new Color(255, 255, 0));
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 25));
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("위에있는버튼");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("위에있는 버튼을 눌렀군요");
			}
		});
		btnNewButton_1.setBackground(new Color(255, 222, 173));
		btnNewButton_1.setForeground(new Color(0, 128, 0));
		btnNewButton_1.setFont(new Font("가는안상수체", Font.BOLD, 20));
		f.getContentPane().add(btnNewButton_1, BorderLayout.NORTH);
		
		JButton btnNewButton_2 = new JButton("왼쪽버튼");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBackground(new Color(255, 0, 0));
		btnNewButton_2.setForeground(new Color(0, 0, 128));
		btnNewButton_2.setFont(new Font("가는안상수체", Font.BOLD, 20));
		f.getContentPane().add(btnNewButton_2, BorderLayout.WEST);
		
		JButton btnNewButton_3 = new JButton("오른쪽버튼");
		btnNewButton_3.setBackground(new Color(0, 255, 0));
		btnNewButton_3.setForeground(new Color(139, 0, 0));
		btnNewButton_3.setFont(new Font("가는안상수체", Font.BOLD, 20));
		f.getContentPane().add(btnNewButton_3, BorderLayout.EAST);
		
		JButton btnNewButton_4 = new JButton("아래있는버튼");
		btnNewButton_4.setBackground(new Color(0, 255, 255));
		btnNewButton_4.setForeground(new Color(255, 165, 0));
		btnNewButton_4.setFont(new Font("가는안상수체", Font.BOLD, 20));
		f.getContentPane().add(btnNewButton_4, BorderLayout.SOUTH);
		f.setVisible(true);
		
	}

}
