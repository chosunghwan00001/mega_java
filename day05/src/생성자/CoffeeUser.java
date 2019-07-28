package 생성자;

public class CoffeeUser {

	public static void main(String[] args) {
		Coffee c1 = new Coffee();
		Coffee c2 = new Coffee(5000);
		Coffee c3 = new Coffee(5000,"라떼");
		
		//System.out.println(c1);
		System.out.println(c2.price);
		System.out.println(c3.price + "," + c3.field);
	}

}
