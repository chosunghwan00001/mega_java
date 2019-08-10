package 파일입출력;

import java.awt.Color;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 네이버크롤링4 {
	private JTextField code;
	
	public 네이버크롤링4() {
		// TODO Auto-generated constructor stub
		JFrame f = new JFrame("나의주식");
		
		f.setSize(496,794);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JTextArea result = new JTextArea();
		result.setFont(new Font("Monospaced", Font.PLAIN, 20));
		result.setColumns(20);
		result.setRows(5);
		JButton btnNewButton = new JButton("모나미");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Document doc;
				try {
					doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=005360").get();
					Elements el =  doc.select("span.blind");
					String today = el.get(12).text();
					String yesterday = el.get(15).text();
					String high = el.get(16).text();
					result.setText("");
					result.append("오늘 : " + today + "\n");
					result.append("어제 : " + yesterday + "\n");
					result.append("고가 : " + high + "\n");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 70));
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("삼성전자");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Document doc;
				try {
					doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=005930").get();
					Elements el =  doc.select("span.blind");
					String today = el.get(12).text();
					String yesterday = el.get(15).text();
					String high = el.get(16).text();
					result.setText("");
					result.append("오늘 : " + today + "\n");
					result.append("어제 : " + yesterday + "\n");
					result.append("고가 : " + high + "\n");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		});
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 70));
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("셀트리온");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Document doc;
				try {
					doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=068270").get();
					Elements el =  doc.select("span.blind");
					String today = el.get(12).text();
					String yesterday = el.get(15).text();
					String high = el.get(16).text();
					result.setText("");
					result.append("오늘 : " + today + "\n");
					result.append("어제 : " + yesterday + "\n");
					result.append("고가 : " + high + "\n");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 70));
		f.getContentPane().add(btnNewButton_2);
		
		JLabel lblCode = new JLabel("code");
		lblCode.setFont(new Font("굴림", Font.PLAIN, 70));
		f.getContentPane().add(lblCode);
		
		code = new JTextField();
		code.setFont(new Font("굴림", Font.PLAIN, 25));
		f.getContentPane().add(code);
		code.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("크롤링시작");
		btnNewButton_3.setFont(new Font("굴림", Font.PLAIN, 57));
		f.getContentPane().add(btnNewButton_3);
		
		
		f.getContentPane().add(result);
		f.setVisible(true);
		
	}

	public static void main(String[] args) throws Exception {
		
		
		네이버크롤링4 name = new 네이버크롤링4();		
		
	}

}
