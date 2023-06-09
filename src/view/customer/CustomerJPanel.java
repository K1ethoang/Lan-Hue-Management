package view.customer;

import dao.Customer.CustomerDAOImpl;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.CustomerModel;
import table.TableCustomer;
import view.component.scroll.ScrollBarCus;

public class CustomerJPanel extends javax.swing.JPanel {

    List<CustomerModel> listCustomer = null;
    CustomerModel customerCurrent = new CustomerModel();
    private TableRowSorter<TableModel> rowSorter ;

    public CustomerJPanel() {
        List<CustomerModel> listCustomer = CustomerDAOImpl.getInstance().getList();
        initComponents();
        // set vertical and horizontal scroll bar
        ScrollPaneTable.setVerticalScrollBar(new ScrollBarCus());
        ScrollBarCus sb = new ScrollBarCus();
        sb.setOrientation(JScrollBar.HORIZONTAL);
        ScrollPaneTable.setHorizontalScrollBar(sb);
        tableCustomer.fixTable(ScrollPaneTable);

        clearTable();
        setCustomerTable();
    }
    
    public void searchAndFilterGender(){
        String text = searchField.getText();
        if (text.trim().length() == 0) {
            if(rdoAll.isSelected()){
                rowSorter.setRowFilter(null);
            }
            else if(rdoFemale.isSelected()){
                rowSorter.setRowFilter(RowFilter.regexFilter("Nữ", 3));
            }
            else if(rdoMale.isSelected()){
                rowSorter.setRowFilter(RowFilter.regexFilter("Nam", 3));
            }
        } else {
            if (rdoAll.isSelected()) { 
                rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
            } else if(rdoMale.isSelected()){ 
                List<RowFilter<Object, Object>> filters = new ArrayList<>();
                filters.add(RowFilter.regexFilter("(?i)" + text));
                filters.add(RowFilter.regexFilter("Nam", 3));
                rowSorter.setRowFilter(RowFilter.andFilter(filters));
            } else if(rdoFemale.isSelected()){
                List<RowFilter<Object, Object>> filters = new ArrayList<>();
                filters.add(RowFilter.regexFilter("(?i)" + text));
                filters.add(RowFilter.regexFilter("Nữ", 3));
                rowSorter.setRowFilter(RowFilter.andFilter(filters));
            }
            
        }
    }
//    
    
