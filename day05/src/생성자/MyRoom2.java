package 생성자;

public class MyRoom2 {

	public static void main(String[] args) {
		//멤버변수값을 객체생성시 자동으로 넣고 싶으면 생성자 메서드 사용
		//클래스 이름과 동일하게 만들면 자동 호출
		Tv tv1 = new Tv(100, 10, true);
		Tv tv2 = new Tv(200, 5, false);
//		System.out.println(tv1.ch);
//		System.out.println(tv1.volume);
//		System.out.println(tv1.onOff);
//		
//		System.out.println(tv2.ch);
//		System.out.println(tv2.volume);
//		System.out.println(tv2.onOff);

		// 재정의 후 찍어보면 의미없는 주소값 없어짐
		// 그리고 위에서 하나하나 찍어보지 않아도 아래처럼 하면 값 다 나온다.
		// 멤버변수값을 프린트하고 싶으면 toString()메서드를 재정의하면 된다.
		System.out.println(tv1);
		System.out.println(tv2);

	}

}
