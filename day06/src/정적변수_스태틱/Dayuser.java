package 정적변수_스태틱;

public class Dayuser {

	public static void main(String[] args) {
		Day day1 = new Day("자바공부", 10, "강남");
		Day day2 = new Day("여행", 15, "강원도");
		Day day3 = new Day("운동", 11, "피트니스");

		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);

		
		//int total = day1.time + day2.time + day3.time;
		//int total = Day.sum;
		System.out.println(Day.sum);
		
		
		//System.out.println(total/3);
		
		//static 접근은 클래스이름.변수
		System.out.println(Day.sum/Day.count);
		
		
	}

}
