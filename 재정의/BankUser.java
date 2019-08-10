package 재정의;

public class BankUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BadBank bbk = new BadBank();
		NomarBank nbk = new NomarBank();
		GoodBank gbk = new GoodBank();
		
		bbk.getInterestRate();
		nbk.getInterestRate();
		gbk.getInterestRate();
	}

}
