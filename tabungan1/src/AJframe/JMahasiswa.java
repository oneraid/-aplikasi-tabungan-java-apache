
package AJframe;
import CollegeStudent.Mahasiswa;
import static Connection.Koneksi.*;
import CollegeStudent.MahasiswaController;

import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class JMahasiswa extends javax.swing.JFrame {

    
    public String selected_nim;
    public String pNim, pNama, pJenisKelamin, pJurusan, pStatus;
    public int pTSaldo;
    
    Mahasiswa mahasiswa_model = new Mahasiswa(pNim, pNama, pJenisKelamin, pJurusan, pTSaldo, pStatus);
    MahasiswaController mahasiswa_controller = new MahasiswaController(mahasiswa_model , this);
    public DefaultTableModel table_mahasiswa = new DefaultTableModel();
    
    
    public JMahasiswa() {
        initComponents();
        cekKoneksi();
        initTable();
        showData();
        clearData();
    }
    
    private void initTable() {
       table_mahasiswa = new DefaultTableModel();
       tblMhs.setModel(table_mahasiswa);
       table_mahasiswa.addColumn("NIM");
       table_mahasiswa.addColumn("Nama");
       table_mahasiswa.addColumn("Jenis Kelamin");
       table_mahasiswa.addColumn("Jurusan");
       table_mahasiswa.addColumn("Total Tabungan");
       table_mahasiswa.addColumn("Status");
   }
    
    private void clearData(){
        txtNIM.requestFocus();
        txtNIM.setText("");
        Lk.setSelected(false);
        Pr.setSelected(false);
        txtNama.setText("");
        cJurusan.setSelectedItem("");
    }
    
    public void showData(){
        table_mahasiswa.getDataVector().removeAllElements();
        table_mahasiswa.fireTableDataChanged();
        mahasiswa_controller.show();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtNIM = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        Lk = new javax.swing.JCheckBox();
        Pr = new javax.swing.JCheckBox();
        cJurusan = new javax.swing.JComboBox<>();
        Txtsaldo1 = new javax.swing.JTextField();
        cStatus = new javax.swing.JComboBox<>();
        sumbitBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        KembaliBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMhs = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        txtNIM.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setText("NIM");

        jLabel5.setText("Nama");

        jLabel6.setText("Jenis Kelamin");

        jLabel7.setText("Jurusan");

        jLabel14.setText("Saldo");

        jLabel15.setText("Status");

        Lk.setText("Laki Laki");

        Pr.setText("Perempuan");

        cJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknik Informatika", "PGSD", "Sistem Informasi", "Farmasi", "Teknik Elektro" }));

        cStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aktif", "Non Aktif" }));

        sumbitBtn.setText("Submit");
        sumbitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumbitBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setForeground(new java.awt.Color(255, 0, 51));
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        ClearBtn.setText("Clear");
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });

        EditBtn.setText("Edit");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ClearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cJurusan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Lk, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Pr, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNama, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNIM)
                            .addComponent(Txtsaldo1)
                            .addComponent(cStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(sumbitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(EditBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DeleteBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Pr)
                    .addComponent(Lk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txtsaldo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(34, 34, 34)
                .addComponent(sumbitBtn)
                .addGap(18, 18, 18)
                .addComponent(EditBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ClearBtn)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        KembaliBtn.setText("<<Kembali");
        KembaliBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KembaliBtnMouseClicked(evt);
            }
        });
        KembaliBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliBtnActionPerformed(evt);
            }
        });

        tblMhs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIM", "Nama", "Jenis Kelamin", "Jurusan", "Total Tabungan", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMhsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMhs);
        if (tblMhs.getColumnModel().getColumnCount() > 0) {
            tblMhs.getColumnModel().getColumn(4).setResizable(false);
            tblMhs.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("DATA MAHASISWA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel3))
                    .addComponent(KembaliBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KembaliBtn)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 401, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 48, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        
        Txtsaldo1.setEditable(false);
        Txtsaldo1.setEnabled(false);
        EditBtn.setEnabled(false);
        DeleteBtn.setEnabled(false);
    }//GEN-LAST:event_formComponentShown

    private void tblMhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMhsMouseClicked
//        txtNIM.setEditable(false);
        txtNIM.setEnabled(false);
        sumbitBtn.setEnabled(false);
        EditBtn.setEnabled(true);
        DeleteBtn.setEnabled(true);
        
        
        int row = tblMhs.getSelectedRow();
        pNim = tblMhs.getValueAt(row, 0).toString();
        pNama = tblMhs.getValueAt(row, 1).toString();
        pJenisKelamin = tblMhs.getValueAt(row, 2).toString();
        pJurusan = tblMhs.getValueAt(row, 3).toString();
        selected_nim = pNim;
        txtNIM.setText(pNim);
        txtNama.setText(pNama);
        cJurusan.setSelectedItem(pJurusan);
        if(pJenisKelamin.equals("Laki-laki")){
            Lk.setSelected(true);
            Pr.setSelected(false);
        } else {
            Pr.setSelected(true);
            Lk.setSelected(false);
        }

        //        boolean a=tblMhs.isEditing();
        //        if(a==false){
            //            JOptionPane.showMessageDialog(null, "Table tidak bisa di ubah");
            //        }
    }//GEN-LAST:event_tblMhsMouseClicked

    private void KembaliBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_KembaliBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
        int ok=JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus data ini?","Confirmation",JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0)
        {
            try {
                mahasiswa_controller.delete();
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Data gagal dihapus!");
            }
        }
        showData();
        sumbitBtn.setEnabled(true);
        txtNIM.setEnabled(true);
        EditBtn.setEnabled(false);
        DeleteBtn.setEnabled(false);
        clearData();

    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:

        int ok=JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin mengupdate data ini?","Confirmation",JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0)
        {
            try{
                pNim = txtNIM.getText();
                pNama = txtNama.getText();
                pJenisKelamin = (Lk.isSelected() ? "Laki-laki" : "Perempuan");
                pJurusan = (String) cJurusan.getSelectedItem();
                pTSaldo = Integer.valueOf(Txtsaldo1.getText());
                pStatus = (String) cStatus.getSelectedItem();
                
                mahasiswa_controller.update();
                
                JOptionPane.showMessageDialog(this, "Data berhasil diupdate!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Data gagal DiUpdate!" );
            }
        }
        showData();
        sumbitBtn.setEnabled(true);
        txtNIM.setEnabled(true);
        EditBtn.setEnabled(false);
        DeleteBtn.setEnabled(false);
        clearData();
    }//GEN-LAST:event_EditBtnActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        new JmainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void sumbitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumbitBtnActionPerformed
        if(txtNIM.getText().isEmpty() || txtNama.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog(this, "error empty column!");
        }else{
            try{
                Txtsaldo1.setText("0");
                pNim = txtNIM.getText();
                pNama = txtNama.getText();
                pJenisKelamin = (Lk.isSelected() ? "Laki-laki" : "Perempuan");
                pJurusan = (String) cJurusan.getSelectedItem();
                pTSaldo = Integer.valueOf(Txtsaldo1.getText());
                pStatus = (String) cStatus.getSelectedItem();
                
                mahasiswa_controller.insert();
                
                JOptionPane.showMessageDialog(this, "Sukses ditambah");
            } catch (Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
        showData();
        clearData();
    }//GEN-LAST:event_sumbitBtnActionPerformed

    private void KembaliBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KembaliBtnMouseClicked
        new JmainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_KembaliBtnMouseClicked

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        sumbitBtn.setEnabled(true);
        txtNIM.setEnabled(true);
        EditBtn.setEnabled(false);
        DeleteBtn.setEnabled(false);
        clearData();  
    }//GEN-LAST:event_ClearBtnActionPerformed

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
            java.util.logging.Logger.getLogger(JMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JButton KembaliBtn;
    private javax.swing.JCheckBox Lk;
    private javax.swing.JCheckBox Pr;
    private javax.swing.JTextField Txtsaldo1;
    private javax.swing.JComboBox<String> cJurusan;
    private javax.swing.JComboBox<String> cStatus;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton sumbitBtn;
    private javax.swing.JTable tblMhs;
    private javax.swing.JTextField txtNIM;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}
