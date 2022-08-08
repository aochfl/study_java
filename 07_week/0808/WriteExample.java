import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class WriteExample {
	public static void main(String[] args) {
		FileWriter fw = null;
		File file = new File("./test8.txt");
		PrintWriter pw = null;
		try { // try ���̿� ���ܰ� �߻��� ���� �ִ� ������ �ۼ�
			fw = new FileWriter(file);
			pw = new PrintWriter(fw);
			pw.println("�ȳ��ϼ���");
			pw.print("hello World");
			pw.write("cccccc");
			pw.flush(); // ���ۿ� �ִ� ���� �� ������
			
			fw.close();
			pw.close();
		}catch(IOException e) { // �߻��� �� �ִ� ���ܸ� ����
			// ���ܰ� �߻����� ��� �۵��� ������ ����
			System.out.println("���ܹ߻�");
		}
		
		
		
	}
}
