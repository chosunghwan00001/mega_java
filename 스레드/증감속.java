package 스레드;

public class 증감속 {

	public static void main(String[] args) {
		증가 증 = new 증가();
		감소 감 = new 감소();
		
		증.start();
		감.start();
	}

}
