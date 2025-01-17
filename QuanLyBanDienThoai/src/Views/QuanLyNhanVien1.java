package Views;

import Controllers.NhanVienController;
import Models.NhanVien;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class QuanLyNhanVien1 extends javax.swing.JInternalFrame {

    DefaultTableModel tbl;
    List<NhanVien> listNV = new ArrayList<>();
    public String makh, tenkh, diachi, ngaysinh, macu, sdt;
    private boolean ktThem;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
Date date = new Date();
    
    public QuanLyNhanVien1() {
        initComponents();
        tbl = (DefaultTableModel) dgDanhSachNhanVien.getModel();
        KhoaMo(true);
        LayNguon();
        Design();
    }

    public void KhoaMo(boolean b) {
        btnThem.setEnabled(b);
        btnSua.setEnabled(b);
        btnXoa.setEnabled(b);
        btnKetThuc.setEnabled(b);
        btnGhi.setEnabled(!b);
        btnKhong.setEnabled(!b);
        txtMaNV.setEditable(!b);
        txtTenkh.setEditable(!b);
        txtSDT.setEditable(!b);
        txtTenkh.setEditable(!b);
        txtDiaChi.setEditable(!b);
        txtNgaySinh.setEnabled(!b);
        dgDanhSachNhanVien.setEnabled(b);
    }

    public void XoaTrang() {
        txtMaNV.setText("");
        txtTenkh.setText("");
        txtSDT.setText("");
        txtDiaChi.setText("");
//        try {
//            date=sdf.parse(ngaysinh);
//        } catch (ParseException ex) {
//            Logger.getLogger(QuanLyNhanVien1.class.getName()).log(Level.SEVERE, null, ex);
//        }
//            txtNgaySinh.setDate(date);
    }

    public void Design() {
        dgDanhSachNhanVien.setAutoResizeMode(dgDanhSachNhanVien.AUTO_RESIZE_OFF);
        dgDanhSachNhanVien.getColumnModel().getColumn(0).setPreferredWidth(150);
        dgDanhSachNhanVien.getColumnModel().getColumn(1).setPreferredWidth(150);
        dgDanhSachNhanVien.getColumnModel().getColumn(2).setPreferredWidth(150);
        dgDanhSachNhanVien.getColumnModel().getColumn(3).setPreferredWidth(150);
        dgDanhSachNhanVien.getColumnModel().getColumn(4).setPreferredWidth(130);
    }

    public void LayNguon() {
        listNV = NhanVienController.LayNguonNganh();
        tbl.setRowCount(0);//xóa trắng danh sách
        listNV.forEach(p -> {//mỗi vòng lặp add 1 dòng
            tbl.addRow(new Object[]{
                p.getMaNV(), p.getTenNV(), p.getNgaySinh(), p.getDiaChi(), p.getSDT()

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

        jScrollPane4 = new javax.swing.JScrollPane();
        dgDanhSachNhanVien = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLaMaNV = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        jLaTenKH = new javax.swing.JLabel();
        JLaDiaChi = new javax.swing.JLabel();
        jLaSDT = new javax.swing.JLabel();
        txtTenkh = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnKetThuc = new javax.swing.JButton();
        btnKhong = new javax.swing.JButton();
        btnGhi = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLNgaySinh = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        txtNgaySinh = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Quản Lý Nhân Viên ");

        dgDanhSachNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Khách Hàng", "Tên Nhân Viên", "Ngày Sinh", "Địa chỉ", "Số điện thoại"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dgDanhSachNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgDanhSachNhanVienMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(dgDanhSachNhanVien);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin chi tiết", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLaMaNV.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLaMaNV.setText("Mã Nhân Viên:");

        jLaTenKH.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLaTenKH.setText("Tên Nhân Viên:");

        JLaDiaChi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JLaDiaChi.setText("Địa chỉ:");

        jLaSDT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLaSDT.setText("Số điện thoại:");

        txtSDT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSDTKeyTyped(evt);
            }
        });

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8_add_30px.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8_support_30px.png"))); // NOI18N
        btnSua.setText("Sửa ");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8_cancel_30px_1.png"))); // NOI18N
        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8_exit_30px.png"))); // NOI18N
        btnKetThuc.setText("Kết thúc");
        btnKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetThucActionPerformed(evt);
            }
        });

        btnKhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8_back_30px.png"))); // NOI18N
        btnKhong.setText("Không");
        btnKhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhongActionPerformed(evt);
            }
        });

        btnGhi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8_pen_30px.png"))); // NOI18N
        btnGhi.setText("Ghi");
        btnGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiActionPerformed(evt);
            }
        });

        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/search_magnifyng_glass_search_locate_icon_124190.png"))); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8_refresh_30px.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLNgaySinh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLNgaySinh.setText("Ngày Sinh:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThem)
                            .addComponent(btnReset))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGhi, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnKhong)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTimKiem)
                            .addComponent(btnKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLaMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLaTenKH)
                            .addComponent(jLaSDT)
                            .addComponent(JLaDiaChi)
                            .addComponent(jLNgaySinh))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtMaNV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                            .addComponent(txtTenkh, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSDT, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDiaChi))))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLaMaNV)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLaTenKH)
                    .addComponent(txtTenkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLaDiaChi)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLaSDT)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLNgaySinh)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(btnGhi)
                    .addComponent(btnKhong)
                    .addComponent(btnKetThuc))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dgDanhSachNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgDanhSachNhanVienMouseClicked
        // TODO add your handling code here:
        int index = dgDanhSachNhanVien.getSelectedRow();
        TableModel model = dgDanhSachNhanVien.getModel();
        makh = model.getValueAt(index, 0).toString();
        tenkh = model.getValueAt(index, 1).toString();
        ngaysinh = model.getValueAt(index, 2).toString();
        //      System.out.println(model.getValueAt(index, 2).toString());
        diachi = model.getValueAt(index, 3).toString();
        //   System.out.println(model.getValueAt(index, 3).toString());
        sdt = model.getValueAt(index, 4).toString();
        //   System.out.println( model.getValueAt(index, 4).toString());

        txtMaNV.setText(makh);
        txtTenkh.setText(tenkh);
        txtSDT.setText("" + sdt);
        txtDiaChi.setText(diachi);
        try {
            date=sdf.parse(ngaysinh);
            txtNgaySinh.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(QuanLyNhanVien1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dgDanhSachNhanVienMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        XoaTrang();
        KhoaMo(false);
        ktThem = true;
        txtMaNV.requestFocus();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        if (txtMaNV.getText().length() <= 0) {
            return;
        }
        macu = txtMaNV.getText();
        KhoaMo(false);
        ktThem = false;
        txtMaNV.requestFocus();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        if (txtMaNV.getText().length() <= 0) {
            return;
        }
        int kq = JOptionPane.showConfirmDialog(this, "bạn có muốn xóa [" + txtMaNV.getText() + "] không ?",
                "thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (kq == JOptionPane.YES_OPTION) {
            macu = txtMaNV.getText();
            NhanVienController.XoaNganh(macu);
            XoaTrang();
            LayNguon();

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
        if (txtMaNV.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "bạn chưa nhập mã nhân viên", "thông báo", JOptionPane.WARNING_MESSAGE);
            txtMaNV.requestFocus();
            return;
        }

        //
        if (txtTenkh.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "bạn chưa nhập tên nhân viên", "thông báo", JOptionPane.WARNING_MESSAGE);
            txtTenkh.requestFocus();
            return;
        }

//        if (txtNgaySinh.getDate()) {
//            JOptionPane.showMessageDialog(this, "bạn chưa nhập ngày sinh"+"["+"Ngày sinh có định dạng năm - tháng - ngày"+"]" 
//       , "thông báo", JOptionPane.WARNING_MESSAGE);
//            txtNgaySinh.requestFocus();
//            return;
//        }

        if (txtSDT.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "bạn chưa nhập số điện thoại", "thông báo", JOptionPane.WARNING_MESSAGE);
            txtSDT.requestFocus();
            return;
        }

        if (txtDiaChi.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "bạn chưa nhập địa chỉ", "thông báo", JOptionPane.WARNING_MESSAGE);
            txtDiaChi.requestFocus();
            return;
        }
        //kieemr tra trung ma
        if (NhanVienController.KiemTraTrungMa(txtMaNV.getText(), ktThem, macu) == true) {
            JOptionPane.showMessageDialog(this, "bạn nhập trùng mã đã có", "thông báo", JOptionPane.ERROR_MESSAGE);
            txtMaNV.requestFocus();
            return;
        }

        //ghi
        makh = txtMaNV.getText();
        tenkh = txtTenkh.getText();
        sdt = txtSDT.getText();
        diachi = txtDiaChi.getText();
        ngaysinh = sdf.format(txtNgaySinh.getDate());
        //
        NhanVien d = new NhanVien(makh, tenkh, ngaysinh, diachi, sdt);
        if (ktThem == true) {
            NhanVienController.ThemNganh(d);
             JOptionPane.showMessageDialog(this, "Thêm thành công", "Thông báo", JOptionPane.NO_OPTION);
        } else {
            NhanVienController.CapNhatNganh(d, macu);
             JOptionPane.showMessageDialog(this, "Sửa thành công", "Thông báo", JOptionPane.NO_OPTION);
        }
        // TODO add your handling code here:
        LayNguon();
        KhoaMo(true);
    }//GEN-LAST:event_btnGhiActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        String tentk = JOptionPane.showInputDialog(this, "Nhập tên nhân viên cần tìm");
        if (tentk != null && tentk.length() > 0) {
            listNV = NhanVienController.TimKiemNhanVien(tentk,tentk);
            tbl.setRowCount(0);
            listNV.forEach(p -> {
                tbl.addRow(new Object[]{
                    p.getMaNV(), p.getTenNV(), p.getNgaySinh(), p.getDiaChi(), p.getSDT()});
            });
        } else {
            LayNguon();
            XoaTrang();
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        XoaTrang();
  LayNguon();

    }//GEN-LAST:event_btnResetActionPerformed

    private void txtSDTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSDTKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLaDiaChi;
    private javax.swing.JButton btnGhi;
    private javax.swing.JButton btnKetThuc;
    private javax.swing.JButton btnKhong;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JTable dgDanhSachNhanVien;
    private javax.swing.JLabel jLNgaySinh;
    private javax.swing.JLabel jLaMaNV;
    private javax.swing.JLabel jLaSDT;
    private javax.swing.JLabel jLaTenKH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMaNV;
    private com.toedter.calendar.JDateChooser txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenkh;
    // End of variables declaration//GEN-END:variables
}
