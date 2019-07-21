package 클래스기본;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class 카운터프로그램 {
	static int  count = 0;
	private static final JTextField t2 = new JTextField();
	private static final JTextField t1 = new JTextField();
	public static void main(String[] args) {
		JLabel result = new JLabel("0");
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(176, 224, 230));
		f.setSize(359, 824);
		f.setTitle("카운터");
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("숫자1");
		f.getContentPane().add(lblNewLabel_1);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel label = new JLabel("숫자2");
		f.getContentPane().add(label);
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\tjsc2-202-05\\Desktop\\계산기.jpg"));
		f.getContentPane().add(lblNewLabel);
		
		JButton button = new JButton("-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("-버튼을 눌렀네요");
				//count--;
				String s1 = t1.getText();
				String s2 = t2.getText();
				int n1 = Integer.parseInt(s1) - Integer.parseInt(s2);
				result.setText(n1+"");
			}
		});
		button.setBackground(Color.PINK);
		button.setFont(new Font("굴림", Font.PLAIN, 99));
		f.getContentPane().add(button);
		
		JButton btnNewButton_1 = new JButton("0");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("0버튼을 눌렀네요");
				//count = 0;
				t1.setText(0+"");
				t2.setText(0+"");
				result.setText(0+"");
			}
		});
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 99));
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("+버튼을 눌렀네요");
//				count++;
				//두수의 값을 가져오기
				//모든 입력값은 모두 string 그래서 	변환해야함
				String s1 = t1.getText();
				String s2 = t2.getText();
				int n1 = Integer.parseInt(s1) + Integer.parseInt(s2);
				result.setText(n1+"");
			}
		});
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 99));
		f.getContentPane().add(btnNewButton);
		
		
		result.setForeground(Color.RED);
		result.setFont(new Font("굴림", Font.PLAIN, 99));
		f.getContentPane().add(result);
		
		f.setVisible(true);
	}

}
