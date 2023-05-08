package view.dish;

import dao.Dish.DishDAOImpl;
import dao.TypeDish.TypeDishDAOImpl;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import javax.swing.text.NumberFormatter;
import model.DishModel;
import model.TypeDishModel;

/**
 *
 * @author kieth
 */
public class AddDishView extends javax.swing.JFrame {

    List<TypeDishModel> gListTypeDish = TypeDishDAOImpl.getInstance().getList();
    DishModel gCurrentDish = null;
    DishDAOImpl dishDAOImpl = new DishDAOImpl();

    public AddDishView() {
        initComponents();

        initTextFieldPrice(false);

        // set data
        setTextFieldID();
        setComboBoxTypeDish();
    }

    public AddDishView(DishModel _dishModel, boolean isSee) {
        initComponents();

        initTextFieldPrice(isSee);
        setComboBoxTypeDish();
        // set data
        setDataSeeDish(_dishModel, isSee);

        // set button
        if (isSee == false) {
            saveBtn.setVisible(false);
        }
    }

    private void initTextFieldPrice(boolean isSee) {
        Locale vn = new Locale("vi", "VN");
        NumberFormat dongFormat = NumberFormat.getNumberInstance(vn);

        FTF_price.setFormatterFactory(new DefaultFormatterFactory(
                new NumberFormatter(dongFormat)));
        if (isSee == false) {
            FTF_price.setValue(50000);
        }

    }

    private void setTextFieldID() {
        TF_dishID.setText(DishDAOImpl.getInstance().getNextID() + "");
    }

    private void setDataSeeDish(DishModel dish, boolean isSee) {
        this.setTitle("Xem món ăn");
        TF_dishID.setText(dish.getDishID() + "");
        TF_nameDish.setText(dish.getDishName());
        CB_typeDish.setSelectedItem(dish.getTypeDish().getTypeName());
        setFieldEnable(isSee);
    }

    private void setComboBoxTypeDish() {
        // gListTypeDish = TypeDishDAOImpl.getInstance().getList();
        CB_typeDish.removeAllItems();
        for (int i = 0; i < gListTypeDish.size(); i++) {
            CB_typeDish.addItem(gListTypeDish.get(i).getTypeName());
        }
    }

    private void setFieldEnable(boolean bool) {
        TF_dishID.setEditable(false);
        TF_nameDish.setEditable(bool);
        CB_typeDish.setEditable(bool);
        FTF_price.setEditable(bool);
    }

    public boolean insertDish() {
        DishModel dish = new DishModel();
        dish.setDishID(Integer.parseInt(TF_dishID.getText()));
        dish.setDishName(TF_nameDish.getText());

        dish.setPrice(Double.parseDouble(FTF_price.getText()));

        for (int i = 0; i < gListTypeDish.size(); i++) {
            if (CB_typeDish.getSelectedIndex() == i) {
                dish.setTypeDish(gListTypeDish.get(i));
                break;
            }
        }
        return dishDAOImpl.insert(dish);
    }

    public boolean updateDish() {
        DishModel dish = new DishModel();
        dish.setDishID(Integer.parseInt(TF_dishID.getText()));
        dish.setDishName(TF_nameDish.getText());
        dish.setPrice(Double.parseDouble(FTF_price.getText()));
        for (int i = 0; i < gListTypeDish.size(); i++) {
            if (CB_typeDish.getSelectedIndex() == i) {
                dish.setTypeDish(gListTypeDish.get(i));
                break;
            }
        }
        System.out.println("name TypeDish: " + dish.getTypeDish().getTypeName());
        System.out.println("ID TypeDish: " + dish.getTypeDish().getTypeDishID());
        System.out.println("DISH: " + dish);
        return dishDAOImpl.update(dish);
    }

    public boolean deleteDish() {
        int dishID = Integer.parseInt(TF_dishID.getText());
        return dishDAOImpl.delete(dishID);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        panelCustomer = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        TF_dishID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TF_nameDish = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        FTF_price = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        CB_typeDish = new javax.swing.JComboBox<>();
        bottom = new javax.swing.JPanel();
        saveBtn = new rojeru_san.complementos.RSButtonHover();
        cancelBtn = new rojeru_san.complementos.RSButtonHover();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thêm món ăn");
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.Y_AXIS));

        panelCustomer.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 0, 10, 0));
        panelCustomer.setLayout(new java.awt.GridLayout(4, 2, 0, 10));

        jLabel6.setText("ID (*)");
        panelCustomer.add(jLabel6);

        TF_dishID.setEditable(false);
        TF_dishID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_dishIDActionPerformed(evt);
            }
        });
        panelCustomer.add(TF_dishID);

        jLabel5.setText("Tên món ăn (*)");
        panelCustomer.add(jLabel5);
        panelCustomer.add(TF_nameDish);

        jLabel7.setText("Giá (Đồng) (*)");
        panelCustomer.add(jLabel7);

        FTF_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FTF_priceActionPerformed(evt);
            }
        });
        panelCustomer.add(FTF_price);

        jLabel8.setText("Loại món ăn (*)");
        panelCustomer.add(jLabel8);

        panelCustomer.add(CB_typeDish);

        jPanel2.add(panelCustomer);

        bottom.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5));

        saveBtn.setBackground(new java.awt.Color(10, 77, 104));
        saveBtn.setText("Lưu");
        saveBtn.setColorHover(new java.awt.Color(14, 112, 152));
        saveBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saveBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        saveBtn.setPreferredSize(new java.awt.Dimension(110, 40));
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        bottom.add(saveBtn);

        cancelBtn.setBackground(new java.awt.Color(10, 77, 104));
        cancelBtn.setText("Hủy");
        cancelBtn.setColorHover(new java.awt.Color(14, 112, 152));
        cancelBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cancelBtn.setPreferredSize(new java.awt.Dimension(110, 40));
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        bottom.add(cancelBtn);

        jPanel2.add(bottom);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 548,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TF_dishIDActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_TF_dishIDActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_TF_dishIDActionPerformed

    private void FTF_priceActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_FTF_priceActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_FTF_priceActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_savePartyBtnActionPerformed
        System.out.println("updateDish: " + updateDish());
        if (insertDish() == true || updateDish() == true) {
            JOptionPane.showMessageDialog(this, "Lưu thành công !");
            dispose();
            DishJPanel dishJpn = new DishJPanel();

            dishJpn.clearTable();
            dishJpn.setDishTable();
        } else {
            JOptionPane.showMessageDialog(this, "Bạn vui lòng nhập đầy đủ dữ liệu !");
        }
    }// GEN-LAST:event_savePartyBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();
    }// GEN-LAST:event_cancelBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddDishView.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDishView.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDishView.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDishView.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDishView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_typeDish;
    private javax.swing.JFormattedTextField FTF_price;
    private javax.swing.JTextField TF_dishID;
    private javax.swing.JTextField TF_nameDish;
    private javax.swing.JPanel bottom;
    private rojeru_san.complementos.RSButtonHover cancelBtn;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelCustomer;
    private rojeru_san.complementos.RSButtonHover saveBtn;
    // End of variables declaration//GEN-END:variables
}