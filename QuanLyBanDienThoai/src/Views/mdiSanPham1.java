    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Views;

import Controllers.KiemTraDLController;
import Controllers.LoaiSanPhamController;
import Controllers.SanPhamController;
import Models.LoaiSanPham;
import Models.SanPham1;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author thuan
 */
public class mdiSanPham1 extends javax.swing.JInternalFrame {

   public DefaultTableModel tblDanhSachSanPham;
    public List<SanPham1> listSanPham = new ArrayList<>();
    public List<LoaiSanPham> listLoaiSanPham = new ArrayList<>();
    public String masp, malsp, tensp, hinhanh, macu;
//    public String duongdananh = "D:\\ProjectJavaNetbean12\\ProjectJava\\ProjectJava\\QuanLyBanDienThoai\\src\\giaodienchuan\\images\\Product Images\\";
    public float dongia;
    public int soluong;
    private boolean ktThem;

        public mdiSanPham1() {
        initComponents();
        tblDanhSachSanPham = (DefaultTableModel) dgDanhSach.getModel();
        KhoaMo(true);
        Select();
        LayNguonCBO();
    }

    public void KhoaMo(boolean b) {
        btnThem.setEnabled(b);
        btnSua.setEnabled(b);
        btnXoa.setEnabled(b);
        btnKetThuc.setEnabled(b);
        btnGhi.setEnabled(!b);
        btnKhong.setEnabled(!b);
        txtDonGia.setEditable(!b);
        txtTenSP.setEditable(!b);
        txtSoLuong.setEditable(!b);
        txtTenAnh.setEditable(b);
        cbLSP.setEnabled(!b);
        txtMaSP.setEditable(!b);
        dgDanhSach.setEnabled(b);
        btnFolderAnh.setEnabled(!b);
    }

    public void XoaTrang() {
        txtTenSP.setText("");
        txtMaSP.setText("");
        txtDonGia.setText("");
        txtSoLuong.setText("");
        txtTenAnh.setText("");
        lbImageSanPham.setIcon(null);
    }

    public void Select() {
        listSanPham = SanPhamController.Select();
        tblDanhSachSanPham.setRowCount(0);
        listSanPham.forEach(p -> {
            tblDanhSachSanPham.addRow(new Object[]{
                p.getMaSP(), p.getTenLSP(), p.getTenSP(), p.getHinhAnh(), p.getDonGia(), p.getSoLuong()
            });
        });
    }

    public ImageIcon ResizeImage(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(lbImageSanPham.getWidth(), lbImageSanPham.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    public void LayNguonCBO() {
        listLoaiSanPham = LoaiSanPhamController.Select();
        for (int i = 0; i < listLoaiSanPham.size(); i++) {
            cbLSP.addItem(listLoaiSanPham.get(i).getTenLSP());
        }
    }

    public int vtLSP(String malsp) {
        for (int i = 0; i < listLoaiSanPham.size(); i++) {
            if (listLoaiSanPham.get(i).getTenLSP().equals(malsp)) {
                return i;
            }
        }
        return 0;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnKetThuc = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgDanhSach = new javax.swing.JTable();
        btnFolderAnh = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cbLSP = new javax.swing.JComboBox<>();
        btnReset = new javax.swing.JButton();
        lbImageSanPham = new javax.swing.JLabel();
        btnKhong = new javax.swing.JButton();
        txtTenSP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        btnGhi = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        txtSoLuong = new javax.swing.JTextField();
        txtMaSP = new javax.swing.JTextField();
        btnSua = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtTenAnh = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnXoa = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setClosable(true);

        btnKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8_exit_30px.png"))); // NOI18N
        btnKetThuc.setText("Kết thúc");
        btnKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetThucActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Loại sản phẩm:");

        dgDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã Sản phẩm", "Loại sản phẩm", "Tên", "Hình ảnh", "Đơn giá", "Số lượng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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

        btnFolderAnh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8_opened_folder_20px.png"))); // NOI18N
        btnFolderAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFolderAnhActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Tên file ảnh:");

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8_reset_30px.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnKhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8_back_30px.png"))); // NOI18N
        btnKhong.setText("Không");
        btnKhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhongActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Mã sản phẩm:");

        txtDonGia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDonGiaKeyTyped(evt);
            }
        });

