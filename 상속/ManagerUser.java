package 상속;

public class ManagerUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m = new Manager();
		m.name = "홍길동";
		m.addr = "강남구";
		m.bonus = 1000;
		m.salary = 300;
		m.rrn = 880101;
		
		m.test();
		System.out.println(m);
		

	}

}
