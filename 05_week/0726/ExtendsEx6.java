class Ext6{ // �θ�Ŭ������� Ư���Ѱ� �ƴ�
	int x;
	String str;
	
	void printExt6() {
		System.out.println("Ext6");
	}
}
class ExtendsEx6_2 extends Ext6{}
class ExtendsEx6_3 extends Ext6{}
class ExtendsEx6_4 extends Ext6{}
public class ExtendsEx6 extends Ext6{ //��ӹ޾Ҵ� == ExtendsEx6 + Ext6
	int y;
	int z;
	double[] dd;
	
	void printClass() {
		System.out.println("ExtendsEx6");
	}
}
