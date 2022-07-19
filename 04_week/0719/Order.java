
public class Order {
	int orderCnt;
	int price;

	void sellProduct(Product p, Customer c) {
		orderCnt++;// �� �޼��尡 ����� �� ���� ������ 1�� ����
		price = price + p.price;//���� price�� ��ǰ�� price�� ������
		p.minusStock();// ��� 1 ����
	}
	void sellProduct(Product p, Customer c,int count) {
		orderCnt++;// �� �޼��尡 ����� �� ���� ������ 1�� ����
		price += p.price*count;//���� price�� ��ǰ�� price�� ������
		p.minusStock(count);// ��� 1 ����
	}

	void printOrderAll() {
		System.out.println("�� �ֹ� ����:"+orderCnt);
		System.out.println("�� ����:"+price);
	}
	void printAllStock(Product ...p) {
		for(int i = 0 ; i < p.length; i++) {
			p[i].printProduct();
		}
	}
	
	public static void main(String[] args) {
		Order o = new Order();
		
		Customer c = new Customer("���̵�","���̸�");
		Customer c2 = new Customer("���̵�2","���̸�");
		Product shoes = new Product("�Ź�", 10000, 700, 10);
		Product phone = new Product("��ȭ��", 8000, 500, 100);
		Product pencil = new Product("����", 500, 100, 50);
		
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
