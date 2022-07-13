
public class HouseEx {
	House house;
	HouseEx(){
		house = new House();
	}
	HouseEx(String mete){
		house = new House(mete);
	}
	HouseEx(String mete, int floor){
		house = new House(mete,floor);
	}
	
	void print() {
		System.out.println("구조:"+house.mete + " / 층수:"+house.floor);
	}
	public static void main(String[] args) {
		HouseEx he1 = new HouseEx();
		he1.print();
		
		HouseEx he2 = new HouseEx("나무");
		he2.print();
		
		HouseEx he3 = new HouseEx("나무",2);
		he3.print();
	}
}
