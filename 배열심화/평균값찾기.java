package 배열심화;

import java.util.Scanner;

public class 평균값찾기 {

	public static void main(String[] args) {
		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);
		double avg = 0;
		for (int i = 0; i < num.length; i++) {
			System.out.print("성적을 입력하세요 >>  ");
			num[i] = sc.nextInt();
			avg = avg + num[i];
		}
		System.out.println("학생들의 평균값은? " + (avg/num.length));

	}

}