    public void setCustomerTable() {
        listCustomer = CustomerDAOImpl.getInstance().getList();
        TableCustomer tb = new TableCustomer();
        tb.setCustomerDetailsToTable(listCustomer, tableCustomer);

        rowSorter = new TableRowSorter<>(tableCustomer.getModel());
        tableCustomer.setRowSorter(rowSorter);

        searchField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                searchAndFilterGender();
                setSumCustomer();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                searchAndFilterGender();
                setSumCustomer();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });
        setSumCustomer();
    }

    private void setSumCustomer() {
        sumCustomer.setText("Số lượng: " + tableCustomer.getRowCount() + "");
    }

    private void setCustomerCurrent() {
        int viewRowIndex = tableCustomer.getSelectedRow();
        int row = tableCustomer.getRowSorter().convertRowIndexToModel(viewRowIndex);
//        int row = tableCustomer.getSelectedRow();
        customerCurrent = listCustomer.get(row);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu = new javax.swing.JPopupMenu();
        seeBtn = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        editBtn = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        removeBtn = new javax.swing.JMenuItem();
        sexGroup = new javax.swing.ButtonGroup();
        top = new javax.swing.JPanel();
        searchAndButton = new javax.swing.JPanel();
        searchPanel = new javax.swing.JPanel();
        searchField = new rojerusan.RSMetroTextPlaceHolder();
        button = new javax.swing.JPanel();
        addBtn = new rojeru_san.complementos.RSButtonHover();
        sumCustomer = new javax.swing.JLabel();
        filter = new javax.swing.JPanel();
        sex = new javax.swing.JPanel();
        labelGoogleIcon2 = new view.component.LabelGoogleIcon();
        rdoAll = new javax.swing.JRadioButton();
        rdoMale = new javax.swing.JRadioButton();
        rdoFemale = new javax.swing.JRadioButton();
        center = new javax.swing.JPanel();
        ScrollPaneTable = new javax.swing.JScrollPane();
        tableCustomer = new view.component.table.Table();

        seeBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        seeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/image/Search.png"))); // NOI18N
        seeBtn.setText("Xem");
        seeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeBtnActionPerformed(evt);
            }
        });
        popupMenu.add(seeBtn);
        popupMenu.add(jSeparator2);

        editBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        editBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/image/Edit.png"))); // NOI18N
        editBtn.setText("Chỉnh sửa");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });
        popupMenu.add(editBtn);
        popupMenu.add(jSeparator3);

        removeBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        removeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/image/Delete.png"))); // NOI18N
        removeBtn.setText("Xóa");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });
        popupMenu.add(removeBtn);

        setBackground(new java.awt.Color(249, 245, 231));
        setMinimumSize(new java.awt.Dimension(1017, 576));
        setPreferredSize(new java.awt.Dimension(1017, 576));
        setLayout(new java.awt.BorderLayout());

        top.setBackground(getBackground());
        top.setLayout(new javax.swing.BoxLayout(top, javax.swing.BoxLayout.Y_AXIS));

        searchAndButton.setBackground(getBackground());
        searchAndButton.setLayout(new javax.swing.BoxLayout(searchAndButton, javax.swing.BoxLayout.LINE_AXIS));

        searchPanel.setBackground(getBackground());

        searchField.setForeground(new java.awt.Color(0, 0, 0));
        searchField.setBorderColor(new java.awt.Color(10, 77, 104));
        searchField.setBotonColor(new java.awt.Color(0, 0, 0));
        searchField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchField.setPhColor(new java.awt.Color(10, 77, 104));
        searchField.setPlaceholder("Tìm kiếm");
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        searchAndButton.add(searchPanel);

        button.setBackground(getBackground());

        addBtn.setBackground(new java.awt.Color(148, 175, 159));
        addBtn.setText("Thêm khách hàng");
        addBtn.setColorHover(new java.awt.Color(187, 214, 184));
        addBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addBtn.setPreferredSize(new java.awt.Dimension(150, 40));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        button.add(addBtn);

        sumCustomer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sumCustomer.setText("Số lượng: 0");
        button.add(sumCustomer);

        searchAndButton.add(button);

        top.add(searchAndButton);

        filter.setBackground(getBackground());
        filter.setLayout(new javax.swing.BoxLayout(filter, javax.swing.BoxLayout.Y_AXIS));

        sex.setBackground(getBackground());

        labelGoogleIcon2.setText("Giới tính:");
        labelGoogleIcon2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sex.add(labelGoogleIcon2);

        sexGroup.add(rdoAll);
        rdoAll.setSelected(true);
        rdoAll.setText("Tất cả");
        rdoAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoAllActionPerformed(evt);
            }
        });
        sex.add(rdoAll);

        sexGroup.add(rdoMale);
        rdoMale.setText("Nam");
        rdoMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoMaleActionPerformed(evt);
            }
        });
        sex.add(rdoMale);

        sexGroup.add(rdoFemale);
        rdoFemale.setText("Nữ");
        rdoFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoFemaleActionPerformed(evt);
            }
        });
        sex.add(rdoFemale);

        filter.add(sex);

        top.add(filter);

        add(top, java.awt.BorderLayout.NORTH);

        center.setBackground(getBackground());

        tableCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên KH", "SĐT", "Giới tính", "Số CCCD", "Địa chỉ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCustomer.setComponentPopupMenu(popupMenu);
        tableCustomer.setShowGrid(true);
        tableCustomer.getTableHeader().setReorderingAllowed(false);
        ScrollPaneTable.setViewportView(tableCustomer);

        javax.swing.GroupLayout centerLayout = new javax.swing.GroupLayout(center);
        center.setLayout(centerLayout);
        centerLayout.setHorizontalGroup(
            centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPaneTable, javax.swing.GroupLayout.DEFAULT_SIZE, 1005, Short.MAX_VALUE)
                .addContainerGap())
        );
        centerLayout.setVerticalGroup(
            centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPaneTable, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(center, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        AddCustomerView addCustomer = new AddCustomerView();
        addCustomer.setVisible(true);
//        refresh();
    }//GEN-LAST:event_addBtnActionPerformed

    private void seeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeBtnActionPerformed
        try {
            setCustomerCurrent();

            AddCustomerView.isEditCustomer = false;

            AddCustomerView addCustomer = new AddCustomerView(customerCurrent);
            addCustomer.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Khách hàng không hợp lệ", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_seeBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        try {
            setCustomerCurrent();

            AddCustomerView.isEditCustomer = true;

            AddCustomerView addCustomer = new AddCustomerView(customerCurrent);
            addCustomer.setVisible(true);
//            clearTable();
//            setCustomerTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Khách hàng không hợp lệ", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editBtnActionPerformed

    public void clearTable() {
        DefaultTableModel model = (DefaultTableModel) tableCustomer.getModel();
        model.setRowCount(0);
    }


    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        try {
            setCustomerCurrent();
            int a = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa hay không?", "Lựa chọn", JOptionPane.YES_NO_OPTION);
            if (a == 0) {
                if (CustomerDAOImpl.getInstance().delete(customerCurrent.getID())) {
                    clearTable();
                    rdoAll.setSelected(true);
                    setCustomerTable();

                    JOptionPane.showMessageDialog(this, "Xóa thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(this, "Xóa không thành công!", "Thông báo", JOptionPane.ERROR_MESSAGE);
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Khách hàng không hợp lệ", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_removeBtnActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void rdoAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoAllActionPerformed
        searchAndFilterGender();
        setSumCustomer();
    }//GEN-LAST:event_rdoAllActionPerformed

    private void rdoMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoMaleActionPerformed
        searchAndFilterGender();
        setSumCustomer();
    }//GEN-LAST:event_rdoMaleActionPerformed

    private void rdoFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoFemaleActionPerformed
        searchAndFilterGender();
        setSumCustomer();
    }//GEN-LAST:event_rdoFemaleActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPaneTable;
    private rojeru_san.complementos.RSButtonHover addBtn;
    private javax.swing.JPanel button;
    private javax.swing.JPanel center;
    private javax.swing.JMenuItem editBtn;
    private javax.swing.JPanel filter;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private view.component.LabelGoogleIcon labelGoogleIcon2;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JRadioButton rdoAll;
    private javax.swing.JRadioButton rdoFemale;
    private javax.swing.JRadioButton rdoMale;
    private javax.swing.JMenuItem removeBtn;
    private javax.swing.JPanel searchAndButton;
    private rojerusan.RSMetroTextPlaceHolder searchField;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JMenuItem seeBtn;
    private javax.swing.JPanel sex;
    private javax.swing.ButtonGroup sexGroup;
    private javax.swing.JLabel sumCustomer;
    private view.component.table.Table tableCustomer;
    private javax.swing.JPanel top;
    // End of variables declaration//GEN-END:variables

    private String updateCustomer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
