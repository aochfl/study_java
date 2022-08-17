import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeModel;


public class TreeEx2 extends JFrame{
	TreeEx2(){
		this.setSize(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		DefaultMutableTreeNode node = new DefaultMutableTreeNode();
		DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Vegetables");
		DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("Fruits");
		

		DefaultTreeCellRenderer iconRenderer = new DefaultTreeCellRenderer();
		
		node.add(node1);
		
		
		node1.add(new DefaultMutableTreeNode("Capsicum"));
		node1.add(new DefaultMutableTreeNode("Carrot"));
		node1.add(new DefaultMutableTreeNode("Tomato"));
		node1.add(new DefaultMutableTreeNode("Banana"));
 
		node.add(node2);
		node2.add(new DefaultMutableTreeNode("Banana"));
		node2.add(new DefaultMutableTreeNode("Mango"));
		node2.add(new DefaultMutableTreeNode("Apple"));
		node2.add(new DefaultMutableTreeNode("Grapes"));
		
		JTree tree = new JTree(node);
		tree.setRootVisible(false);
		tree.setShowsRootHandles(true);
		
		DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
		renderer.setLeafIcon(new ImageIcon("1.png"));
//		renderer.setClosedIcon(new ImageIcon("ghost.jpg"));
//		renderer.setOpenIcon(new ImageIcon("robot.jpg"));
	//	      ImageIcon imageIcon = new ImageIcon()
	  
		tree.setCellRenderer(renderer);
	    tree.setEditable(true);

		
		
		
		
		
		JScrollPane sp = new JScrollPane(tree);
		this.add(sp);
		
		
		
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		TreeEx2 ex2 = new TreeEx2();
	}
}
