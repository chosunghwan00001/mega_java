package 조건문;

import java.util.Date;
import java.util.Scanner;

public class 조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		int hour = date.getHours();
		if (hour < 11) {
			System.out.println("굿모닝");
		}else if (hour < 15) {
			System.out.println("굿애프터 눈");
		}else if (hour < 20) {
			System.out.println("굿이브닝");
		}else {
			System.out.println("굿나잇");
		}
		
	
		
	}
	
	
	
	
	
	

}