        btnGhi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8_pen_30px.png"))); // NOI18N
        btnGhi.setText("Ghi");
        btnGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiActionPerformed(evt);
            }
        });

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8_add_30px.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnTimKiem.setIcon(new javax.swing.ImageIcon("D:\\ProjectJavaNetbeans\\ProjectJava\\QuanLyBanDienThoai\\src\\giaodienchuan\\images\\search_30px.png")); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        txtSoLuong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSoLuongKeyTyped(evt);
            }
        });

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8_support_30px.png"))); // NOI18N
        btnSua.setText("Sửa ");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Đơn giá(triệu):");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Tên sản phẩm:");

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8_cancel_30px_1.png"))); // NOI18N
        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Số lượng:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTenAnh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnFolderAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbLSP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTenSP)
                            .addComponent(txtDonGia)
                            .addComponent(txtSoLuong)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbImageSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKhong))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGhi, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbLSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFolderAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addComponent(lbImageSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKhong, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGhi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetThucActionPerformed
        // TODO add your handling code here:
        int kq = JOptionPane.showConfirmDialog(this, "Bạn có muốn kết thúc không?", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (kq == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_btnKetThucActionPerformed

    private void dgDanhSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgDanhSachMouseClicked
        // TODO add your handling code here:
        int index = dgDanhSach.getSelectedRow();
        TableModel model = dgDanhSach.getModel();
        masp = model.getValueAt(index, 0).toString();
        malsp = model.getValueAt(index, 1).toString();
        tensp = model.getValueAt(index, 2).toString();
        hinhanh = model.getValueAt(index, 3).toString();
        dongia = Float.parseFloat(model.getValueAt(index, 4).toString());
        soluong = Integer.parseInt(model.getValueAt(index, 5).toString());

        txtDonGia.setText(String.valueOf((dongia)));
        txtSoLuong.setText(String.valueOf(soluong));
        txtTenAnh.setText(hinhanh);
        txtTenSP.setText(tensp);
        txtMaSP.setText(masp);
        cbLSP.setSelectedIndex(vtLSP(malsp));
        lbImageSanPham.setIcon(ResizeImage(String.valueOf(hinhanh)));
    }//GEN-LAST:event_dgDanhSachMouseClicked

    private void btnFolderAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFolderAnhActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser f = new JFileChooser("D:\\ProjectJavaNetbean12\\ProjectJava\\ProjectJava\\ProjectJava\\QuanLyBanDienThoai\\src\\giaodienchuan\\images\\Product Images");
            f.setDialogTitle("Mở file");
            f.showOpenDialog(null);
            File ftenanh = f.getSelectedFile();
            hinhanh = ftenanh.getAbsolutePath();
            txtTenAnh.setText(hinhanh);
            if (hinhanh != null) {
                lbImageSanPham.setIcon(ResizeImage(String.valueOf(hinhanh)));
            } else {
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn ảnh");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnFolderAnhActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        Select();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnKhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhongActionPerformed
        // TODO add your handling code here:
        XoaTrang();
        KhoaMo(true);
    }//GEN-LAST:event_btnKhongActionPerformed

    private void txtDonGiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDonGiaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetter(c) && !evt.isAltDown()) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDonGiaKeyTyped

    private void btnGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiActionPerformed
        // TODO add your handling code here:
        SanPhamController tkc = new SanPhamController();
        malsp = listLoaiSanPham.get(cbLSP.getSelectedIndex()).getMaLSP();
        masp = txtMaSP.getText();
        tensp = txtTenSP.getText();
        hinhanh = txtTenAnh.getText();
        if (txtSoLuong.getText().equals("") && txtDonGia.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập đầy đủ thông tin");
            return;
        } else {
            soluong = Integer.parseInt(txtSoLuong.getText());
            dongia = Float.parseFloat(txtDonGia.getText());

        }
        if (malsp.length() <= 0 || masp.length() <= 0 || tensp.length() <= 0 || hinhanh.length() <= 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập đầy đủ thông tin", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (KiemTraDLController.KiemTraTrungMa("MaSP", "sanpham", masp, ktThem, macu) == true) {
            JOptionPane.showMessageDialog(this, "Bạn nhập trùng mã sản phẩm", "Thông báo", JOptionPane.WARNING_MESSAGE);
            txtMaSP.requestFocus();
            return;
        }

        SanPham1 tk = new SanPham1(masp, malsp, tensp, hinhanh, dongia, soluong);
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

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        XoaTrang();
        KhoaMo(false);
        ktThem = true;
        txtMaSP.requestFocus();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        String tensp = JOptionPane.showInputDialog(this, "Nhập tên sản phẩm cần tìm");
        if (tensp != null && tensp.length() > 0) {
            listSanPham = SanPhamController.TimKiemTheoTenSanPham(tensp);
            tblDanhSachSanPham.setRowCount(0);
            listSanPham.forEach(p -> {
                tblDanhSachSanPham.addRow(new Object[]{
                    p.getMaSP(), p.getTenLSP(), p.getTenSP(), p.getHinhAnh(), p.getDonGia(), p.getSoLuong()
                });
            });
        } else {
            Select();
            XoaTrang();
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void txtSoLuongKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSoLuongKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtSoLuongKeyTyped

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        if (txtMaSP.getText().length() <= 0) {
            return;
        }
        macu = txtMaSP.getText();
        KhoaMo(false);
        ktThem = false;
        txtTenAnh.setEditable(false);
        txtMaSP.requestFocus();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        if (txtMaSP.getText().length() <= 0) {
            return;
        }
        macu = txtMaSP.getText();
        int kq = JOptionPane.showConfirmDialog(this, "Bạn có muốn xoá mã sản phẩm [" + txtMaSP.getText() + "] không?", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (kq == JOptionPane.YES_OPTION) {
            SanPhamController.Delete(macu);
            XoaTrang();
            Select();
        }
    }//GEN-LAST:event_btnXoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFolderAnh;
    private javax.swing.JButton btnGhi;
    private javax.swing.JButton btnKetThuc;
    private javax.swing.JButton btnKhong;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbLSP;
    private javax.swing.JTable dgDanhSach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbImageSanPham;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenAnh;
    private javax.swing.JTextField txtTenSP;
    // End of variables declaration//GEN-END:variables

}
