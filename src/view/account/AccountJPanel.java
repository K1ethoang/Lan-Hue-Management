/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.account;

/**
 *
 * @author Admin
 */
public class AccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TaiKhoanJPanel
     */
    public AccountJPanel() {
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

        jPanel1 = new javax.swing.JPanel();
        labelGoogleIcon1 = new view.component.LabelGoogleIcon();

        setBackground(new java.awt.Color(249, 245, 231));

        jPanel1.setBackground(getBackground());

        labelGoogleIcon1.setBackground(getBackground());
        labelGoogleIcon1.setForeground(new java.awt.Color(0, 0, 0));
        labelGoogleIcon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGoogleIcon1.setText("Đang phát triển");
        labelGoogleIcon1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelGoogleIcon1.setGoogleIcon(icon.GoogleMaterialDesignIcons.CODE);
        labelGoogleIcon1.setIconColor(new java.awt.Color(0, 0, 0));
        labelGoogleIcon1.setIconSize(36.0F);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelGoogleIcon1, javax.swing.GroupLayout.DEFAULT_SIZE, 1005, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelGoogleIcon1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private view.component.LabelGoogleIcon labelGoogleIcon1;
    // End of variables declaration//GEN-END:variables
}
