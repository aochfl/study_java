
public class Product {// Ŭ���� - ��ü �ڵ�ȭ��Ų��
	String pName;// 
	int price,weight,stock;
	
	public Product() {}// new �Ҷ� �����
		
	
	public Product(String pName,int price,int weight,int stock) {// new �Ҷ� �����
		this.pName=pName;
		this.price=price;
		this.weight=weight;
		this.stock=stock;
	}
	
	public void setInfo(String pName, int price, int weight, int stock) {
		this.pName=pName;
		this.price=price;
		this.weight=weight;
		this.stock=stock;
	}
	
	public void setInfo(String pName, int price, int weight) {
		setInfo(pName,price,weight,10);
	}
	
	public void setInfo(String pName, int weight) {
		setInfo(pName,5000,weight,10);
	}
	
	public void setInfo(String pName) {
		setInfo(pName,5000,700,10);
	}
	
	void plusStock() {// �ѹ������� ������ �ϳ��� ����
		stock++;
	}
	void plusStock(int cnt) {// �ѹ������� ������ �ϳ��� ����
		stock += cnt;
	}
	void minusStock() {
		stock--;
	}
	void minusStock(int cnt) {
		stock-= cnt;
	}
	void printProduct() {
		System.out.print(" ��ǰ��:"+pName);
		System.out.print(" ����:"+price);
		System.out.print(" ����:"+weight);
		System.out.println(" ���:"+stock);
	}
	
	// �̸����� ��Ŭ������ ���鶧 �׽����̴�. ���� �ϼ��Ǹ� �����ָ� ����.
	/*
	public static void main(String[] args) {
		Product p1 = new Product("�Ź�1", 5000, 600, 10);// ��ǰ�� 2�� ����
		Product p2 = new Product("�Ź�2", 7000, 500, 10);
		
		p1.printProduct();
		p2.printProduct();
		
		p1.minusStock();// p1�� ��� 1 ����.
		p1.minusStock();
		p1.minusStock();
		p1.printProduct();// ������ �˰� ���������� ����
		p1.plusStock();
		p1.printProduct();
		
		Product p3 = new Product();
		p3.setInfo("�尩");
		p3.printProduct();		
		p3.minusStock();
		p3.printProduct();
	}*/
}





