package 예외처리;

public class 예외처리테스트2 {

	public static void main(String[] args) {
		try {
//에러가 발생할 것 같은 코드
			int[] num = { 1, 2 };
			num[2] = 3;
		} catch (Exception e) {
			// 에러처리내용코드
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("에러발생");
		}

		System.out.println("내가실행될까요");
	}

}
