//class Product{
//	String name;
//	int price;
//	double weight;
//	int count;
//	Product(){
//		this("상품명", 10000, 0.0, 10);
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
//		System.out.println("물품명:"+name+" / 가격:"+price+" / 무게:"+weight+" / 재고:"+count);
//	}
//}
//class Person{
//	String id;
//	String name;
//	String address;
//	String phone;
//	Person(){
//		this("ID","이름","주소","010-");
//	}
//	Person(String id, String name, String address, String phone){
//		this.id = id;
//		this.name = name;
//		this.address = address;
//		this.phone = phone;
//	}
//	void printInfo() {
//		System.out.println("아이디:"+id+" / 이름:"+name+" / 주소:"+address+" / 전화번호:"+phone);
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
//		this.totalPrice = this.item.price * this.count; // 이 변수는 굳이 필요하지는 않아보임
//		
//		this.item.changeCount(-count);
//	}
//
//	void printInfo() {
//		System.out.println("\n주문정보 출력");
//		System.out.println("고객:"+person.id+"("+person.name+") / 주문한 제품:"+ item.name+" / 개수:"+count+" / 총금액:"+ totalPrice);
//		System.out.println("");
//		
//	}
//}
//
//
//public class MethodQuestion1 {
//	public static void main(String[] args) {
//		{ // 동작확인
//			Product pd = new Product();
//			pd.printInfo();
//			Person p = new Person();
//			p.printInfo();
//			
//			Order order = new Order(p, pd, 3);
//			order.printInfo();
//	
//			pd.printInfo(); // 재고 변동사항 확인
//		}
//		
//		System.out.println("\n\n");
//		// 사용자/제품 등록
//		Person[] personList = new Person[3];
//		// 이후 사용할때 편하게 읽기위해 변수로 생성
//		Person kim = new Person("aaaa","김씨","광안","010-1111-2222");		
//		personList[0] = kim;
//		personList[1] = new Person("bbbb","박씨","수영","010-3333-4444");
//		personList[2] = new Person("cccc","정씨","망미","010-5555-6666");
//		// 이후 사용할때 편하게 읽기위해 변수로 생성
//		Product[] productList = new Product[2];
//		Product book = new Product("책",8000,1.2,300);
//		productList[0] = book;
//		productList[1] = new Product("가방",15000,0.8,50);
//		
//		// 전체 사용자 출력
//		for(int i = 0 ; i < personList.length; i++) {
//			personList[i].printInfo();
//		}
//		// 전체 제품 출력
//		for(int i = 0 ; i < productList.length; i++) {
//			productList[i].printInfo();
//		}
//		// 김씨가 책을 3권 산 주문서
//		Order order = new Order(kim,book,3);
//		order.printInfo();
//
//		// 전체 제품 출력
//		for(int i = 0 ; i < productList.length; i++) {
//			productList[i].printInfo();
//		}
//	}
//}
