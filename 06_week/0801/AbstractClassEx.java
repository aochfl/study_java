abstract class Animal{
	public void moving() {
		System.out.println("움직인다");
	}
	public abstract void sound(); // 추상 메서드
	// 동물은 움직인다는 기능은 다 가지고 있고, 소리도 다 가지고 있지만
	// 소리는 다 다르므로 이 클래스를 사용하면 sound() 클래스를 무조건 만들어서 사용해야함
}
public class AbstractClassEx {
	
	
	public static void main(String[] args) {
		Animal ani = new Animal() {
			@Override
			public void sound() {
				// TODO Auto-generated method stub
				System.out.println("멍");
			}
		};
		ani.moving(); // 일반메서드
		ani.sound(); // 추상메서드
		// 사용시 완성시켜줘야함
	}
}
