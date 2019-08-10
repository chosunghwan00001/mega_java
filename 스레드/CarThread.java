package 스레드;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CarThread extends Thread {
	int x, y;
	ImageIcon icon;
	JLabel label;

	public CarThread(String file, int x, int y) {

		this.x = x;
		this.y = y;
		label = new JLabel();
		icon = new ImageIcon(file);
		label.setIcon(icon);
		label.setBounds(x, y, 100, 100);
		add(label);
	}

	Random r = new Random();

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			label.setBounds(x, 50, 100, 100);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
