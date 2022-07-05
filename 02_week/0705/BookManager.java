import java.util.Scanner;

class BookManager{ 
	public static void main(String args[]){ 
		Scanner sc = new Scanner(System.in);
		String book[] = new String[3];
		int idx=0;
		while(true){
			System.out.print("책을 입력합니다.");
			String input = sc.nextLine(); 
			book[idx]=input;
			idx++;
			
			if(idx ==book.length)
				break;
		}
		
		for(int i = 0 ; i < book.length; i++){
			System.out.println(book[i]);
		}
	}
}
