package 생성자;

public class Computer {
	int price;
	String company;
	
	public Computer(int p, String c) {
		price = p;
		company = c;
	}
	
	@Override
	public String toString() {
		
		return price + "," + company;
	}
}

