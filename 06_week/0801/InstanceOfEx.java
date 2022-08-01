class IOParents{
	
}
class IOChild extends IOParents{
	
}
public class InstanceOfEx {
	public static void main(String[] args) {
		IOParents iop = new IOChild();
		IOParents iop2 = new IOParents();
		IOChild ioc = null;
		//IOChild ioc =(IOChild) new IOParents(); // 자식보다 부모가 늦게 생성되는경우 error
		System.out.println(iop instanceof IOParents);
		System.out.println(iop instanceof IOChild);
		System.out.println(iop2 instanceof IOChild);
		// 생성된 변수가 instanceOf 타입 이냐?
		String str="ㅎㅇ";
		System.out.println(str instanceof Object);
	}
}
