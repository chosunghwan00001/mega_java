package 생성자;

public class Coffee {
	int price;
	String field;

	public Coffee() {

	}

	public Coffee(int price) {
		this.price = price;
	}

	public Coffee(int price, String field) {
		this.price = price;
		this.field = field;
	}

	@Override
	public String toString() {

		return price + "," + field;
	}
}
