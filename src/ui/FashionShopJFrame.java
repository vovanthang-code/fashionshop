/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import utils.Auth;
import utils.XImage;

/**
 *
 * @author vvtvo
 */
public class FashionShopJFrame extends javax.swing.JFrame {

    /**
     * Creates new form TSHOPJFrame
     */
    public FashionShopJFrame() {
        initComponents();
        init();
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
        jLabel1 = new javax.swing.JLabel();
        lblDongHo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblTenNV = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblVaiTro = new javax.swing.JLabel();
        lblAnh = new javax.swing.JLabel();
        btnDangXuat = new javax.swing.JButton();
        btnHoaDon = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblChu = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btnNhanVien = new javax.swing.JButton();
        btnKhachHang = new javax.swing.JButton();
        btnSanPham = new javax.swing.JButton();
        btnKho = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuQuanLy = new javax.swing.JMenu();
        minTaoTaiKhoan = new javax.swing.JMenuItem();
        mniDoiMatkhau = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mmiDangXuat = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuKhachHang = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        mniSanPham = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mniLoaiSanPham = new javax.swing.JMenuItem();
        mniDonViTinh = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mniKho = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mniThongKeNgay = new javax.swing.JMenuItem();
        mniThongKeThang = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mniHoaDon = new javax.swing.JMenuItem();
        mniDanhSachHD = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        mniHuongDan = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mniGioiThieu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FashionShop - HỆ QUẢN TRỊ SHOP");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Info.png"))); // NOI18N
        jLabel1.setText("Quản lý shop thời trang");

        lblDongHo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Alarm.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDongHo)
                .addGap(70, 70, 70))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addComponent(lblDongHo)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin người dùng", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Tên người dùng:");

        lblTenNV.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTenNV.setForeground(new java.awt.Color(0, 0, 255));
        lblTenNV.setText("name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Vai trò :");

        lblVaiTro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblVaiTro.setForeground(new java.awt.Color(0, 0, 255));
        lblVaiTro.setText("vaitro");

        lblAnh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAnh.setText("Hình đai diện");

        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Exit.png"))); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblVaiTro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTenNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 111, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAnh, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTenNV)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblVaiTro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(lblAnh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnHoaDon.setBackground(new java.awt.Color(0, 204, 0));
        btnHoaDon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnHoaDon.setForeground(new java.awt.Color(255, 0, 0));
        btnHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/thanhtoan.png"))); // NOI18N
        btnHoaDon.setText("HÓA ĐƠN");
        btnHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoaDonActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/chu.png"))); // NOI18N
        jLabel2.setOpaque(true);

        lblChu.setBackground(new java.awt.Color(255, 255, 255));
        lblChu.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblChu.setForeground(new java.awt.Color(255, 0, 0));
        lblChu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChu.setText("CHÀO MỪNG BẠN ĐẾN VỚI FASHION SHOP !!!");
        lblChu.setOpaque(true);
        lblChu.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblChuAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setOpaque(true);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setOpaque(true);

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);

        btnNhanVien.setBackground(new java.awt.Color(255, 255, 255));
        btnNhanVien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Clien list.png"))); // NOI18N
        btnNhanVien.setText("Nhân viên");
        btnNhanVien.setFocusable(false);
        btnNhanVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNhanVien.setMargin(new java.awt.Insets(2, 30, 2, 30));
        btnNhanVien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNhanVien);

        btnKhachHang.setBackground(new java.awt.Color(255, 255, 255));
        btnKhachHang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/User group.png"))); // NOI18N
        btnKhachHang.setText("Khách hàng");
        btnKhachHang.setFocusable(false);
        btnKhachHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKhachHang.setMargin(new java.awt.Insets(2, 30, 2, 30));
        btnKhachHang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhachHangActionPerformed(evt);
            }
        });
        jToolBar1.add(btnKhachHang);

        btnSanPham.setBackground(new java.awt.Color(255, 255, 255));
        btnSanPham.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Basket.png"))); // NOI18N
        btnSanPham.setText("Sản phẩm");
        btnSanPham.setFocusable(false);
        btnSanPham.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSanPham.setMargin(new java.awt.Insets(2, 30, 2, 30));
        btnSanPham.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanPhamActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSanPham);

        btnKho.setBackground(new java.awt.Color(255, 255, 255));
        btnKho.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnKho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Box.png"))); // NOI18N
        btnKho.setText("Kho");
        btnKho.setFocusable(false);
        btnKho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKho.setMargin(new java.awt.Insets(2, 30, 2, 30));
        btnKho.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnKho);

        btnThongKe.setBackground(new java.awt.Color(255, 255, 255));
        btnThongKe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Bar chart.png"))); // NOI18N
        btnThongKe.setText("Thống kê");
        btnThongKe.setFocusable(false);
        btnThongKe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThongKe.setMargin(new java.awt.Insets(2, 30, 2, 30));
        btnThongKe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });
        jToolBar1.add(btnThongKe);

        mnuQuanLy.setText("Quản lý");
        mnuQuanLy.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mnuQuanLy.setMargin(new java.awt.Insets(0, 0, 0, 10));

        minTaoTaiKhoan.setText("Quản lý nhân viên");
        minTaoTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minTaoTaiKhoanActionPerformed(evt);
            }
        });
        mnuQuanLy.add(minTaoTaiKhoan);

        mniDoiMatkhau.setText("Đổi mật khẩu");
        mniDoiMatkhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoiMatkhauActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniDoiMatkhau);
        mnuQuanLy.add(jSeparator1);

        mmiDangXuat.setText("Đăng xuất");
        mmiDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmiDangXuatActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mmiDangXuat);

        jMenuBar1.add(mnuQuanLy);

        jMenu3.setText("Khách hàng");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenu3.setMargin(new java.awt.Insets(0, 0, 0, 10));

        mnuKhachHang.setText("Quản lý khách hàng");
        mnuKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuKhachHangActionPerformed(evt);
            }
        });
        jMenu3.add(mnuKhachHang);

        jMenuBar1.add(jMenu3);

        jMenu7.setText("Sản phẩm");
        jMenu7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenu7.setMargin(new java.awt.Insets(0, 0, 0, 10));

        mniSanPham.setText("Quản lý sản phẩm");
        mniSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSanPhamActionPerformed(evt);
            }
        });
        jMenu7.add(mniSanPham);
        jMenu7.add(jSeparator4);

        mniLoaiSanPham.setText("Loại sản phẩm");
        mniLoaiSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLoaiSanPhamActionPerformed(evt);
            }
        });
        jMenu7.add(mniLoaiSanPham);

        mniDonViTinh.setText("Đơn vị tính");
        mniDonViTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDonViTinhActionPerformed(evt);
            }
        });
        jMenu7.add(mniDonViTinh);

        jMenuItem9.setText("Sale");
        jMenu7.add(jMenuItem9);

        jMenuBar1.add(jMenu7);

        jMenu1.setText("Kho");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenu1.setMargin(new java.awt.Insets(0, 0, 0, 10));

        mniKho.setText("Quản lý kho");
        mniKho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKhoActionPerformed(evt);
            }
        });
        jMenu1.add(mniKho);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Thống kê");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenu2.setMargin(new java.awt.Insets(0, 0, 0, 10));

        mniThongKeNgay.setText("Thống kê Ngày");
        mniThongKeNgay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniThongKeNgayActionPerformed(evt);
            }
        });
        jMenu2.add(mniThongKeNgay);

        mniThongKeThang.setText("Thống kê Tháng");
        mniThongKeThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniThongKeThangActionPerformed(evt);
            }
        });
        jMenu2.add(mniThongKeThang);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Hóa đơn");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenu4.setMargin(new java.awt.Insets(0, 0, 0, 10));

        mniHoaDon.setText("Quản lý hóa đơn");
        mniHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHoaDonActionPerformed(evt);
            }
        });
        jMenu4.add(mniHoaDon);

        mniDanhSachHD.setText("Danh sách hóa đơn");
        mniDanhSachHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDanhSachHDActionPerformed(evt);
            }
        });
        jMenu4.add(mniDanhSachHD);

        jMenuBar1.add(jMenu4);

        jMenu9.setText("Trợ giúp");
        jMenu9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenu9.setMargin(new java.awt.Insets(0, 0, 0, 10));

        mniHuongDan.setText("Hướng dẫn sử dụng");
        mniHuongDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHuongDanActionPerformed(evt);
            }
        });
        jMenu9.add(mniHuongDan);
        jMenu9.add(jSeparator3);

        mniGioiThieu.setText("Giới thiệu sản phẩm");
        mniGioiThieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniGioiThieuActionPerformed(evt);
            }
        });
        jMenu9.add(mniGioiThieu);

        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 945, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 945, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblChu, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoaDonActionPerformed
        // TODO add your handling code here:
        this.openHoaDon();
    }//GEN-LAST:event_btnHoaDonActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        // TODO add your handling code here:
        this.openDangXuat();
        this.loadUser();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void mniDoiMatkhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoiMatkhauActionPerformed
        // TODO add your handling code here:
        this.openDoiMatKhau();
    }//GEN-LAST:event_mniDoiMatkhauActionPerformed

    private void mnuKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuKhachHangActionPerformed
        // TODO add your handling code here:
        this.openKhachHang();
    }//GEN-LAST:event_mnuKhachHangActionPerformed

    private void mniSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSanPhamActionPerformed
        // TODO add your handling code here:
        this.openSanPham();
    }//GEN-LAST:event_mniSanPhamActionPerformed

    private void mniHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHoaDonActionPerformed
        // TODO add your handling code here:
        this.openHoaDon();
    }//GEN-LAST:event_mniHoaDonActionPerformed

    private void minTaoTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minTaoTaiKhoanActionPerformed
        // TODO add your handling code here:
        this.openNhanVien();
    }//GEN-LAST:event_minTaoTaiKhoanActionPerformed

    private void mniDonViTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDonViTinhActionPerformed
        // TODO add your handling code here:
        this.openDonViTinh();
    }//GEN-LAST:event_mniDonViTinhActionPerformed

    private void mniLoaiSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLoaiSanPhamActionPerformed
        // TODO add your handling code here:
        this.openLoaiSanPham();
    }//GEN-LAST:event_mniLoaiSanPhamActionPerformed

    private void mniKhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKhoActionPerformed
        // TODO add your handling code here:
        this.openKho();
    }//GEN-LAST:event_mniKhoActionPerformed

    private void lblChuAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblChuAncestorAdded
        // TODO add your handling code here:
        textmove();
    }//GEN-LAST:event_lblChuAncestorAdded

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        // TODO add your handling code here:
        this.openNhanVien();
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachHangActionPerformed
        // TODO add your handling code here:
        this.openKhachHang();
    }//GEN-LAST:event_btnKhachHangActionPerformed

    private void btnSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanPhamActionPerformed
        // TODO add your handling code here:
        this.openSanPham();
    }//GEN-LAST:event_btnSanPhamActionPerformed

    private void btnKhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoActionPerformed
        // TODO add your handling code here:
        this.openKho();
    }//GEN-LAST:event_btnKhoActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        // TODO add your handling code here:
        this.openThongKeNgay();
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void mniThongKeNgayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniThongKeNgayActionPerformed
        // TODO add your handling code here:
        this.openThongKeNgay();
    }//GEN-LAST:event_mniThongKeNgayActionPerformed

    private void mniDanhSachHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDanhSachHDActionPerformed
        // TODO add your handling code here:]
        this.openHoaDonCC();
    }//GEN-LAST:event_mniDanhSachHDActionPerformed

    private void mniHuongDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHuongDanActionPerformed
        // TODO add your handling code here:
        this.openHDSD();
    }//GEN-LAST:event_mniHuongDanActionPerformed

    private void mniGioiThieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniGioiThieuActionPerformed
        // TODO add your handling code here:
        this.openGioiThieu();
    }//GEN-LAST:event_mniGioiThieuActionPerformed

    private void mmiDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmiDangXuatActionPerformed
        // TODO add your handling code here:
        this.openDangXuat();
        this.loadUser();
    }//GEN-LAST:event_mmiDangXuatActionPerformed

    private void mniThongKeThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniThongKeThangActionPerformed
        // TODO add your handling code here:
        this.openThongKeThang();
    }//GEN-LAST:event_mniThongKeThangActionPerformed

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
            java.util.logging.Logger.getLogger(FashionShopJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FashionShopJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FashionShopJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FashionShopJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FashionShopJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnHoaDon;
    private javax.swing.JButton btnKhachHang;
    private javax.swing.JButton btnKho;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnSanPham;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblAnh;
    private javax.swing.JLabel lblChu;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JLabel lblTenNV;
    private javax.swing.JLabel lblVaiTro;
    private javax.swing.JMenuItem minTaoTaiKhoan;
    private javax.swing.JMenuItem mmiDangXuat;
    private javax.swing.JMenuItem mniDanhSachHD;
    private javax.swing.JMenuItem mniDoiMatkhau;
    private javax.swing.JMenuItem mniDonViTinh;
    private javax.swing.JMenuItem mniGioiThieu;
    private javax.swing.JMenuItem mniHoaDon;
    private javax.swing.JMenuItem mniHuongDan;
    private javax.swing.JMenuItem mniKho;
    private javax.swing.JMenuItem mniLoaiSanPham;
    private javax.swing.JMenuItem mniSanPham;
    private javax.swing.JMenuItem mniThongKeNgay;
    private javax.swing.JMenuItem mniThongKeThang;
    private javax.swing.JMenuItem mnuKhachHang;
    private javax.swing.JMenu mnuQuanLy;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setLocationRelativeTo(null);
        this.setIconImage(XImage.getAppIcon());
        new ChaoJDialog(this, true).setVisible(true);
        new DangNhapJDialog(this, true).setVisible(true);
        this.startDongHo();  
        this.loadUser();
    }

    private void startDongHo() {
        SimpleDateFormat formater = new SimpleDateFormat("hh:mm:ss a");
        new Timer(1000, (e) -> {
            lblDongHo.setText(formater.format(new Date()));
        }).start();
    }
    private void loadUser(){
        lblTenNV.setText(Auth.user.getTenNV());
        lblVaiTro.setText(Auth.user.isVaiTro() ? "Admin" : "Nhân Viên");
        if(Auth.user.getHinh() != null){
            lblAnh.setText(null);
            lblAnh.setIcon(XImage.read(Auth.user.getHinh()));
        }else{
            lblAnh.setText("Ảnh đại diện");
            lblAnh.setIcon(new ImageIcon());
        }
        
    }

    private void openDangXuat() {
        new DangNhapJDialog(this, true).setVisible(true);
    }

    private void openDoiMatKhau() {
        new DoiMatKhauJDialog(this, true).setVisible(true);
    }

    private void openHoaDon() {
        new HoaDonJFrame().setVisible(true);
    }

    private void openKhachHang() {
        new KhachHangJDialog(this, true).setVisible(true);
    }

    private void openNhanVien() {
        new NhanVienJFrame().setVisible(true);
    }

    private void openSanPham() {
        new SanPhamJFrame().setVisible(true);
    }
    private void openDonViTinh() {
        new DonViTinhJDialog(this, true).setVisible(true);
    }
    private void openLoaiSanPham() {
        new LoaiSanPhamJDialog(this, true).setVisible(true);
    }

    private void openKho() {
        new KhoJFrame().setVisible(true);
    }

    private void openThongKeThang() {
        new ThongKeThangJFrame().setVisible(true);
    }
    private void openThongKeNgay(){
        new ThongKeNgayJFrame().setVisible(true);
    }
    private void openHoaDonCC(){
        new HoaDonChiTietJFrame().setVisible(true);
    }
    private void openHDSD(){
        new HuongDanSuDungJDialog(this, true).setVisible(true);
    }
    private void openGioiThieu(){
        new GioiThieuJDialog(this, true).setVisible(true);
    }
    int lblTextleght = 0;
Timer tm;
int counter = 0;
 void textmove(){
     String txt =lblChu.getText();
        lblTextleght = txt.length();
        tm= new Timer(100, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                if(counter > lblTextleght){
                    lblChu.setText("");
                    counter=0;   
                }else{
                lblChu.setText(txt.substring(0,counter));
                
                if(lblChu.getForeground() == Color.RED){
                    lblChu.setForeground(Color.RED);
                }else {
                   lblChu.setForeground(Color.RED);
                }
                  }      
               }
        });
       tm.start();
}
}