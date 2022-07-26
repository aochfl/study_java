import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


class CLButton extends JButton{
	public CLButton(String str) {
		this(str,100,100);
	}
	public CLButton(String str, int w, int h) {
		this.setSize(w,h);
		this.setText(str);
	}
}

// 기본적인 계산기 GUI 생성 class입니다.
class NormalCalc extends JFrame{
	NormalCalc(int w, int h){
		this.setSize(w,h);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		String[][] btnTextList = {  {"%","CE","C","%"},
									{"7","8","9","*"},
									{"4","5","6","-"},
									{"1","2","3","+"},
									{"+/","0",".","="}
								};
		// 버튼의 배경을 지정할 행/열 
		// MIN~MAX 사이의 행/열의 배경을 변경한다
		int MIN_ROW = 1, MAX_ROW = 4;
		int MIN_COL = 0, MAX_COL = 2;
		///////////////////////////////
		
		this.setLayout(new GridLayout(0, 1)); // 계산기를 1줄씩 랜더링하기 위해 GridLayout 부여
		
		JTextField text = new JTextField(); // 최상단의 testField
		this.add(text);
		
		for(int row = 0 ; row < btnTextList.length ; row++) { // btnTextList.length 행의 수
			JPanel p = new JPanel();			// 버튼을 한줄씩 붙이기 위한 패널
			p.setLayout(new GridLayout(0, 4)); // 버튼 1줄에 4개씩 넣기 위해  GridLayout 세팅
			for(int col = 0 ; col < btnTextList[row].length ; col++) {	// btnTextList[i].length i번째 행의 열의 수
				CLButton btn = new CLButton(btnTextList[row][col]); // 등록할 버튼 객체 생성
				// 위에서 설정한 행/열 의 범위의 버튼에 배경색상을 지정하는 동작
				if( MIN_ROW <= row && row <= MAX_ROW &&
					MIN_COL <= col && col <= MAX_COL )
					btn.setBackground(Color.white);
				//////////////////////////////////////////
				p.add(btn); // 생성한 버튼을 panel 에 추가
			}
			this.add(p); // 생성한 panel을 frame에 추가
		}
		
		this.setVisible(true);
	}
}

public class CalcText{
	public static void main(String[] args) {	
		// 기본 계산기
		NormalCalc f = new NormalCalc(240,400);
	}
}
