package FileUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MemberFile {
	final static String memberTxt = "Member.txt";// AuthForm.memberTxt
	
	// idChek("asdf") => true/false
	public static boolean idCheck(String id) {
		boolean result = false;
		// 파일 처리 작업
		File f = new File(memberTxt);
		FileReader fr;
		
		try {			
			
			fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line=br.readLine()) != null) {// 한줄씩 읽어온다. null이 아닐때까지 
				String[] lineData = line.split("/");// /로 잘라서 배열에 담는다
				if(lineData[0].equals(id)) {
					result=true;
					break;
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	public static void regiMember(String data) {//
		
		File f = new File(memberTxt);
		FileWriter fw;
		try {
			fw = new FileWriter(f,true);
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println(data);
			pw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}
	

}
















