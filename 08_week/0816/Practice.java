import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

class TreePractice extends JPanel{
	public TreePractice() {
		DefaultMutableTreeNode node = new DefaultMutableTreeNode("���");
		DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("���1");
		DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("���2");
		DefaultMutableTreeNode node3 = new DefaultMutableTreeNode("���3");
		DefaultMutableTreeNode node4 = new DefaultMutableTreeNode("���4");
		
		node.add(node1);
		node.add(node2);
		node1.add(node3);
		node2.add(node4);
		
		JTree tree = new JTree(node);
		this.add(tree);
	}
}

class JMenuPractice extends JPanel{
	JMenuPractice(){
		
	}
}

class TabbedPractice extends JFrame{
	TabbedPractice (){
		this.setSize(500,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbed = new JTabbedPane();
		
		tabbed.add("�޴�1",new TreePractice());
		tabbed.add("�޴�2",new JMenuPractice());
		this.add(tabbed);
		
		this.setVisible(true);
	}
}


public class Practice {
	
	
	public static void main(String[] args) {
		TabbedPractice tab = new TabbedPractice();
	}
}
