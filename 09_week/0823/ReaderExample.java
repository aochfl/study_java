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
			BufferedReader br = new BufferedReader(fr);// ���� ������ �о���
			
			String line=null;//�޼��� ������ ���� ������ �ݵ�� �ʱⰪ�� �־�� ��.
			line=br.readLine();
			System.out.println(line);
			fr.close();
			br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("���Ͼ���");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


