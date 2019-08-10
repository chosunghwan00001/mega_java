package 스레드;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 자동차경주게임3 extends JFrame {
	public 자동차경주게임3() {
		setTitle("자동차경주게임");
		setSize(600,200);
		setLayout(null);
		setVisible(true);
		
		CarThread c1 = new CarThread("car1.gif", 100, 0);
		CarThread c2 = new CarThread("car2.gif", 100, 50);
		CarThread c3 = new CarThread("car3.gif", 100, 100);
		
		c1.start();
		c2.start();
		c3.start();
	}
	public static void main(String[] args) {

		자동차경주게임3 name = new 자동차경주게임3();
	}

}
