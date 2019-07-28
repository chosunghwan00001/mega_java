package 정적변수_스태틱;

public class 상수테스트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 상수선언 -> 변경 불가
		final int PRICE = 5000; //상수는 대문자로 암묵적인 약속, 가독성 업

		int num = 100;

		// price = 6000;//에러
		num = 200;

	}

}
