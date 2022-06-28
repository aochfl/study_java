import java.util.Scanner;

class IfTest3{ 
	/*
첫번째 숫자 : <== 입력
두번째 숫자 : <== 입력
세번째 숫자 : <== 입력

==> 작은 순으로 정렬해서 출력하시오
	*/
	public static void main(String args[]){ 		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하시오 :");
		int i = sc.nextInt();
		System.out.print("두번째 숫자를 입력하시오 :");
		int j = sc.nextInt();
		System.out.print("세번째 숫자를 입력하시오 :");
		int k = sc.nextInt();
		
		
		// 1
		if(i > j){
			if(i > k){
				if(j > k){
					System.out.printf("%d %d %d\n",k,j,i);
				}
				else{
					System.out.printf("%d %d %d\n",j,k,i);
				}
			}
			else{
				System.out.printf("%d %d %d\n",j,i,k);
			}
		}
		else{
			if(j > k){
				if(i > k){
					System.out.printf("%d %d %d\n",k,i,j);
				}
				else{
					System.out.printf("%d %d %d\n",i,k,j);
				}
			}
			else{
				System.out.printf("%d %d %d\n",i,j,k);
			}
		}
		
		// 2
		if( i>j && i>k){
			if(j>k){
				System.out.printf("%d %d %d\n",k,j,i);
			}
			else{
				System.out.printf("%d %d %d\n",j,k,i);
			}
		}
		else if(i>j && i<k){
			System.out.printf("%d %d %d\n",j,i,k); 
		}
		else if(j>i && j>k){
			if(i>k){
				System.out.printf("%d %d %d\n",k,i,j);
			}
			else{
				System.out.printf("%d %d %d\n",i,k,j);
			}
		}
		else if(j>i && j<k){
			System.out.printf("%d %d %d\n",i,j,k);
		}
		
		// 3
		if(i<j && i<k){
			System.out.print(i+" ");
			if(j<k){
				System.out.print(j+" ");
				System.out.print(k);
			}else{
				System.out.print(k+" ");
				System.out.print(j);
			}
		}
		if(j<i && j<k){
			System.out.print(j+" ");			
			if(i<k){
				System.out.print(i+" ");
				System.out.print(k);
			}else{
				System.out.print(k+" ");
				System.out.print(i);
			}
		}
		if(k<i && k<j){
			System.out.print(k+" ");
			if(i<j){
				System.out.print(i+" ");
				System.out.print(j);
			}else{
				System.out.print(j+" ");
				System.out.print(i);
			}
		}
	}
}
