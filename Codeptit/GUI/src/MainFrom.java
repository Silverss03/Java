
import gui.Main;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class MainFrom extends javax.swing.JFrame {

    /**
     * Creates new form MainFrom
     */
    public MainFrom() {
        initComponents();
        bt1.setEnabled(false);
        bt2.setEnabled(false);
        mLamLai.setEnabled(false);
        mTinhToan.setEnabled(false);
        setLocationRelativeTo(this) ;
        bt1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                txtn1.setText("");
                txtn2.setText("");
            }
            
        });
        bt2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(txtn1.getText()) ;
                int n2 = Integer.parseInt(txtn2.getText()) ;
                int kq = n1 + n2 ; 
                lblketqua.setText("Ket qua:" + kq);
            }
            
        });
        bt3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(JOptionPane.showConfirmDialog(null, "Co thoat khong", "Thoat", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                    System.exit(0) ;
                }
            }
            
        });
        txtn1.getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {
                String s1 = txtn1.getText() ;
                String s2 = txtn2.getText() ;
                if(s1.isEmpty() && s2.isEmpty())
                    bt1.setEnabled(false);
                else
                    bt1.setEnabled(true);
                String reg = "\\d+" ;
                if(s1.matches(reg) && s2.matches(reg)){
                    bt2.setEnabled(true);
                }
                else{
                    bt2.setEnabled(false);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String s1 = txtn1.getText() ;
                String s2 = txtn2.getText() ;
                if(s1.isEmpty() && s2.isEmpty())
                    bt1.setEnabled(false);
                else
                    bt1.setEnabled(true);
                String reg = "\\d+" ;
                if(s1.matches(reg) && s2.matches(reg)){
                    bt2.setEnabled(true);
                }
                else{
                    bt2.setEnabled(false);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
            
        });
        txtn2.getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {
                String s1 = txtn1.getText() ;
                String s2 = txtn2.getText() ;
                if(s1.isEmpty() && s2.isEmpty()){
                    bt1.setEnabled(false);
                    mLamLai.setEnabled(false);
                }
                else{
                    bt1.setEnabled(true);
                    mLamLai.setEnabled(true);
                }
                String reg = "\\d+" ;
                if(s1.matches(reg) && s2.matches(reg)){
                    bt2.setEnabled(true);
                    mTinhToan.setEnabled(true);
                }
                else{
                    bt2.setEnabled(false);
                    mTinhToan.setEnabled(false);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String s1 = txtn1.getText() ;
                String s2 = txtn2.getText() ;
                if(s1.isEmpty() && s2.isEmpty()){
                    bt1.setEnabled(false);
                    mLamLai.setEnabled(false);
                }
                else{
                    bt1.setEnabled(true);
                    mLamLai.setEnabled(true);
                }
                String reg = "\\d+" ;
                if(s1.matches(reg) && s2.matches(reg)){
                    bt2.setEnabled(true);
                    mTinhToan.setEnabled(true) ;
                }
                else{
                    bt2.setEnabled(false);
                    mTinhToan.setEnabled(false) ;
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
            
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbln1 = new javax.swing.JLabel();
        lbln2 = new javax.swing.JLabel();
        txtn1 = new javax.swing.JTextField();
        txtn2 = new javax.swing.JTextField();
        lblketqua = new javax.swing.JLabel();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu1 = new javax.swing.JMenu();
        mLamLai = new javax.swing.JMenuItem();
        mTinhToan = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mThoat = new javax.swing.JMenuItem();
        menu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tinh toan");

        lbln1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbln1.setText("Nhập vào số thứ nhất");

        lbln2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbln2.setText("Nhập số thứ 2");

        txtn1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtn2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblketqua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblketqua.setText("Kết quả");

        bt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt1.setText("Làm lại");

        bt2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt2.setText("Tính toán");

        bt3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt3.setText("Thoát");
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });

        menu1.setText("Thực hiện");
        menu1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        mLamLai.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mLamLai.setText("Làm lại");
        mLamLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mLamLaiActionPerformed(evt);
            }
        });
        menu1.add(mLamLai);

        mTinhToan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mTinhToan.setText("Tính toán");
        mTinhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mTinhToanActionPerformed(evt);
            }
        });
        menu1.add(mTinhToan);
        menu1.add(jSeparator1);

        mThoat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mThoat.setText("Thoát");
        mThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mThoatActionPerformed(evt);
            }
        });
        menu1.add(mThoat);

        jMenuBar1.add(menu1);

        menu2.setText("Đặt màu");
        menu2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenu1.setText("Đặt màu chữ");

        jMenuItem3.setText("Màu đỏ");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem5.setText("Màu xanh lá cây");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Màu xanh nước biển");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        menu2.add(jMenu1);

        jMenu2.setText("Đặt màu nền");

        jMenuItem7.setText("Màu xanh nhạt");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("Màu vàng nhạt");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        menu2.add(jMenu2);

        jMenuBar1.add(menu2);

        jMenu3.setText("Mở Form");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Mở Form 1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbln2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbln1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblketqua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtn1)
                            .addComponent(txtn2, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(bt2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(bt3)
                        .addGap(85, 85, 85))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbln1)
                    .addComponent(txtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbln2)
                    .addComponent(txtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(lblketqua)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt1)
                    .addComponent(bt2)
                    .addComponent(bt3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        lbln1.setForeground(Color.green);
        lbln2.setForeground(Color.green);
        lblketqua.setForeground(Color.green);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void mLamLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mLamLaiActionPerformed
        txtn1.setText("");
        txtn2.setText("");
    }//GEN-LAST:event_mLamLaiActionPerformed

    private void mTinhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mTinhToanActionPerformed
        int n1 = Integer.parseInt(txtn1.getText()) ;
        int n2 = Integer.parseInt(txtn2.getText()) ;
        int kq = n1 + n2 ; 
        lblketqua.setText("Ket qua:" + kq);
    }//GEN-LAST:event_mTinhToanActionPerformed

    private void mThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mThoatActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Co thoat khong", "Thoat", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            System.exit(0) ;
        }
    }//GEN-LAST:event_mThoatActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        lbln1.setForeground(Color.red);
        lbln2.setForeground(Color.red);
        lblketqua.setForeground(Color.red);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        lbln1.setForeground(Color.blue);
        lbln2.setForeground(Color.blue);
        lblketqua.setForeground(Color.blue);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        txtn1.setBackground(Color.cyan);
        txtn2.setBackground(Color.cyan);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        txtn1.setBackground(Color.yellow);
        txtn2.setBackground(Color.yellow);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        MainForm2 m = new MainForm2() ;
        m.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblketqua;
    private javax.swing.JLabel lbln1;
    private javax.swing.JLabel lbln2;
    private javax.swing.JMenuItem mLamLai;
    private javax.swing.JMenuItem mThoat;
    private javax.swing.JMenuItem mTinhToan;
    private javax.swing.JMenu menu1;
    private javax.swing.JMenu menu2;
    private javax.swing.JTextField txtn1;
    private javax.swing.JTextField txtn2;
    // End of variables declaration//GEN-END:variables
}
