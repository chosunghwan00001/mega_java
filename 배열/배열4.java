package 배열;

public class 배열4 {

	public static void main(String[] args) {
		//성적관리 프로그램
		int [] jumsu = new int[5];
		jumsu[0] = 90;
		jumsu[1] = 80;
		jumsu[2] = 70;
		jumsu[3] = 60;
		jumsu[4] = 50;
		
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(jumsu[i]);
		}
		
		int imsi;//초기화 되지 않음. 프린트 오류
		int[] imsi2 = new int[3];
//		System.out.println(imsi);
		System.out.println(imsi2[0]);//배열은 배열의 초기값으로  데이터 타입에 맞게 들어가있다
		//배열은 자동 초기화
		//int -> 0 기본값
	

	}

}
