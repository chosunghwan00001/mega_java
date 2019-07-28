package 파일;

import java.io.FileWriter;
import java.io.IOException;

public class 파일저장 {
	public static void main(String[] args) throws Exception {
		//외부자원을 연결할때
		//파일, 네트워크, db
		//이런것들 처리시에는 에러처리문 필수, 여러가지 있음 그중 하나는 try catch
		
		
		FileWriter file = new FileWriter("text.txt");
		file.write("한글" + "\n");
		file.write("abc" + "\n");
		file.close();//종료하지 않으면 글 저장 안됨
		
		
		
		
		
		
	}
}
