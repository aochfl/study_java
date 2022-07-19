class StringTest{
	String str;
	StringTest(){
		str="";
	}
	void add(String str) {
		this.str = this.str.concat(str).concat(" ");
	}
	void add(Boolean b) {
		this.str += b;
		space();
	}
	void add(int i) {
		this.str += i;
		space();
	}
	void space() {
		this.str = this.str.concat(" ");
	}
	void showData() {
		System.out.println(str);
	}
}
public class OverloadingEx {
	public static void main(String args[]){
	    StringTest st = new StringTest();

	    st.add("¾È³ç");
	    st.add(true);
	    st.add(1);
	    st.add("¹æ°¡");

	    st.showData();// ¾È³çtrue1¹æ°¡

	}
}
