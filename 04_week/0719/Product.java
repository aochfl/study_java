
public class Product {// 클래스 - 객체 코드화시킨거
	String pName;// 
	int price,weight,stock;
	
	public Product() {}// new 할때 실행됨
		
	
	public Product(String pName,int price,int weight,int stock) {// new 할때 실행됨
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
	
	void plusStock() {// 한번실행할 때마다 하나만 증가
		stock++;
	}
	void plusStock(int cnt) {// 한번실행할 때마다 하나만 증가
		stock += cnt;
	}
	void minusStock() {
		stock--;
	}
	void minusStock(int cnt) {
		stock-= cnt;
	}
	void printProduct() {
		System.out.print(" 제품명:"+pName);
		System.out.print(" 가격:"+price);
		System.out.print(" 무게:"+weight);
		System.out.println(" 재고:"+stock);
	}
	
	// 이메인은 이클래스를 만들때 테스용이다. 이후 완성되면 지워주면 좋다.
	/*
	public static void main(String[] args) {
		Product p1 = new Product("신발1", 5000, 600, 10);// 제품을 2개 만듬
		Product p2 = new Product("신발2", 7000, 500, 10);
		
		p1.printProduct();
		p2.printProduct();
		
		p1.minusStock();// p1의 재고가 1 빠짐.
		p1.minusStock();
		p1.minusStock();
		p1.printProduct();// 내용을 알고 싶을때마다 실행
		p1.plusStock();
		p1.printProduct();
		
		Product p3 = new Product();
		p3.setInfo("장갑");
		p3.printProduct();		
		p3.minusStock();
		p3.printProduct();
	}*/
}





