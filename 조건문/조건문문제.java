package 조건문;

import java.util.Scanner;

public class 조건문문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp = "-----------------------------";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문제1 ");
		System.out.println(temp);
		System.out.print("오늘의 기온은? ");
		String data1 = sc.next();
		System.out.print("오늘 나의 평가는? ");
		String data2 = sc.next();
		System.out.print("오늘 나의 신발 사이즈는? ");
		String data3 = sc.next();
		System.out.println(temp);
		System.out.println("오늘은 " + data1 + "도, 나의 평가는 " + data2 + ", 신발 사이즈는 " + data3 );
		
		System.out.println();
		System.out.println("문제2 ");
		System.out.println("두 수를 입력받아 같은지 비교하여 같으면 '두 수가 같습니다.' 다르면 '두 수가 다릅니다.' 출력하기");
		System.out.print("첫번째 수 입력 >>  ");
		int data4 = sc.nextInt();
		System.out.print("두번째 수 입력 >>  ");
		int data5 = sc.nextInt();
		
		if (data4 == data5 ) {
			System.out.println("두 수가 같습니다.");	
		} else {
			System.out.println("두 수가 다릅니다.");
		}
		
		System.out.println();
		System.out.println("문제3");
		System.out.println("다음의 영수증을 출력하세요(부가세는 10%)");
		System.out.print("받은돈 입력 >>  ");
		int data6 = sc.nextInt();
		System.out.print("상품의 총액 >>  ");
		int data7 = sc.nextInt();
		double data8 = data7 * 0.1;
		System.out.println("부가세 >>  " + (int)data8 + "원");
		System.out.print("잔돈 >>  " + (data6 - data7) + "원");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
