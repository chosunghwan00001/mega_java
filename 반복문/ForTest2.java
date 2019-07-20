package 반복문;

import java.util.Random;

public class ForTest2 {

	public static void main(String[] args) {
		//초기값, 조건식, 증감값
		Random r = new Random();
		for (int i = 0; i < 6; i++) {
			//랜덤값 발생
			int result = r.nextInt(45);//발생은 0은제외, 0보다 큰수만 출력됨
			System.out.println(result);
		}
	}

}
