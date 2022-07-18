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
		System.out.println(name +", "+ price+"원, "+ ((stock)?"재고있음, ":"재고없음, ")+"평점 "+score+"점");
	}
}

public class bookEx {
	public static void main(String[] args) {
		Book b = new Book();
		b.insertTitle("오만과편견");
		b.insertPrice(12000);
		b.insertStock(true);
		b.insertScore(9.5);
		b.showData();
	}
}
