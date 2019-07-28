package 정적변수_스태틱;

public class WorkUser {

	public static void main(String[] args) {

		Work w1 = new Work("홍길동", 25, "남");
		Work w2 = new Work("김길동", 23, "여");

		System.out.println(w1);
		System.out.println(w2);
		System.out.println("직원들의 평균 나이는 " + (Work.sum_age / Work.count));
		System.out.println("직원수 " + (Work.count));

	}

}
