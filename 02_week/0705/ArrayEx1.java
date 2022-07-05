class ArrayEx1{ 
	// 1. 배열 -> 2.Collection
	// 배열은 변수의 묶음이다.
	// 배열은 미리 공간을 만들어야 한다.
	// 배열은 변수[숫자] 형태로 만들어진다.
	// 배열의 시작은 0 부터이고, 배열의 전체 크기는 "배열이름.length"로 확인가능하다.
	// 배열을 만들때는 type 배열명[] = new type[개수(정수)];
	// 또는 미리 값을 넣어도 된다. int arr2[] = {1,2,3};
	
	public static void main(String args[]){ 
		// String book1 = "노인과 바다";
		// String book2 = "오만과 편견";
		// String book3 = "데미안";
		
		// 도서관에 있는 모든 책을 출력해보자.

		String book[] = new String[7]; // 3이기 때문에 번호는 0 1 2 의 번호를 가진다.
		book[0]="노인과 바다";
		book[1]="오만과 편견";
		book[2]="달과 6펜스";
		book[3]="데미안";
		book[4]="장발장";
		book[5]="60일간의 세계일주";
		book[6]="인간 관계론";
		
		for(int i =0 ; i < book.length ; i++)
		{
			System.out.println(book[i]);
		}
	}
}
