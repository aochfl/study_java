class IfTest{ 
	// if 만약에...
	// if(조건) 
	// 조건의 결과는 반드시 true/false가 나올 수 있는 조건이 들어가야한다.
	// => 조건의 결과는 true/false가 되어야한다
	public static void main(String args[]){ 
		//if(10>5 && 5>2){ // 조건이 참(true)일때만 실행됨
		//	System.out.println("출력");
		//}
		//if(false){
		//	System.out.println("출력안됨");
		//}
		
		int randomNum = 10; 
		int userInput = 15;		
		
		if( randomNum>userInput ) {
			System.out.println("더 작은수를 입력하세요");
		}
		else{ // if의 조건이 맞지 않을때만 실행됨
			System.out.println("더 큰수를 입력하세요");
		}
	}
}
