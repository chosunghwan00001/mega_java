package 정적변수_스태틱;

import javax.swing.JOptionPane;

public class 다이얼로그 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "나는 메시지창");
		
		String age = JOptionPane.showInputDialog("나이입력");
		int agei = Integer.parseInt(age);
		
		//JOptionPane.showMessageDialog(null, agei);
		System.out.println("내 나이는 " + agei);
	}

}
