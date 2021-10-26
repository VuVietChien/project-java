/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.KiemTraDLController;
import Controllers.QuyenController;
import Models.Quyen;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author thuan
 */
public class mdiPhanQuyen extends javax.swing.JInternalFrame {

    DefaultTableModel tblDanhSachQuyen;
    List<Quyen> listQuyen = new ArrayList<>();
    public String maquyen, tenquyen, chitietquyen, macu;
    private boolean ktThem;

    public mdiPhanQuyen() {
        initComponents();
        tblDanhSachQuyen = (DefaultTableModel) dgDanhSach.getModel();
        KhoaMo(true);
        Select();
    }

    public void KhoaMo(boolean b) {
        btnThem.setEnabled(b);
        btnSua.setEnabled(b);
        btnXoa.setEnabled(b);
        btnKetThuc.setEnabled(b);
        btnGhi.setEnabled(!b);
        btnKhong.setEnabled(!b);
        txtMaQuyen.setEditable(!b);
        txtChiTietQuyen.setEditable(!b);
        txtTenQuyen.setEditable(!b);
        dgDanhSach.setEnabled(b);
    }

    public void XoaTrang() {
        txtChiTietQuyen.setText("");
        txtTenQuyen.setText("");
        txtMaQuyen.setText("");
    }

    public void Select() {
        listQuyen = QuyenController.Select();
        tblDanhSachQuyen.setRowCount(0);
        listQuyen.forEach(p -> {
            tblDanhSachQuyen.addRow(new Object[]{
                p.getMaQuyen(), p.getTenQuyen(), p.getChiTietQuyen()
            });
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

        jScrollPane1 = new javax.swing.JScrollPane();
        dgDanhSach = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMaQuyen = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnKetThuc = new javax.swing.JButton();
        btnKhong = new javax.swing.JButton();
        btnGhi = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        txtTenQuyen = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtChiTietQuyen = new javax.swing.JTextField();

        setClosable(true);

        dgDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã Quyền", "Tên Quyền", "Chi Tiết Quyền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dgDanhSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgDanhSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dgDanhSach);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin chi tiêt", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Mã Quyền:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Tên Quyền:");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa ");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnKetThuc.setText("Kết thúc");
        btnKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetThucActionPerformed(evt);
            }
        });

        btnKhong.setText("Không");
        btnKhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhongActionPerformed(evt);
            }
        });

        btnGhi.setText("Ghi");
        btnGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiActionPerformed(evt);
            }
        });

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Chi Tiết Quyền:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTimKiem)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset)
                        .addGap(18, 18, 18)
                        .addComponent(btnGhi, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnKhong)
                        .addGap(18, 18, 18)
                        .addComponent(btnKetThuc))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtChiTietQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTenQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtChiTietQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnKetThuc)
                    .addComponent(btnKhong)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnTimKiem)
                    .addComponent(btnGhi)
                    .addComponent(btnReset))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dgDanhSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgDanhSachMouseClicked
        // TODO add your handling code here:
        int index = dgDanhSach.getSelectedRow();
        TableModel model = dgDanhSach.getModel();
        maquyen = model.getValueAt(index, 0).toString();
        tenquyen = model.getValueAt(index, 1).toString();
        chitietquyen = model.getValueAt(index, 2).toString();

        txtMaQuyen.setText(maquyen);
        txtTenQuyen.setText(tenquyen);
        txtChiTietQuyen.setText(chitietquyen);
    }//GEN-LAST:event_dgDanhSachMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        XoaTrang();
        KhoaMo(false);
        ktThem = true;
        txtMaQuyen.requestFocus();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        if (txtMaQuyen.getText().length() <= 0) {
            return;
        }
        macu = txtMaQuyen.getText();
        KhoaMo(false);
        ktThem = false;
        txtMaQuyen.requestFocus();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        if (txtMaQuyen.getText().length() <= 0) {
            return;
        }
        macu = txtMaQuyen.getText();
        int kq = JOptionPane.showConfirmDialog(this, "Bạn có muốn xoá mã quyền [" + txtMaQuyen.getText() + "] không?", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (kq == JOptionPane.YES_OPTION) {
            QuyenController.Delete(macu);
            XoaTrang();
            Select();
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetThucActionPerformed
        // TODO add your handling code here:
        int kq = JOptionPane.showConfirmDialog(this, "Bạn có muốn kết thúc không?", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (kq == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_btnKetThucActionPerformed

    private void btnKhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhongActionPerformed
        // TODO add your handling code here:
        XoaTrang();
        KhoaMo(true);
    }//GEN-LAST:event_btnKhongActionPerformed

    private void btnGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiActionPerformed
        // TODO add your handling code here:
        QuyenController tkc = new QuyenController();
        maquyen = txtMaQuyen.getText();
        tenquyen = txtTenQuyen.getText();
        chitietquyen = txtChiTietQuyen.getText();

        if (maquyen.length() <= 0 || tenquyen.length() <= 0 || chitietquyen.length() <= 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập đầy đủ thông tin", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (KiemTraDLController.KiemTraTrungMa("MaQuyen", "phanquyen", maquyen, ktThem, macu) == true) {
            JOptionPane.showMessageDialog(this, "Bạn nhập trùng mã quyền", "Thông báo", JOptionPane.WARNING_MESSAGE);
            txtMaQuyen.requestFocus();
            return;
        }

        Quyen tk = new Quyen(maquyen, tenquyen, chitietquyen);
        if (ktThem == true) {

            tkc.Insert(tk);
            JOptionPane.showMessageDialog(this, "Thêm thành công", "Thông báo", JOptionPane.NO_OPTION);

        } else {
            tkc.Update(tk, macu);
            JOptionPane.showMessageDialog(this, "Update thành công", "Thông báo", JOptionPane.NO_OPTION);

        }
        Select();
        KhoaMo(true);
    }//GEN-LAST:event_btnGhiActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        String tenquyen = JOptionPane.showInputDialog(this, "Nhập tên ngành cần tìm");
        if (tenquyen != null && tenquyen.length() > 0) {
            listQuyen = QuyenController.TimKiemTheoTenQuyen(tenquyen);
            tblDanhSachQuyen.setRowCount(0);
            listQuyen.forEach(p -> {
                tblDanhSachQuyen.addRow(new Object[]{
                    p.getMaQuyen(), p.getTenQuyen(), p.getChiTietQuyen()
                });
            });
        } else {
            Select();
            XoaTrang();
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        Select();
    }//GEN-LAST:event_btnResetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGhi;
    private javax.swing.JButton btnKetThuc;
    private javax.swing.JButton btnKhong;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JTable dgDanhSach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtChiTietQuyen;
    private javax.swing.JTextField txtMaQuyen;
    private javax.swing.JTextField txtTenQuyen;
    // End of variables declaration//GEN-END:variables
}