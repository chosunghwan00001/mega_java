package 연산자;

public class 로그인 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id = 1000;//회원가입아이디
		int pw = 1111;//회원가입pw
		int input = 1000;//입력한아이디
		int input2 = 1111;//입력한pw
		if (id == input && pw == input2) {
			System.out.println("로그인OK");
		} else {
			System.out.println("로그인NOT");
		}

	}

}
