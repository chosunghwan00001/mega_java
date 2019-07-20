package 반복문;

import java.util.Random;
import java.util.Scanner;

public class WhileTest6 {

	public static void main(String[] args) {
		// 컨트롤+쉬프트+F = 코드정렬
		Scanner sc = new Scanner(System.in);
		// int target = 50;
		Random r = new Random();
		int target = r.nextInt(100);
		int data;
		int cnt = 0;
		while (true) {
			System.out.print("숫자입력(정답일때) : ");
			data = sc.nextInt();
			cnt++;
			if (data == target) {
				System.out.println("축하합니다. 정답입니다. ");
				break;// 반복문종료
			} else {
				System.out.println("정답이 아닙니다. 다시 입력해 주세요 : " + data);
				if (data > target) {
					System.out.println("너무 큽니다.");
				} else {
					System.out.println("너무 작습니다.");
				}
			}

		}
		System.out.println("정답은 : " + target);
		System.out.println("몇번째에 맞췄나요: " + cnt);
		System.out.println("실패한 횟수: " + (cnt - 1));

	}

}
