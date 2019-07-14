package 조건문;

import java.util.Scanner;

public class 조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("실적을 입력하세요 : ");
		int num = 1000;//실적목표금액
		Scanner sc = new Scanner(System.in);
		int num2 = sc.nextInt();
		
		if (num2 > num) {
			System.out.println("축하!!! 실적달성");
			double bonus = num2 * 0.2;
			System.out.println("당신의 보너스는 " + (int)bonus + "만원 입니다.");
			
		} else {
			System.out.println("안타깝네요!!! 실적 미달성");
		}
		sc.close();
	}

}
