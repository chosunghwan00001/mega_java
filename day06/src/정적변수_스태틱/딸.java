package 정적변수_스태틱;

public class 딸 {
	public String name;
	public int age;
	static int wallet = 10000;
	static int dongCount = 0;
	static int soonCount = 0;

	public 딸(String name, int age) {
		wallet = wallet - 1000;
		if (name.equals("홍길동")) {
			dongCount++;
		} else if (name.equals("홍길순")) {
			soonCount++;
		}else {
			System.out.println("해당 이름이 없습니다.");
		}
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "딸 [name=" + name + ", age=" + age + "]";
	}

}
