package 정적변수_스태틱;

public class Car {
	int speed;//차량 따로따로 복사예정
	static int count;//누적

	public Car(int speed) {
		count++;
		this.speed = speed;
	}
	
	public void speedUp() {
		
		
		System.out.println("speedUp!!!");
	}
	
	public static void printCount() {
		System.out.println(count);
	}
	
}
