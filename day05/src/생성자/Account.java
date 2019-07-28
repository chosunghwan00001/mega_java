package 생성자;

public class Account {
	String no;// 계좌번호
	String name;// 계좌주
	int total;// 입금액

	// 계좌생성
	public Account(String no, String name, int total) {
		this.no = no;
		this.name = name;
		this.total = total;
	}

	// 입금
	public Account(String no, int total) {

		this.no = no;
		this.total = total;

	}

	@Override
	public String toString() {
		return no + "  " + name + "  " + total;
	}

}
