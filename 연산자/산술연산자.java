package 연산자;

public class 산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 200;
		int num2 = 100;
		
		//컨트롤+알트+화살표아래 = 복사
		//알트+화살표 : 이동

		//비교연산결과 boolean
		//논리형
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		System.out.println(num1 > num2);

		//사칙연산
		System.out.println("더하기 : " + (num1 + num2));
		System.out.println("빼기 : " + (num1 - num2));
		System.out.println("곱하기 : " + (num1 * num2));
		System.out.println("나누기 : " + (num1 / num2));
		System.out.println("나머지 : " + (num1 % num2));
		
	}

}

