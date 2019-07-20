package 반복문;

import java.util.Random;
import java.util.Scanner;

public class 예금출금문제 {

	public static void main(String[] args) {
		// 1:예금, 2:출금, 3:잔고, 4:잔고
		// 화면만들기
		Scanner sc = new Scanner(System.in);
		int money = 0;
		int data;
		int money_data;
		while (true) {
			System.out.println("------------------------------------------- ");
			System.out.println("1:예금, 2:출금, 3:잔고, 4:종료");
			System.out.println("------------------------------------------- ");
			System.out.print("선택 >> ");
			data = sc.nextInt();
			if (data == 1) {
				System.out.print("예금액 >> ");
				money_data = sc.nextInt();
				money = money + money_data;
				System.out.println("현재금액 >> " + money + "원");
			} else if (data == 2) {
				System.out.print("출금액 >> ");
				money_data = sc.nextInt();
				money = money - money_data;
				System.out.println("현재금액 >> " + money + "원");
			} else if (data == 3) {
				System.out.println("잔고확인 >> " + money + "원");
			} else {
				System.out.println("종료합니다.");
				break;
			}

		}
		System.out.print("최종잔고 >> " + money + "원");

	}

}
