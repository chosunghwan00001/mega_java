package 정적변수_스태틱;

public class Family {
	static int money = 10000;
	String name;
	int height;
	
	public Family(String name, int height) {
		money = money-1000;
		this.name = name;
		this.height = height;
		System.out.println("아빠 지갑의 잔액" + money);
	}

	@Override
	public String toString() {
		return "딸정보 [이름=" + name + ", 키=" + height + "]";
	}
	
	
}
