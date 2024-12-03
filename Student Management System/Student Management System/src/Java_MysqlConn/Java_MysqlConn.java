package Java_MysqlConn;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Java_MysqlConn extends javax.swing.JFrame {
 private static final String username = "root";
    private static final String password = "1234";
    private static final String dataConn = "jdbc:mysql://localhost:3306/connector";

    Connection sqlConn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int q, i;
 public Java_MysqlConn() {
        initComponents();
    }
  public void upDateDb() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn, username, password);
            pst = sqlConn.prepareStatement("SELECT * FROM connector");

            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();

            q = stData.getColumnCount();
            DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
            RecordTable.setRowCount(0);

            while (rs.next()) {
                Vector<String> columnData = new Vector<>();

                for (i = 1; i <= q; i++) {
                    columnData.add(rs.getString("id"));
                    columnData.add(rs.getString("StudentID"));
                    columnData.add(rs.getString("Firstname"));
                    columnData.add(rs.getString("Surename"));
                    columnData.add(rs.getString("Address"));
                    columnData.add(rs.getString("PostCode"));
                    columnData.add(rs.getString("Telephone"));
                }
                RecordTable.addRow(columnData);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextTelephone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextStudentID = new javax.swing.JTextField();
        jTextFirstName = new javax.swing.JTextField();
        jTextSurname = new javax.swing.JTextField();
        jTextAddress = new javax.swing.JTextField();
        jTextPost = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jButtonExit = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonPrint = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 8));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 8));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, -1, 390));

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Student Data");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 333, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 870, 110));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 8));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextTelephone.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel3.add(jTextTelephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 430, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Telephone");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Student ID");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("First Name");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Surname");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Address");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jTextStudentID.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel3.add(jTextStudentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 430, -1));

        jTextFirstName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel3.add(jTextFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 430, -1));

        jTextSurname.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel3.add(jTextSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 430, -1));

        jTextAddress.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel3.add(jTextAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 430, -1));

        jTextPost.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel3.add(jTextPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 430, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Post code");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Student Id", "Firstname", "Surename", "Address", "Post Code", "Telephone"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 590, 170));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 610, 490));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 8));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonExit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 210, -1));

        jButtonAdd.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonAdd.setText("Add New ");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 210, -1));

        jButtonUpdate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 210, -1));

        jButtonPrint.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonPrint.setText("Print");
        jButtonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrintActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 210, -1));

        jButtonReset.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 210, -1));

        jButtonDelete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 210, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 250, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 28, 890, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
         jTextStudentID.setText("");
        jTextFirstName.setText("");
        jTextSurname.setText("");
        jTextAddress.setText("");
        jTextPost.setText("");
        jTextTelephone.setText("");        
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
         try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Corrected Driver
            sqlConn = DriverManager.getConnection(dataConn, username, password);
            pst = sqlConn.prepareStatement(
                    "INSERT INTO connector (StudentID, Firstname, Surename, Address, PostCode, Telephone) VALUES (?, ?, ?, ?, ?, ?)"
            );

            pst.setString(1, jTextStudentID.getText());
            pst.setString(2, jTextFirstName.getText());
            pst.setString(3, jTextSurname.getText());
            pst.setString(4, jTextAddress.getText());
            pst.setString(5, jTextPost.getText());
            pst.setString(6, jTextTelephone.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Added");
            upDateDb();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        try {
            int selectedRow = jTable1.getSelectedRow();
            if (selectedRow >= 0) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                sqlConn = DriverManager.getConnection(dataConn, username, password);

                pst = sqlConn.prepareStatement(
                        "UPDATE connector SET StudentID=?, Firstname=?, Surename=?, Address=?, PostCode=?, Telephone=? WHERE id=?");

                pst.setString(1, jTextStudentID.getText());
                pst.setString(2, jTextFirstName.getText());
                pst.setString(3, jTextSurname.getText());
                pst.setString(4, jTextAddress.getText());
                pst.setString(5, jTextPost.getText());
                pst.setString(6, jTextTelephone.getText());
                pst.setInt(7, Integer.parseInt(jTable1.getValueAt(selectedRow, 0).toString()));

                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Record Updated");
                upDateDb();
            } else {
                JOptionPane.showMessageDialog(this, "No record selected.");
            }
        } catch (Exception ex) {
            Logger.getLogger(Java_MysqlConn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Java_MysqlConn().setVisible(true));
    }//GEN-LAST:event_jButtonUpdateActionPerformed
private JFrame farme;
    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
      JFrame frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to Exit", "MySQL Connector",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
          int SelectedRows= jTable1.getSelectedRow();
          
          jTextStudentID.setText(RecordTable.getValueAt(SelectedRows,1).toString());
          jTextFirstName.setText(RecordTable.getValueAt(SelectedRows,2).toString());
          jTextSurname.setText(RecordTable.getValueAt(SelectedRows,3).toString());
          jTextAddress.setText(RecordTable.getValueAt(SelectedRows,4).toString());
          jTextPost.setText(RecordTable.getValueAt(SelectedRows,5).toString());
          jTextTelephone.setText(RecordTable.getValueAt(SelectedRows,6).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrintActionPerformed
         try {
            boolean print = jTable1.print();
            if (print) {
                JOptionPane.showMessageDialog(this, "Print successful");
            } else {
                JOptionPane.showMessageDialog(this, "Print cancelled");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jButtonPrintActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
       try {
            int selectedRow = jTable1.getSelectedRow();
            if (selectedRow >= 0) {
                int id = Integer.parseInt(jTable1.getValueAt(selectedRow, 0).toString());
                int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this record?");
                if (confirm == JOptionPane.YES_OPTION) {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    sqlConn = DriverManager.getConnection(dataConn, username, password);
                    pst = sqlConn.prepareStatement("DELETE FROM connector WHERE id=?");
                    pst.setInt(1, id);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Record Deleted");
                    upDateDb();
                }
            } else {
                JOptionPane.showMessageDialog(this, "No record selected.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonPrint;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextAddress;
    private javax.swing.JTextField jTextFirstName;
    private javax.swing.JTextField jTextPost;
    private javax.swing.JTextField jTextStudentID;
    private javax.swing.JTextField jTextSurname;
    private javax.swing.JTextField jTextTelephone;
    // End of variables declaration//GEN-END:variables
}
