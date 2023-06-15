/*    */ package gymrat;
/*    */ import java.awt.Color;
/*    */ import java.awt.EventQueue;
import java.awt.Font;
/*    */ import java.awt.LayoutManager;
/*    */ import java.util.logging.Level;
/*    */ import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
/*    */ import javax.swing.JFrame;
/*    */ import javax.swing.JLabel;
/*    */ import javax.swing.JPanel;
/*    */ import javax.swing.JScrollPane;
/*    */ import javax.swing.JTextArea;
/*    */ import javax.swing.UIManager;
/*    */ import javax.swing.UnsupportedLookAndFeelException;
/*    */ //import org.netbeans.lib.awtextra.AbsoluteConstraints;
/*    */ //import org.netbeans.lib.awtextra.AbsoluteLayout;
/*    */ 
/*    */ public class about extends JFrame {
/*    */   public about() {
/* 19 */     initComponents();
/* 20 */     //setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("biceps.jpg")));
/*    */   }
/*    */ 
/*    */   
/*    */   private JTextArea aboutta;
/*    */   
/*    */   private JLabel appiconlbl;
/*    */   
/*    */   private JPanel jPanel1;
/*    */   
/*    */   private JScrollPane jScrollPane1;
/*    */   
/*    */   private void initComponents() {
/* 33 */     this.jPanel1 = new JPanel();
/* 34 */     this.appiconlbl = new JLabel();
/* 35 */     this.jScrollPane1 = new JScrollPane();
/* 36 */     this.aboutta = new JTextArea();
/*    */     
/* 38 */     setDefaultCloseOperation(2);
/* 39 */     setTitle("Gymrat[About]");
/* 40 */     setBackground(new Color(0, 0, 0));
/* 41 */     setResizable(false);
///* 42 */     getContentPane().setLayout((LayoutManager)new AbsoluteLayout());
/*    */     
/* 44 */     this.jPanel1.setBackground(new Color(0, 0, 0));
///* 45 */     this.jPanel1.setLayout((LayoutManager)new AbsoluteLayout());
/*    */     
/* 47 */     this.appiconlbl.setIcon(new ImageIcon(getClass().getResource("/gymrat/biceps.jpg")));
/* 48 */  //   this.jPanel1.add(this.appiconlbl, new AbsoluteConstraints(20, 30, 420, 300));
/*    */     
/* 50 */     this.aboutta.setEditable(false);
/* 51 */     this.aboutta.setBackground(new Color(0, 0, 0));
/* 52 */     this.aboutta.setColumns(20);
/* 53 */     this.aboutta.setFont(new Font("Arial", 0, 18));
/* 54 */     this.aboutta.setForeground(new Color(153, 153, 153));
/* 55 */     this.aboutta.setRows(5);
/* 56 */     this.aboutta.setText("Project name : GymRat Diet and Gym management\nSystem :CentOS 7 RedHat(64-bit) \nLanguage : Java 19.0.2\nIDE : Apache NetBeans 16 \n\nProject by :      Aniruddha Pandit - 32\n\tBhavesh Chaudhari - 33\n\tIshaan Nakhare -29\n\tShreyash Kale - 70");
/* 57 */     this.aboutta.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 1, new Color(153, 153, 153)));
/* 58 */     this.jScrollPane1.setViewportView(this.aboutta);
/*    */     
/* 60 */    // this.jPanel1.add(this.jScrollPane1, new AbsoluteConstraints(20, 350, 420, 210));
/*    */     
/* 62 */    // getContentPane().add(this.jPanel1, new AbsoluteConstraints(0, 0, 470, 600));
/*    */     
/* 64 */     pack();
/* 65 */     setLocationRelativeTo(null);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void main(String[] args) {
/*    */     try {
/* 78 */       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
/* 79 */         if ("Nimbus".equals(info.getName())) {
/* 80 */           UIManager.setLookAndFeel(info.getClassName());
/*    */           break;
/*    */         } 
/*    */       } 
/* 84 */     } catch (ClassNotFoundException ex) {
/* 85 */       Logger.getLogger(about.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 86 */     } catch (InstantiationException ex) {
/* 87 */       Logger.getLogger(about.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 88 */     } catch (IllegalAccessException ex) {
/* 89 */       Logger.getLogger(about.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 90 */     } catch (UnsupportedLookAndFeelException ex) {
/* 91 */       Logger.getLogger(about.class.getName()).log(Level.SEVERE, (String)null, ex);
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 96 */     EventQueue.invokeLater(new Runnable() {
/*    */           public void run() {
/* 98 */             new about().setVisible(true);
/*    */           }
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\pandi\OneDrive\Desktop\Gymrat.jar!\gymrat\about.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */