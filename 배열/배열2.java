package 배열;

public class 배열2 {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5 };
		System.out.println(num[0]);
		System.out.println(num[3]);

		double[] eye = { 0.5, 0.6, 1.0, 2.0, 0.8 };
		System.out.println(eye[2]);
	

		// 배열은 위치값을 가지고 접근
		// 위치값 = index
		// index는 0부터 시작
		// index의 마지막값은 개수-1

		System.out.println(eye.length);

		String[] name = { "김길동", "님길동", "딤길도", "리길동", "미길동" };
		System.out.println(name[0]);
		System.out.println(name[4]);
		System.out.println("총인원 : " + name.length + "명");

		char[] gender = { '남', '여', '여', '남', '여' };
		System.out.println(gender[0]);
		
		for (int i = 0; i < gender.length; i++) {
			System.out.println(i + ":" +num[i]);
			System.out.println(i + ":" +eye[i]);
			System.out.println(i + ":" +name[i]);
			System.out.println(i + ":" +gender[i]);
			
		}
	}

}
