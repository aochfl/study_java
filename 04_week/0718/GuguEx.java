class Gugu{ 
	int dan;
	int num;
	void setNum(int dan, int num) {
		this.dan = dan;
		this.num = num;
	}
	void showData() {
		for(int i = 1 ; i <= num ; i++)
		{
			System.out.print(dan+"*"+i+"="+dan*i+"\t");
		}
		System.out.println();
	}
}
public class GuguEx {

	public static void main(String[] args) {
		Gugu g = new Gugu();
		g.setNum(2, 5); // 2���� x5���� ���
		g.showData();
	}
}
