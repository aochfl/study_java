import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderExample {
	public static void main(String[] args) {
		
		File file = new File("test8.txt");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);// 한줄 단위로 읽어짐
			
			String line=null;//메서드 내에서 만든 변수는 반드시 초기값이 있어야 함.
			line=br.readLine();
			System.out.println(line);
			fr.close();
			br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("파일없음");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


