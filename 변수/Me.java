package 변수;

public class Me {

	public static void main(String[] args) {
		byte age; //선언 => 메모리공간 확보
		age = 37; 
		int money = 10;
		double weight = 70;
		float eye = 0.5f;//플롯은 명시적으로 표현해야함
		char gender = '남';
		//String 은 클래스객체, 그래서 대문자 일반 int같은것들은 소문자 키워드
		String name = "조성환";
		
		boolean lunch = true; // false;
		
		System.out.println("내이름은 "+name+ " 입니다.");
		System.out.println("나이 : "+age + "세");
		System.out.println("내 자산 : "+money + "원");
		System.out.println("내 몸무게 : "+weight + "kg");
		System.out.println("내 시력은 : "+eye);
		System.out.println("내 성별은 : "+gender);
		System.out.println("점심은 맛났나요 : "+lunch);

	}

}
