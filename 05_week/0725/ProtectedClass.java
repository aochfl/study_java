import test.A;
import test.C;

class B{
	public void method() {
		C a = new C();
	}
}
public class ProtectedClass {
	public static void main(String[] args) {
		DefaultClass d = new DefaultClass();
		//A a = new A();
		B b = new B();
		
	}
}
