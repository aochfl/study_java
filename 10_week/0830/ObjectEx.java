package _0830;

public class ObjectEx {
	int i,j;
	
	void setInt(int i , int j) {
		this.i = i;
		this.j = j;
	}
	
	@Override
	public String toString() {
		// 필요한 내용을 작성해서 return에 주면 된다
		return i+":"+j;
	}
	
	public static void main(String[] args) {
		ObjectEx oe = new ObjectEx();
		String res = oe.toString();
		System.out.println(res);
	}
}
