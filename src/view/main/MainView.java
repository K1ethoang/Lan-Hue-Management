/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.main;

import bean.DanhMucBean;
import controller.ChuyenManHinhController;
import java.util.ArrayList;
import java.util.List;

public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
        
        setTitle("QUẢN LÍ TIỆC LAN HUỆ");
        // chuyển màn hình view
        ChuyenManHinhController controller = new ChuyenManHinhController(jpnView);
        controller.setView(jpnKhachHang, jlbKhachHang);
        
        List<DanhMucBean> listItem = new ArrayList<>();
        listItem.add(new DanhMucBean("KhachHang", jpnKhachHang, jlbKhachHang));
        listItem.add(new DanhMucBean("NhanVien", jpnNhanVien, jlbNhanVien));
        listItem.add(new DanhMucBean("ThucDon", jpnThucDon, jlbThucDon));
        listItem.add(new DanhMucBean("DatTiec", jpnDatTiec, jlbDatTiec));
        listItem.add(new DanhMucBean("DoanhThu", jpnDoanhThu, jlbDoanhThu));
        listItem.add(new DanhMucBean("DangXuat", jpnDangXuat, jlbDangXuat));
        
        controller.setEvent(listItem);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRoot = new javax.swing.JPanel();
        jpnView = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        labelGoogleIcon1 = new icon.LabelGoogleIcon();
        jpnNhanVien = new javax.swing.JPanel();
        jlbNhanVien = new icon.LabelGoogleIcon();
        jpnThucDon = new javax.swing.JPanel();
        jlbThucDon = new icon.LabelGoogleIcon();
        jpnDatTiec = new javax.swing.JPanel();
        jlbDatTiec = new icon.LabelGoogleIcon();
        jpnDoanhThu = new javax.swing.JPanel();
        jlbDoanhThu = new icon.LabelGoogleIcon();
        jpnKhachHang = new javax.swing.JPanel();
        jlbKhachHang = new icon.LabelGoogleIcon();
        jpnDangXuat = new javax.swing.JPanel();
        jlbDangXuat = new icon.LabelGoogleIcon();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 697, Short.MAX_VALUE)
        );

        jpnMenu.setBackground(new java.awt.Color(51, 51, 51));

        jPanel10.setBackground(new java.awt.Color(204, 51, 0));

        labelGoogleIcon1.setForeground(new java.awt.Color(255, 255, 255));
        labelGoogleIcon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGoogleIcon1.setText("QUẢN LÝ TIỆC LAN HUỆ");
        labelGoogleIcon1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelGoogleIcon1.setGoogleIcon(icon.GoogleMaterialDesignIcons.SUPERVISOR_ACCOUNT);
        labelGoogleIcon1.setIconColor(new java.awt.Color(255, 255, 255));
        labelGoogleIcon1.setIconSize(40.0F);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelGoogleIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(labelGoogleIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jpnNhanVien.setBackground(new java.awt.Color(76, 175, 80));

        jlbNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        jlbNhanVien.setText("NHÂN VIÊN");
        jlbNhanVien.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jlbNhanVien.setGoogleIcon(icon.GoogleMaterialDesignIcons.PERSON);
        jlbNhanVien.setIconColor(new java.awt.Color(255, 255, 255));
        jlbNhanVien.setIconSize(30.0F);

        javax.swing.GroupLayout jpnNhanVienLayout = new javax.swing.GroupLayout(jpnNhanVien);
        jpnNhanVien.setLayout(jpnNhanVienLayout);
        jpnNhanVienLayout.setHorizontalGroup(
            jpnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNhanVienLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlbNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnNhanVienLayout.setVerticalGroup(
            jpnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnNhanVienLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jlbNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jpnThucDon.setBackground(new java.awt.Color(76, 175, 80));

        jlbThucDon.setForeground(new java.awt.Color(255, 255, 255));
        jlbThucDon.setText("THỰC ĐƠN");
        jlbThucDon.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jlbThucDon.setGoogleIcon(icon.GoogleMaterialDesignIcons.IMPORT_CONTACTS);
        jlbThucDon.setIconColor(new java.awt.Color(255, 255, 255));
        jlbThucDon.setIconSize(30.0F);

        javax.swing.GroupLayout jpnThucDonLayout = new javax.swing.GroupLayout(jpnThucDon);
        jpnThucDon.setLayout(jpnThucDonLayout);
        jpnThucDonLayout.setHorizontalGroup(
            jpnThucDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThucDonLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlbThucDon, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnThucDonLayout.setVerticalGroup(
            jpnThucDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThucDonLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlbThucDon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jpnDatTiec.setBackground(new java.awt.Color(76, 175, 80));

        jlbDatTiec.setForeground(new java.awt.Color(255, 255, 255));
        jlbDatTiec.setText("ĐẶT TIỆC");
        jlbDatTiec.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jlbDatTiec.setGoogleIcon(icon.GoogleMaterialDesignIcons.SHOPPING_CART);
        jlbDatTiec.setIconColor(new java.awt.Color(255, 255, 255));
        jlbDatTiec.setIconSize(30.0F);

        javax.swing.GroupLayout jpnDatTiecLayout = new javax.swing.GroupLayout(jpnDatTiec);
        jpnDatTiec.setLayout(jpnDatTiecLayout);
        jpnDatTiecLayout.setHorizontalGroup(
            jpnDatTiecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDatTiecLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlbDatTiec, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnDatTiecLayout.setVerticalGroup(
            jpnDatTiecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDatTiecLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlbDatTiec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jpnDoanhThu.setBackground(new java.awt.Color(76, 175, 80));

        jlbDoanhThu.setForeground(new java.awt.Color(255, 255, 255));
        jlbDoanhThu.setText("DOANH THU");
        jlbDoanhThu.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jlbDoanhThu.setGoogleIcon(icon.GoogleMaterialDesignIcons.PAYMENT);
        jlbDoanhThu.setIconColor(new java.awt.Color(255, 255, 255));
        jlbDoanhThu.setIconSize(30.0F);

        javax.swing.GroupLayout jpnDoanhThuLayout = new javax.swing.GroupLayout(jpnDoanhThu);
        jpnDoanhThu.setLayout(jpnDoanhThuLayout);
        jpnDoanhThuLayout.setHorizontalGroup(
            jpnDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDoanhThuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlbDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnDoanhThuLayout.setVerticalGroup(
            jpnDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDoanhThuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlbDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jpnKhachHang.setBackground(new java.awt.Color(76, 175, 80));

        jlbKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        jlbKhachHang.setText("KHÁCH HÀNG");
        jlbKhachHang.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jlbKhachHang.setGoogleIcon(icon.GoogleMaterialDesignIcons.CONTACT_PHONE);
        jlbKhachHang.setIconColor(new java.awt.Color(255, 255, 255));
        jlbKhachHang.setIconSize(30.0F);

        javax.swing.GroupLayout jpnKhachHangLayout = new javax.swing.GroupLayout(jpnKhachHang);
        jpnKhachHang.setLayout(jpnKhachHangLayout);
        jpnKhachHangLayout.setHorizontalGroup(
            jpnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnKhachHangLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlbKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jpnKhachHangLayout.setVerticalGroup(
            jpnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnKhachHangLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlbKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jpnDangXuat.setBackground(new java.awt.Color(76, 175, 80));

        jlbDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        jlbDangXuat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbDangXuat.setText("ĐĂNG XUẤT");
        jlbDangXuat.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jlbDangXuat.setGoogleIcon(icon.GoogleMaterialDesignIcons.INPUT);
        jlbDangXuat.setIconColor(new java.awt.Color(255, 255, 255));
        jlbDangXuat.setIconSize(30.0F);

        javax.swing.GroupLayout jpnDangXuatLayout = new javax.swing.GroupLayout(jpnDangXuat);
        jpnDangXuat.setLayout(jpnDangXuatLayout);
        jpnDangXuatLayout.setHorizontalGroup(
            jpnDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDangXuatLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlbDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jpnDangXuatLayout.setVerticalGroup(
            jpnDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnDangXuatLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jlbDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jpnDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpnDatTiec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpnThucDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpnNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpnDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jpnKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnThucDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnDatTiec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel10;
    private icon.LabelGoogleIcon jlbDangXuat;
    private icon.LabelGoogleIcon jlbDatTiec;
    private icon.LabelGoogleIcon jlbDoanhThu;
    private icon.LabelGoogleIcon jlbKhachHang;
    private icon.LabelGoogleIcon jlbNhanVien;
    private icon.LabelGoogleIcon jlbThucDon;
    private javax.swing.JPanel jpnDangXuat;
    private javax.swing.JPanel jpnDatTiec;
    private javax.swing.JPanel jpnDoanhThu;
    private javax.swing.JPanel jpnKhachHang;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnNhanVien;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnThucDon;
    private javax.swing.JPanel jpnView;
    private icon.LabelGoogleIcon labelGoogleIcon1;
    // End of variables declaration//GEN-END:variables
}
