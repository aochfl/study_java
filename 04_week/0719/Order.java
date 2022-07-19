
public class Order {
	int orderCnt;
	int price;

	void sellProduct(Product p, Customer c) {
		orderCnt++;// 이 메서드가 실행될 때 마다 무조건 1씩 증가
		price = price + p.price;//현재 price에 제품의 price를 더해줌
		p.minusStock();// 재고 1 빼기
	}
	void sellProduct(Product p, Customer c,int count) {
		orderCnt++;// 이 메서드가 실행될 때 마다 무조건 1씩 증가
		price += p.price*count;//현재 price에 제품의 price를 더해줌
		p.minusStock(count);// 재고 1 빼기
	}

	void printOrderAll() {
		System.out.println("총 주문 개수:"+orderCnt);
		System.out.println("총 수익:"+price);
	}
	void printAllStock(Product ...p) {
		for(int i = 0 ; i < p.length; i++) {
			p[i].printProduct();
		}
	}
	
	public static void main(String[] args) {
		Order o = new Order();
		
		Customer c = new Customer("아이디","최이름");
		Customer c2 = new Customer("아이디2","김이름");
		Product shoes = new Product("신발", 10000, 700, 10);
		Product phone = new Product("전화기", 8000, 500, 100);
		Product pencil = new Product("연필", 500, 100, 50);
		
		o.sellProduct(shoes,c);
		o.sellProduct(phone,c2);
		o.sellProduct(pencil,c2);
		o.sellProduct(pencil,c2);
		o.sellProduct(shoes,c2);
		
		o.printAllStock(shoes, phone, pencil);
		o.printOrderAll();

		o.sellProduct(pencil,c2,40);

		o.printAllStock(shoes, phone, pencil);
		o.printOrderAll();
	}
	
}
