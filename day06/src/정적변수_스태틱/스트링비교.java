package 정적변수_스태틱;

import javax.swing.JOptionPane;

public class 스트링비교 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("입력");
		int dongCount = 0;
		int soonCount = 0;

		if (name.equals("홍길동")) {
			dongCount++;
		} else if (name.equals("홍길순")) {
			soonCount++;
		}else {
			System.out.println("해당 이름이 없습니다.");
			
		}

	}

}
