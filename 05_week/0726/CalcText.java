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

// �⺻���� ���� GUI ���� class�Դϴ�.
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
		// ��ư�� ����� ������ ��/�� 
		// MIN~MAX ������ ��/���� ����� �����Ѵ�
		int MIN_ROW = 1, MAX_ROW = 4;
		int MIN_COL = 0, MAX_COL = 2;
		///////////////////////////////
		
		this.setLayout(new GridLayout(0, 1)); // ���⸦ 1�پ� �������ϱ� ���� GridLayout �ο�
		
		JTextField text = new JTextField(); // �ֻ���� testField
		this.add(text);
		
		for(int row = 0 ; row < btnTextList.length ; row++) { // btnTextList.length ���� ��
			JPanel p = new JPanel();			// ��ư�� ���پ� ���̱� ���� �г�
			p.setLayout(new GridLayout(0, 4)); // ��ư 1�ٿ� 4���� �ֱ� ����  GridLayout ����
			for(int col = 0 ; col < btnTextList[row].length ; col++) {	// btnTextList[i].length i��° ���� ���� ��
				CLButton btn = new CLButton(btnTextList[row][col]); // ����� ��ư ��ü ����
				// ������ ������ ��/�� �� ������ ��ư�� �������� �����ϴ� ����
				if( MIN_ROW <= row && row <= MAX_ROW &&
					MIN_COL <= col && col <= MAX_COL )
					btn.setBackground(Color.white);
				//////////////////////////////////////////
				p.add(btn); // ������ ��ư�� panel �� �߰�
			}
			this.add(p); // ������ panel�� frame�� �߰�
		}
		
		this.setVisible(true);
	}
}

public class CalcText{
	public static void main(String[] args) {	
		// �⺻ ����
		NormalCalc f = new NormalCalc(240,400);
	}
}
