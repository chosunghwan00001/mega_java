package 조건문;

import java.util.Scanner;

public class 로또번호발생기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//일괄주석및일괄주석풀기 컨트롤+/
//		Scanner sc = new Scanner(System.in);
//		System.out.print("주민번호 입력(-제외)  >> ");
//		String sn = sc.next();
//		//charAt(위치값) : string 에서 char 1글자 추출
//		char gender =sn.charAt(6);//제로베이스 0부터 숫자시작
//		System.out.println(gender);
//		
//		switch (gender) {
//		case '1':
//		case '3':
//			System.out.println('남');	
//			break;
//		case '2':
//		case '4':
//			System.out.println('여');
//			break;
//		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성적입력  >> ");
		String sn = sc.next();
		//charAt(위치값) : string 에서 char 1글자 추출
		char data =sn.charAt(0);//제로베이스 0부터 숫자시작
		System.out.println(data);
		
		//switch문으로는 소수점 불가
		switch (data) {
		case 'A':
			System.out.println("취우수입니다.");
			break;
		case 'B':
			System.out.println("우수입니다.");
			break;
		case 'C':
			System.out.println("보통입니다.");
			break;
		default :
			System.out.println("통과하지 못했습니다.");
			break;
		}
		
		sc.close();
		
		
		
		
		
	}

}
