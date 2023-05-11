/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student.result.management;
import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Hai
 */
public class StudentHome extends javax.swing.JFrame {

    
    /**
     * Creates new form StudentHome
     */
    public StudentHome() {
 initComponents();
 
    }
    
        public StudentHome(String rollno) {
              
        initComponents();
        
         try{
    String url,user,pass;
    
        
        url= "jdbc:mysql://localhost:3306/StudentResult";
        user = "root";
        pass = "1234";
        
    
    Connection con = DriverManager.getConnection(url,user,pass);
    Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("Select * from student inner join result where student.rollno ='"+rollno+"' and result.rollNo='"+rollno+"'");

        if(rs.next()){
            
            rt.setText(rs.getString(1));
            ct.setText(rs.getString(2));
            bt.setText(rs.getString(3));
            nt.setText(rs.getString(4));
            gt.setText(rs.getString(5));
            ft.setText(rs.getString(6));
            
            
            jTextField19.setText(rs.getString(8));
            jTextField20.setText(rs.getString(9));
            jTextField21.setText(rs.getString(10));
            jTextField22.setText(rs.getString(11));
            jTextField23.setText(rs.getString(12));
            
            int mark1, mark2,mark3,mark4,mark5;
            
            mark1=Integer.parseInt(jTextField19.getText());
            mark2=Integer.parseInt(jTextField20.getText());
            mark3=Integer.parseInt(jTextField21.getText());
            mark4=Integer.parseInt(jTextField22.getText());
            mark5=Integer.parseInt(jTextField23.getText());
            
            int total = mark1+mark2+mark3+mark4+mark5;
            
            jTextField24.setText(Integer.toString(total));
            
            if(mark1>49 && mark2>49 && mark3>49 && mark4>49 && mark5>49){
                            JOptionPane.showMessageDialog(null, "pass");
                                        jTextField25.setText("PASS");


            }
            
            else{
                 JOptionPane.showMessageDialog(null, "Sorry!! You are fail");
                                                         jTextField25.setText("FAIL");

            }
           
        }
        else{
            JOptionPane.showMessageDialog(null, "Incorrect roll Number");
             setVisible(false);
            new StudentHome(rollno).setVisible(true);
        }
    
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "connection error");
             setVisible(false);
            new StudentHome(rollno).setVisible(true);
        }
        
         rt.setEditable(false);
         ct.setEditable(false);
         bt.setEditable(false);
         nt.setEditable(false);
         gt.setEditable(false);
         ft.setEditable(false);
         
         jTextField19.setEditable(false);
         jTextField20.setEditable(false);
         jTextField21.setEditable(false);
         jTextField22.setEditable(false);
         jTextField23.setEditable(false);
         jTextField24.setEditable(false);
                  jTextField25.setEditable(false);

      
    }
        


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ct = new javax.swing.JTextField();
        gt = new javax.swing.JTextField();
        nt = new javax.swing.JTextField();
        bt = new javax.swing.JTextField();
        rt = new javax.swing.JTextField();
        ft = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 6), "Result", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 24), new java.awt.Color(153, 0, 51))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setText("Course Name");

        jLabel2.setText("Name");

        jLabel3.setText("Gender");

        jLabel4.setText("Branch Name");

        jLabel5.setText("Roll Number");

        jLabel6.setText("Father Name");

        ct.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        gt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        nt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        bt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ft.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(gt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ct, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ft, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(rt, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(bt)))
                .addGap(99, 99, 99))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel4))
                            .addGap(6, 6, 6)))
                    .addComponent(ct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(rt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel6)
                        .addComponent(gt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 710, 110));

        jLabel7.setText("Physics-1");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel8.setText("Chemistry");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel9.setText("Maths");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel10.setText("Electronic Engg");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel11.setText("Electrical Engg");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jLabel12.setText("Total Marks");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        jLabel13.setText("Total Marks");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        jLabel14.setText("Passing Marks");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        jLabel15.setText("Marks Obtained");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, -1, -1));

        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 70, -1));

        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 70, -1));

        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 70, -1));

        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 70, -1));

        jTextField23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 70, -1));

        jTextField24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 70, -1));

        jTextField25.setBackground(new java.awt.Color(153, 153, 153));
        jTextField25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField25ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 70, -1));

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("<-Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 70, -1));

        jLabel16.setText("50");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, 10));

        jLabel17.setText("50");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, 10));

        jLabel18.setText("50");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, 10));

        jLabel19.setText("50");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, -1, 10));

        jLabel20.setText("50");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, -1, 10));

        jLabel21.setText("each>50");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, -1, 10));

        jLabel22.setText("100");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        jLabel23.setText("100");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        jLabel24.setText("100");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        jLabel25.setText("100");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));

        jLabel26.setText("100");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, -1, -1));

        jLabel27.setText("500");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        dispose();
        new StudentIndex().setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField25ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bt;
    private javax.swing.JTextField ct;
    private javax.swing.JTextField ft;
    private javax.swing.JTextField gt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField nt;
    private javax.swing.JTextField rt;
    // End of variables declaration//GEN-END:variables
}
