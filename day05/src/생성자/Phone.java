package 생성자;

public class Phone {
	String color;
	int size;
	
	//객체생성시 자동호출
	//생성자(construtor)
	//입력값이 없는 생성자:기본생성자
	//내가 직접만들지 않아도 자동으로 만들어줌
	//내부적으로 만들어진다.
	public Phone() {
		//System.out.println("내가자동호출된다.");
	}
	
	//빨강, 7
	//this 는 이 클래스의 멤버변수를 뜻한다.
	public Phone(String color, int size) {
		this.color = color;
		this.size = size;
	}
	
	@Override
	public String toString() {
		return color + "," + size;
	}
}
