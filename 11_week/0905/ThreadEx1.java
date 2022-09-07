package _0905;


public class ThreadEx1 {
   public static void main(String[] args) {      
      Thread t1 = new Thread(new Runnable() {         
         @Override
         public void run() {
            for(int i=0;i<10;i++) {
               System.out.println("X");
               
               try {
                  Thread.sleep(1000);
               } catch (InterruptedException e) {
                  // TODO Auto-generated catch block
                  e.printStackTrace();
               }
            }            
         }
      });
      Thread t2 = new Thread(new Runnable() {         
         @Override
         public void run() {
            for(int i=0;i<10;i++) {
               System.out.println("O");
               try {
                  Thread.sleep(1000);
               } catch (InterruptedException e) {
                  // TODO Auto-generated catch block
                  e.printStackTrace();
               }
            }
         }
      });
      
      t1.start();
      t2.start();
      
      
   }
}