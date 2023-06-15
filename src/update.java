/*     */ package gymrat;
/*     */ import java.awt.Color;
import java.awt.Component;
import java.sql.*;
/*     */ import java.awt.Dimension;
import java.awt.EventQueue;
/*     */ import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.Toolkit;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.sql.Connection;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
import javax.swing.JOptionPane;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;
/*     */ 
/*     */ public class update extends JFrame {
/*     */   private JLabel agelbl;
/*     */   private JTextField agetf;
/*     */   private JButton backbtn;
/*     */   
/*     */   public update(String name) {
/*  23 */     this.name = name;
/*  24 */     initComponents();
/*  25 */     setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("biceps.jpg")));
/*     */   }
/*     */   private JLabel heightlbl; private JTextField heighttf; private JLabel jLabel1;
/*     */   private JLabel jLabel2;
/*     */   private JLabel updatebglbl;
/*     */   private JButton updatebtn;
/*     */   private JLabel weightlbl;
/*     */   private JTextField weighttf;
/*     */   private String name;
/*     */   
/*     */   public update() {}
/*     */   
/*     */   private void initComponents() {
/*  38 */     this.weightlbl = new JLabel();
/*  39 */     this.weighttf = new JTextField();
/*  40 */     this.heightlbl = new JLabel();
/*  41 */     this.heighttf = new JTextField();
/*  42 */     this.agelbl = new JLabel();
/*  43 */     this.agetf = new JTextField();
/*  44 */     this.updatebtn = new JButton();
/*  45 */     this.backbtn = new JButton();
/*  46 */     this.jLabel1 = new JLabel();
/*  47 */     this.jLabel2 = new JLabel();
/*  48 */     this.updatebglbl = new JLabel();
/*     */     
/*  50 */     setDefaultCloseOperation(2);
/*  51 */     setTitle("Gymrat[Update]");
/*  52 */     setMaximumSize(new Dimension(1080, 720));
/*  53 */     setMinimumSize(new Dimension(1080, 720));
/*  54 */     setResizable(false);
/*  55 */     setSize(new Dimension(1080, 720));
/*  56 */     getContentPane().setLayout((LayoutManager)new AbsoluteLayout());
/*     */     
/*  58 */     this.weightlbl.setFont(new Font("Arial", 0, 24));
/*  59 */     this.weightlbl.setForeground(new Color(153, 153, 153));
/*  60 */     this.weightlbl.setText("Weight :");
/*  61 */     this.weightlbl.setPreferredSize(new Dimension(63, 20));
/*  62 */     getContentPane().add(this.weightlbl, new AbsoluteConstraints(280, 160, 110, 40));
/*     */     
/*  64 */     this.weighttf.setBackground(new Color(153, 153, 153));
/*  65 */     this.weighttf.setFont(new Font("Arial", 0, 18));
/*  66 */     this.weighttf.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153), 3));
/*  67 */     this.weighttf.setPreferredSize(new Dimension(120, 23));
/*  68 */     this.weighttf.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  70 */             update.this.weighttfActionPerformed(evt);
/*     */           }
/*     */         });
/*  73 */     getContentPane().add(this.weighttf, new AbsoluteConstraints(390, 170, -1, -1));
/*     */     
/*  75 */     this.heightlbl.setFont(new Font("Arial", 0, 24));
/*  76 */     this.heightlbl.setForeground(new Color(153, 153, 153));
/*  77 */     this.heightlbl.setText("Height :");
/*  78 */     this.heightlbl.setPreferredSize(new Dimension(63, 20));
/*  79 */     getContentPane().add(this.heightlbl, new AbsoluteConstraints(280, 210, 110, 40));
/*     */     
/*  81 */     this.heighttf.setBackground(new Color(153, 153, 153));
/*  82 */     this.heighttf.setFont(new Font("Arial", 0, 18));
/*  83 */     this.heighttf.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153), 3));
/*  84 */     this.heighttf.setPreferredSize(new Dimension(120, 23));
/*  85 */     getContentPane().add(this.heighttf, new AbsoluteConstraints(390, 220, -1, -1));
/*     */     
/*  87 */     this.agelbl.setFont(new Font("Arial", 0, 24));
/*  88 */     this.agelbl.setForeground(new Color(153, 153, 153));
/*  89 */     this.agelbl.setText("Age :");
/*  90 */     this.agelbl.setPreferredSize(new Dimension(63, 20));
/*  91 */     getContentPane().add(this.agelbl, new AbsoluteConstraints(280, 260, 110, 40));
/*     */     
/*  93 */     this.agetf.setBackground(new Color(153, 153, 153));
/*  94 */     this.agetf.setFont(new Font("Arial", 0, 18));
/*  95 */     this.agetf.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153), 3));
/*  96 */     this.agetf.setPreferredSize(new Dimension(120, 23));
/*  97 */     getContentPane().add(this.agetf, new AbsoluteConstraints(390, 270, -1, -1));
/*     */     
/*  99 */     this.updatebtn.setBackground(new Color(153, 153, 153));
/* 100 */     this.updatebtn.setFont(new Font("Arial", 0, 18));
/* 101 */     this.updatebtn.setForeground(new Color(0, 0, 0));
/* 102 */     this.updatebtn.setText("Update");
/* 103 */     this.updatebtn.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
/* 104 */     this.updatebtn.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 106 */             update.this.updatebtnActionPerformed(evt);
/*     */           }
/*     */         });
/* 109 */     getContentPane().add(this.updatebtn, new AbsoluteConstraints(310, 450, 90, 30));
/*     */     
/* 111 */     this.backbtn.setBackground(new Color(153, 153, 153));
/* 112 */     this.backbtn.setFont(new Font("Arial", 0, 18));
/* 113 */     this.backbtn.setForeground(new Color(0, 0, 0));
/* 114 */     this.backbtn.setText("Back");
/* 115 */     this.backbtn.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
/* 116 */     this.backbtn.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 118 */             update.this.backbtnActionPerformed(evt);
/*     */           }
/*     */         });
/* 121 */     getContentPane().add(this.backbtn, new AbsoluteConstraints(460, 450, 90, 30));
/*     */     
/* 123 */     this.jLabel1.setFont(new Font("Arial", 0, 18));
/* 124 */     this.jLabel1.setForeground(new Color(153, 153, 153));
/* 125 */     this.jLabel1.setText("In cms");
/* 126 */     this.jLabel1.setToolTipText("");
/* 127 */     getContentPane().add(this.jLabel1, new AbsoluteConstraints(530, 220, -1, -1));
/*     */     
/* 129 */     this.jLabel2.setFont(new Font("Arial", 0, 18));
/* 130 */     this.jLabel2.setForeground(new Color(153, 153, 153));
/* 131 */     this.jLabel2.setText("In Kgs");
/* 132 */     this.jLabel2.setToolTipText("");
/* 133 */     getContentPane().add(this.jLabel2, new AbsoluteConstraints(530, 170, -1, -1));
/*     */     
/* 135 */     this.updatebglbl.setFont(new Font("Arial", 0, 24));
/* 136 */     this.updatebglbl.setIcon(new ImageIcon("/root/Downloads/pexels-binyamin-mellish-116079 (1).jpg"));
/* 137 */     this.updatebglbl.setText("jLabel1");
/* 138 */     this.updatebglbl.setPreferredSize(new Dimension(1080, 720));
/* 139 */     getContentPane().add(this.updatebglbl, new AbsoluteConstraints(0, 0, -1, -1));
/*     */     
/* 141 */     pack();
/* 142 */     setLocationRelativeTo((Component)null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void weighttfActionPerformed(ActionEvent evt) {}
/*     */ 
/*     */   
/*     */   private void updatebtnActionPerformed(ActionEvent evt) {
/* 151 */     String weight = this.weighttf.getText();
/* 152 */     String height = this.heighttf.getText();
/* 153 */     String age = this.agetf.getText();
/* 154 */     if (weight.isBlank() || height.isBlank() || age.isBlank()) {
/*     */       
/* 156 */       JOptionPane.showMessageDialog(this, "Please fill all fields");
/*     */     } else {
/*     */ 
/*     */       
/*     */       try {
/* 161 */         Class.forName("org.postgresql.Driver");
/* 162 */         Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/project", "postgres", "Turbotime");
/* 163 */         Statement stmt = con.createStatement();
/* 164 */         int rs = stmt.executeUpdate("update customer set weight='" + weight + "',height='" + height + "',age='" + age + "' where name='" + this.name + "'");
/* 165 */         if (rs == 1)
/*     */         
/* 167 */         { System.out.println("Successfully Updated");
/*     */           
/* 169 */           (new main(this.name)).setVisible(true);
/* 170 */           dispose(); }
/*     */         else
/*     */         
/* 173 */         { System.out.println("Unsuccessfully Updated"); } 
/* 174 */       } catch (Exception e) {
/*     */         
/* 176 */         System.out.println(e);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void backbtnActionPerformed(ActionEvent evt) {
/* 183 */     dispose();
/* 184 */     (new main(this.name)).setVisible(true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void main(String[] args) throws UnsupportedLookAndFeelException {
/*     */     try {
/* 197 */       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
/* 198 */         if ("Nimbus".equals(info.getName())) {
/* 199 */           UIManager.setLookAndFeel(info.getClassName());
/*     */           break;
/*     */         } 
/*     */       } 
/* 203 */     } catch (ClassNotFoundException ex) {
/* 204 */       Logger.getLogger(update.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 205 */     } catch (InstantiationException ex) {
/* 206 */       Logger.getLogger(update.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 207 */     } catch (IllegalAccessException ex) {
/* 208 */       Logger.getLogger(update.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 209 */     } catch (UnsupportedLookAndFeelException ex) {
/* 210 */       Logger.getLogger(update.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 215 */     EventQueue.invokeLater(new Runnable() {
/*     */           public void run() {
/* 217 */             (new update()).setVisible(true);
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Users\pandi\OneDrive\Desktop\Gymrat.jar!\gymra\\update.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */