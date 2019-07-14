package 조건문;

import java.util.Date;

public class 조건문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//컨트롤+쉬프트+영문o   잘못된 임포트문 되면 임포트문 지우고 해당 명령어 실행
		Date date = new Date();
		int hour = date.getHours();
		
		if (hour <= 12) {
			System.out.println("오전");
		} else {
			System.out.println("오후");
		}
	}

}
