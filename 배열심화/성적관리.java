package 배열심화;

import java.util.Scanner;

public class 성적관리 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = null;
		int sel;
		while (true) {

			System.out.println("---------------------------------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("---------------------------------------------------------------");
			sel = sc.nextInt();

			if (sel == 1) {
				System.out.print("선택값 : " + sel);
				System.out.println();
				System.out.print("학생수입력 : ");
				sel = sc.nextInt();

				num = new int[sel];
			} else if (sel == 2) {
				System.out.println("선택값 : " + sel);
				for (int i = 0; i < num.length; i++) {
					System.out.print("점수입력 : ");
					num[i] = sc.nextInt();
				}

			} else if (sel == 3) {
				System.out.println("선택값 : " + sel);
				for (int i = 0; i < num.length; i++) {
					System.out.println("점수확인 : " + num[i]);
				}
			} else if (sel == 4) {
				System.out.println("선택값 : " + sel);
				int max = num[0];
				double avg = 0;
				for (int i = 0; i < num.length; i++) {
					if (num[i] > max) {
						max = num[i];
					}
					avg = avg + num[i];
				}
				System.out.println("최고점수 : " + max);
				System.out.println("평균점수 : " + (avg / num.length));
			} else {
				break;
			}
		}
		System.out.println("선택값 " + sel);
		System.out.println("프로그램 종료 ");

	}

}
