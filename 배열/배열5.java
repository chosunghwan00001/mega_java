package 배열;

import java.util.Scanner;

public class 배열5 {

	public static void main(String[] args) {

		int[] jumsu = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < jumsu.length; i++) {
			System.out.print("점수입력 >> ");
			int data = sc.nextInt();
			jumsu[i] = data;
			
		}
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(jumsu[i]);
		}
		

	}

}
