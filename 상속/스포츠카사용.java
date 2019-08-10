package 상속;

public class 스포츠카사용 extends SportsCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SportsCar sc = new SportsCar();
		sc.color = "red";
		sc.speed = 200;
		System.out.println(sc.color);
		System.out.println(sc.speed);
		sc.start();
		sc.speedUp();
	}

}
