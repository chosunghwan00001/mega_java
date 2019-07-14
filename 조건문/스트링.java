package 조건문;

import java.util.Scanner;

public class 스트링 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "java";
		String s2 = "python";
		
		
		if (s1.equals(s2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		System.out.print("문자열 두개 입력(띄어쓰기로) : ");
		Scanner sc = new Scanner(System.in);
		String data1 = sc.next();
		String data2 = sc.next();
		
		if (data1.equals(data2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		System.out.print("인생 좌우명 입력 : ");
		sc.nextLine();//이게 필요한 이유는? 위에서 입력한 엔터값을 없애기 위해서, 위 엔터값을 해당줄에서 처리함
		String life = sc.nextLine();
		System.out.println(life);
		
		
		
		
				
		
		
	}

}
