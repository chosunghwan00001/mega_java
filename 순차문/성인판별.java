package 순차문;

import java.io.ObjectInputStream.GetField;
import java.util.Date;
import java.util.Scanner;

public class 성인판별 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		int thisYear = date.getYear() + 1900;
		System.out.print("태어난 해 입력 >>> ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int age = thisYear - year + 1;
		System.out.println("당신의 나이는 " + age + "살");
		
		if (age >= 18) {
			System.out.println("성인");	
		} else {
			System.out.println("미성인");
		}
	}

}
