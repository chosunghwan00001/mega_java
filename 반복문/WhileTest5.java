package 반복문;

import java.util.Scanner;

public class WhileTest5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int data;
		while(true) {
			System.out.print("숫자입력(종료시 0 입력) : ");
			data = sc.nextInt();
			if (data == 0) {
				System.out.println("프로그램 종료 ");
				break;//반복문종료
			}
			System.out.println("확인 : " + data);
			//sum에다가 입력값 계속 더해보세요
			//여기까지의 sum값을 출력
			sum = sum + data;
			System.out.println("더한값 : " + sum);
		}
		System.out.println("최종합 : " + sum);
		
	}

}
