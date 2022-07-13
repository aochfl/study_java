
public class AdvancedForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {95,71,84,93,87};
		
		int sum = 0;
		for (int score: scores) {
			sum += score;
		}
		System.out.println("ÃÑÇÕ = "+sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("Á¡¼ö Æò±Õ = "+avg);
	}

}
