package 생성자;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 나의중국집 {
	int cnt = 0;
	int cnt1 = 0;
	int cnt2 = 0;
	public 나의중국집() {
		JFrame f = new JFrame("나의 영화 앨범");
		FlowLayout flow = new FlowLayout();
		ImageIcon icon = new ImageIcon("짬뽕.png");
		ImageIcon icon2 = new ImageIcon("우동.png");
		ImageIcon icon3 = new ImageIcon("짜장.png");
		JButton m0 = new JButton("짬뽕");
		JButton m1 = new JButton("우동");
		JButton m2 = new JButton("짜장면");
		JButton m3 = new JButton();
		JLabel count = new JLabel("개수");
		JLabel Total = new JLabel("더한 결과값");
		JLabel TotalText = new JLabel();
		JTextField t1 = new JTextField(10);
		
		
		m0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m3.setIcon(icon);
				cnt = cnt + 1;
				t1.setText(cnt + "");
				int sum = 5000 * cnt;
				TotalText.setText(sum+"");
			}
		});

		m1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m3.setIcon(icon2);
				cnt1 = cnt1 + 1;
				t1.setText(cnt1 + "");
				int sum = 5000 * cnt1;
				TotalText.setText(sum+"");
			}
		});

		m2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m3.setIcon(icon3);
				cnt2 = cnt2 + 1;
				t1.setText(cnt2 + "");
				int sum = 5000 * cnt2;
				TotalText.setText(sum+"");
			}
		});
		

		f.getContentPane().setLayout(flow);
		f.setSize(400,400);
		f.getContentPane().add(m0);
		f.getContentPane().add(m1);
		f.getContentPane().add(m2);
		f.getContentPane().add(count);
		f.getContentPane().add(t1);
		f.getContentPane().add(m3);
		m3.setIcon(icon);
		f.getContentPane().add(Total);
		f.getContentPane().add(TotalText);

		f.setVisible(true);
	}

	public static void main(String[] args) {

		나의중국집 china = new 나의중국집();
		
		
	}

}
