package 상속;

import javax.swing.JFrame;

public class 나의윈도우2 extends JFrame {// 제이프레임 상속, 그럼 new 키워드 필요없음
	public 나의윈도우2() {
		setSize(100, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		나의윈도우2 name = new 나의윈도우2();
	}

}
