/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AJframe;
import Transaction.DepositController;
import static Connection.Koneksi.*;
import Transaction.Deposit;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ridhw
 */
public class JDeposit extends javax.swing.JFrame {

    public String pIdsetor, pNim, pNama;
    public Date pDate;
    public int pDsaldo;
    
    Deposit deposit_model = new Deposit(pIdsetor, pNim, pNama, pDate, pDsaldo);
    DepositController deposit_controller = new DepositController(deposit_model, this);
    public DefaultTableModel table_deposit = new DefaultTableModel();
            
    public JDeposit() {
        initComponents();
        cekKoneksi();
        initTable();
        showData();
        clearData();
    }

    
    private void initTable() {
       table_deposit = new DefaultTableModel();
       tblst.setModel(table_deposit);
       table_deposit.addColumn("ID Setor");
       table_deposit.addColumn("NIM");
       table_deposit.addColumn("Nama");
       table_deposit.addColumn("Tanggal");
       table_deposit.addColumn("Jumlah");
   }
    
    private void clearData(){
        txtNIM.requestFocus();
        txtNIM.setText("");
        Namelb.setText("");
        JeniskelLb.setText("");
        Jurusanlb.setText("");
        txAmount.setText("");
        idsetorLbl.setText("");
        saldo.setText("");
    }
    
    public void showData(){
        table_deposit.getDataVector().removeAllElements();
        table_deposit.fireTableDataChanged();
        deposit_controller.show();
    }
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtNIM = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        CheckBtn = new javax.swing.JButton();
        DepositBtn = new javax.swing.JButton();
        Namelb = new javax.swing.JLabel();
        JeniskelLb = new javax.swing.JLabel();
        Jurusanlb = new javax.swing.JLabel();
        saldo = new javax.swing.JLabel();
        txAmount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idsetorLbl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblst = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        kembaliBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("NIM");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("DEPOSIT");

        CheckBtn.setText("Check");
        CheckBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckBtnMouseClicked(evt);
            }
        });
        CheckBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBtnActionPerformed(evt);
            }
        });

        DepositBtn.setText("DEPOSIT");
        DepositBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositBtnActionPerformed(evt);
            }
        });

        Namelb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Namelb.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Namelb.setText("-");

        JeniskelLb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JeniskelLb.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JeniskelLb.setText("-");

        Jurusanlb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Jurusanlb.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Jurusanlb.setText("-");

        saldo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        saldo.setForeground(new java.awt.Color(51, 51, 255));
        saldo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        saldo.setText("-");

        txAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txAmountKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Rp");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Rp");

        idsetorLbl.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        idsetorLbl.setForeground(new java.awt.Color(255, 0, 51));
        idsetorLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idsetorLbl.setText("-");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(JeniskelLb, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Jurusanlb, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Namelb, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(saldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DepositBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                    .addComponent(txAmount)
                                    .addComponent(idsetorLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CheckBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(txtNIM))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Namelb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JeniskelLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Jurusanlb)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saldo)
                    .addComponent(jLabel5))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addComponent(DepositBtn)
                .addGap(18, 18, 18)
                .addComponent(idsetorLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblst.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Setor", "NIM", "Nama", "Tanggal", "Jumlah"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblstMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblst);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("DATA DEPOSIT");

        kembaliBtn.setText("<<Kembali");
        kembaliBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kembaliBtnMouseClicked(evt);
            }
        });
        kembaliBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kembaliBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jLabel3)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kembaliBtn)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CheckBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBtnActionPerformed

        try {
            
            deposit_controller.dataview(txtNIM, Namelb, Jurusanlb, JeniskelLb, saldo);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_CheckBtnActionPerformed

    private void tblstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblstMouseClicked

        boolean a=tblst.isEditing();
        if(a==false){
            JOptionPane.showMessageDialog(null, "Table tidak bisa di ubah");
        }

    }//GEN-LAST:event_tblstMouseClicked

    private void kembaliBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliBtnActionPerformed
        new JmainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kembaliBtnActionPerformed

    private void kembaliBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kembaliBtnMouseClicked
        new JmainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kembaliBtnMouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        DepositBtn.setEnabled(false);
    }//GEN-LAST:event_formComponentShown

    private void CheckBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckBtnMouseClicked
        DepositBtn.setEnabled(true);
    }//GEN-LAST:event_CheckBtnMouseClicked

    private void txAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txAmountKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txAmountKeyTyped

    private void DepositBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositBtnActionPerformed
        if (txtNIM.getText().isEmpty() || txAmount.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Masukkan Nim atau Jumlah");
        }else{
                try {
                deposit_controller.code(idsetorLbl);
                pIdsetor = idsetorLbl.getText();
                
                pNim = txtNIM.getText();
                pNama = Namelb.getText();
                pDsaldo = Integer.parseInt(txAmount.getText());

                java.util.Date date = new java.util.Date();
                pDate = new java.sql.Date(date.getTime());
                
                deposit_controller.insert();
                deposit_controller.updatesaldo(pNim, pDsaldo);
                
                JOptionPane.showMessageDialog(this, "Sukses ditambah");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
        
        showData();
        clearData();
        DepositBtn.setEnabled(false);
    }//GEN-LAST:event_DepositBtnActionPerformed

    
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
            java.util.logging.Logger.getLogger(JDeposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDeposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDeposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDeposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JDeposit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CheckBtn;
    private javax.swing.JButton DepositBtn;
    private javax.swing.JLabel JeniskelLb;
    private javax.swing.JLabel Jurusanlb;
    private javax.swing.JLabel Namelb;
    public javax.swing.JLabel idsetorLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kembaliBtn;
    private javax.swing.JLabel saldo;
    private javax.swing.JTable tblst;
    private javax.swing.JTextField txAmount;
    private javax.swing.JTextField txtNIM;
    // End of variables declaration//GEN-END:variables
}
