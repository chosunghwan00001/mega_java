package 파일입출력;

import java.io.FileWriter;
import java.io.IOException;

public class 파일출력 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileWriter file = new FileWriter("test.txt");
		
		file.write("자바" + "\n");
		file.write("스프링" + "\n");
		
		file.close();
		//file과 java와의 연결통로 : stream(스트림)을 통해서 
		//데이터를 file에 씀
		//stream을 닫으면 파일의 작성이 끝
	}

}
