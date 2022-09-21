package javaChatProgram;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClientGUI extends JFrame implements ActionListener {

	Socket socket;
	BufferedReader br;
	PrintWriter pw;
	Thread t1;

	JTextField tf;
	JTextArea ta;
	JScrollPane sp;
	JButton btnSend;
	JButton btnConnect;

	JTextField tfid;
	JTextField tfip;
	JLabel lblid;
	JLabel lblip;

	JList<String> list;
	DefaultListModel<String> model;

	public ChatClientGUI() {

		try {
			InetAddress inet = InetAddress.getLocalHost();
			String title = inet.getHostAddress();
			this.setTitle(title);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.setSize(400, 600);

		tf = new JTextField(25);
		tf.addActionListener(this);
		btnSend = new JButton("전송");
		btnSend.addActionListener(this);
		ta = new JTextArea();
		sp = new JScrollPane(ta);
		JPanel pnl = new JPanel();
		pnl.add(tf);
		pnl.add(btnSend);

		JPanel pnl2 = new JPanel();
		lblid = new JLabel("아이디");
		lblip = new JLabel("아이피");
		tfip = new JTextField("localhost", 10);
		tfid = new JTextField("ㅇㅇㄷ", 10);
		btnConnect = new JButton("연결");
		btnConnect.addActionListener(this);
		pnl2.add(lblip);
		pnl2.add(tfip);
		pnl2.add(lblid);
		pnl2.add(tfid);
		pnl2.add(btnConnect);

		model = new DefaultListModel<>();
		list = new JList<>(model);
		model.addElement("==접속자목록==");

		this.add(pnl2, "North");
		this.add(sp);
		this.add(pnl, "South");
		this.add(list, "East");
		this.setVisible(true);

		// this.setDefaultCloseOperation(3);
		// 기본 닫기는 쓰레드를 안전하게 종료하지 않으므로 종료는 되지만 예외가 발생한다.
		this.addWindowListener(new WindowListener() {
			@Override
			public void windowOpened(WindowEvent e) {
			}

			@Override
			public void windowIconified(WindowEvent e) {
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
			}

			@Override
			public void windowClosing(WindowEvent e) {
				if (pw != null) {
					System.out.println("클라이언트 종료");
					pw.println("/quit ");
					pw.flush();
					System.exit(0);
				} else {
					System.exit(0);
				}
			}

			@Override
			public void windowClosed(WindowEvent e) {
			}

			@Override
			public void windowActivated(WindowEvent e) {
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnConnect) {// 연결
			connection();
		} else if (e.getSource() == btnSend) {// 전송
			sendMsg(tf.getText());
			tf.setText("");
		} else if (e.getSource() == tf) {
			sendMsg(tf.getText());
			tf.setText("");
		}

	}

	void connection() {// 서버에 연결하기

		String ip = tfip.getText();
		String id = tfid.getText();
		try {
			socket = new Socket(ip, 10001);
			// 연결끝 - 서버의 accept부분이 실행됨

		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} // ip, port

		try {
			// 연결통로만들기 input / output
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));

			pw.println(tfid.getText());// 서버에 아이디 전송
			pw.flush();

			clientThread2();// 쓰레드 실행

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	void clientThread2() {
		t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					// 서버로 부터 들어오는 내용 읽어서 출력하기
					String line = null;
					while ((line = br.readLine()) != null) {
						System.out.println("서버로부터 받은메세지 : " + line);
						if (line.indexOf("/serverdown") == 0) {
							JOptionPane.showMessageDialog(ta, "[알림] 서버가 종료되었습니다");
							break;
						} else if (line.indexOf("/quit") == 0) {
							model.removeAllElements();
							pw.println("/quit ");
							pw.flush();
							JOptionPane.showMessageDialog(ta, "[알림] 서버로부터 강퇴되었습니다");
						} else if (line.indexOf("/members") == 0) {
							System.out.println(line);
							model.removeAllElements();// 갱신을 위해서 다 지우기
							model.addElement("==접속자목록==");// 처음에 집어 넣기
							String[] userList = line.split(" ")[1].split("#");
							for (int i = 0; i < userList.length; i++) {
								model.addElement(userList[i]);
							}
						} else if (line.indexOf("/list") == 0) {
							System.out.println(line);
							model.removeAllElements();// 갱신을 위해서 다 지우기
							model.addElement("==접속자목록==");// 처음에 집어 넣기
							String[] userList = line.split(" ");
							for (int i = 1; i < userList.length; i++) {
								model.addElement(userList[i]);
							}
						} else if (line.indexOf("/cl") == 0) {
							ta.setText("");
						} else if (line.indexOf("/off") == 0) {
							btnSend.setEnabled(false);
						} else if (line.indexOf("/on") == 0) {
							btnSend.setEnabled(true);
						} else {
							ta.append(line + "\n");
							sp.getVerticalScrollBar().setValue(sp.getVerticalScrollBar().getMaximum());
						}
					}
					System.exit(0);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t1.start();

		// 쓰레드 끝
	}

	public void sendMsg(String str) {// 서버로 글쓰기 - 내통로를 통해서 서버에 글씨를 날림
		pw.println(str);
		pw.flush();
	}

	public static void main(String[] args) {
		new ChatClientGUI();
	}

}
