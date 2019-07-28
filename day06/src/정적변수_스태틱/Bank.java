package 정적변수_스태틱;

public class Bank {
	//클래스 밑으로 선언된 변수는 자동 초기화
	//string = null, int = 0, double = 0.0, boolean = false; 이런식으로
	//중요사실 : 메인 메서드 및 다른 메서드 안에서 선언된 변수는 자동 초기화 안된다.
	//선언시 초기화를 습관하자.
	String product;
	String name;
	int money;
	static int sum_money;
	static int count;
	
//	public static void printCount() {
//		System.out.println(count);
//		
//	}
//	
//	public void printCount_() {
//		System.out.println(count);
//		
//	}

	public Bank(String product,String name,int money) {
		count++;
		sum_money = sum_money + money;
		this.product = product;
		this.name = name;
		this.money = money;
	}
	
//	@Override
//	public String toString() {
//		return super.toString();
//	}

}
