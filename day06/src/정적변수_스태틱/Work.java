package 정적변수_스태틱;

public class Work {
	String name;
	int age;
	String gender;
	static int count;
	static int sum_age;

	public Work(String name, int age, String gender) {
		count++;
		sum_age = sum_age + age;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "[이름=" + name + ", 나이=" + age + ", 성별=" + gender + "]";
	}
	
	

}
