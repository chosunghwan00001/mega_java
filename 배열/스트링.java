package 배열;

public class 스트링 {

	public static void main(String[] args) {
		//스트링은 기본형 데이터가 아니다.
		//스트링 비교는 부품이 제공하는 명령어를 따로 사용한다
		
		String id = "root";
		String input = "root";
		String PW = "1234";
		
		System.out.println(id.equals(input));
		System.out.println(id.equals(PW));
	}

}
