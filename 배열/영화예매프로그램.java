package 배열;

import java.util.Scanner;

public class 영화예매프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] seat = new int[10];
		int data;
		int money = 0;
		

		while (true) {

			System.out.println("---------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println("---------------------");

			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			}
			System.out.println();
			System.out.println("---------------------");
			System.out.print("예매번호입력(종료시-1) >> ");
			data = sc.nextInt();
			if (data == -1) {
				System.out.println("최종 결재금액은 " + money  + "원 입니다.");
				System.out.println("종료합니다..");
				break;
			}

			if (seat[data] == 0) {
				seat[data] = 1;
				System.out.println(data + "번째 자리 예매하였습니다.");
				money = money + 10000;
			} else {
				System.out.println(data + "번째 자리는 예매된 자리입니다. \n다른 자리를 선택해 주세요.");
			}

		}

	}

}
