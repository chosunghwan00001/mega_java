package 클래스기본;

public class 계산기 {

	//void : 할일을 하고 반환값이 없다. 즉 밥통에서 취사버튼를 누르면 밥만 한다.
	//리턴이 있는건 취사버튼 누르면 취사를 시작합니다. 메시지 리턴 그리고 밥한다
	public void add(int n1, int n2) {
		
		System.out.println("더하기 : " + (n1+n2));
	}

	public void minus(int n1, int n2) {
		System.out.println("빼기 : " + (n1-n2));
	}

	public void mul(int n1, int n2) {
		System.out.println("곱하기 : " + (n1*n2));
	}

	public void div(double n1, double n2) {
		System.out.println("나누기 : " + (n1/n2));
	}
}
