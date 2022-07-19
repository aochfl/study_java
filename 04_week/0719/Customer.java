
public class Customer {
	String id, cName, add, tel;
		
	public Customer(String id, String cName){// new 에서 사용
		this(id, cName, "서울","000-0000-0000" );		
	}
	public Customer(String id, String cName, String add, String tel) {
		this.id = id;
		this.cName = cName;
		this.add = add;
		this.tel = tel;
	}
	
	void setAdd(String add) {// 값을 넣을때도 사용되지만 수정될때도 사용되는 메서드
		this.add=add;
	}
	
	void setTel(String tel) {
		this.tel=tel;
	}
	
	void printCus() {
		System.out.print(" ID : "+id);
		System.out.print(" 고객명 : "+cName);
		System.out.print(" 주소 : "+add);
		System.out.println(" 전화번호 : "+tel);
	}

	//test code
	public static void main(String[] args) {
		Customer c = new Customer("id1","최이름","부산","01011111111");
		c.printCus();
		Customer c2 = new Customer("id2","김이름");
		c2.printCus();
		c2.setAdd("경주");
		c2.printCus();
	}
}
