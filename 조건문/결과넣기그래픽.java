package 조건문;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 결과넣기그래픽 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.setTitle("나의 그래픽");
		
		JButton top = new JButton("위버튼");
		JButton middle = new JButton("가운데버튼");
		JButton sub = new JButton("아래버튼");
		
		top.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("탑을 눌렀군요");
				f.setTitle("탑을 눌렀군요");
				sub.setText("탑을 눌렀군요");
			}
		});
		f.getContentPane().add(top, BorderLayout.NORTH);
		
		
		middle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("가운데을 눌렀군요");
				f.setTitle("가운데을 눌렀군요");
				sub.setText("가운데을 눌렀군요");
			}
		});
		
		f.getContentPane().add(middle, BorderLayout.CENTER);
		
		
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("아래을 눌렀군요");
				f.setTitle("아래을 눌렀군요");
				sub.setText("아래을 눌렀군요");
			}
		});
		f.getContentPane().add(sub, BorderLayout.SOUTH);
		f.setVisible(true);
	}

}
