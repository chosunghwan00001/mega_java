package 상속;

public class Manager extends Employee {
	int bonus;

	public void test() {
		System.out.println("관리 감독하다.");
	}

	@Override //재정의, 오버라이드(구문생략가능)
	public String toString() {
		return "Manager [bonus=" + bonus + ", name=" + name + ", addr=" + addr + ", salary=" + salary + ", rrn=" + rrn
				+ "]";
	}
	
	//부모메서드와 자식메서드가 같으면 자식메서드가 실행된다.
}
