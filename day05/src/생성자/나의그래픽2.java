package 생성자;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의그래픽2 {
	boolean check = false;

	public 나의그래픽2() {
		JFrame f = new JFrame("나의아이유");
		FlowLayout flow = new FlowLayout();
		ImageIcon icon = new ImageIcon("iu.jpg");
		ImageIcon icon2 = new ImageIcon("su.jpg");
		JButton push = new JButton("나를눌러요");
		JButton img = new JButton();
		JLabel label = new JLabel();
		label.setText("아이유");
		f.getContentPane().add(label);

		f.getContentPane().setLayout(flow);
		f.setSize(800, 800);
		

		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 눌렀군요");
				if (check == false) {
					img.setIcon(icon2);
					check = true;
					label.setText("수지");
				} else {
					img.setIcon(icon);
					check = false;
					label.setText("아이유");
					
				}

			}
		});
		f.getContentPane().add(img);
		f.getContentPane().add(push);
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JLabel result = new JLabel("결과값출력");
		JButton push2 = new JButton("더한결과확인");
		push2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//result.setText(t1.getText() + t2.getText()); 
				result.setText(Integer.parseInt(t1.getText())  + Integer.parseInt(t2.getText()) + "");
			}
		});
		f.getContentPane().add(push2);
		f.getContentPane().add(t1);
		f.getContentPane().add(t2);
		
		f.getContentPane().add(result);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		나의그래픽2 name = new 나의그래픽2();

	}

}
