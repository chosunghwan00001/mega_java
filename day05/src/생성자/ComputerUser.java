package 생성자;

public class ComputerUser {

	public static void main(String[] args) {
		Computer c1 = new Computer(1000000, "컴퓨터존");
		
		System.out.println(c1.price);
		System.out.println(c1.company);
		
		Computer c2 = new Computer(2000000, "컴퓨터존2");
		System.out.println(c2);

	}

}
