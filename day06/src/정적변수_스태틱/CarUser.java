package 정적변수_스태틱;

public class CarUser {

	public static void main(String[] args) {
		//Car car1 = new Car(100);
		//Car car2 = new Car(200);
		
		//car1.speedUp();//일반메서드는 [생성된객체이름.메서드이름] 으로 접급
		System.out.println(Car.count);
		
		Car.printCount();
		

	}

}
