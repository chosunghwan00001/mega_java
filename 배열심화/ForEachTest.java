package 배열심화;

public class ForEachTest {

	public static void main(String[] args) {
		int[] num = { 10, 20, 30, 40, 50 };
		System.out.println("첫번째 num: " + num[0]);
		System.out.println("배열의 개수: " + num.length);
		System.out.println("맨마지막 num: " + num[num.length - 1]);
		
		//여기i는 인덱스(위치값)
		for (int i = 0; i < num.length; i++) {
			System.out.println((i) + "번째 num: " + num[i]);
		}
		
		//여기i는 int라는 값, 변수명은 변경 가능
		//웹에서 많이 사용, 알아두기
		for (int i : num) {
			System.out.println(i);
		}
		
		String [] names = {"홍길동","김길동","고길동"};
		for (int i = 0; i < names.length; i++) {
			System.out.println( names[i]);	
		}
		
		//인덱스가 없다. 알아두기
		for (String s: names) {
			System.out.println(s);
		}
		
	}

}