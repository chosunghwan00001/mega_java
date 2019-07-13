package 연산자;

import java.util.Date;

public class 날짜부품 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		
		int hour  = date.getHours();
		int min  = date.getMinutes();
		int sec  = date.getSeconds();
		System.out.println("현재시간은? " + hour + "시" + min + "분" +  sec + "초");
		
		int year = date.getYear() + 1900;
		int month = date.getMonth() + 1;
		int day = date.getDay();
		
		System.out.println("현재년도? " + year);
		System.out.println("현재달? " + month);
		System.out.println("현재일? " + day);

	}

}
