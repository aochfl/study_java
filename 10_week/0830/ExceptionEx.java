package _0830;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExceptionEx {
	
	// 예외는 직접처리, 가상머신에게 대신처리를 맡김
	//	try{
	//		예외가 발생할 수 있는 부분
	//	} 
	//	catch(발생할 예외)
	//	{ 예외 발생시 처리 코드 }
	
	// 예외를 던진다는 이야기는 실제 사용하는 코드에서 다시 예외처리를 해야한다.
	void makeFile(String name, String data) throws IOException { // 파일명, 내용 받아서 파일만들기
		File f = new File(name); // 파일 객체 만들기
		FileWriter fw = new FileWriter(f);	// 파일에 내용을 추가, 새로 작성
		PrintWriter pw = new PrintWriter(fw);	// println을 사용 - 줄단위 입력
		
		pw.println(data);	// 실제 내용 입력
		pw.close();	// 사용후 파일 닫기
	}
	public static void main(String[] args) throws IOException{
		ExceptionEx ee = new ExceptionEx();
		ee.makeFile("test.txt", "값값값");
	}
}
