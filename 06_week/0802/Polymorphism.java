interface Number{}

class Inte implements Number{ void printIN() {}}
class Floa implements Number{ void printFl() {}}
class Doubl implements Number{void printDo() {}}

public class Polymorphism {
//	void printNumber(Inte i) {}
//	void printNumber(Floa i) {}
//	void printNumber(Doubl i) {}
	void printNumber(Number i) {} // 인터페이스 하나로 묶어서 처리가능
	
	public static void main(String[] args) {
		Polymorphism p = new Polymorphism();
		p.printNumber(new Doubl());
		p.printNumber(new Floa());
		p.printNumber(new Inte());
	}
}
