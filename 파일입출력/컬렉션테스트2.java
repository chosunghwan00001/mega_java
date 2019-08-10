package 파일입출력;

import java.util.ArrayList;

public class 컬렉션테스트2 {

	public static void main(String[] args) {
		//가장많이 사용하는 타입, 리스트형, 타입에 상관없이 등록 가능
		ArrayList list = new ArrayList();
		list.add("박스키");
		list.add("송스키");
		list.add("박스키");
		list.add("정스키");
		
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
		

	}

}
