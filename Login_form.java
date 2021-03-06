package com.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

public class Login_form extends javax.swing.JFrame 
{
  Connection con=null;
  ResultSet rs=null;
  PreparedStatement pst=null;
  int month,day,year,hour,min,sec;
 
    public Login_form() 
    {
        initComponents();
        con=Connectivity.getConnection(); 
        try{
        String query2="create database if not exists BusReservationSystem;";
         PreparedStatement pst2=con.prepareStatement(query2);
         pst2.executeUpdate();
         query2="use BusReservationSystem;";
         pst2=con.prepareStatement(query2);
         pst2.executeUpdate();
         query2="create table if not exists User(User_id int not null auto_increment,Uname varchar(40),Ugender varchar(10),U_dob varchar(20),Address varchar(100),U_MobileNo varchar(11),EmailId varchar(50),Password varchar(15),primary key(User_id));";
         pst2=con.prepareStatement(query2);
         pst2.executeUpdate();
         query2="create table if not exists Passenger(P_id varchar(40),Pname varchar(40),Pgender varchar(10),P_dob varchar(20),P_MobileNo varchar(11),primary key(P_id));";
         pst2=con.prepareStatement(query2);
         pst2.executeUpdate();
            System.out.println("Hii");
          query2="create table if not exists Bus(Bid int primary key auto_increment,Bname varchar(30), Booked_seats int,Total_seats int, Available_seats int);";
          pst2=con.prepareStatement(query2);
          pst2.executeUpdate();
            System.out.println("hello");
              query2="create table if not exists Ticket(Tid int primary key auto_increment, P_id varchar(40) references Passenger(P_id),source varchar(30), dest varchar(30),Bid int references Bus(Bid));";
          pst2=con.prepareStatement(query2);
          pst2.executeUpdate();
            System.out.println("Namste");
         query2="create table if not exists Route( Bid int references Bus(Bid),cost float ,distance float, sink varchar(30) ,start varchar(30) );";
         pst2=con.prepareStatement(query2);
          pst2.executeUpdate();
        }catch(Exception e)
        {
            System.out.println(e);
        }
        currentdate();
    }

    public void currentdate()
    {
       Calendar cal=new GregorianCalendar();
       
        month= cal.get(Calendar.MONTH);
        year=cal.get(Calendar.YEAR);
        day=cal.get(Calendar.DAY_OF_MONTH);
       label_date.setText(day+"/"+month+"/"+year);
     
        sec=cal.get(Calendar.SECOND);
        min=cal.get(Calendar.MINUTE);
        hour=cal.get(Calendar.HOUR);
       label_time.setText(hour+":"+min+":"+sec);
       
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UsernameTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        PasswordTextField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        label_time = new javax.swing.JLabel();
        label_date = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bus Reservation System");
        getContentPane().setLayout(null);

        b1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 0, 0));
        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/student/images/Log Details.png"))); // NOI18N
        b1.setText("LOGIN");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(240, 300, 110, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 153));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 200, 100, 20);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 153));
        jLabel2.setText("Username");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 140, 100, 20);

        UsernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(UsernameTextField);
        UsernameTextField.setBounds(250, 140, 170, 30);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("SignUp");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(430, 300, 100, 30);
        getContentPane().add(PasswordTextField);
        PasswordTextField.setBounds(250, 200, 170, 30);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("     BUS RESERVATION SYSTEM");
        jLabel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jLabel1ComponentHidden(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 50, 500, 60);

        label_time.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_time.setForeground(new java.awt.Color(255, 204, 204));
        label_time.setText("Time");
        getContentPane().add(label_time);
        label_time.setBounds(460, 10, 110, 30);

        label_date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_date.setForeground(new java.awt.Color(255, 204, 204));
        label_date.setText("Date");
        getContentPane().add(label_date);
        label_date.setBounds(340, 10, 110, 30);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Forgot Password");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(40, 300, 140, 30);

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(10, 10, 60, 23);

        jLabel5.setBackground(new java.awt.Color(153, 255, 51));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 204));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/student/images/img 2.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 570, 370);

        setSize(new java.awt.Dimension(584, 404));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
try
        {
            
          con=Connectivity.getConnection();
          String query2="select *from User where EmailId=? and Password=?";  //Employee is my table name     
          PreparedStatement pst=con.prepareStatement(query2);
          pst.setString(1,UsernameTextField.getText());
          pst.setString(2,PasswordTextField.getText());
          //pst.setString(2,new String(PasswordTextField.getPassword()));
            
          ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
                
                //admin login
                 if(UsernameTextField.getText().equals("admin@gmail.com")&&PasswordTextField.getText().equals("admin@1234"))
                {
                    AdminLogin a=new AdminLogin();//creating object a of class MainMenu
                    a.setVisible(true);//using object a setting visibility of mainMenuForm
                    this.setVisible(false);//disable current opened form
                }
                 
                 //employee login
                 else  if(UsernameTextField.getText().equals(rs.getString("EmailId"))&&PasswordTextField.getText().equals(rs.getString("Password")))
                 {
              UserLogin w=new UserLogin();//(UsernameTextField.getText());
                w.setVisible(true);
                setVisible(false);
                }
                
                
            }
            else 
            {
                JOptionPane.showMessageDialog(null,"Entered Wrong username or password","Wrong Pass",JOptionPane.ERROR_MESSAGE);
            PasswordTextField.setText("");
            UsernameTextField.setText("");
            
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }    }//GEN-LAST:event_b1ActionPerformed

    private void jLabel1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel1ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1ComponentHidden

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Signup s=new Signup();
        s.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
               try
                {
                    
                
                  con=Connectivity.getConnection();
                   //employee e=new employee(); 
                  String input = JOptionPane.showInputDialog("Sir/Madam Please Enter Username");
                  System.out.println(input);
                  String query1="select * from User where EmailId='"+input+"';";
                   
                  
                    pst=con.prepareStatement(query1);
                    ResultSet rs1=pst.executeQuery();
                    if(rs1.next())
                    {
                      String op1=rs1.getString("Password");
                      JOptionPane.showMessageDialog(null, op1, "Sir/Madam Your Passwors IS:", INFORMATION_MESSAGE);
                      //JOptionPane.showm
                    }
                    else
                    {
                      JOptionPane.showMessageDialog(null,"Please check Username");
                    }
                    
                 }catch(Exception e) 
                 {
                       
                       
                 }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void UsernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTextFieldActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordTextField;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JButton b1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel label_date;
    private javax.swing.JLabel label_time;
    // End of variables declaration//GEN-END:variables
}
