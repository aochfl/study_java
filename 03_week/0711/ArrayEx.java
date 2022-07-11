import java.util.Scanner;

public class ArrayEx {
	int k;
	
	ArrayEx(){ // 없으면 자동으로 생성해준다. 내용을 수정할 일이 있으면 만들면 됨
		k=10; // 생성할 때 불러지는 부분이므로,바로 출력은 안되지만, 변수, 메서드등 사용은 가능하다
	}
	
	
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		System.out.println(arr);
		
		//ArrayEx ae = new ArrayEx(); // new 뒤에는 반드시 생성자가 와야 한다.
		
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
