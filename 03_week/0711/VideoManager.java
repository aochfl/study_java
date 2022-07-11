
public class VideoManager { // - 비디오 관리 프로그램 - 객체지향프로그래밍
	// 클래스는 객체를 표현
	Video[] v; // 모든비디오
	Member[] m; // 모든 회원
	
	int money; // 총 수익금
	
	String id;
	String pw;
	String version;
	
	public static void main(String[] args) {
		VideoManager vm = new VideoManager();
		vm.v = new Video[100];
		
		vm.v[0] = new Video();
		vm.v[0].idx=1;
		vm.v[0].date="2020-07-20";
		vm.v[0].mActor="마동석";
		vm.v[0].price=50000;
		vm.v[0].rent=false;
		vm.v[0].title="범죄도시2";
		
		vm.m = new Member[100];
		vm.m[0] = new Member();
		vm.m[0].age=30;
		vm.m[0].addr="부산";
		vm.m[0].mileage=0;
		vm.m[0].name="홍길동";		
				
	}
}
