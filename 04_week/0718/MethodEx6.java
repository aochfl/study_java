
public class MethodEx6 {
	char charAt(String str, int index) {
		char c = '0';
		
		if(str.length()< index) {
			System.out.println("인덱스 범위 에러");
		}
		else {
			// 방법1
			// c= str.charAt(index);
			
			// 방법2
			char[] carr = str.toCharArray();
			
			c= carr[index];
		}
		return c; 
	}
	
	
	public static void main(String[] args) {
		MethodEx6 me = new MethodEx6();
		char c = me.charAt("abcde",3);
		System.out.println(c);
	}
}
