package 정적변수_스태틱;



public class Day {
	
	//멤버변수는 다 따로따로 다이나믹하게 동적
	String doing;
	int time;
	String location;
	//여기에 static 을 붙이면 정적, 변수하나만 만들어진다. 누적시킬 변수가 있으면 유용하다.
	static int count;
	static int sum;	
	
	//변수값들 입력
	public Day(String doing, int time, String location) {
		count++;
		sum = sum + time;
		System.out.println(count);
		this.doing = doing;
		this.time = time;
		this.location = location;
	}

	//변수값들 출력
	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	

	
	
}
