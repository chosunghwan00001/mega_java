package 파일입출력;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class 컬렉션테스트6 {

	public static void main(String[] args) {
		//짝을지어저장
		HashMap map = new HashMap();
		map.put("1번","엄마");
		map.put("2번","아빠");
		map.put("3번","친구");
		map.put("4번","동생");
		System.out.println(map);
		System.out.println(map.get("2번"));	
		
		ArrayList list = new ArrayList();
		list.add("박소정");
		list.add("김정민");
		list.add("소지현");
		list.add("김개념");
		list.remove(1);
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1)+"등 " + list.get(i));	
		}
		
		HashSet bag = new HashSet();
		bag.add("프로그래머");
		bag.add("DB관리자");
		bag.add("디자이너");
		System.out.println(bag);
		bag.add("매니저");
		System.out.println(bag);
	}

}
