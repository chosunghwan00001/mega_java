package 파일입출력;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 일기장로그인 {
	private JTextField t1;
	private JTextField t2;
	public 일기장로그인() {
	JFrame f = new JFrame("나의일기장");
	f.getContentPane().setBackground(Color.PINK);
	f.setSize(496,794);
	f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	
	JLabel label = new JLabel("");
	label.setIcon(new ImageIcon("C:\\Users\\tjsc2-202-05\\Desktop\\일기장.jpg"));
	f.getContentPane().add(label);
	
	JLabel lblId = new JLabel("id입력");
	lblId.setFont(new Font("Dialog", Font.BOLD, 12));
	f.getContentPane().add(lblId);
	
	t1 = new JTextField();
	t1.setBackground(Color.GREEN);
	f.getContentPane().add(t1);
	t1.setColumns(10);
	
	JLabel lblNewLabel = new JLabel("pw입력");
	lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 12));
	f.getContentPane().add(lblNewLabel);
	
	t2 = new JTextField();
	t2.setBackground(Color.GREEN);
	f.getContentPane().add(t2);
	t2.setColumns(10);
	
	JButton btnNewButton = new JButton("로그인처리");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String s1 = t1.getText();//아이디
			String s2 = t2.getText();//패스워드
			System.out.println(s1 + "/" + s2);
			
			String id = "root";
			String pw = "1234";
			
			if (id.equals(s1) && pw.equals(s2)) {
				System.out.println("로그인ok");
				일기장 diary = new 일기장();
			} else {
				System.out.println("로그인not");
				JOptionPane.showMessageDialog(null, "다시로그인해주세요");
				t1.setText("");
				t2.setText("");
				
			}
			
			
		}
	});
	btnNewButton.setBackground(Color.YELLOW);
	btnNewButton.setForeground(Color.BLUE);
	btnNewButton.setFont(new Font("Dialog", Font.BOLD, 40));
	f.getContentPane().add(btnNewButton);
	f.setVisible(true);
	}

	public static void main(String[] args) {
		일기장로그인 name = new 일기장로그인();
	}

}
