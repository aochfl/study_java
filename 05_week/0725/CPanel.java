import java.awt.Color;

import javax.swing.JPanel;

public class CPanel extends JPanel{
	public CPanel() {
		//super(); <= �θ��� �����ڸ� �ݵ�� �ҷ��� �ϴ°��� �ƴ�
		// �ֳ��ϸ� �θ� ������ڸ� ������ ������ �˾Ƽ� ȣ���
		// ���� �θ� �������() <= ���ξȿ� �ƹ��͵� ���� �����ڰ� ���ٸ� �ݵ��
		// 		super(�Ű�����) <= �θ��� �����ڸ� ��������� ȣ���ؾ���
	}
	public CPanel(Color c) {
		this.setBackground(c);
	}
}
