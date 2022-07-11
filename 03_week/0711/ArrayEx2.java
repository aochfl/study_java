import java.util.Arrays;


public class ArrayEx2 {
	public static void main(String[] args) {
		int[] x = new int[10];
		
		int[][]k = new int [5][10];
		
		for( int i =0 ; i< 10; i++)
		{
			x[i] = 0;
		}
		System.out.println(Arrays.toString(x));
		
		for(int i = 0 ; i < 5 ; i++)
		{
			for(int j = 0 ; j < 10;j++) {
				k[i][j] = 0;
			}
			System.out.println(Arrays.toString(k[i]));
		}
	}
}
