package 연산자;

import java.util.Date;

public class 집에갈시간 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		int hour = date.getHours();
		System.out.println("현재 시각은 " + hour);
		
		if(hour < 16){//true
			System.out.println("집에 갈 시간이 아닙니다.");	
		}else{//false
			System.out.println("곧 집에 갈 시간 입니다. ");
		}

	}

}
