package 배열심화;

import java.util.Arrays;
import java.util.Scanner;

public class 배열복사 {

	public static void main(String[] args) {
		// 변수복사
		// 각각의 변수가 생성, 복사 가능
		int n1 = 100;
		int n2 = n1;
		System.out.println(n1);
		System.out.println(n2);
		n1 = 200;
		System.out.println(n1);
		System.out.println(n2);

		// 배열복사
		// 주소값 참조
		// 이런 복사를 얕은복사
		int[] n3 = { 1, 2 };
		int[] n4 = n3;
		for (int x : n3) {
			System.out.println(x);
		}
		for (int x : n4) {
			System.out.println(x);
		}
		n3[0] = 99;
		for (int x : n3) {
			System.out.println(x);
		}
		for (int x : n4) {
			System.out.println(x);
		}
		
		//깊은복사. 메서드 있음
		System.out.println("---------------------------------------------");
		int [] n5 = {1,2};
		int [] n6 = n5.clone();//깊은복사 메서드
		
		for (int x : n5) {
			System.out.println(x);
		}
		for (int x : n6) {
			System.out.println(x);
		}
		n5[0] = 99;
		for (int x : n5) {
			System.out.println(x);
		}
		for (int x : n6) {
			System.out.println(x);
		}
		System.out.println("---------------------------------------------");
		//배열정렬
		int[] n7 = {1,5,9,7,6,8,3};
		Arrays.sort(n7);
		for (int x : n7) {
			System.out.println(x);
		}
		
		
		
		
		
	}

}
