class IOParents{
	
}
class IOChild extends IOParents{
	
}
public class InstanceOfEx {
	public static void main(String[] args) {
		IOParents iop = new IOChild();
		IOParents iop2 = new IOParents();
		IOChild ioc = null;
		//IOChild ioc =(IOChild) new IOParents(); // �ڽĺ��� �θ� �ʰ� �����Ǵ°�� error
		System.out.println(iop instanceof IOParents);
		System.out.println(iop instanceof IOChild);
		System.out.println(iop2 instanceof IOChild);
		// ������ ������ instanceOf Ÿ�� �̳�?
		String str="����";
		System.out.println(str instanceof Object);
	}
}
