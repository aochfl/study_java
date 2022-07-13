package ex;
import java.util.Scanner;

class Person{
	String name;
	String id;
	int millage;
	Person(String name, String id){
		this.name = name;
		this.id = id;
	}
	Person(String name, String id, int millage){
		this.name = name;
		this.id = id;
		this.millage = millage;
	}
	void print() {
		System.out.println("이름:"+name+" / id:"+id+" / millage:"+millage);
	}
}
class Book{
	String name;
	int price;
	int count;
	public Book(String name) {
		// TODO Auto-generated constructor stub
		this.name =name;
	}
	public Book(String name, int price) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.price = price;
	}
	public Book(String name, int price, int count) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.price = price;
		this.count = count;
	}
	void print() {
		System.out.println("도서명:"+name+" / 가격:"+price+" / 재고:"+count);
	}
}

public class LibraryManager {
	Person[] personList;
	Book[] bookList;

	int personNum = 0;
	int bookNum = 0;
	
	public LibraryManager(int person, int book) {
		personList = new Person[person];
		bookList = new Book[book];
	}
	public static void main(String[] args) {
		// class 생성자 사용 기본예시
		Person person1 = new Person("김씨","5");
		person1.print();
		Person person2 = new Person("박씨","5",1000);
		person2.print();

		
		// 심심심..
		System.out.println("== 도서관 프로그램 ==");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("최대로 등록할 인원 수를 입력해주세요");
		int personTotal = sc.nextInt();
		System.out.println("최대로 등록할 도서의 수를 입력해주세요");
		int bookTotal = sc.nextInt();
		
		LibraryManager lm = new LibraryManager(personTotal, bookTotal);
		int input = 0;
		while(true) {
			System.out.println("1:사용자추가 / 2:도서추가 / 3:사용자출력 / 4:도서출력 / 5:마일리지 / 그외:종료");
			input = sc.nextInt();
			if(input == 1) {
				if(lm.personNum <lm.personList.length)
				{
					System.out.print("이름을 입력해주세요");
					String name = sc.next();
					System.out.print("사용하실 id를 입력해주세요");
					String id = sc.next();
					lm.personList[lm.personNum] = new Person(name,id);
					lm.personNum++;
				}
			}
			else if(input == 2) {
				if(lm.bookNum <lm.bookList.length)
				{
					System.out.print("도서이름을 입력해주세요");
					String name = sc.next();
					System.out.print("도서가격을 입력해주세요");
					int price = sc.nextInt();
					System.out.print("도서수량을 입력해주세요");
					int count = sc.nextInt();
					lm.bookList[lm.bookNum] = new Book(name,price,count);
					lm.bookNum++;
				}
			}
			else if(input == 3) {
				for(int i = 0 ; i < lm.personNum ; i++)
				{
					lm.personList[i].print();
				}
			}
			else if(input == 4) {
				for(int i = 0 ; i < lm.bookNum ; i++)
				{
					lm.bookList[i].print();
				}
			}
			else if(input == 5)	{
				System.out.println("마일리지를 수정할 유저의 숫자를 입력해주세요");
				for(int i =0 ; i< lm.personNum ; i++)
				{
					System.out.print((i+1)+":"+lm.personList[i].name+" / ");
				}
				System.out.println();
				input = sc.nextInt();
				
				System.out.println(lm.personList[input-1].name +"유저의 마일리지를 몇점으로 수정하시겠습니까?" );
				lm.personList[input-1].millage = sc.nextInt();
				
			}
			else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
}
