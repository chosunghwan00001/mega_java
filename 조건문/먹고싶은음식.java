package 조건문;

import java.util.Scanner;

public class 먹고싶은음식 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp = "-----------------------------";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("먹고 싶은 음식 선택하세요.");
		System.out.print("1)짬뽕, 2)짜장, 3)우동, 4)기타  : ");
		int food = sc.nextInt();
		
		
		switch (food) {
		case 1:
			System.out.println("짬뽕먹어요");
			break;
		case 2:
			System.out.println("짜장먹어요");
			break;
		case 3:
			System.out.println("우동먹어요");
			break;
		default:
			System.out.println("안먹어요");
			break;
		}
		
		System.out.println("가고 싶은 음식점을 입력 하세요.");
		System.out.print("분식, 한식, 일식  >>>  ");
		String inputData = sc.next();
		
		switch (inputData) {
		case "분식":
			System.out.println(inputData + "집으로");
			break;
		case "한식":
			System.out.println(inputData + "집으로");
			break;
		case "일식":
			System.out.println(inputData + "집으로");
			break;
		default:
			System.out.println("집에서");
			break;
		}
		
		
	}

}
