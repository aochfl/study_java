package _0830;

// 기본타입은 메서드를 가지고 있지 않다.
// 하지만 우리는 기본타입에 관련된 메서드들이 필요하다.


public class WrapperEx {
	public static void main(String[] args) {
		// char => Character
		// int => Integer
		// 나머지는 단어는 똑같고 첫글자만 대문자
		
//		int i = 10;
		Integer ii = 20;
		
		String weight="80.5";
		double d = Double.parseDouble(weight);
		
		String bool = "true";
		boolean b = Boolean.parseBoolean(bool);
		
		String in = "100";
		int i = Integer.parseInt(in);
				
	}
}
