class Book{
	String name;
	int price;
	boolean stock;
	double score;
	
	void insertTitle(String str) {
		this.name = str;
	}
	void insertPrice(int price) {
		this.price = price;
	}
	void insertStock(boolean stock) {
		this.stock = stock;
	}
	void insertScore(double score) {
		this.score = score;
	}
	void showData() {
		System.out.println(name +", "+ price+"��, "+ ((stock)?"�������, ":"������, ")+"���� "+score+"��");
	}
}

public class bookEx {
	public static void main(String[] args) {
		Book b = new Book();
		b.insertTitle("���������");
		b.insertPrice(12000);
		b.insertStock(true);
		b.insertScore(9.5);
		b.showData();
	}
}
