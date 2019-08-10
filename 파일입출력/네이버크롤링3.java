package 파일입출력;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버크롤링3 {

	public static void main(String[] args) throws Exception {
		Document doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=005360").get();
		Elements e =  doc.select("span.blind");
		System.out.println(e.get(12).text());
		System.out.println(e.get(15).text());
		System.out.println(e.get(16).text());
		System.out.println(e.get(17).text());
//		FileWriter file;
//		try {
//			file = new FileWriter("증권.txt");
//			
//			for (Element element : e) {
//				//System.out.println(element.text());
//				file.write(element.text() + "\n");
//			}
//			
//			file.close();
//
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		
	}

}
