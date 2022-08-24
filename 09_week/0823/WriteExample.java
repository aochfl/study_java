import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteExample {
	public static void main(String[] args) {
		File file = new File("test8.txt");
		FileWriter fw = null;
		PrintWriter pw = null;
		
		try {// try 사이에 예외가 발생할 수도 있는 내용을 작성
			fw = new FileWriter(file);
			pw = new PrintWriter(fw);
			pw.println("안녕하세요");
			pw.print("헬로");
			pw.println("hello");
			
			pw.flush();// 버퍼에 있는 내용 다 꺼내기
			fw.close();// 파일을 다 썼으면 닫아줘야함.
			pw.close();
			System.out.println("파일 만들어짐");
			
		} catch (IOException e) {// 발생할 수 있는 예외를 써줌			
			// 예외가 발생했을 경우 작동될 내용을 써줌
			System.out.println("예외발생");
		}
	}
		 
}




