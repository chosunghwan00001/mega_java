package 연산자;

import java.util.Date;

public class 나이계산2 {

	public static void main(String[] args) {
		int year = 1983;
		
		Date date = new Date();
		int thisYear = date.getYear() + 1900;
		int age = thisYear-year+1;
		
		System.out.println("나이는??" + age);
		
	}

}
