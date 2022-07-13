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
		System.out.println("�̸�:"+name+" / id:"+id+" / millage:"+millage);
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
		System.out.println("������:"+name+" / ����:"+price+" / ���:"+count);
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
		// class ������ ��� �⺻����
		Person person1 = new Person("�达","5");
		person1.print();
		Person person2 = new Person("�ھ�","5",1000);
		person2.print();

		
		// �ɽɽ�..
		System.out.println("== ������ ���α׷� ==");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ִ�� ����� �ο� ���� �Է����ּ���");
		int personTotal = sc.nextInt();
		System.out.println("�ִ�� ����� ������ ���� �Է����ּ���");
		int bookTotal = sc.nextInt();
		
		LibraryManager lm = new LibraryManager(personTotal, bookTotal);
		int input = 0;
		while(true) {
			System.out.println("1:������߰� / 2:�����߰� / 3:�������� / 4:������� / 5:���ϸ��� / �׿�:����");
			input = sc.nextInt();
			if(input == 1) {
				if(lm.personNum <lm.personList.length)
				{
					System.out.print("�̸��� �Է����ּ���");
					String name = sc.next();
					System.out.print("����Ͻ� id�� �Է����ּ���");
					String id = sc.next();
					lm.personList[lm.personNum] = new Person(name,id);
					lm.personNum++;
				}
			}
			else if(input == 2) {
				if(lm.bookNum <lm.bookList.length)
				{
					System.out.print("�����̸��� �Է����ּ���");
					String name = sc.next();
					System.out.print("���������� �Է����ּ���");
					int price = sc.nextInt();
					System.out.print("���������� �Է����ּ���");
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
				System.out.println("���ϸ����� ������ ������ ���ڸ� �Է����ּ���");
				for(int i =0 ; i< lm.personNum ; i++)
				{
					System.out.print((i+1)+":"+lm.personList[i].name+" / ");
				}
				System.out.println();
				input = sc.nextInt();
				
				System.out.println(lm.personList[input-1].name +"������ ���ϸ����� �������� �����Ͻðڽ��ϱ�?" );
				lm.personList[input-1].millage = sc.nextInt();
				
			}
			else {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
	}
}
