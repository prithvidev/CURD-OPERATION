
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PrithviDevKumar
 */
public class CURD_OP extends javax.swing.JFrame {

   
    public CURD_OP() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        n = new javax.swing.JTextField();
        suffix = new javax.swing.JComboBox<>();
        rolln = new javax.swing.JTextField();
        br = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        delete1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        l = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("jLabel4");

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CURD OPERATION WITHOUT DB");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel10.setText("Without Databse....");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 110, -1));
        jLabel10.getAccessibleContext().setAccessibleName("");

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Curd Operation...  (1).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 99));

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\wallpapers\\16.jpg")); // NOI18N
        jLabel3.setText("WITHOUT DATABASE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 120));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 110));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Name");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 118, 94, 25));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Roll No.");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 168, 94, 25));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Branch");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 211, 94, 25));

        n.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        n.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nFocusLost(evt);
            }
        });
        n.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nKeyPressed(evt);
            }
        });
        getContentPane().add(n, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 206, 25));

        suffix.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        suffix.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mr.", "Mrs.", "Miss" }));
        getContentPane().add(suffix, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 70, -1));

        rolln.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rolln.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rollnFocusGained(evt);
            }
        });
        rolln.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rollnKeyPressed(evt);
            }
        });
        getContentPane().add(rolln, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 206, 25));

        br.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        br.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECT ANY ONE--", "Bachelor of Technology", "Bachelor of Architecture", "Bachelor of Computer Applications", "Bachelor of Buisness Administration" }));
        br.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        br.setKeySelectionManager(null);
        br.setName("select");
        br.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                brFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                brFocusLost(evt);
            }
        });
        br.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brMouseClicked(evt);
            }
        });
        br.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brActionPerformed(evt);
            }
        });
        br.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                brKeyPressed(evt);
            }
        });
        getContentPane().add(br, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, 25));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 650, 10));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tab.setBackground(new java.awt.Color(0, 204, 255));
        tab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Rollno.", "Branch"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tab.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tab.setName(""); // NOI18N
        tab.setOpaque(false);
        tab.getTableHeader().setReorderingAllowed(false);
        tab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tab);
        if (tab.getColumnModel().getColumnCount() > 0) {
            tab.getColumnModel().getColumn(0).setResizable(false);
            tab.getColumnModel().getColumn(0).setPreferredWidth(35);
            tab.getColumnModel().getColumn(1).setResizable(false);
            tab.getColumnModel().getColumn(1).setPreferredWidth(10);
            tab.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 200));

        add.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        add.setText("ADD");
        add.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel2.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 11, 116, -1));

        update.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        update.setText("UPDATE");
        update.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel2.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 58, 116, -1));

        delete.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        delete.setText("DELETE");
        delete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel2.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 110, 116, -1));

        delete1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        delete1.setText("CANCEL");
        delete1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });
        jPanel2.add(delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 155, 116, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16.jpg"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 220));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 276, 650, 210));

        l.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(l, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 161, 233, 32));

        jLabel7.setIcon(new javax.swing.ImageIcon("E:\\wallpapers\\16.jpg")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 650, 220));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 650, 160));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 8)); // NOI18N
        jLabel11.setText("copyright version 1.0.0.0");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 125, 19));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 20));
        jLabel12.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 650, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
    l.setText("");
    if(!n.getText().trim().equals("")){
        DefaultTableModel model = (DefaultTableModel)tab.getModel();
        if(br.getSelectedIndex()== 0 || rolln.getText().isEmpty() || n.getText().isEmpty()){
        l.setText("CHECK ALL THE BOXES");
        }
        else{
        model.addRow(new Object[]{suffix.getSelectedItem().toString()+" "+n.getText(),rolln.getText(),br.getSelectedItem().toString()});
        l.setText("SUCCESSFULLY ADDED");
        n.setText("");
        rolln.setText("");
        br.setSelectedIndex(0);
        }
    }
    else {
    l.setText("HOW CAN YOU MISS IT BRUH!!!");
    }
    }//GEN-LAST:event_addActionPerformed

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_delete1ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
       l.setText("");
        DefaultTableModel m=(DefaultTableModel) tab.getModel();
        if(tab.getSelectedRow()==-1)
        {
        if(tab.getRowCount()==0)
        {
        l.setText("Table is Empty First Add Record");
        
        }
        else
        {
        
        l.setText("You Must Select a Record ");
        }
        
       }
       
        else
        {
        m.setValueAt(n.getText(),tab.getSelectedRow(),0);
        m.setValueAt(rolln.getText(),tab.getSelectedRow(),1);
        m.setValueAt(br.getSelectedItem().toString(),tab.getSelectedRow(),2);
        l.setText("Updated Successfully...");
        n.setText("");
        rolln.setText("");
        br.setSelectedIndex(0);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void tabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMouseClicked
 DefaultTableModel m=(DefaultTableModel) tab.getModel();
    n.setText(m.getValueAt(tab.getSelectedRow(),0).toString());
    br.setSelectedItem(m.getValueAt(tab.getSelectedRow(),2).toString());
    rolln.setText(m.getValueAt(tab.getSelectedRow(),1).toString());
    }//GEN-LAST:event_tabMouseClicked

    private void brActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brActionPerformed

    private void brFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_brFocusGained
       
    }//GEN-LAST:event_brFocusGained

    private void brKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_brKeyPressed
      
      
      
    }//GEN-LAST:event_brKeyPressed

    private void brMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brMouseClicked
                
    }//GEN-LAST:event_brMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
    l.setText("");
    DefaultTableModel m = (DefaultTableModel)tab.getModel();
    if(tab.getSelectedRow()== -1){
    if(tab.getRowCount()==0){
    l.setText("TABLE IS EMPTY");
    }
    else{l.setText("YOU MUST SELECT A RECORD");}
    }
    else{
    m.removeRow(tab.getSelectedRow());
    n.setText("");
    rolln.setText("");
    br.setSelectedIndex(0);
    }
    }//GEN-LAST:event_deleteActionPerformed

    private void nFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nFocusGained
      
    }//GEN-LAST:event_nFocusGained

    private void rollnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rollnFocusGained
      
    }//GEN-LAST:event_rollnFocusGained

    private void brFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_brFocusLost
      
    }//GEN-LAST:event_brFocusLost

    private void nFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nFocusLost
  // TODO add your handling code here:
    }//GEN-LAST:event_nFocusLost

    private void nKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nKeyPressed
if (!n.getText().matches("^[a-zA-Z   ]*$") )
        {
            l.setText("ONLY CHARACTERS");
            n.setText("");
        }           // TODO add your handling code here:
    }//GEN-LAST:event_nKeyPressed

    private void rollnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rollnKeyPressed
if (rolln.getText().matches("^[a-zA-Z   ]*$"))
{
l.setText("ONLY NUMBERS");
rolln.setText("");
}   
    }//GEN-LAST:event_rollnKeyPressed

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
                /*if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }*/
                  UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CURD_OP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CURD_OP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CURD_OP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CURD_OP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CURD_OP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JComboBox<String> br;
    private javax.swing.JButton delete;
    private javax.swing.JButton delete1;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel l;
    private javax.swing.JTextField n;
    private javax.swing.JTextField rolln;
    private javax.swing.JComboBox<String> suffix;
    private javax.swing.JTable tab;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
