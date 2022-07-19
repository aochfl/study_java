
public class Customer {
	String id, cName, add, tel;
		
	public Customer(String id, String cName){// new ���� ���
		this(id, cName, "����","000-0000-0000" );		
	}
	public Customer(String id, String cName, String add, String tel) {
		this.id = id;
		this.cName = cName;
		this.add = add;
		this.tel = tel;
	}
	
	void setAdd(String add) {// ���� �������� �������� �����ɶ��� ���Ǵ� �޼���
		this.add=add;
	}
	
	void setTel(String tel) {
		this.tel=tel;
	}
	
	void printCus() {
		System.out.print(" ID : "+id);
		System.out.print(" ���� : "+cName);
		System.out.print(" �ּ� : "+add);
		System.out.println(" ��ȭ��ȣ : "+tel);
	}

	//test code
	public static void main(String[] args) {
		Customer c = new Customer("id1","���̸�","�λ�","01011111111");
		c.printCus();
		Customer c2 = new Customer("id2","���̸�");
		c2.printCus();
		c2.setAdd("����");
		c2.printCus();
	}
}
