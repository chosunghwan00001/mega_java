package 정적변수_스태틱;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class 딸용돈3 {
	// int num;

	// 스태틱 없이 사용하기 위해 꼼수, 스태틱 많으면 메모리 폭발
	public 딸용돈3() {
		JFrame f = new JFrame("딸용돈그래픽");
		JLabel l1 = new JLabel("딸 이름 : ");
		l1.setFont(new Font("굴림", Font.PLAIN, 22));
		JLabel l2 = new JLabel("딸 나이 : ");
		l2.setFont(new Font("굴림", Font.PLAIN, 22));
		JLabel l3 = new JLabel("아빠 지갑 잔액 : ");
		JLabel l4 = new JLabel("홍길동 용돈 : ");
		l4.setFont(new Font("굴림", Font.PLAIN, 23));
		JLabel l5 = new JLabel("홍길순 용돈 : ");
		l5.setFont(new Font("굴림", Font.PLAIN, 23));
		l3.setFont(new Font("굴림", Font.PLAIN, 22));
		JTextField name = new JTextField(10);
		name.setFont(new Font("굴림", Font.PLAIN, 22));
		JTextField age = new JTextField(10);
		age.setFont(new Font("굴림", Font.PLAIN, 22));
		JButton daddy = new JButton("아빠 돈 주세요");
		JTextArea list = new JTextArea(10, 10);
		JTextArea list1 = new JTextArea(10, 10);
		list.setFont(new Font("Monospaced", Font.PLAIN, 22));
		list1.setFont(new Font("Monospaced", Font.PLAIN, 22));

		daddy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = name.getText();
				String s2 = age.getText();
				int agei = Integer.parseInt(s2);
				딸 딸1 = new 딸(s1, agei);
				int result = 딸.wallet;
				l3.setText("아빠잔액 : " + result + "");
				// l4.setText("홍길동 용돈 : " + (딸.dongCount * 1000) + "");
				// l5.setText("홍길순 용돈 : " + (딸.soonCount * 1000) + "");

				list.append(딸1 + "\n");
				list1.append("홍길동" + (딸.dongCount * 1000) + "\n");
				list1.append("홍길순" + (딸.soonCount * 1000) + "\n");
				list1.append("----------------------------- \n");
				// JOptionPane.showMessageDialog(null, 딸1);

				try {
					FileWriter file = new FileWriter("c:/temp/" + s1 + ".txt");
					file.write(s1 + "\n");
					file.write(s2 + "\n");
					file.close();
				} catch (Exception e2) {
					
				}

			}
		});
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		f.getContentPane().add(l1);
		f.getContentPane().add(name);
		f.getContentPane().add(l2);
		f.getContentPane().add(age);
		f.getContentPane().add(daddy);
		f.getContentPane().add(l3);
		// f.getContentPane().add(l4);
		// f.getContentPane().add(l5);
		f.getContentPane().add(list);
		f.getContentPane().add(list1);

		f.setSize(400, 1000);
		f.setVisible(true);

		// System.out.println(num); 출력가능

	}

	public static void main(String[] args) {
		딸용돈3 name = new 딸용돈3();// 스태틱 없이 사용하기 위해 꼼수, 스태틱 많으면 메모리 폭발
		// System.out.println(num); 출력불가능
	}

}
