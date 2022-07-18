
 class TimeTables {
	 void ttable(int number ) {
		 for(int i = 1; i < 10 ; i++)
		 {
			 System.out.print(number+"*"+i+"="+(number*i)+"\t");
		 }
		 System.out.println();
	 }
}


 public class TtTest{
	public static void main(String[] args) {
		TimeTables tt = new TimeTables();
		tt.ttable(2);
		tt.ttable(3);
		tt.ttable(4);
		tt.ttable(5);
		tt.ttable(6);
		tt.ttable(7);
		tt.ttable(8);
	}
}