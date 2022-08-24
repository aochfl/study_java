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
		
		try {// try ���̿� ���ܰ� �߻��� ���� �ִ� ������ �ۼ�
			fw = new FileWriter(file);
			pw = new PrintWriter(fw);
			pw.println("�ȳ��ϼ���");
			pw.print("���");
			pw.println("hello");
			
			pw.flush();// ���ۿ� �ִ� ���� �� ������
			fw.close();// ������ �� ������ �ݾ������.
			pw.close();
			System.out.println("���� �������");
			
		} catch (IOException e) {// �߻��� �� �ִ� ���ܸ� ����			
			// ���ܰ� �߻����� ��� �۵��� ������ ����
			System.out.println("���ܹ߻�");
		}
	}
		 
}




