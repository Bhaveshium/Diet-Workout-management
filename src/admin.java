package gymrat;

import java.awt.*;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.JFrame;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import java.sql.*;

public class admin extends JFrame { private JLabel adagelbl; private JTextField adagetf;
  private JButton adbackbtn;
  private JButton addeletebtn;
  private JButton adeditbtn;
  private JLabel adgenderlbl;
  
  public admin() {
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("biceps.jpg")));
    initComponents();
    this.adeditbtn.setVisible(false);
    this.adeditbtn.setVisible(false);
    this.adupdatebtn.setVisible(false);
    this.addeletebtn.setVisible(false);
  }
  private JTextField adgendertf; private JLabel adheightlbl; private JTextField adheighttf; private JLabel adlastloginlbl; private JTextField adlastlogintf; private JLabel adminbgiconlbl; private JLabel adnamelbl; private JTextField adnametf; private JButton adnewbtn; private JLabel adpasswordlbl; private JTextField adpasswordtf; private JLabel adphonelbl; private JTextField adphonetf; private JButton adupdatebtn; private JLabel adweightlbl; private JTextField adweighttf; private JPanel displaypnl; private JLabel jLabel1; private JButton searchbtn;
  private JTextField searchnametf;
  private JPanel searchpnl;
  
  private void initComponents() {
    this.searchpnl = new JPanel();
    this.jLabel1 = new JLabel();
    this.searchnametf = new JTextField();
    this.searchbtn = new JButton();
    this.adnewbtn = new JButton();
    this.displaypnl = new JPanel();
    this.adnamelbl = new JLabel();
    this.adpasswordlbl = new JLabel();
    this.adagelbl = new JLabel();
    this.adgenderlbl = new JLabel();
    this.adheightlbl = new JLabel();
    this.adphonelbl = new JLabel();
    this.adweightlbl = new JLabel();
    this.adlastloginlbl = new JLabel();
    this.adnametf = new JTextField();
    this.adpasswordtf = new JTextField();
    this.adagetf = new JTextField();
    this.adgendertf = new JTextField();
    this.adheighttf = new JTextField();
    this.adweighttf = new JTextField();
    this.adphonetf = new JTextField();
    this.adlastlogintf = new JTextField();
    this.adbackbtn = new JButton();
    this.adupdatebtn = new JButton();
    this.addeletebtn = new JButton();
    this.adeditbtn = new JButton();
    this.adminbgiconlbl = new JLabel();
    
    setDefaultCloseOperation(3);
    setTitle("Gymrat[Admin]");
    setCursor(new Cursor(0));
    setResizable(false);
    setSize(new Dimension(1080, 720));
    getContentPane().setLayout((LayoutManager)new AbsoluteLayout());
    
    this.searchpnl.setBackground(new Color(0, 0, 0));
    this.searchpnl.setLayout((LayoutManager)new AbsoluteLayout());
    
    this.jLabel1.setFont(new Font("Arial", 3, 24));
    this.jLabel1.setForeground(new Color(153, 153, 153));
    this.jLabel1.setHorizontalAlignment(4);
    this.jLabel1.setIcon(new ImageIcon("/root/NetBeansProjects/Gymrat/src/gymrat/icons/people.png"));
    this.jLabel1.setText("NAME :");
    this.jLabel1.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
    this.jLabel1.setCursor(new Cursor(0));
    this.jLabel1.setHorizontalTextPosition(4);
    this.searchpnl.add(this.jLabel1, new AbsoluteConstraints(6, 32, 161, 64));
    
    this.searchnametf.setBackground(new Color(153, 153, 153));
    this.searchnametf.setFont(new Font("Arial", 1, 24));
    this.searchnametf.setForeground(new Color(0, 0, 0));
    this.searchnametf.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
    this.searchpnl.add(this.searchnametf, new AbsoluteConstraints(185, 49, 183, -1));
    
    this.searchbtn.setBackground(new Color(0, 0, 0));
    this.searchbtn.setFont(new Font("Arial", 3, 24));
    this.searchbtn.setForeground(new Color(153, 153, 153));
    this.searchbtn.setIcon(new ImageIcon("/root/NetBeansProjects/Gymrat/src/gymrat/icons/search.gif"));
    this.searchbtn.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
    this.searchbtn.setBorderPainted(false);
    this.searchbtn.setContentAreaFilled(false);
    this.searchbtn.setFocusPainted(false);
    this.searchbtn.addMouseListener(new MouseAdapter() {
          public void mouseClicked(MouseEvent evt) {
            admin.this.searchbtnMouseClicked(evt);
          }
        });
    this.searchbtn.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            admin.this.searchbtnActionPerformed(evt);
          }
        });
    this.searchpnl.add(this.searchbtn, new AbsoluteConstraints(386, 31, -1, 65));
    
    this.adnewbtn.setBackground(new Color(0, 0, 0));
    this.adnewbtn.setFont(new Font("Arial", 3, 24));
    this.adnewbtn.setForeground(new Color(153, 153, 153));
    this.adnewbtn.setIcon(new ImageIcon("/root/NetBeansProjects/Gymrat/src/gymrat/icons/8-account-outline (6).gif"));
    this.adnewbtn.setText("Create User");
    this.adnewbtn.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(153, 153, 153)));
    this.adnewbtn.setBorderPainted(false);
    this.adnewbtn.setContentAreaFilled(false);
    this.adnewbtn.setFocusPainted(false);
    this.adnewbtn.setIconTextGap(-30);
    this.adnewbtn.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            admin.this.adnewbtnActionPerformed(evt);
          }
        });
    this.searchpnl.add(this.adnewbtn, new AbsoluteConstraints(659, 31, 262, 65));
    
    getContentPane().add(this.searchpnl, new AbsoluteConstraints(0, 0, 1080, 120));
    
    this.displaypnl.setBackground(new Color(0, 0, 0));
    this.displaypnl.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
    this.displaypnl.setForeground(new Color(0, 0, 0));
    this.displaypnl.setLayout((LayoutManager)new AbsoluteLayout());
    
    this.adnamelbl.setBackground(new Color(0, 0, 0));
    this.adnamelbl.setFont(new Font("Arial", 0, 24));
    this.adnamelbl.setForeground(new Color(153, 153, 153));
    this.adnamelbl.setText("Name :");
    this.displaypnl.add(this.adnamelbl, new AbsoluteConstraints(151, 96, 125, -1));
    
    this.adpasswordlbl.setBackground(new Color(0, 0, 0));
    this.adpasswordlbl.setFont(new Font("Arial", 0, 24));
    this.adpasswordlbl.setForeground(new Color(153, 153, 153));
    this.adpasswordlbl.setText("Password :");
    this.displaypnl.add(this.adpasswordlbl, new AbsoluteConstraints(151, 144, 125, -1));
    
    this.adagelbl.setBackground(new Color(0, 0, 0));
    this.adagelbl.setFont(new Font("Arial", 0, 24));
    this.adagelbl.setForeground(new Color(153, 153, 153));
    this.adagelbl.setText("Age :");
    this.displaypnl.add(this.adagelbl, new AbsoluteConstraints(151, 192, 125, -1));
    
    this.adgenderlbl.setBackground(new Color(0, 0, 0));
    this.adgenderlbl.setFont(new Font("Arial", 0, 24));
    this.adgenderlbl.setForeground(new Color(153, 153, 153));
    this.adgenderlbl.setText("Gender :");
    this.displaypnl.add(this.adgenderlbl, new AbsoluteConstraints(151, 240, 125, -1));
    
    this.adheightlbl.setBackground(new Color(0, 0, 0));
    this.adheightlbl.setFont(new Font("Arial", 0, 24));
    this.adheightlbl.setForeground(new Color(153, 153, 153));
    this.adheightlbl.setText("Height :");
    this.displaypnl.add(this.adheightlbl, new AbsoluteConstraints(151, 288, 125, -1));
    
    this.adphonelbl.setBackground(new Color(0, 0, 0));
    this.adphonelbl.setFont(new Font("Arial", 0, 24));
    this.adphonelbl.setForeground(new Color(153, 153, 153));
    this.adphonelbl.setText("Phone :");
    this.displaypnl.add(this.adphonelbl, new AbsoluteConstraints(151, 384, 125, -1));
    
    this.adweightlbl.setBackground(new Color(0, 0, 0));
    this.adweightlbl.setFont(new Font("Arial", 0, 24));
    this.adweightlbl.setForeground(new Color(153, 153, 153));
    this.adweightlbl.setText("Weight :");
    this.displaypnl.add(this.adweightlbl, new AbsoluteConstraints(151, 336, 125, -1));
    
    this.adlastloginlbl.setBackground(new Color(0, 0, 0));
    this.adlastloginlbl.setFont(new Font("Arial", 0, 24));
    this.adlastloginlbl.setForeground(new Color(153, 153, 153));
    this.adlastloginlbl.setText("Last Login :");
    this.displaypnl.add(this.adlastloginlbl, new AbsoluteConstraints(151, 432, -1, -1));
    
    this.adnametf.setEditable(false);
    this.adnametf.setBackground(new Color(153, 153, 153));
    this.adnametf.setFont(new Font("Arial", 1, 24));
    this.adnametf.setForeground(new Color(0, 0, 0));
    this.adnametf.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
    this.displaypnl.add(this.adnametf, new AbsoluteConstraints(319, 95, 265, -1));
    
    this.adpasswordtf.setEditable(false);
    this.adpasswordtf.setBackground(new Color(153, 153, 153));
    this.adpasswordtf.setFont(new Font("Arial", 1, 24));
    this.adpasswordtf.setForeground(new Color(0, 0, 0));
    this.adpasswordtf.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
    this.displaypnl.add(this.adpasswordtf, new AbsoluteConstraints(319, 143, 265, -1));
    
    this.adagetf.setEditable(false);
    this.adagetf.setBackground(new Color(153, 153, 153));
    this.adagetf.setFont(new Font("Arial", 1, 24));
    this.adagetf.setForeground(new Color(0, 0, 0));
    this.adagetf.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
    this.displaypnl.add(this.adagetf, new AbsoluteConstraints(319, 191, 265, -1));
    
    this.adgendertf.setEditable(false);
    this.adgendertf.setBackground(new Color(153, 153, 153));
    this.adgendertf.setFont(new Font("Arial", 1, 24));
    this.adgendertf.setForeground(new Color(0, 0, 0));
    this.adgendertf.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
    this.displaypnl.add(this.adgendertf, new AbsoluteConstraints(319, 239, 265, -1));
    
    this.adheighttf.setEditable(false);
    this.adheighttf.setBackground(new Color(153, 153, 153));
    this.adheighttf.setFont(new Font("Arial", 1, 24));
    this.adheighttf.setForeground(new Color(0, 0, 0));
    this.adheighttf.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
    this.displaypnl.add(this.adheighttf, new AbsoluteConstraints(319, 287, 265, -1));
    
    this.adweighttf.setEditable(false);
    this.adweighttf.setBackground(new Color(153, 153, 153));
    this.adweighttf.setFont(new Font("Arial", 1, 24));
    this.adweighttf.setForeground(new Color(0, 0, 0));
    this.adweighttf.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
    this.displaypnl.add(this.adweighttf, new AbsoluteConstraints(319, 335, 265, -1));
    
    this.adphonetf.setEditable(false);
    this.adphonetf.setBackground(new Color(153, 153, 153));
    this.adphonetf.setFont(new Font("Arial", 1, 24));
    this.adphonetf.setForeground(new Color(0, 0, 0));
    this.adphonetf.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
    this.displaypnl.add(this.adphonetf, new AbsoluteConstraints(319, 383, 265, -1));
    
    this.adlastlogintf.setEditable(false);
    this.adlastlogintf.setBackground(new Color(153, 153, 153));
    this.adlastlogintf.setFont(new Font("Arial", 1, 24));
    this.adlastlogintf.setForeground(new Color(0, 0, 0));
    this.adlastlogintf.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
    this.displaypnl.add(this.adlastlogintf, new AbsoluteConstraints(319, 431, 265, -1));
    
    this.adbackbtn.setBackground(new Color(153, 153, 153));
    this.adbackbtn.setFont(new Font("Arial", 0, 24));
    this.adbackbtn.setForeground(new Color(0, 0, 0));
    this.adbackbtn.setText("Back");
    this.adbackbtn.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
    this.adbackbtn.setFocusPainted(false);
    this.adbackbtn.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            admin.this.adbackbtnActionPerformed(evt);
          }
        });
    this.displaypnl.add(this.adbackbtn, new AbsoluteConstraints(530, 500, 100, 30));
    
    this.adupdatebtn.setBackground(new Color(153, 153, 153));
    this.adupdatebtn.setFont(new Font("Arial", 0, 24));
    this.adupdatebtn.setForeground(new Color(0, 0, 0));
    this.adupdatebtn.setText("Update");
    this.adupdatebtn.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
    this.adupdatebtn.setFocusPainted(false);
    this.adupdatebtn.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            admin.this.adupdatebtnActionPerformed(evt);
          }
        });
    this.displaypnl.add(this.adupdatebtn, new AbsoluteConstraints(240, 500, 100, 30));
    
    this.addeletebtn.setBackground(new Color(153, 153, 153));
    this.addeletebtn.setFont(new Font("Arial", 0, 24));
    this.addeletebtn.setForeground(new Color(0, 0, 0));
    this.addeletebtn.setText("Delete");
    this.addeletebtn.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
    this.addeletebtn.setFocusPainted(false);
    this.addeletebtn.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            admin.this.addeletebtnActionPerformed(evt);
          }
        });
    this.displaypnl.add(this.addeletebtn, new AbsoluteConstraints(380, 500, 100, 30));
    
    this.adeditbtn.setBackground(new Color(153, 153, 153));
    this.adeditbtn.setFont(new Font("Arial", 0, 24));
    this.adeditbtn.setForeground(new Color(0, 0, 0));
    this.adeditbtn.setText("Edit");
    this.adeditbtn.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
    this.adeditbtn.setFocusPainted(false);
    this.adeditbtn.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            admin.this.adeditbtnActionPerformed(evt);
          }
        });
    this.displaypnl.add(this.adeditbtn, new AbsoluteConstraints(100, 500, 100, 30));
    
    this.adminbgiconlbl.setBackground(new Color(0, 0, 0));
    this.adminbgiconlbl.setIcon(new ImageIcon(getClass().getResource("/gymrat/icons/pexels-dreamlens-production-896058 (1)(1).jpg")));
    this.adminbgiconlbl.setText("jLabel2");
    this.displaypnl.add(this.adminbgiconlbl, new AbsoluteConstraints(0, 0, 1080, 610));
    
    getContentPane().add(this.displaypnl, new AbsoluteConstraints(0, 116, 1080, 610));
    
    pack();
    setLocationRelativeTo(null);
  }
  
  private void adbackbtnActionPerformed(ActionEvent evt) {
    dispose();
  }

  
  private void searchbtnActionPerformed(ActionEvent evt) {
    String name = this.searchnametf.getText();
    this.adpasswordtf.setEditable(false);
    this.adagetf.setEditable(false);
    this.adgendertf.setEditable(false);
    this.adheighttf.setEditable(false);
    this.adweighttf.setEditable(false);
    this.adphonetf.setEditable(false);


    
    try {
      Class.forName("org.postgresql.Driver");
      Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/project", "postgres", "Turbotime");
      Statement stmt = c.createStatement(1005, 1008);
      ResultSet rs = stmt.executeQuery("Select * from customer where name ='" + name + "'");
      if (rs.next())
      {
        this.adeditbtn.setVisible(true);
        this.adupdatebtn.setVisible(true);
        this.addeletebtn.setVisible(true);
        this.adeditbtn.setVisible(true);
        this.adnametf.setText(rs.getString(1));
        this.adagetf.setText(rs.getString(2));
        this.adgendertf.setText(rs.getString(3));
        this.adpasswordtf.setText(rs.getString(4));
        this.adphonetf.setText(rs.getString(5));
        this.adweighttf.setText(rs.getString(6));
        this.adheighttf.setText(rs.getString(7));
        this.adlastlogintf.setText(rs.getString(8));
      
      }
      else
      {
        JOptionPane.showMessageDialog(this, "User does't exist");
      }
    
    } catch (Exception e) {
      System.out.print(e);
    } 
  }

  
  private void searchbtnMouseClicked(MouseEvent evt) {}

  
  private void adnewbtnActionPerformed(ActionEvent evt) {
    (new register()).setVisible(true);
  }

  
  private void adeditbtnActionPerformed(ActionEvent evt) {
    this.adpasswordtf.setEditable(true);
    this.adagetf.setEditable(true);
    this.adgendertf.setEditable(true);
    this.adheighttf.setEditable(true);
    this.adweighttf.setEditable(true);
    this.adphonetf.setEditable(true);
  }

  
  private void adupdatebtnActionPerformed(ActionEvent evt) {
    String name = this.searchnametf.getText();
    String phone = this.adphonetf.getText();
    String password = this.adpasswordtf.getText();
    String gender = this.adgendertf.getText();
    String weight = this.adweighttf.getText();
    String height = this.adheighttf.getText();
    String age = this.adagetf.getText();
    if (gender.isBlank() || password.isBlank() || phone.isBlank() || weight.isBlank() || height.isBlank() || age.isBlank()) {
      
      JOptionPane.showMessageDialog(this, "Please fill all fields");
    } else {

      
      try {
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/project", "postgres", "Turbotime");
        Statement stmt = con.createStatement();
        int rs = stmt.executeUpdate("update customer set password='" + password + "',gender='" + gender + "',weight='" + weight + "',height='" + height + "',age='" + age + "' where name='" + name + "'");
        if (rs == 1)
        
        { JOptionPane.showMessageDialog(this, "Successfully Updated");
          
          this.adpasswordtf.setEditable(false);
          this.adagetf.setEditable(false);
          this.adgendertf.setEditable(false);
          this.adheighttf.setEditable(false);
          this.adweighttf.setEditable(false);
          this.adphonetf.setEditable(false); }
        else
        
        { System.out.println("Unsuccessfully Updated"); } 
      } catch (Exception e) {
        
        System.out.println(e);
      } 
    } 
  }

  
  private void addeletebtnActionPerformed(ActionEvent evt) {
    String name = this.searchnametf.getText();
    deleteworkout(name);
    try {
      Class.forName("org.postgresql.Driver");
      Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/project", "postgres", "Turbotime");
      Statement stmt = con.createStatement();
      int rs = stmt.executeUpdate("delete from  customer  where name='" + name + "'");
      if (rs == 1) {
        
        this.adnametf.setText("");
        this.adpasswordtf.setText("");
        this.adagetf.setText("");
        this.adgendertf.setText("");
        this.adweighttf.setText("");
        this.adheighttf.setText("");
        this.adlastlogintf.setText("");
        this.searchnametf.setText("");
        this.adphonetf.setText("");
        this.adeditbtn.setVisible(false);
        this.adupdatebtn.setVisible(false);
        this.addeletebtn.setVisible(false);
      } 
    } catch (Exception e) {
      
      System.out.println(e);
    } 
  }

  
  private void deleteworkout(String n) {
    String name = this.searchnametf.getText();
    try {
      Class.forName("org.postgresql.Driver");
      Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/project", "postgres", "Turbotime");
      Statement stmt = con.createStatement();
      int rs = stmt.executeUpdate("delete from  workout  where name='" + name + "'");
      if (rs == 1)
      { JOptionPane.showMessageDialog(this, "Successfully Deleted"); }
      else
      { JOptionPane.showMessageDialog(this, "Unsuccessfully Deletion"); } 
    } catch (Exception e) {
      
      System.out.println(e);
    } 
  }






  
  public static void main(String[] args) {
    try {
      for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          UIManager.setLookAndFeel(info.getClassName());
          break;
        } 
      } 
    } catch (Exception ex) {
                System.out.println(ex);
    }
      


    
    EventQueue.invokeLater(new Runnable() {
          public void run() {
            new admin().setVisible(true);
          }
        });
  } }


