package 생성자;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Movie {

	boolean check = false;

	public Movie() {
		JFrame f = new JFrame("나의 영화 앨범");

		FlowLayout flow = new FlowLayout();
		ImageIcon icon = new ImageIcon("라이온킹.jpg");
		ImageIcon icon2 = new ImageIcon("알라딘.jpg");
		ImageIcon icon3 = new ImageIcon("엑시트.jpg");
		JButton m0 = new JButton();
		m0.setIcon(icon);
		JButton m1 = new JButton("라이언킹");
		m1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m0.setIcon(icon);
			}
		});
		JButton m2 = new JButton("알라딘");
		m2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m0.setIcon(icon2);
			}
		});
		JButton m3 = new JButton("엑시트");
		m3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m0.setIcon(icon3);
			}
		});

		f.getContentPane().setLayout(flow);
		f.setSize(270, 400);
		f.getContentPane().add(m0);
		f.getContentPane().add(m1);
		f.getContentPane().add(m2);
		f.getContentPane().add(m3);

		f.setVisible(true);
	}

	public static void main(String[] args) {
		Movie name = new Movie();
	}

}
