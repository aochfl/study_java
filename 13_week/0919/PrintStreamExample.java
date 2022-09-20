package _0919;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
	public static void main(String[] args) throws Exception {
		String filePath = "C:\\develop\\java\\JavaProject\\src\\_0919\\printstream.txt";
		FileOutputStream fos = new FileOutputStream(filePath);
		PrintStream ps = new PrintStream(fos);

		ps.println("[프린터 보조 스트림]");
		ps.println("마치 ");
		ps.println("프린터가 출력하는 것처럼 ");
		ps.println("데이터를 출력합니다");

		ps.flush();
		ps.close();

	}
}
