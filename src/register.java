/*     */ package gymrat;
/*     */ import java.awt.Color;
import java.awt.Component;
/*     */ import java.awt.Dimension;
import java.awt.EventQueue;
/*     */ import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.Toolkit;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.util.logging.Level;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.*;
/*     */ import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import java.sql.*;
import org.postgresql.util.PSQLException;
/*     */ 
/*     */ public class register extends JFrame {
/*     */   private JLabel agelbl;
/*     */   private JTextField agetf;
/*     */   private JLabel cnfpswdlbl;
/*     */   private JPasswordField cnpasswdtf;
/*     */   private JRadioButton femalerbtn;
/*     */   
/*     */   public register() {
/*  24 */     initComponents();
/*  25 */     setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("biceps.jpg")));
/*  26 */     this.pwdanslbl.setVisible(false);
/*  27 */     this.pwdanstf.setVisible(false);
/*     */   }
/*     */   private ButtonGroup genderbtngrp; private JLabel genderlbl; private JRadioButton malerbtn; private JLabel namelbl; private JTextField nametf; private JPasswordField passwdtf; private JLabel passwordquslbl; private JLabel phnlbl; private JTextField phntf;
/*     */   private JLabel pswdlbl;
/*     */   private JLabel pwdanslbl;
/*     */   private JTextField pwdanstf;
/*     */   private JComboBox<String> pwdcmbox;
/*     */   private JLabel registerbglbl;
/*     */   private JPanel registerpnl;
/*     */   private JButton resetbtn;
/*     */   private JButton submitbtn;
/*     */   
/*     */   private void initComponents() {
/*  40 */     this.genderbtngrp = new ButtonGroup();
/*  41 */     this.registerpnl = new JPanel();
/*  42 */     this.namelbl = new JLabel();
/*  43 */     this.agelbl = new JLabel();
/*  44 */     this.genderlbl = new JLabel();
/*  45 */     this.phnlbl = new JLabel();
/*  46 */     this.pswdlbl = new JLabel();
/*  47 */     this.cnfpswdlbl = new JLabel();
/*  48 */     this.nametf = new JTextField();
/*  49 */     this.passwdtf = new JPasswordField();
/*  50 */     this.cnpasswdtf = new JPasswordField();
/*  51 */     this.phntf = new JTextField();
/*  52 */     this.agetf = new JTextField();
/*  53 */     this.resetbtn = new JButton();
/*  54 */     this.submitbtn = new JButton();
/*  55 */     this.malerbtn = new JRadioButton();
/*  56 */     this.femalerbtn = new JRadioButton();
/*  57 */     this.passwordquslbl = new JLabel();
/*  58 */     this.pwdcmbox = new JComboBox<>();
/*  59 */     this.pwdanslbl = new JLabel();
/*  60 */     this.pwdanstf = new JTextField();
/*  61 */     this.registerbglbl = new JLabel();
/*     */     
/*  63 */     setDefaultCloseOperation(2);
/*  64 */     setTitle("Gymrat[Register]");
/*  65 */     setMaximumSize(new Dimension(1080, 720));
/*  66 */     setMinimumSize(new Dimension(1080, 720));
/*  67 */     setResizable(false);
/*  68 */     setSize(new Dimension(1080, 720));
/*  69 */     getContentPane().setLayout((LayoutManager)new AbsoluteLayout());
/*     */     
/*  71 */     this.registerpnl.setBackground(new Color(0, 0, 0));
/*  72 */     this.registerpnl.setLayout((LayoutManager)new AbsoluteLayout());
/*     */     
/*  74 */     this.namelbl.setFont(new Font("Arial", 1, 24));
/*  75 */     this.namelbl.setForeground(new Color(153, 153, 153));
/*  76 */     this.namelbl.setText("Name :");
/*  77 */     this.registerpnl.add(this.namelbl, new AbsoluteConstraints(210, 120, -1, -1));
/*     */     
/*  79 */     this.agelbl.setFont(new Font("Arial", 1, 24));
/*  80 */     this.agelbl.setForeground(new Color(153, 153, 153));
/*  81 */     this.agelbl.setText("Age :");
/*  82 */     this.registerpnl.add(this.agelbl, new AbsoluteConstraints(210, 160, -1, -1));
/*     */     
/*  84 */     this.genderlbl.setFont(new Font("Arial", 1, 24));
/*  85 */     this.genderlbl.setForeground(new Color(153, 153, 153));
/*  86 */     this.genderlbl.setText("Gender :");
/*  87 */     this.registerpnl.add(this.genderlbl, new AbsoluteConstraints(210, 200, -1, -1));
/*     */     
/*  89 */     this.phnlbl.setFont(new Font("Arial", 1, 24));
/*  90 */     this.phnlbl.setForeground(new Color(153, 153, 153));
/*  91 */     this.phnlbl.setText("Phone number :");
/*  92 */     this.registerpnl.add(this.phnlbl, new AbsoluteConstraints(210, 240, -1, -1));
/*     */     
/*  94 */     this.pswdlbl.setFont(new Font("Arial", 1, 24));
/*  95 */     this.pswdlbl.setForeground(new Color(153, 153, 153));
/*  96 */     this.pswdlbl.setText("Password :");
/*  97 */     this.registerpnl.add(this.pswdlbl, new AbsoluteConstraints(210, 280, -1, -1));
/*     */     
/*  99 */     this.cnfpswdlbl.setFont(new Font("Arial", 1, 24));
/* 100 */     this.cnfpswdlbl.setForeground(new Color(153, 153, 153));
/* 101 */     this.cnfpswdlbl.setText("Confirm Password :");
/* 102 */     this.registerpnl.add(this.cnfpswdlbl, new AbsoluteConstraints(210, 320, -1, -1));
/*     */     
/* 104 */     this.nametf.setBackground(new Color(153, 153, 153));
/* 105 */     this.nametf.setFont(new Font("Arial", 0, 18));
/* 106 */     this.nametf.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
/* 107 */     this.nametf.setPreferredSize(new Dimension(150, 22));
/* 108 */     this.nametf.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 110 */             register.this.nametfActionPerformed(evt);
/*     */           }
/*     */         });
/* 113 */     this.registerpnl.add(this.nametf, new AbsoluteConstraints(480, 120, -1, -1));
/*     */     
/* 115 */     this.passwdtf.setBackground(new Color(153, 153, 153));
/* 116 */     this.passwdtf.setFont(new Font("Arial", 0, 18));
/* 117 */     this.passwdtf.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
/* 118 */     this.passwdtf.setPreferredSize(new Dimension(150, 22));
/* 119 */     this.registerpnl.add(this.passwdtf, new AbsoluteConstraints(480, 280, -1, -1));
/*     */     
/* 121 */     this.cnpasswdtf.setBackground(new Color(153, 153, 153));
/* 122 */     this.cnpasswdtf.setFont(new Font("Arial", 0, 18));
/* 123 */     this.cnpasswdtf.setForeground(new Color(0, 0, 0));
/* 124 */     this.cnpasswdtf.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
/* 125 */     this.cnpasswdtf.setPreferredSize(new Dimension(150, 22));
/* 126 */     this.registerpnl.add(this.cnpasswdtf, new AbsoluteConstraints(480, 320, 150, -1));
/*     */     
/* 128 */     this.phntf.setBackground(new Color(153, 153, 153));
/* 129 */     this.phntf.setFont(new Font("Arial", 0, 18));
/* 130 */     this.phntf.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
/* 131 */     this.phntf.setPreferredSize(new Dimension(150, 22));
/* 132 */     this.registerpnl.add(this.phntf, new AbsoluteConstraints(480, 240, -1, -1));
/*     */     
/* 134 */     this.agetf.setBackground(new Color(153, 153, 153));
/* 135 */     this.agetf.setFont(new Font("Arial", 0, 18));
/* 136 */     this.agetf.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
/* 137 */     this.agetf.setPreferredSize(new Dimension(150, 22));
/* 138 */     this.registerpnl.add(this.agetf, new AbsoluteConstraints(480, 160, -1, -1));
/*     */     
/* 140 */     this.resetbtn.setBackground(new Color(153, 153, 153));
/* 141 */     this.resetbtn.setFont(new Font("Arial", 1, 24));
/* 142 */     this.resetbtn.setForeground(new Color(0, 0, 0));
/* 143 */     this.resetbtn.setText("Reset");
/* 144 */     this.resetbtn.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 146 */             register.this.resetbtnActionPerformed(evt);
/*     */           }
/*     */         });
/* 149 */     this.registerpnl.add(this.resetbtn, new AbsoluteConstraints(260, 490, 130, -1));
/*     */     
/* 151 */     this.submitbtn.setBackground(new Color(153, 153, 153));
/* 152 */     this.submitbtn.setFont(new Font("Arial", 1, 24));
/* 153 */     this.submitbtn.setForeground(new Color(0, 0, 0));
/* 154 */     this.submitbtn.setText("Submit");
/* 155 */     this.submitbtn.addMouseListener(new MouseAdapter() {
/*     */           public void mouseClicked(MouseEvent evt) {
/* 157 */             register.this.submitbtnMouseClicked(evt);
/*     */           }
/*     */         });
/* 160 */     this.submitbtn.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 162 */             register.this.submitbtnActionPerformed(evt);
/*     */           }
/*     */         });
/* 165 */     this.registerpnl.add(this.submitbtn, new AbsoluteConstraints(440, 490, 120, -1));
/*     */     
/* 167 */     this.malerbtn.setBackground(new Color(0, 0, 0));
/* 168 */     this.genderbtngrp.add(this.malerbtn);
/* 169 */     this.malerbtn.setFont(new Font("Arial", 0, 18));
/* 170 */     this.malerbtn.setForeground(new Color(153, 153, 153));
/* 171 */     this.malerbtn.setText("Male");
/* 172 */     this.registerpnl.add(this.malerbtn, new AbsoluteConstraints(480, 200, -1, -1));
/*     */     
/* 174 */     this.femalerbtn.setBackground(new Color(0, 0, 0));
/* 175 */     this.genderbtngrp.add(this.femalerbtn);
/* 176 */     this.femalerbtn.setFont(new Font("Arial", 0, 18));
/* 177 */     this.femalerbtn.setForeground(new Color(153, 153, 153));
/* 178 */     this.femalerbtn.setText("Female");
/* 179 */     this.registerpnl.add(this.femalerbtn, new AbsoluteConstraints(540, 200, -1, -1));
/*     */     
/* 181 */     this.passwordquslbl.setFont(new Font("Arial", 1, 24));
/* 182 */     this.passwordquslbl.setForeground(new Color(153, 153, 153));
/* 183 */     this.passwordquslbl.setText("Recovery  Question :");
/* 184 */     this.registerpnl.add(this.passwordquslbl, new AbsoluteConstraints(210, 370, -1, -1));
/*     */     
/* 186 */     this.pwdcmbox.setBackground(new Color(153, 153, 153));
/* 187 */     this.pwdcmbox.setFont(new Font("Arial", 0, 16));
/* 188 */     this.pwdcmbox.setForeground(new Color(0, 0, 0));
/* 189 */     this.pwdcmbox.setModel(new DefaultComboBoxModel<>(new String[] { "Select Question", "What is the name of the first school you attented?", "What is the name of the town where you were born?", "Messi or Ronaldo?" }));
/* 190 */     this.pwdcmbox.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
/* 191 */     this.pwdcmbox.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 193 */             register.this.pwdcmboxActionPerformed(evt);
/*     */           }
/*     */         });
/* 196 */     this.registerpnl.add(this.pwdcmbox, new AbsoluteConstraints(480, 365, 380, 30));
/*     */     
/* 198 */     this.pwdanslbl.setFont(new Font("Arial", 1, 24));
/* 199 */     this.pwdanslbl.setForeground(new Color(153, 153, 153));
/* 200 */     this.pwdanslbl.setText("Answer :");
/* 201 */     this.registerpnl.add(this.pwdanslbl, new AbsoluteConstraints(350, 420, -1, -1));
/*     */     
/* 203 */     this.pwdanstf.setBackground(new Color(153, 153, 153));
/* 204 */     this.pwdanstf.setFont(new Font("Arial", 0, 18));
/* 205 */     this.pwdanstf.setForeground(new Color(0, 0, 0));
/* 206 */     this.pwdanstf.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
/* 207 */     this.pwdanstf.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 209 */             register.this.pwdanstfActionPerformed(evt);
/*     */           }
/*     */         });
/* 212 */     this.registerpnl.add(this.pwdanstf, new AbsoluteConstraints(480, 420, 150, -1));
/*     */     
/* 214 */     this.registerbglbl.setBackground(new Color(0, 0, 0));
/* 215 */     this.registerbglbl.setFont(new Font("Arial", 0, 18));
/* 216 */     this.registerbglbl.setIcon(new ImageIcon("bottle.jpg"));
/* 217 */     this.registerbglbl.setText("");
/* 218 */     this.registerbglbl.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
/* 219 */     this.registerbglbl.setMaximumSize(new Dimension(1080, 720));
/* 220 */     this.registerbglbl.setMinimumSize(new Dimension(1080, 720));
/* 221 */     this.registerbglbl.setPreferredSize(new Dimension(1080, 720));
/* 222 */     this.registerpnl.add(this.registerbglbl, new AbsoluteConstraints(0, 0, -1, -1));
/*     */     
/* 224 */     getContentPane().add(this.registerpnl, new AbsoluteConstraints(0, 0, -1, -1));
/*     */     
/* 226 */     pack();
/* 227 */     setLocationRelativeTo((Component)null);
/*     */   }
/*     */ 
/*     */   
/*     */   private void submitbtnActionPerformed(ActionEvent evt) {
/*     */     try {
/* 233 */       Class.forName("org.postgresql.Driver");
/* 234 */       Connection con = DriverManager.getConnection("jdbc:postgresql://localhost/project", "postgres", "Turbotime");
/* 235 */       String name = this.nametf.getText();
/* 236 */       String password = this.passwdtf.getText();
/* 237 */       String age = this.agetf.getText();
/* 238 */       String phone = this.phntf.getText();
/* 239 */       String gender = "";
/* 240 */       String sv = this.pwdcmbox.getSelectedItem().toString();
/* 241 */       String a = this.pwdanstf.getText();
/* 242 */       if (this.malerbtn.isSelected() == true) {
/*     */         
/* 244 */         gender = "Male";
/*     */       }
/* 246 */       else if (this.femalerbtn.isSelected() == true) {
/*     */         
/* 248 */         gender = "Female";
/*     */       } 
/*     */       
/* 251 */       if (!password.equals(new String(this.cnpasswdtf.getText()))) {
/*     */         
/* 253 */         JOptionPane.showMessageDialog(this, "Password Doesn't Match");
/*     */       
/*     */       }
/* 256 */       else if (name.isBlank() || password.isBlank() || age.isBlank() || phone.isBlank() || gender.isBlank() || sv.isBlank() || a.isBlank()) {
/*     */         
/* 258 */         JOptionPane.showMessageDialog(this, "Please fill every details");
/*     */       }
/* 260 */       else if (phone.length() != 10) {
/* 261 */         JOptionPane.showMessageDialog(this, "Please enter valid phone number");
/*     */       }
/*     */       else {
/*     */         
/* 265 */         Statement stmt = con.createStatement();
/* 266 */         int ans = stmt.executeUpdate("insert into customer(name,age,gender,password,phone,recovery_qus,recovery_ans) values('" + name + "','" + age + "','" + gender + "','" + password + "','" + phone + "','" + sv + "','" + a + "')");
/*     */         
/* 268 */         if (ans == 1) {
/*     */           
/* 270 */           JOptionPane.showMessageDialog(this, "Registered Successfully");
/* 271 */           insertworkout(name);
/* 272 */           dispose();
/*     */         } else {
/*     */           
/* 275 */           JOptionPane.showMessageDialog(this, "Registeration Unsuccessfully");
/*     */         }
/*     */       
/*     */       } 
/* 279 */     } catch (PSQLException psql) {
/* 280 */       JOptionPane.showMessageDialog(this, "User already exists!!!");
/* 281 */     } catch (Exception e) {
/*     */       
/* 283 */       JOptionPane.showMessageDialog(this, e);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void insertworkout(String n) {
/*     */     try {
/* 289 */       Class.forName("org.postgresql.Driver");
/* 290 */       Connection con = DriverManager.getConnection("jdbc:postgresql://localhost/project", "postgres", "Turbotime");
/* 291 */       String name = n;
/* 292 */       Statement stmt = con.createStatement();
/* 293 */       int ans = stmt.executeUpdate("insert into workout values('" + name + "')");
/* 294 */       if (ans == 1) {
/*     */         
/* 296 */         System.out.println("Inserted successfully in workout table");
/*     */       } else {
/*     */         
/* 299 */         System.out.println("Inserted Unsuccessfully in workout table");
/*     */       } 
/* 301 */     } catch (Exception e) {
/*     */       
/* 303 */       System.out.println("This user already exists!!");
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void nametfActionPerformed(ActionEvent evt) {}
/*     */ 
/*     */ 
/*     */   
/*     */   private void submitbtnMouseClicked(MouseEvent evt) {}
/*     */ 
/*     */   
/*     */   private void pwdcmboxActionPerformed(ActionEvent evt) {
/* 317 */     this.pwdanslbl.setVisible(true);
/* 318 */     this.pwdanstf.setVisible(true);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void pwdanstfActionPerformed(ActionEvent evt) {}
/*     */ 
/*     */   
/*     */   private void resetbtnActionPerformed(ActionEvent evt) {
/* 327 */     this.nametf.setText("");
/* 328 */     this.agetf.setText("");
/* 329 */     this.passwdtf.setText("");
/* 330 */     this.cnpasswdtf.setText("");
/* 331 */     this.pwdanstf.setText("");
/* 332 */     this.phntf.setText("");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void main(String[] args) {
/*     */     try {
/* 339 */       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
/* 340 */         if ("Nimbus".equals(info.getName())) {
/* 341 */           UIManager.setLookAndFeel(info.getClassName());
/*     */           break;
/*     */         } 
/*     */       } 
/* 345 */     } catch (Exception ex) {
/* 346 */   System.out.println(ex);   
            }
/*     */ 
/*     */ 
/*     */     
/* 357 */     EventQueue.invokeLater(new Runnable() {
/*     */           public void run() {
/* 359 */             (new register()).setVisible(true);
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Users\pandi\OneDrive\Desktop\Gymrat.jar!\gymrat\register.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */