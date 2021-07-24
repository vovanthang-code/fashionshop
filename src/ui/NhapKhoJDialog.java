/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import dao.DonViTinhDAO;
import dao.KhoDAO;
import dao.SanPhamDAO;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.DonViTinh;
import model.Kho;
import model.SanPham;
import utils.MsgBox;

/**
 *
 * @author vvtvo
 */
public class NhapKhoJDialog extends javax.swing.JDialog {

    /**
     * Creates new form NhapKhoJDialog
     */
    public NhapKhoJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        lblDVT = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSL = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtGiaNhap = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnNhapKho = new javax.swing.JButton();
        lblTenSP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblDVT.setText("ĐVT");

        jLabel4.setText("SL Nhập");

        jLabel3.setText("ĐVT");

        jLabel5.setText("Giá nhập");

        jLabel2.setText("Tên sản phẩm");

        btnNhapKho.setText("Nhập kho");
        btnNhapKho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapKhoActionPerformed(evt);
            }
        });

        lblTenSP.setText("Sản phẩm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSL)
                    .addComponent(txtGiaNhap)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNhapKho)
                            .addComponent(lblDVT)
                            .addComponent(lblTenSP))
                        .addGap(0, 151, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblTenSP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblDVT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnNhapKho)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNhapKhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapKhoActionPerformed
        // TODO add your handling code here:
        insert();
    }//GEN-LAST:event_btnNhapKhoActionPerformed

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
            java.util.logging.Logger.getLogger(NhapKhoJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhapKhoJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhapKhoJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhapKhoJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NhapKhoJDialog dialog = new NhapKhoJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNhapKho;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblDVT;
    private javax.swing.JLabel lblTenSP;
    private javax.swing.JTextField txtGiaNhap;
    private javax.swing.JTextField txtSL;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setLocationRelativeTo(null);
        LoadData();
    }
    KhoDAO dao = new KhoDAO();
    SanPhamDAO spdao = new SanPhamDAO();
    DonViTinhDAO dtdao = new DonViTinhDAO();
    int row = -1;

    void setFrom(Kho nk) {
        //đổ thông tin sản phẩm
        SanPham sp = spdao.selectByName(KhoJFrame.tenSP);
        DonViTinh dt = dtdao.selectById(sp.getMaDVT());
        lblTenSP.setText(sp.getTenSP());
        lblDVT.setText(dt.getTenDVT());
        //thông tin nhập kho
        txtSL.setText("");
        txtGiaNhap.setText("");
    }
//    void fillTable() {
//        DefaultTableModel table = (DefaultTableModel) tblKho.getModel();
//        table.setRowCount(0);
//        Object[] col = {"Mã SP","Ngày tạo", "Số lượng", "Giá"};
//        String ten = lblTenSP.getText();
//        SanPham sp = spdao.selectByName(ten);
//        List<Kho> list = dao.selectByName(sp.getMaSP());
//        for (Kho nk : list) {
//            Object[] row = {
//                nk.getMaSP(),nk.getNgayTao(), nk.getSlNhap(), nk.getGiaNhap()
//            };
//            table.addRow(row);
//        }
//    }

    Kho getFrom() {
        Kho nk = new Kho();
        //Chuyển tên sản phẩm thành mã
        String tensp = lblTenSP.getText();
        SanPham sp = (SanPham) spdao.selectByName(tensp);
        //Chuyển tên đơn vị tính thành mã
        String tenDVT = lblDVT.getText();
        DonViTinh dt = dtdao.selectByName(tenDVT);
        //lấy thông tin
        nk.setMaSP(sp.getMaSP());
        nk.setMaDVT(dt.getMaDVT());
        nk.setSlNhap(Integer.parseInt(txtSL.getText()));
        nk.setGiaNhap(Double.parseDouble(txtGiaNhap.getText()));
        nk.setNgayTao(new Date());
        return nk;
    }

    void insert() {
        Kho nk = getFrom();
        try {
            dao.insert(nk);
            this.LoadData();
            MsgBox.alert(this, "Thêm mới thành công!");
            new KhoJFrame().fillTable();
            this.dispose();      
        } catch (Exception e) {
            MsgBox.alert(this, "Thêm mới thất bại!");
            e.printStackTrace();
        }
    }//btn Them

    private void LoadData() {
        Kho nk = new Kho();
        this.setFrom(nk);
        this.row = -1;
    }
}
