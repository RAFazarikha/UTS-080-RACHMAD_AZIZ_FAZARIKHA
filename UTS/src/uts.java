
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HP
 */
public class uts extends javax.swing.JFrame {

    /**
     * Creates new form uts
     */
    public uts() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnmulai = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbpemain = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbkomputer = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        fhasil = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new java.awt.BorderLayout(10, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GAME SUIT");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        btnmulai.setText("Mulai");
        btnmulai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmulaiActionPerformed(evt);
            }
        });
        jPanel1.add(btnmulai, java.awt.BorderLayout.LINE_END);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(new java.awt.GridLayout(3, 0, 0, 10));

        jLabel2.setText("Pemain :");
        jPanel3.add(jLabel2);

        cbpemain.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih --", "Gunting", "Batu", "Kertas" }));
        jPanel3.add(cbpemain);

        jLabel3.setText("Komputer :");
        jPanel3.add(jLabel3);

        cbkomputer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Gunting", "Batu", "Kertas" }));
        cbkomputer.setEnabled(false);
        jPanel3.add(cbkomputer);

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 215, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4);
        jPanel3.add(fhasil);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmulaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmulaiActionPerformed
        // TODO add your handling code here:
//        switch (cbpemain.getSelectedIndex()) {
//            case 1 -> cbkomputer.setSelectedIndex(1 + (int) (Math.random() * 3));
//            case 2 -> cbkomputer.setSelectedIndex(1 + (int) (Math.random() * 3));
//            case 3 -> cbkomputer.setSelectedIndex(1 + (int) (Math.random() * 3));
//            default -> JOptionPane.showMessageDialog(null, "Pilih Terlebih Dahulu");
//        }
        cbkomputer.setSelectedIndex(1 + (int) (Math.random() * 3));

        if (cbpemain.getSelectedIndex() == 1){
            if (cbkomputer.getSelectedIndex() == 1){
                fhasil.setText("Hasil Imbang!");
            }else if (cbkomputer.getSelectedIndex() == 2){
                fhasil.setText("Anda Kalah!");
            }if (cbkomputer.getSelectedIndex() == 3){
                fhasil.setText("Anda Menang!");
            }
        }else if (cbpemain.getSelectedIndex() == 2){
            if (cbkomputer.getSelectedIndex() == 1){
                fhasil.setText("Anda Menang!");
            }else if (cbkomputer.getSelectedIndex() == 2){
                fhasil.setText("Hasil Imbang!");
            }if (cbkomputer.getSelectedIndex() == 3){
                fhasil.setText("Anda Kalah!");
            }
        }else if (cbpemain.getSelectedIndex() == 3){
            if (cbkomputer.getSelectedIndex() == 1){
                fhasil.setText("Anda Kalah!");
            }else if (cbkomputer.getSelectedIndex() == 2){
                fhasil.setText("Anda Menang!");
            }if (cbkomputer.getSelectedIndex() == 3){
                fhasil.setText("Hasil Imbang!");
            }
        }
        
    }//GEN-LAST:event_btnmulaiActionPerformed

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
            java.util.logging.Logger.getLogger(uts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(uts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(uts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(uts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new uts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmulai;
    private javax.swing.JComboBox<String> cbkomputer;
    private javax.swing.JComboBox<String> cbpemain;
    private javax.swing.JTextField fhasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
