package 배열제어문심화;

public class 이차원배열 {
	public static void main(String[] args) {

		int[] seat1 = new int[10];
		for (int i = 0; i < seat1.length; i++) {
			System.out.print(seat1[i] + " ");
			
		}
		System.out.println();
			System.out.println("-------------------------------------------------------------");
			
			int[][] seat2 = new int[2][10];//행열
			
			seat2[1][7] = 1;
			seat2[1][8] = 1;
			seat2[1][9] = 1;
			
			System.out.println(seat2.length);//행의개수
			
			//행마다 열의 개수가 다르다
			System.out.println(seat2[0].length);//1행의 열개수
			System.out.println(seat2[1].length);//2행의 열개수
			
			for (int i = 0; i < seat2.length; i++) {
				for (int j = 0; j < seat2[i].length; j++) {
					System.out.print(seat2[i][j]);
				}
				System.out.println();
			}
	}
}
