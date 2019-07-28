package 파일;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class 파일저장3 {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.print("이름입력 : ");
		String name = sc.next();
		System.out.print("나이입력 : ");
		int age = sc.nextInt();
		System.out.print("학교입력 : ");
		String school = sc.next();

		FileWriter file = new FileWriter(name + ".txt");

		file.write(name + "\n");
		file.write(age + "\n");
		file.write(school + "\n");

		file.close();// 종료하지 않으면 글 저장 안됨

	}
}
