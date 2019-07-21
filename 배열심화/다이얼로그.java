package 배열심화;

import javax.swing.JOptionPane;

public class 다이얼로그 {

	public static void main(String[] args) {
		String data1 = "";
		String data2 = "";
		data1 = JOptionPane.showInputDialog("숫자1 입력");
		data2 = JOptionPane.showInputDialog("숫자2 입력");
		int sum = Integer.parseInt(data1) + Integer.parseInt(data2);
		System.out.println("합 " + sum + " 입니다.");
		JOptionPane.showMessageDialog(null, "두수의 합은 " + sum);
	}

}
