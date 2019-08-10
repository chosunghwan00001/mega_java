package 파일입출력;

import java.util.ArrayList;
import java.util.HashSet;

public class 컬렉션테스트3 {

	public static void main(String[] args) {
		//중복등록 안됨, 자체 필터링
		HashSet bag = new HashSet();
		bag.add("휴지");
		bag.add("볼펜");
		bag.add("휴대폰");
		System.out.println(bag);
		bag.add("볼펜");
		System.out.println(bag);
		
		

	}

}
