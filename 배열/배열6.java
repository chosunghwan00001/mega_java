package 배열;

import java.util.Scanner;

public class 배열6 {

	public static void main(String[] args) {

		int[] jumsu = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < jumsu.length; i++) {
			System.out.print("영어점수입력 >> ");
			int data = sc.nextInt();
			jumsu[i] = data;
			
		}
		for (int i = 0; i < jumsu.length; i++) {
			if (i == 2) {
				System.out.println("컨닝 : 0점처리");	
			} else {
				System.out.println(jumsu[i] + "점");
			}
			
		}
		

	}

}
