// *
// **
// ***
// ****
// *****
// ===============
// *****
// ****
// ***
// **
// *
// ===============
//     *
//    **
//   ***
//  ****
// *****
// ===============
// *****
//  ****
//   ***
//    **
//     *
/// 그려보기
class ForEx7{ 
	public static void main(String args[]){ 
		for(int i = 0 ; i < 5 ; i++)
		{
			for(int j = 0 ;  j <= i ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("============");
		for(int i = 5 ; i > 0 ; i--)
		{
			for(int j = 0 ;  j < i ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("============");
		for(int i = 0 ; i < 5 ; i++)
		{
			for(int j = 4 ;  j >= 0 ; j--)
			{
				if(i >= j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("============");
		for(int i = 0 ; i < 5 ; i++)
		{
			for(int j = 0 ;  j < 5 ; j++)
			{
				if(i <= j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("============");
		for(int i= 0 ; i  < 10;  i++)
		{
			for(int j = i; j < 5 ; j++)
			{
				System.out.print("  ");
			}
			for(int k = 0 ; k < (i*2)+1; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("============");
	}
}
