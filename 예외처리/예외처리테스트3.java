package 예외처리;

public class 예외처리테스트3 {

	public static void main(String[] args) {
		try {
			//에러가 발생할 것 같은 코드
			int num1 = 4;
			int num2 = 0;
			int num3 = num1/num2;
			
		} catch (Exception e) {
			// 에러처리내용코드
			e.printStackTrace();
			System.out.println("에러발생");
		}

		System.out.println("에러처리를 마침");
	}

}
