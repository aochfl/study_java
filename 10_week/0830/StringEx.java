package _0830;

public class StringEx {
	public static void main(String[] args) {
		String str = "안녕하세요안녕하세요";
		int io1 = str.indexOf("녕");
		System.out.println(io1);
		
		int lo2 = str.lastIndexOf("녕");
		System.out.println(lo2);
		
		char ch = str.charAt(3);
		System.out.println(ch);
		
		int len = str.length();
		System.out.println(len);
		
		String s1 = str.substring(5);
		System.out.println(s1);
		
		String s2 = str.substring(3,6);
		System.out.println(s2);
		
		String str2="    abCdEFGhi    ";
		String s3 = str2.toLowerCase();
		String s4 = str2.toUpperCase();
		String s5 = str2.trim();

		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}
}
