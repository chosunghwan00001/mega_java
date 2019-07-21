package 클래스기본;

public class 계산기사용2 {

	public static void main(String[] args) {
		계산기2 cal = new 계산기2();
		
		//System.out.println(cal.mul(5,5000));
		int total = cal.mul(5,5000);
		if (total >= 20000) {
			System.out.println("당신의 지불금액은 2000월 할인되어 " + (total-2000) + "원 입니다.");
		}
		else {
			System.out.println("당신의 지불금액은 " + (total) + "원 입니다.");
		}
		

	}

}
