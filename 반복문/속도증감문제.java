package 반복문;

import java.util.Random;
import java.util.Scanner;

public class 속도증감문제 {

	public static void main(String[] args) {
		// 1:증속, 2:감속, 3:종료
		// 화면만들기
		Scanner sc = new Scanner(System.in);
		int sum = 100;
		int data;
		while (true) {
			System.out.println("------------------------------------------- ");
			System.out.println("1:증속, 2:감속, 3:중지");
			System.out.println("------------------------------------------- ");
			System.out.print("선택 >> ");
			data = sc.nextInt();
			if (data == 1) {
				sum = sum + 1;
				System.out.println("현재속도 >> " + sum);
			} else if (data == 2) {
				sum = sum - 1;
				System.out.println("현재속도 >> " + sum);
			} else {
				System.out.println("종료합니다.");
				break;
			}

		}
		System.out.print("최종속도 >> " + sum);

	}

}
