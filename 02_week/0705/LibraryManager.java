import java.util.Scanner;

class LibraryManager{ 
	// todo 도서관리 프로그램
	// == 도서관리 프로그램 ==
	// 메뉴를 선택하세요.(1.책입력 2.책삭제 3.책검색 4.종료)
	// 10개짜리 String 배열을 만듭니다.
	// 처음엔 전부다 "책없음" 이라는 내용으로 다 넣어 둡니다.
	// 1. 책입력을 선택하면 배열에 순서대로 입력한 책들이 입력됩니다.
	// 2. 책삭제를 선택하면 원래 있던 책 이름이 "책없음"으로 바뀌면 됩니다.
	public static void main(String args[]){ 
		Scanner sc = new Scanner(System.in);
		
		String[] bookList = new String[10];
		for(int i = 0 ; i < bookList.length ; i++)
		{
			bookList[i] = "책없음";
		}
		
		int input = 0;
		while(true)
		{
			System.out.println("\n== 도서관리 프로그램 ==");
			System.out.print("메뉴를 선택하세요.(1.책입력 2.책삭제 3. 전체출력 4.책검색 0.종료)");
			input = sc.nextInt();
			
			if(input == 1)
			{
				while(true)
				{
					System.out.print("저장할 책의 번호를 입력해주세요 :");
					input = sc.nextInt();
					if( 0 < input && input < bookList.length+1 )
					{
						String book;
						System.out.print("저장할 책의 이름을 입력해주세요 :");
						book = sc.next();
						bookList[input-1] = book;
						System.out.println( "저장되었습니다" );
						
						
						System.out.print("추가로 책을 저장하시겠습니까? 1:예 2:아니요 - ");
						input = sc.nextInt();
						if(input == 1)
						{
							continue;
						}							
					}
					else 
					{
						System.out.println("입력하신 책번호가 잘못되었습니다 :"+input);
					}
					break;
				}
			}
			else if(input == 2)
			{
				System.out.print("삭제할 책의 번호를 입력해주세요 :");
				input = sc.nextInt();
				if( 0 < input && input < bookList.length+1 )
				{
					bookList[input-1] = "책없음";
					System.out.println( "삭제되었습니다" );
				}
				else 
				{
					System.out.println("입력하신 책번호가 잘못되었습니다 :"+input);
				}
			}
			else if (input == 3)
			{
				for(int i = 0 ; i < bookList.length ; i++)
				{
					System.out.println((i+1)+". "+bookList[i]);
				}
			}
			else if (input == 4)
			{
				System.out.print("확인하실 책의 번호를 입력하세요:");
				input = sc.nextInt();
				if( 0 < input && input < bookList.length+1 )
				{
					System.out.println(input+". "+bookList[input-1] );
				}
				else 
				{
					System.out.println("입력하신 책번호가 잘못되었습니다 :"+input);
				}
			}
			else if (input == 0)
			{
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else 
			{
				System.out.println("잘못된 숫자가 입력되었습니다 "+input);
			}
			
		}
	}
}
