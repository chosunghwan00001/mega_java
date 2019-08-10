package 상속;

public class 자동차사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		세단 s = new 세단();
		s.color = "빨강";
		s.name = "세단";
		s.start();
		s.stop();
		
		System.out.println(s);
		
		
		
		트럭 t = new 트럭();
		t.color = "노랑";
		t.name = "트럭";
		t.start();
		t.stop();
		
		System.out.println(t);
	}

}
