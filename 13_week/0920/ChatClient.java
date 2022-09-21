package javaChatProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChatClient {
	Scanner sc;
	String ip;
	String id;
	PrintWriter pw;
	BufferedReader br;

	BufferedReader keyboard;
	Thread t1;

	public ChatClient() {
		sc = new Scanner(System.in);
		// 127.0.0.1 == localhost
//		System.out.print("아이피를 입력하세요(내컴퓨터는 localhost):");
//		ip = sc.nextLine();
//		ip = "10.100.205.116";
		ip = "localhost";
		System.out.print("아이디를 입력하세요:");
		id = sc.nextLine();
//		id = "idid";

		if (ip.trim().length() == 0 || id.trim().length() == 0) {
			System.out.println("아이피/아이디는 필수 입니다.");
			System.exit(0);
		}

		try {
			Socket socket = new Socket(ip, 10001);// 서버에 연결하기

			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			pw = new PrintWriter(osw);
			// 클라이언트 => 서버 연결통로

			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			// 서버 => 클라이언트 연결통로
			//// 여기까지가 서버와 연결통로 만들기 끝

			keyboard = new BufferedReader(new InputStreamReader(System.in));
			// 키보드로 부터 줄 단위로 입력 받기 위한 br

			pw.println(id);
			pw.flush();
			// 연결한 다음 자동으로 id 보내기

			// 이하 Thread로 서버로 부터 들어오는 내용을 계속 받을수 있도록 작성해야 함
			clientThread2();

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("서버접속실패");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("서버접속실패");
		} // 접속할 ip , port

	}

	void clientThread2() {
		t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					// 서버로부터 들어오는 내용 읽어서 출력하기
					String line = null;
					while ((line = br.readLine()) != null) {
						System.out.println(line);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		});
		t1.start();
		// 쓰레드 끝

		try {
			// 키보드로부터 입력받은 글씨 서버로 보내기
			String keyboardLine = null;
			while ((keyboardLine = keyboard.readLine()) != null) {
				pw.println(keyboardLine);

				pw.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ChatClient();
	}

}
