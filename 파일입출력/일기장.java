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
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class 일기장 {
	private JTextField t1;
	private JTextField t2;

	public 일기장() {
		JFrame f = new JFrame("나의일기장 작성화면");
		f.getContentPane().setBackground(Color.PINK);
		f.setSize(441, 540);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label = new JLabel("<<<일기작성날짜>>>");
		f.getContentPane().add(label);
		
		t1 = new JTextField();
		t1.setBackground(Color.CYAN);
		f.getContentPane().add(t1);
		t1.setColumns(20);
		
		JLabel label_1 = new JLabel("<<<일기작성제목>>>");
		f.getContentPane().add(label_1);
		
		t2 = new JTextField();
		t2.setBackground(Color.CYAN);
		t2.setColumns(20);
		f.getContentPane().add(t2);
		
		JLabel lblNewLabel = new JLabel("<<<일기작성내용>>>");
		f.getContentPane().add(lblNewLabel);
		
		JTextArea t3 = new JTextArea();
		t3.setBackground(Color.CYAN);
		t3.setColumns(30);
		t3.setRows(10);
		f.getContentPane().add(t3);
		
		JButton btnNewButton = new JButton("파일에 저장하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();//날짜
				String s2 = t2.getText();//제목
				String s3 = t3.getText();//내용
				FileWriter file;
				try {
					
					file = new FileWriter("ddd.txt");
					file.write("날짜 : " + s1 + "\n");
					file.write("제목 : " + s2 + "\n");
					file.write("내용 : \n");
					file.write(s3);
					file.close();
					JOptionPane.showMessageDialog(null, "파일이 저장되었습니다.");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		btnNewButton.setForeground(Color.ORANGE);
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 36));
		f.getContentPane().add(btnNewButton);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		일기장 name = new 일기장();
	}

}
