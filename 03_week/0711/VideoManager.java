
public class VideoManager { // - ���� ���� ���α׷� - ��ü�������α׷���
	// Ŭ������ ��ü�� ǥ��
	Video[] v; // ������
	Member[] m; // ��� ȸ��
	
	int money; // �� ���ͱ�
	
	String id;
	String pw;
	String version;
	
	public static void main(String[] args) {
		VideoManager vm = new VideoManager();
		vm.v = new Video[100];
		
		vm.v[0] = new Video();
		vm.v[0].idx=1;
		vm.v[0].date="2020-07-20";
		vm.v[0].mActor="������";
		vm.v[0].price=50000;
		vm.v[0].rent=false;
		vm.v[0].title="���˵���2";
		
		vm.m = new Member[100];
		vm.m[0] = new Member();
		vm.m[0].age=30;
		vm.m[0].addr="�λ�";
		vm.m[0].mileage=0;
		vm.m[0].name="ȫ�浿";		
				
	}
}
