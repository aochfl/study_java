package _0905;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TimeGUI extends JFrame implements ActionListener{
   JLabel lbl;
   JButton btn;
   public TimeGUI() {
      this.setSize(300, 200);
      this.setDefaultCloseOperation(3);
      btn = new JButton("클릭");
      btn.addActionListener(this);
      lbl = new JLabel();
      this.add(lbl);
      this.add(btn,"South");
      this.setVisible(true);      
   }
   
   void setTime() {
      for(int i=10;i>=0;i--) {
         lbl.setText(i+"");
         try {
            Thread.sleep(1000);
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
   }
   
   public static void main(String[] args) {
      new TimeGUI();
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      setTime();
      
   }
}
