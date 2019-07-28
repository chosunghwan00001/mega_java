package 생성자;

import java.util.Scanner;

public class 은행시스템 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Account a = null;

		while (true) {
			System.out.println("--------------------------------------------");
			System.out.println("1:계좌생성|2:계좌목록|3:예금|4:출금|5:종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택  >>  ");

			int input = sc.nextInt();

			if (input == 1) {// 계좌생성
				System.out.println("----------------------");
				System.out.println("계좌생성");
				System.out.println("----------------------");
				System.out.print("계좌번호 : ");
				String d1 = sc.next();
				System.out.print("계좌주 : ");
				String d2 = sc.next();
				System.out.print("초기입금액 : ");
				int d3 = sc.nextInt();

				a = new Account(d1, d2, d3);
				System.out.println("결과 : 계좌가 생성 되었습니다.");

			} else if (input == 2) {// 계좌목록
				System.out.println("----------------------");
				System.out.println("계좌목록");
				System.out.println("----------------------");
				System.out.println(a);

			} else if (input == 3) {// 예금
				System.out.println("----------------------");
				System.out.println("예금");
				System.out.println("----------------------");
				System.out.print("계좌번호 : ");
				String d1 = sc.next();
				System.out.print("입금액 : ");
				int d3 = sc.nextInt();
				a.total = a.total + d3;
				a = new Account(d1, a.total);
				
				System.out.print("현재금액 : " + a.total);
				
				
				

			} else if (input == 4) {// 출금
				System.out.println("----------------------");
				System.out.println("출금");
				System.out.println("----------------------");
				System.out.print("계좌번호 : ");
				String d1 = sc.next();
				System.out.print("출금액 : ");
				int d3 = sc.nextInt();
				a.total = a.total - d3;
				a = new Account(d1, a.total);
			} else {
				// 5일때
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}

	}
}
