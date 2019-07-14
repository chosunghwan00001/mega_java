package 순차문;

import java.util.Scanner;

public class 기본입력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.print("프로그램 이름 입력하세요 : ");
		String data;// = sc.next();		
		//System.out.println("입력값 : " + data);
		String name;
		String id;
		String pw;
		String tel;
		
		System.out.println("==================");
		System.out.println("회원가입 정보");
		System.out.println("-------------------------------");
		System.out.print("이름 : ");
		data = sc.next();
		name = data; 
		System.out.print("아이디 : ");
		data = sc.next();
		id = data;
		System.out.print("비번 : ");
		data = sc.next();
		pw = data;
		System.out.print("연락처 : ");
		data = sc.next();
		tel = data;
		System.out.println("-------------------------------");
		System.out.println(name + ", " + id + ", "+ pw + ", " + tel);
		
		
		
	}

}
