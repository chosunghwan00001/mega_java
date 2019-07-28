package 정적변수_스태틱;

public class BankUser {

	public static void main(String[] args) {
		Bank bank1 = new Bank("청약저축", "김아무개", 500);
		Bank bank2 = new Bank("내비상금", "김아무개딸", 30);
		Bank bank3 = new Bank("자유적금", "박아무개", 100);

		System.out.println(bank2.product + "  통장에는 " + bank2.money + "만원 들어있어요");
		System.out.println(bank3.name + " 통장에는 " + bank3.money + "만원 들어있어요");
		//System.out.println("우리집 전체 예금액은 " + (bank1.money + bank2.money + bank3.money) + "만원 들어있어요");
		System.out.println("우리집 전체 예금액은 " + (Bank.sum_money) + "만원 들어있어요");
		System.out.println("우리집 전체 예금개수는 " + (Bank.count) + "개");

	}

}
