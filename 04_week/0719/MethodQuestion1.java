//class Product{
//	String name;
//	int price;
//	double weight;
//	int count;
//	Product(){
//		this("��ǰ��", 10000, 0.0, 10);
//	}
//	Product(String name, int price, double weight, int count){
//		this.name = name;
//		this.price = price;
//		this.weight = weight;
//		this.count = count;
//	}
//	void  changeCount(int count) {
//		this.count += count;
//	}
//	void printInfo() {
//		System.out.println("��ǰ��:"+name+" / ����:"+price+" / ����:"+weight+" / ���:"+count);
//	}
//}
//class Person{
//	String id;
//	String name;
//	String address;
//	String phone;
//	Person(){
//		this("ID","�̸�","�ּ�","010-");
//	}
//	Person(String id, String name, String address, String phone){
//		this.id = id;
//		this.name = name;
//		this.address = address;
//		this.phone = phone;
//	}
//	void printInfo() {
//		System.out.println("���̵�:"+id+" / �̸�:"+name+" / �ּ�:"+address+" / ��ȭ��ȣ:"+phone);
//	}
//}
//class Order{
//	Person person;
//	Product item;
//	int count;
//	int totalPrice;
//	
//	Order(Person person, Product item, int count){
//		this.person = person;
//		this.item = item;
//		this.count = count;
//		this.totalPrice = this.item.price * this.count; // �� ������ ���� �ʿ������� �ʾƺ���
//		
//		this.item.changeCount(-count);
//	}
//
//	void printInfo() {
//		System.out.println("\n�ֹ����� ���");
//		System.out.println("��:"+person.id+"("+person.name+") / �ֹ��� ��ǰ:"+ item.name+" / ����:"+count+" / �ѱݾ�:"+ totalPrice);
//		System.out.println("");
//		
//	}
//}
//
//
//public class MethodQuestion1 {
//	public static void main(String[] args) {
//		{ // ����Ȯ��
//			Product pd = new Product();
//			pd.printInfo();
//			Person p = new Person();
//			p.printInfo();
//			
//			Order order = new Order(p, pd, 3);
//			order.printInfo();
//	
//			pd.printInfo(); // ��� �������� Ȯ��
//		}
//		
//		System.out.println("\n\n");
//		// �����/��ǰ ���
//		Person[] personList = new Person[3];
//		// ���� ����Ҷ� ���ϰ� �б����� ������ ����
//		Person kim = new Person("aaaa","�达","����","010-1111-2222");		
//		personList[0] = kim;
//		personList[1] = new Person("bbbb","�ھ�","����","010-3333-4444");
//		personList[2] = new Person("cccc","����","����","010-5555-6666");
//		// ���� ����Ҷ� ���ϰ� �б����� ������ ����
//		Product[] productList = new Product[2];
//		Product book = new Product("å",8000,1.2,300);
//		productList[0] = book;
//		productList[1] = new Product("����",15000,0.8,50);
//		
//		// ��ü ����� ���
//		for(int i = 0 ; i < personList.length; i++) {
//			personList[i].printInfo();
//		}
//		// ��ü ��ǰ ���
//		for(int i = 0 ; i < productList.length; i++) {
//			productList[i].printInfo();
//		}
//		// �达�� å�� 3�� �� �ֹ���
//		Order order = new Order(kim,book,3);
//		order.printInfo();
//
//		// ��ü ��ǰ ���
//		for(int i = 0 ; i < productList.length; i++) {
//			productList[i].printInfo();
//		}
//	}
//}
