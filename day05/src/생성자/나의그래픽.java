package 생성자;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class 나의그래픽 {

	public 나의그래픽() {
		JFrame	f = new JFrame("나의그래픽");
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		ImageIcon icon = new ImageIcon("005.png");
		ImageIcon icon2 = new ImageIcon("iu.jpg");
		JButton b1 = new JButton(icon2);
		JButton b2 = new JButton("나도버튼");
		JButton b3 = new JButton("너도버튼");
		JButton b4 = new JButton(icon);
		//add는 f에 올려준다.
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		f.setSize(800, 500);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		나의그래픽 me = new 나의그래픽();
	}

}
