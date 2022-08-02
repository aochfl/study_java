import javax.swing.JList;
import javax.swing.ListSelectionModel;

public class GUIExList extends HFrame{
	JList list;
	
	public GUIExList() {
		String[] city = {"서울","강원","충청","대전","부산","제주"};
		list = new JList(city);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.add(list);
		
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new GUIExList();
	}
}
