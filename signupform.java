
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wahu
 */
public class signupform extends javax.swing.JFrame {
        connection con=null;
        PreparedStatement pst=null;
    private int signup;
    private int Password;
    /**
     * Creates new form signupform
     */
    public signupform() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButtonsignup = new javax.swing.JButton();
        jButtonback = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(237, 53, 139));

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel1.setText("TOUR KENYA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("-");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        close.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        close.setText("X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 544, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(close)
                .addGap(309, 309, 309))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(close))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1068, 51);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 254, 254));
        jLabel4.setText("Username:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 93, 58, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 254, 254));
        jLabel5.setText("Confirm Password:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 213, 110, 15);

        jTextField1.setBackground(new java.awt.Color(129, 132, 28));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(140, 90, 170, 30);

        jPasswordField1.setBackground(new java.awt.Color(129, 132, 28));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(140, 210, 170, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 254, 254));
        jLabel6.setText("Email:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 131, 76, 15);

        jTextField2.setBackground(new java.awt.Color(129, 132, 28));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(140, 130, 170, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 254, 254));
        jLabel7.setText("Enter Password:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 175, 131, 15);

        jPasswordField2.setBackground(new java.awt.Color(129, 132, 28));
        getContentPane().add(jPasswordField2);
        jPasswordField2.setBounds(140, 170, 170, 30);

        jButtonsignup.setBackground(new java.awt.Color(0, 94, 255));
        jButtonsignup.setText("Sign up");
        jButtonsignup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonsignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonsignupMouseClicked(evt);
            }
        });
        jButtonsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsignupActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonsignup);
        jButtonsignup.setBounds(250, 360, 90, 23);

        jButtonback.setBackground(new java.awt.Color(0, 94, 255));
        jButtonback.setText("Back");
        jButtonback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonbackMouseClicked(evt);
            }
        });
        jButtonback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbackActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonback);
        jButtonback.setBounds(460, 410, 55, 23);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Wahu\\Downloads\\animal-eyes-big-dangerous-87403 (1).jpg")); // NOI18N
        jLabel9.setText("cancel");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(-6, 54, 800, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void jButtonbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonbackActionPerformed

    private void jButtonsignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonsignupMouseClicked
        loginform lgf=new loginform();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        
      
    }//GEN-LAST:event_jButtonsignupMouseClicked

    private void jButtonbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonbackMouseClicked
         frontpage fpg=new frontpage();
        fpg.setVisible(true);
        fpg.pack();
        fpg.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonbackMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButtonsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsignupActionPerformed
          String a=jTextField1.getText();
          String b=jTextField2.getText();
          String c=jPasswordField2.getText();
          String d=jPasswordField1.getText();

        
        
        
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tourism","root","");
           Statement st=con.createStatement();
           String q="Select * from sign_up;";
           ResultSet rs=st.executeQuery(q);
           while(rs.next())
           {
               String username=rs.getString(signup);
               String email=rs.getString(signup);
               String pass=rs.getString(Password);
               
               if(a.equals(username) && pass.equals(b))
               {
                 new frontpage().setVisible(true);
               }
               else
               {
                   JOptionPane.showMessageDialog(null,"wrong password");
               }
           }
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,"error while establishing connection");
       }
    }//GEN-LAST:event_jButtonsignupActionPerformed

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
            java.util.logging.Logger.getLogger(signupform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signupform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signupform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signupform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signupform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private javax.swing.JButton jButtonback;
    private javax.swing.JButton jButtonsignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
