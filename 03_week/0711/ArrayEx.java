import java.util.Scanner;

public class ArrayEx {
	int k;
	
	ArrayEx(){ // ������ �ڵ����� �������ش�. ������ ������ ���� ������ ����� ��
		k=10; // ������ �� �ҷ����� �κ��̹Ƿ�,�ٷ� ����� �ȵ�����, ����, �޼���� ����� �����ϴ�
	}
	
	
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		System.out.println(arr);
		
		//ArrayEx ae = new ArrayEx(); // new �ڿ��� �ݵ�� �����ڰ� �;� �Ѵ�.
		
		//Scanner sc = new Scanner(System.in);
		
		int[] i = new int[10];
		i[0] = 10;
		i[1] = 20;
		
		Scanner[] scs = new Scanner[10];
		scs[0]= new Scanner(System.in);
		scs[1]= new Scanner(System.in);
		
		int x = scs[0].nextInt();
		System.out.println(x);
	}
}
