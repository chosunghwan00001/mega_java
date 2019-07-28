package 생성자;

public class Tv {
	// 정적특징 => 멤버변수
	int ch;
	int volume;
	boolean onOff;

	// 생성자
	// 객체생성시 자동으로 호출된다
	// 클래스명과 같은 이름
	public Tv() {
		System.out.println("객체생성시 내가 자동 호출 됩니다.");
	}

	// 생성자
	public Tv(int c, int v, boolean o) {
		ch = c;
		volume = v;
		onOff = o;
	}

	// 동적특징 => 멤버메소드
	public void powerOn() {
		System.out.println("Tv를 켜다");

	}

	public String powerOff() {
		// System.out.println("Tv를 끄다");
		return "알았어 꺼줄게";
	}
	
	
	@Override // 재정의
	public String toString() {
		
		return ch + "," + volume + "," + onOff;
	}

}
