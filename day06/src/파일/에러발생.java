package 파일;

public class 에러발생 {
	public static void main(String[] args) {
		try {
			System.out.println(5 / 0);
		} catch (Exception e) {
			System.out.println("에러처리함"  + e.getMessage());
		}
		System.out.println("나는실행될까");
		
	}
}
