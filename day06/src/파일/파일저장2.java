package 파일;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class 파일저장2 {
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner();
		
		
		FileWriter file = new FileWriter("text2.txt");
		
		for (int i = 0; i < 3; i++) {
			String data = JOptionPane.showInputDialog("입력데이터");
			file.write(data + "\n");	
		}
		file.close();//종료하지 않으면 글 저장 안됨
		
		
		
		
		
		
	}
}
