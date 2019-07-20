package 배열;

public class swat {

	public static void main(String[] args) {
		int[] seat = new int[10];
		System.out.println("----------------------------------------------");
		System.out.println("----------------------------------------------");
		for (int i = 0; i < seat.length; i++) {
			System.out.print(seat[i] + " ");
		}
		//5,6번자리 예매처리(기본값 0을 1로저장처리)
		seat[4] = 1;
		seat[5] = 1;
		System.out.println();
		for (int i = 0; i < seat.length; i++) {
			System.out.print(seat[i] + " ");
		}
		

	}

}
