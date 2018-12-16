/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectJava;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author phatt
 */
public class MainFrame extends javax.swing.JFrame {

    

    /**
     * Creates new form MainFrame
     * @param user
     */
    private User user;
    private String username;
    private int nhanVienIndex = 0;
    private int index = 0;
    private int indexThongTinCN = 0;
    private ArrayList<User> arrUser;
    private ArrayList<Thuoc> arrThuoc;
    private ArrayList<HoaDon> arrHoaDon;
<<<<<<< HEAD
    private ArrayList<NhanVien> arrNhanVien;
=======
    private ArrayList<HieuThuoc> arrHieuThuoc;
>>>>>>> a5b34ce05276a293e1449f586d480346d51dbffb
    private int selectedRowUser = 0;
    private int selectedRowThuoc = 0;
    private int selectedRowHoaDon = 0;
    private int selectedRowHieuThuoc = 0;
    
    
    public MainFrame(User user, ArrayList<User> arrUser, int index) {
        initComponents();
        this.user = user;
        this.arrUser = arrUser;
        this.index = index;
        this.arrThuoc = ReadWriteFile.layThuocTuFile("thuoc.txt");
        this.arrHoaDon = ReadWriteFile.layHoaDonTuFile("hoadon.txt");
<<<<<<< HEAD
        this.arrNhanVien = ReadWriteFile.layNhanVienTuFile("nhanvien.txt");
=======
        this.arrHieuThuoc = ReadWriteFile.layHieuThuocTuFile("hieuthuoc.txt");
>>>>>>> a5b34ce05276a293e1449f586d480346d51dbffb
        txtCurrentUser.setText(user.getUsername());
        if(user.getUsertype() == 1){
            mainJTabbed.setEnabledAt(4, false);
        }
        jTableUser.setColumnSelectionAllowed(false);
        jTableThuoc.setColumnSelectionAllowed(false);
        jTableHoaDon.setColumnSelectionAllowed(false);
        hienThiListUser();
        hienThiListThuoc();
        hienThiListHoaDon();
<<<<<<< HEAD
        hienThiThongTinCaNhan();
    }
    
    private void hienThiThongTinCaNhan(){
        int index = 0;
        txtUsernameCN.setText(user.getUsername());
        txtPasswordCN.setText(user.getUserpass());
        cboUsertypeCN.setSelectedItem(user.getUsertype());
        for(NhanVien nv : arrNhanVien){
            index++;
            if(user.getUsername().equals(nv.getUserName())){
                txtHoTenCN.setText(nv.getHoTen());
                txtDIaChiCN.setText(nv.getDiaChi());
                txtSDTCN.setText(nv.getSoDT());
                txtNgaySinhCN.setText(nv.getNgaySinh().getNgay() + "");
                txtThangSinhCN.setText(nv.getNgaySinh().getThang() + "");
                txtNamSinhCN.setText(nv.getNgaySinh().getNam() + "");
                setIndexThongTinCN(index - 1);
                break;
            }
        }
=======
        hienThiListHieuThuoc();
>>>>>>> a5b34ce05276a293e1449f586d480346d51dbffb
    }
    
    private void hienThiListUser(){

        DefaultTableModel model;
        model = (DefaultTableModel) jTableUser.getModel();
        model.setRowCount(0);
        for(User u : arrUser){
            String [] data = new String[3];
            data [0] = u.getUsername();
            data [1] = u.getUserpass();
            data [2] = u.getUsertype() + "";
            model.addRow(data);
       }
        jTableUser.setModel(model);
    }
    
    private void hienThiListThuoc(){
        DefaultTableModel model;
        model = (DefaultTableModel) jTableThuoc.getModel();
        model.setRowCount(0);
        for(Thuoc t : arrThuoc){
            String [] data = new String[4];
            data [0] = t.getMaThuoc();
            data [1] = t.getTenThuoc();
            data [2] = t.getDonViTinh();
            data [3] = t.getDonGia() + "";
            model.addRow(data);
       }
        jTableThuoc.setModel(model);
    }
    
    private void hienThiListHoaDon() {
        DefaultTableModel model;
        model = (DefaultTableModel) jTableHoaDon.getModel();
        model.setRowCount(0);
        for(HoaDon hd : arrHoaDon) {
            String [] data = new String[6];
            data [0] = hd.getMaHoaDon();
            data [1] = hd.getNgayNhap().getNgay() + "";
            data [2] = hd.getNgayNhap().getThang() + "";
            data [3] = hd.getNgayNhap().getNam() + "";
            data [4] = hd.getThuoc().getMaThuoc();
            data [5] = hd.getThuoc().getTenThuoc();
            model.addRow(data);
        }
        jTableHoaDon.setModel(model);
    }
    
    public int getSelectedRowThuoc() {
        return selectedRowThuoc;
    }
    
    private void hienThiListHieuThuoc(){
    DefaultTableModel model;
    model = (DefaultTableModel) jTableHieuThuoc.getModel();
    model.setRowCount(0);
    for(HieuThuoc h : arrHieuThuoc){
        String [] data = new String[3];
        data [0] = h.getMaHieuThuoc();
        data [1] = h.getTenHieuThuoc();
        data [2] = h.getDiaChi();
        model.addRow(data);
   }
    jTableHieuThuoc.setModel(model);
}

    public void setSelectedRowThuoc(int selectedRowThuoc) {
        this.selectedRowThuoc = selectedRowThuoc;
    }
    
    /**
     * @return the selectedRow
     */
    public int getSelectedRowUser() {
        return selectedRowUser;
    }

    /**
     * @param selectedRow the selectedRow to set
     */
    public void setSelectedRowUser(int selectedRow) {
        this.selectedRowUser = selectedRow;
    }
    
    /**
     * @return the selectedRowHoaDon
     */
    public int getSelectedRowHoaDon() {
        return selectedRowHoaDon;
    }

    /**
     * @param selectedRowHoaDon the selectedRow to set
     */
    public void setSelectedRowHoaDon(int selectedRowHoaDon) {
        this.selectedRowHoaDon = selectedRowHoaDon;
    }
<<<<<<< HEAD

    public int getNhanVienIndex() {
        return nhanVienIndex;
    }

    public void setNhanVienIndex(int nhanVienIndex) {
        this.nhanVienIndex = nhanVienIndex;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndexThongTinCN() {
        return indexThongTinCN;
    }

    public void setIndexThongTinCN(int indexThongTinCN) {
        this.indexThongTinCN = indexThongTinCN;
    }
    
=======
    
            
       /**
     * @return the selectedRowHieuThuoc
     */
    public int getSelectedRowHieuThuoc() {
        return selectedRowHieuThuoc;
    }

    /**
     * @param selectedRowHieuThuoc the selectedRowHieuThuoc to set
     */
    public void setSelectedRowHieuThuoc(int selectedRowHieuThuoc) {
        this.selectedRowHieuThuoc = selectedRowHieuThuoc;
    }
    
  
>>>>>>> a5b34ce05276a293e1449f586d480346d51dbffb
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mainJTabbed = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableThuoc = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtMaThuoc = new javax.swing.JTextField();
        txtTenThuoc = new javax.swing.JTextField();
        txtDonViTinh = new javax.swing.JTextField();
        txtDonGia = new javax.swing.JTextField();
        cboTimThuoc = new javax.swing.JComboBox<>();
        cboSapXepThuoc = new javax.swing.JComboBox<>();
        txtGiaTriTimThuoc = new javax.swing.JTextField();
        btnSapXepThuoc = new javax.swing.JButton();
        btnTimThuoc = new javax.swing.JButton();
        btnThemThuoc = new javax.swing.JButton();
        btnSuaThuoc = new javax.swing.JButton();
        btnXoaThuoc = new javax.swing.JButton();
        btnCkearThuocFrame = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableHoaDon = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtNgay = new javax.swing.JTextField();
        txtThang = new javax.swing.JTextField();
        txtNam = new javax.swing.JTextField();
        txtMaHoaDon = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtHoaDonMaThuoc = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtHoaDonTenThuoc = new javax.swing.JTextField();
        btnThemHoaDon = new javax.swing.JButton();
        btnXoaHoaDon = new javax.swing.JButton();
        btnSuaHoaDon = new javax.swing.JButton();
        btnClearHoaDon = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
<<<<<<< HEAD
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtUsernameCN = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtHoTenCN = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtDIaChiCN = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtNgaySinhCN = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtThangSinhCN = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtNamSinhCN = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtSDTCN = new javax.swing.JTextField();
        btnCapNhatTT = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        cboUsertypeCN = new javax.swing.JComboBox<>();
        txtPasswordCN = new javax.swing.JPasswordField();
=======
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableHieuThuoc = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtMaHieuThuoc = new javax.swing.JTextField();
        txtTenHieuThuoc = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        cboTimHieuThuoc = new javax.swing.JComboBox<>();
        cboSapXepHieuThuoc = new javax.swing.JComboBox<>();
        txtTimHieuThuoc = new javax.swing.JTextField();
        btnSapXepHieuThuoc = new javax.swing.JButton();
        btnTimHieuThuoc = new javax.swing.JButton();
        btnThemHieuThuoc = new javax.swing.JButton();
        btnSuaHieuThuoc = new javax.swing.JButton();
        btnXoaHieuThuoc = new javax.swing.JButton();
        btnClearHieuThuocFrame = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
>>>>>>> a5b34ce05276a293e1449f586d480346d51dbffb
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableUser = new javax.swing.JTable();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnSapXep = new javax.swing.JButton();
        btnTim = new javax.swing.JButton();
        cboSapXep = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtGiaTriTim = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        cboType = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtNgaySinhUser = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtThangSinhUser = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtNamSinhUser = new javax.swing.JTextField();
        txtHoTenUser = new javax.swing.JTextField();
        txtDiaChiUser = new javax.swing.JTextField();
        txtSoDTUser = new javax.swing.JTextField();
        txtCurrentUser = new javax.swing.JTextField();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Username :");

        jTableThuoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Thuốc", "Tên Thuốc", "Đơn Vị Tính", "Đơn Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableThuoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableThuocMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableThuoc);
        if (jTableThuoc.getColumnModel().getColumnCount() > 0) {
            jTableThuoc.getColumnModel().getColumn(0).setResizable(false);
            jTableThuoc.getColumnModel().getColumn(1).setResizable(false);
            jTableThuoc.getColumnModel().getColumn(2).setResizable(false);
            jTableThuoc.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel7.setText("Mã Thuốc");

        jLabel8.setText("Tên Thuốc");

        jLabel9.setText("Đơn Vị Tính");

        jLabel10.setText("Đơn Giá");

        txtMaThuoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMaThuocFocusLost(evt);
            }
        });

        txtTenThuoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTenThuocFocusLost(evt);
            }
        });

        cboTimThuoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã Thuốc", "Tên Thuốc" }));

        cboSapXepThuoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã Thuốc", "Tên Thuốc", "Đơn Vị Tính", "Đơn Giá" }));

        btnSapXepThuoc.setText("Sắp Xếp");
        btnSapXepThuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepThuocActionPerformed(evt);
            }
        });

        btnTimThuoc.setText("Tìm");
        btnTimThuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimThuocActionPerformed(evt);
            }
        });

        btnThemThuoc.setText("Thêm");
        btnThemThuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemThuocActionPerformed(evt);
            }
        });

        btnSuaThuoc.setText("Sửa");
        btnSuaThuoc.setEnabled(false);
        btnSuaThuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaThuocActionPerformed(evt);
            }
        });

        btnXoaThuoc.setText("Xóa");
        btnXoaThuoc.setEnabled(false);
        btnXoaThuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaThuocActionPerformed(evt);
            }
        });

        btnCkearThuocFrame.setText("Clear");
        btnCkearThuocFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCkearThuocFrameActionPerformed(evt);
            }
        });

        jLabel11.setText("Tìm thuốc theo : ");

        jLabel12.setText("Sắp xếp theo : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDonGia)
                            .addComponent(txtDonViTinh)
                            .addComponent(txtTenThuoc)
                            .addComponent(txtMaThuoc)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtGiaTriTimThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(btnThemThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addGap(28, 28, 28)
                                                .addComponent(cboSapXepThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(btnXoaThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnSuaThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(cboTimThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnTimThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnCkearThuocFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSapXepThuoc)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(75, 75, 75)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtMaThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTenThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDonViTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCkearThuocFrame)
                    .addComponent(btnThemThuoc)
                    .addComponent(btnXoaThuoc)
                    .addComponent(btnSuaThuoc))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cboTimThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimThuoc))
                .addGap(18, 18, 18)
                .addComponent(txtGiaTriTimThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cboSapXepThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSapXepThuoc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainJTabbed.addTab("Quản lý thuốc", jPanel1);

        jTableHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Hóa Đơn", "Ngày", "Tháng", "Năm", "Mã Thuốc", "Tên Thuốc"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableHoaDon.setMinimumSize(new java.awt.Dimension(60, 0));
        jTableHoaDon.setPreferredSize(new java.awt.Dimension(300, 0));
        jTableHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableHoaDonMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableHoaDon);

        jLabel13.setText("Mã Hóa Đơn");
        jLabel13.setName(""); // NOI18N

        jLabel14.setText("Ngày Nhập");

        jLabel16.setText("Ngày:");

        jLabel17.setText("Tháng:");

        jLabel18.setText("Năm:");

        jLabel19.setText("Thuốc");

        jLabel20.setText("Mã Thuốc");

        jLabel21.setText("Tên Thuốc");

        btnThemHoaDon.setText("Thêm");
        btnThemHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemHoaDonActionPerformed(evt);
            }
        });

        btnXoaHoaDon.setText("Xóa");
        btnXoaHoaDon.setEnabled(false);

        btnSuaHoaDon.setText("Sửa");
        btnSuaHoaDon.setEnabled(false);

        btnClearHoaDon.setText("Clear");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel14)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addGap(30, 30, 30)
                            .addComponent(jLabel16)
                            .addGap(2, 2, 2)
                            .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel17)
                            .addGap(2, 2, 2)
                            .addComponent(txtThang, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNam, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel19))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btnThemHoaDon)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                            .addComponent(btnXoaHoaDon)
                            .addGap(18, 18, 18)
                            .addComponent(btnSuaHoaDon)
                            .addGap(37, 37, 37)
                            .addComponent(btnClearHoaDon))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel21)
                                .addComponent(jLabel20))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtHoaDonMaThuoc)
                                .addComponent(txtHoaDonTenThuoc, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtHoaDonMaThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtHoaDonTenThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemHoaDon)
                    .addComponent(btnXoaHoaDon)
                    .addComponent(btnSuaHoaDon)
                    .addComponent(btnClearHoaDon))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel13.getAccessibleContext().setAccessibleName("jLabel13");

        mainJTabbed.addTab("Quản lý hóa đơn", jPanel2);

        jTableHieuThuoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Hiệu Thuốc", "Tên Hiệu Thuốc", "Địa Chỉ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableHieuThuoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableHieuThuocMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTableHieuThuoc);

        jLabel22.setText("Mã Hiệu Thuốc");

        jLabel23.setText("Tên Hiệu Thuốc");

        jLabel24.setText("Địa Chỉ");

        txtMaHieuThuoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMaHieuThuocFocusLost(evt);
            }
        });

        cboTimHieuThuoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã Hiệu Thuốc", "Tên Hiệu Thuốc", "Địa Chỉ" }));

        cboSapXepHieuThuoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã Hiệu Thuốc", "Tên Hiệu Thuốc", "Địa Chỉ" }));

        btnSapXepHieuThuoc.setText("Sắp Xếp");
        btnSapXepHieuThuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepHieuThuocActionPerformed(evt);
            }
        });

        btnTimHieuThuoc.setText("Tìm");
        btnTimHieuThuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimHieuThuocActionPerformed(evt);
            }
        });

        btnThemHieuThuoc.setText("Thêm");
        btnThemHieuThuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemHieuThuocActionPerformed(evt);
            }
        });

        btnSuaHieuThuoc.setText("Sửa");
        btnSuaHieuThuoc.setEnabled(false);
        btnSuaHieuThuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaHieuThuocActionPerformed(evt);
            }
        });

        btnXoaHieuThuoc.setText("Xóa");
        btnXoaHieuThuoc.setEnabled(false);
        btnXoaHieuThuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaHieuThuocActionPerformed(evt);
            }
        });

        btnClearHieuThuocFrame.setText("Clear");
        btnClearHieuThuocFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearHieuThuocFrameActionPerformed(evt);
            }
        });

        jLabel25.setText("Tìm theo : ");

        jLabel26.setText("Sắp xếp theo : ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDiaChi)
                            .addComponent(txtTenHieuThuoc)
                            .addComponent(txtMaHieuThuoc)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTimHieuThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(btnThemHieuThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnXoaHieuThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLabel26)
                                                .addGap(28, 28, 28)
                                                .addComponent(cboSapXepHieuThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLabel25)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(btnSuaHieuThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cboTimHieuThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnTimHieuThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnClearHieuThuocFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSapXepHieuThuoc)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(75, 75, 75)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtMaHieuThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtTenHieuThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClearHieuThuocFrame)
                    .addComponent(btnThemHieuThuoc)
                    .addComponent(btnXoaHieuThuoc)
                    .addComponent(btnSuaHieuThuoc))
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(cboTimHieuThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimHieuThuoc))
                .addGap(18, 18, 18)
                .addComponent(txtTimHieuThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(cboSapXepHieuThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSapXepHieuThuoc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mainJTabbed.addTab("Quản lý hiệu thuốc", jPanel3);

        jLabel22.setText("Username");

        jLabel23.setText("Password");

        txtUsernameCN.setEnabled(false);

        jLabel24.setText("Họ tên");

        jLabel25.setText("Địa chỉ");

        jLabel26.setText("Ngày");

        jLabel27.setText("Tháng");

        jLabel28.setText("Năm");

        jLabel29.setText("Số điện thoại");

        btnCapNhatTT.setText("Cập nhật");
        btnCapNhatTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatTTActionPerformed(evt);
            }
        });

        jLabel36.setText("Usertype");

        cboUsertypeCN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quản Lý", "Nhân Viên" }));
        cboUsertypeCN.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel36)
                        .addComponent(jLabel26)))
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCapNhatTT)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(txtNgaySinhCN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addComponent(txtThangSinhCN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel28)
                        .addGap(18, 18, 18)
                        .addComponent(txtNamSinhCN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtUsernameCN)
                    .addComponent(txtHoTenCN)
                    .addComponent(txtDIaChiCN)
                    .addComponent(txtSDTCN)
                    .addComponent(cboUsertypeCN, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPasswordCN))
                .addContainerGap(564, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtUsernameCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtPasswordCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtHoTenCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtDIaChiCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtSDTCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(cboUsertypeCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgaySinhCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(txtThangSinhCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(txtNamSinhCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(18, 18, 18)
                .addComponent(btnCapNhatTT)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        mainJTabbed.addTab("Thông tin cá nhân", jPanel5);

        jTableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Password", "Usertype"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableUser.setColumnSelectionAllowed(true);
        jTableUser.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableUser.getTableHeader().setReorderingAllowed(false);
        jTableUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUserMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableUser);
        jTableUser.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTableUser.getColumnModel().getColumnCount() > 0) {
            jTableUser.getColumnModel().getColumn(0).setResizable(false);
            jTableUser.getColumnModel().getColumn(1).setResizable(false);
            jTableUser.getColumnModel().getColumn(2).setResizable(false);
        }

        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserFocusLost(evt);
            }
        });

        jLabel3.setText("Username");

        jLabel4.setText("Password");

        jLabel5.setText("Usertype");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.setEnabled(false);
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.setEnabled(false);
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnSapXep.setText("Sắp Xếp");
        btnSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepActionPerformed(evt);
            }
        });

        btnTim.setText("Tìm Kiếm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        cboSapXep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Username", "Usertype" }));

        jLabel6.setText("Sắp xếp theo :");

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        cboType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quản Lý", "Nhân Viên" }));

        jLabel30.setText("Họ tên");

        jLabel31.setText("Địa chỉ");

        jLabel32.setText("Số ĐT");

        jLabel33.setText("Ngày");

        jLabel34.setText("Tháng");

        jLabel35.setText("Năm");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUser)
                            .addComponent(txtPass)
                            .addComponent(cboType, 0, 311, Short.MAX_VALUE)
                            .addComponent(txtHoTenUser)
                            .addComponent(txtDiaChiUser)
                            .addComponent(txtSoDTUser)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(btnThem)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(18, 18, 18)
                                            .addComponent(cboSapXep, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(txtGiaTriTim))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnTim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addGap(18, 18, 18)
                                .addComponent(txtNgaySinhUser, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel34)
                                .addGap(18, 18, 18)
                                .addComponent(txtThangSinhUser, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel35)
                                .addGap(18, 18, 18)
                                .addComponent(txtNamSinhUser, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)))))
                .addGap(76, 76, 76)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtHoTenUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txtDiaChiUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtSoDTUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txtNgaySinhUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(txtThangSinhUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(txtNamSinhUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnClear))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTim)
                    .addComponent(txtGiaTriTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btnSapXep))
                .addContainerGap())
        );

        mainJTabbed.addTab("Quản lý User", jPanel4);

        txtCurrentUser.setText("123");
        txtCurrentUser.setEnabled(false);

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCurrentUser, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogout))
                    .addComponent(mainJTabbed))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtCurrentUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainJTabbed, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:     
        int result = JOptionPane.showConfirmDialog(null, "Bạn muốn đăng xuất?", "Xác nhận" , JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(result == 0){
            LoginFrame logFrame = new LoginFrame();
        logFrame.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepActionPerformed
        // TODO add your handling code here:
        if(cboSapXep.getSelectedItem().equals("Username")){
            Collections.sort(arrUser, new Comparator<User>(){
                @Override
                public int compare(User u1, User u2) {
                    return u1.getUsername().compareTo(u2.getUsername());
                }
            });
        }else if(cboSapXep.getSelectedItem().equals("Usertype")){
            Collections.sort(arrUser, new Comparator<User>(){
                @Override
                public int compare(User u1, User u2) {
                    if(u1.getUsertype() == u2.getUsertype()){
                        return 0;
                    }else if(u1.getUsertype() > u2.getUsertype()){
                        return 1;
                    }else return -1;
                }
            });
        }
        hienThiListUser();
    }//GEN-LAST:event_btnSapXepActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if(!"".equals(txtUser.getText()) && !"".equals(txtPass.getText())){
        DefaultTableModel model = (DefaultTableModel) jTableUser.getModel();
        String [] data = new String[3];
        data [0] = txtUser.getText();
        data [1] = txtPass.getText();
        data [2] = cboType.getSelectedIndex() + "";
        arrUser.add( new User(txtUser.getText(),txtPass.getText(),cboType.getSelectedIndex()));
        Date ngaySinh = new Date(Integer.parseInt(txtNgaySinhUser.getText()),Integer.parseInt(txtThangSinhUser.getText()),Integer.parseInt(txtNamSinhUser.getText()));
        arrNhanVien.add(new NhanVien(txtUser.getText(),txtHoTenUser.getText(), txtDiaChiUser.getText(), txtSoDTUser.getText(), ngaySinh));
        txtUser.setText("");
        txtPass.setText("");
        cboType.setSelectedIndex(0);
        model.addRow(data);
        jTableUser.setModel(model);
        ReadWriteFile.ghiUserVaoFile("user.txt", arrUser);
        ReadWriteFile.ghiNhanVienVaoFile("nhanvien.txt", arrNhanVien);
        JOptionPane.showMessageDialog(null,"Tạo User mới thành công!!!");
        }else JOptionPane.showMessageDialog(null,"Username hoặc Password đang bỏ trống không thể thêm user mới!!!");        
    }//GEN-LAST:event_btnThemActionPerformed

    private void jTableUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUserMouseClicked
        // TODO add your handling code here:
        int row = jTableUser.getSelectedRow();
        setSelectedRowUser(row);
        txtUser.setEnabled(false);
        btnThem.setEnabled(false);
        btnXoa.setEnabled(true);
        btnSua.setEnabled(true);
        txtUser.setText(jTableUser.getValueAt(row, 0) + "");
        txtPass.setText(jTableUser.getValueAt(row, 1) + "");
        cboType.setSelectedIndex(Integer.parseInt((String) jTableUser.getValueAt(row, 2)));
        int i = 0;
        for(NhanVien nv : arrNhanVien){
            i++;
            if(nv.getUserName().equals(txtUser.getText())){
                txtHoTenUser.setText(nv.getHoTen());
                txtDiaChiUser.setText(nv.getDiaChi());
                txtSoDTUser.setText(nv.getSoDT());
                txtNgaySinhUser.setText(nv.getNgaySinh().getNgay() + "");
                txtThangSinhUser.setText(nv.getNgaySinh().getThang() + "");
                txtNamSinhUser.setText(nv.getNgaySinh().getNam() + "");
                setNhanVienIndex(i - 1);
                break;
            }
        }
    }//GEN-LAST:event_jTableUserMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clearAllForUser();
    }//GEN-LAST:event_btnClearActionPerformed

    
    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
        // TODO add your handling code here:
        for(User u : arrUser){
            if(txtUser.getText().equals(u.getUsername())){
                JOptionPane.showMessageDialog(null,"Username đã được sử dụng!!!");
                txtUser.setText("");
                txtUser.requestFocus();
                break;
            }
        }
    }//GEN-LAST:event_txtUserFocusLost

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        
        int result = JOptionPane.showConfirmDialog(null, "Bạn muốn xóa user được chọn?", "Xác nhận xóa" , JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(result == 0){
            arrUser.remove(getSelectedRowUser());
        arrNhanVien.remove(nhanVienIndex);
        boolean flag = false;
        for(User u : arrUser){
            if(txtCurrentUser.getText().equals(u.getUsername())){
                flag = true;
                break;
            }
        }
        if(!flag){
            JOptionPane.showMessageDialog(null,"Username đang sử dụng đã bị xóa!!! Chương trình sẽ thoát và khởi động lại");
            this.dispose();
            LoginFrame logFrame = new LoginFrame();
            logFrame.setVisible(true);
        }
        hienThiListUser();
        clearAllForUser();
        ReadWriteFile.ghiUserVaoFile("user.txt", arrUser);
        ReadWriteFile.ghiNhanVienVaoFile("nhanvien.txt", arrNhanVien);
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        
        int result = JOptionPane.showConfirmDialog(null, "Bạn muốn sửa user được chọn?", "Xác nhận sửa" , JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(result == 0){
            arrUser.get(selectedRowUser).setUserpass(txtPass.getText());
        arrUser.get(selectedRowUser).setUsertype(cboType.getSelectedIndex());
        arrNhanVien.get(nhanVienIndex).setHoTen(txtHoTenUser.getText());
        arrNhanVien.get(nhanVienIndex).setDiaChi(txtDiaChiUser.getText());
        arrNhanVien.get(nhanVienIndex).setSoDT(txtSoDTUser.getText());
        arrNhanVien.get(nhanVienIndex).setNgaySinh(new Date(Integer.parseInt(txtNgaySinhUser.getText()),Integer.parseInt(txtThangSinhUser.getText()),Integer.parseInt(txtNamSinhUser.getText())));
        hienThiListUser();
        ReadWriteFile.ghiUserVaoFile("user.txt", arrUser);
        ReadWriteFile.ghiNhanVienVaoFile("nhanvien.txt", arrNhanVien);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
        boolean flag = false;
        int i = 0;
        for (User u : arrUser) {
            if(u.getUsername().equals(txtGiaTriTim.getText())){
               txtUser.setText(u.getUsername());
               txtPass.setText(u.getUserpass());
               cboType.setSelectedIndex(u.getUsertype());
               txtUser.setEnabled(false);
               btnThem.setEnabled(false);
               btnXoa.setEnabled(true);
               btnSua.setEnabled(true);
                for (NhanVien nv : arrNhanVien) {
                    i++;
                    if (nv.getUserName().equals(txtUser.getText())) {
                        txtHoTenUser.setText(nv.getHoTen());
                        txtDiaChiUser.setText(nv.getDiaChi());
                        txtSoDTUser.setText(nv.getSoDT());
                        txtNgaySinhUser.setText(nv.getNgaySinh().getNgay() + "");
                        txtThangSinhUser.setText(nv.getNgaySinh().getThang() + "");
                        txtNamSinhUser.setText(nv.getNgaySinh().getNam() + "");
                        setNhanVienIndex(i - 1);
                        break;
                    }
                }
               flag = true;
               break;
            }
        }
        if(!flag){
            JOptionPane.showMessageDialog(null,"Username không tồn tại!!!");
        }
    }//GEN-LAST:event_btnTimActionPerformed

    private void jTableThuocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableThuocMouseClicked
        // TODO add your handling code here:
        int row = jTableThuoc.getSelectedRow();
        setSelectedRowThuoc(row);
        txtMaThuoc.setText(jTableThuoc.getValueAt(row, 0) + "");
        txtTenThuoc.setText(jTableThuoc.getValueAt(row, 1) + "");
        txtDonViTinh.setText(jTableThuoc.getValueAt(row, 2) + "");
        txtDonGia.setText(jTableThuoc.getValueAt(row, 3) + "");
        btnThemThuoc.setEnabled(false);
        txtMaThuoc.setEnabled(false);
        btnSuaThuoc.setEnabled(true);
        btnXoaThuoc.setEnabled(true);
    }//GEN-LAST:event_jTableThuocMouseClicked

    private void btnCkearThuocFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCkearThuocFrameActionPerformed
        // TODO add your handling code here:
        clearAllForThuoc();
    }//GEN-LAST:event_btnCkearThuocFrameActionPerformed

    private void jTableHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableHoaDonMouseClicked
        int row = jTableHoaDon.getSelectedRow();
        setSelectedRowHoaDon(row);
        txtMaHoaDon.setText(jTableHoaDon.getValueAt(row, 0) + "");
        txtNgay.setText(jTableHoaDon.getValueAt(row, 1) + "");
        txtThang.setText(jTableHoaDon.getValueAt(row, 2) + "");
        txtNam.setText(jTableHoaDon.getValueAt(row, 3) + "");
        txtHoaDonMaThuoc.setText(jTableHoaDon.getValueAt(row, 4) + "");
        txtHoaDonTenThuoc.setText(jTableHoaDon.getValueAt(row, 5) + "");
        txtMaHoaDon.setEnabled(false);
        txtHoaDonMaThuoc.setEnabled(false);
        txtHoaDonTenThuoc.setEnabled(false);
        
    }//GEN-LAST:event_jTableHoaDonMouseClicked

<<<<<<< HEAD
    private void btnXoaThuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaThuocActionPerformed
        // TODO add your handling code here:       
        int result = JOptionPane.showConfirmDialog(null, "Bạn muốn xóa thuốc được chọn?", "Xác nhận Xóa" , JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(result == 0){
            arrThuoc.remove(selectedRowThuoc);
        ReadWriteFile.ghiThuocVaoFile("thuoc.txt", arrThuoc);
        hienThiListThuoc();
        clearAllForThuoc();
        JOptionPane.showMessageDialog(null,"Xóa thuốc thành công!!!");
        }
    }//GEN-LAST:event_btnXoaThuocActionPerformed

    private void btnSuaThuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaThuocActionPerformed
        // TODO add your handling code here:
        
        int result = JOptionPane.showConfirmDialog(null, "Bạn muốn sửa thuốc được chọn?", "Xác nhận Sửa" , JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(result == 0){
            arrThuoc.get(selectedRowThuoc).setMaThuoc(txtMaThuoc.getText());
        arrThuoc.get(selectedRowThuoc).setTenThuoc(txtTenThuoc.getText());
        arrThuoc.get(selectedRowThuoc).setDonViTinh(txtDonViTinh.getText());
        arrThuoc.get(selectedRowThuoc).setDonGia(Double.parseDouble(txtDonGia.getText()));
        ReadWriteFile.ghiThuocVaoFile("thuoc.txt", arrThuoc);
        hienThiListThuoc();
        JOptionPane.showMessageDialog(null,"Sửa thuốc thành công!!!");
        }
    }//GEN-LAST:event_btnSuaThuocActionPerformed

    private void btnThemThuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemThuocActionPerformed
        // TODO add your handling code here:
        if(!"".equals(txtMaThuoc.getText()) && !"".equals(txtTenThuoc.getText())){
            DefaultTableModel model = (DefaultTableModel) jTableThuoc.getModel();
            String [] data = new String [4];
            data [0] = txtMaThuoc.getText();
            data [1] = txtTenThuoc.getText();
            data [2] = txtDonViTinh.getText();
            data [3] = txtDonGia.getText();
            arrThuoc.add(new Thuoc (txtMaThuoc.getText(),txtTenThuoc.getText(),txtDonViTinh.getText(),Double.parseDouble(txtDonGia.getText())));
            model.addRow(data);
            jTableThuoc.setModel(model);
            hienThiListThuoc();
            clearAllForThuoc();
            ReadWriteFile.ghiThuocVaoFile("thuoc.txt", arrThuoc);
            JOptionPane.showMessageDialog(null,"Thêm thuốc thành công!!!");
        }else JOptionPane.showMessageDialog(null,"Mã thuốc hoặc tên thuốc đang trống!!! Không thể thêm thuốc!!!");
    }//GEN-LAST:event_btnThemThuocActionPerformed

    private void txtMaThuocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaThuocFocusLost
        // TODO add your handling code here:
        for(Thuoc t : arrThuoc){
            if(txtMaThuoc.getText().equals(t.getMaThuoc())){
                JOptionPane.showMessageDialog(null,"Mã thuốc đã được sử dụng!!!");
                txtMaThuoc.setText("");
                txtMaThuoc.requestFocus();
                break;
            }
        }
    }//GEN-LAST:event_txtMaThuocFocusLost

    private void txtTenThuocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenThuocFocusLost
        // TODO add your handling code here:
        for(Thuoc t : arrThuoc){
            if(txtTenThuoc.getText().equals(t.getTenThuoc())){
                JOptionPane.showMessageDialog(null,"Tên thuốc đã được sử dụng!!!");
                txtTenThuoc.setText("");
                txtTenThuoc.requestFocus();
                break;
            }
        }
    }//GEN-LAST:event_txtTenThuocFocusLost

    private void btnTimThuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimThuocActionPerformed
        // TODO add your handling code here:
        boolean flag = false;
        if(cboTimThuoc.getSelectedItem().equals("Mã Thuốc")){
            for(Thuoc t : arrThuoc){
                if(txtGiaTriTimThuoc.getText().equals(t.getMaThuoc())){
                    btnThemThuoc.setEnabled(false);
                    txtMaThuoc.setEnabled(false);
                    btnSuaThuoc.setEnabled(true);
                    btnXoaThuoc.setEnabled(true);
                    txtMaThuoc.setText(t.getMaThuoc());
                    txtTenThuoc.setText(t.getTenThuoc());
                    txtDonViTinh.setText(t.getDonViTinh());
                    txtDonGia.setText(t.getDonGia() + "");
                    flag = true;
                    break;
                }
            }
        }else if (cboTimThuoc.getSelectedItem().equals("Tên Thuốc")){
            for(Thuoc t : arrThuoc){
                if(txtGiaTriTimThuoc.getText().equals(t.getTenThuoc())){
                    btnThemThuoc.setEnabled(false);
                    txtMaThuoc.setEnabled(false);
                    btnSuaThuoc.setEnabled(true);
                    btnXoaThuoc.setEnabled(true);
                    txtMaThuoc.setText(t.getMaThuoc());
                    txtTenThuoc.setText(t.getTenThuoc());
                    txtDonViTinh.setText(t.getDonViTinh());
                    txtDonGia.setText(t.getDonGia() + "");
                    flag = true;
                    break;
                }
            }
        }
        if(!flag){
            JOptionPane.showMessageDialog(null,"Không tìm thấy thuốc!!!");
        }
    }//GEN-LAST:event_btnTimThuocActionPerformed

    private void btnSapXepThuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepThuocActionPerformed
        // TODO add your handling code here:
        if(cboSapXepThuoc.getSelectedItem().equals("Mã Thuốc")){
            Collections.sort(arrThuoc, new Comparator<Thuoc>(){
                @Override
                public int compare(Thuoc t1, Thuoc t2) {
                    return t1.getMaThuoc().compareTo(t2.getMaThuoc());
                }
            });
        }else if(cboSapXepThuoc.getSelectedItem().equals("Tên Thuốc")){
            Collections.sort(arrThuoc, new Comparator<Thuoc>(){
                @Override
                public int compare(Thuoc t1, Thuoc t2) {
                    return t1.getTenThuoc().compareTo(t2.getTenThuoc());
                }
            });
        }else if(cboSapXepThuoc.getSelectedItem().equals("Đơn Vị Tính")){
            Collections.sort(arrThuoc, new Comparator<Thuoc>(){
                @Override
                public int compare(Thuoc t1, Thuoc t2) {
                    return t1.getDonViTinh().compareTo(t2.getDonViTinh());
                }
            });
        }else if(cboSapXepThuoc.getSelectedItem().equals("Đơn Giá")){
            Collections.sort(arrThuoc, new Comparator<Thuoc>(){
                @Override
                public int compare(Thuoc t1, Thuoc t2) {
                    return Double.compare(t1.getDonGia(), t2.getDonGia());
                }
            });
        }
        hienThiListThuoc();
    }//GEN-LAST:event_btnSapXepThuocActionPerformed

    private void btnCapNhatTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatTTActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(null, "Bạn muốn cập nhập lại thông tin?", "Xác nhận cập nhật" , JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(result == 0 && txtPasswordCN.getText() != ""){
            arrUser.get(index).setUserpass(txtPasswordCN.getText());
            arrNhanVien.get(indexThongTinCN).setHoTen(txtHoTenCN.getText());
            arrNhanVien.get(indexThongTinCN).setDiaChi(txtDIaChiCN.getText());
            arrNhanVien.get(indexThongTinCN).setSoDT(txtSDTCN.getText());
            Date ngaySinh = new Date(Integer.parseInt(txtNgaySinhCN.getText()),Integer.parseInt(txtThangSinhCN.getText()),Integer.parseInt(txtNamSinhCN.getText()));
            arrNhanVien.get(indexThongTinCN).setNgaySinh(ngaySinh);
            JOptionPane.showMessageDialog(null,"Cập nhật thông tin thành công!!!");
            ReadWriteFile.ghiNhanVienVaoFile("nhanvien.txt", arrNhanVien);
            hienThiListUser();
        }
    }//GEN-LAST:event_btnCapNhatTTActionPerformed
=======
    private void btnThemHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemHoaDonActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) jTableHoaDon.getModel();
                String [] data = new String[6];
                data [0] = txtMaHoaDon.getText();
                data [1] = txtNgay.getText();
                data [2] = txtThang.getText();
                data [3] = txtNam.getText();
                data [4] = txtHoaDonMaThuoc.getText();
                data [5] = txtHoaDonTenThuoc.getText() + "";

                Date date = new Date(Integer.parseInt(txtNgay.getText()),
                        Integer.parseInt(txtThang.getText()),
                        Integer.parseInt(txtNam.getText()));

                Thuoc thuoc = new Thuoc(txtHoaDonMaThuoc.getText(),txtHoaDonTenThuoc.getText(),"",0.0);

                arrHoaDon.add( new HoaDon(txtMaHoaDon.getText(),date,thuoc));
                txtMaHoaDon.setText("");
                txtNgay.setText("");
                txtThang.setText("");
                txtNam.setText("");
                txtHoaDonMaThuoc.setText("");
                txtHoaDonTenThuoc.setText("");
                model.addRow(data);
            jTableHoaDon.setModel(model);
        }
        catch(Exception e)
        {
            e.getMessage();
        }
    }//GEN-LAST:event_btnThemHoaDonActionPerformed

    private void jTableHieuThuocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableHieuThuocMouseClicked
        int row = jTableHieuThuoc.getSelectedRow();
        setSelectedRowHieuThuoc(row);
        txtMaHieuThuoc.setText(jTableHieuThuoc.getValueAt(row, 0) + "");
        txtTenHieuThuoc.setText(jTableHieuThuoc.getValueAt(row, 1) + "");
        txtDiaChi.setText(jTableHieuThuoc.getValueAt(row, 2) + "");
        btnThemHieuThuoc.setEnabled(false);
        txtMaThuoc.setEnabled(false);
        btnSuaHieuThuoc.setEnabled(true);
        btnXoaHieuThuoc.setEnabled(true);
    }//GEN-LAST:event_jTableHieuThuocMouseClicked

    private void btnSapXepHieuThuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepHieuThuocActionPerformed
        // TODO add your handling code here:
        if(cboSapXepHieuThuoc.getSelectedItem().equals("Mã Hiệu Thuốc")){
            Collections.sort(arrHieuThuoc, new Comparator<HieuThuoc>(){
                @Override
                public int compare(HieuThuoc ht1, HieuThuoc ht2) {
                    return ht1.getMaHieuThuoc().compareTo(ht2.getMaHieuThuoc());
                }
            });
        }else if(cboSapXep.getSelectedItem().equals("Tên Hiệu Thuốc")){
            Collections.sort(arrHieuThuoc, new Comparator<HieuThuoc>(){
                @Override
                public int compare(HieuThuoc ht1, HieuThuoc ht2) {
                    return ht1.getTenHieuThuoc().compareTo(ht2.getTenHieuThuoc());
                }
            });
        }
        else if(cboSapXep.getSelectedItem().equals("Địa Chỉ")){
            Collections.sort(arrHieuThuoc, new Comparator<HieuThuoc>(){
                @Override
                public int compare(HieuThuoc ht1, HieuThuoc ht2) {
                    return ht1.getDiaChi().compareTo(ht2.getDiaChi());
                }
            });
        }
        hienThiListHieuThuoc();
    }//GEN-LAST:event_btnSapXepHieuThuocActionPerformed

    private void btnTimHieuThuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimHieuThuocActionPerformed
        boolean flag = false;
        for (HieuThuoc ht : arrHieuThuoc) {
            if(ht.getTenHieuThuoc().equals(txtTimHieuThuoc.getText())){
                txtMaHieuThuoc.setText(ht.getMaHieuThuoc());
                txtTenHieuThuoc.setText(ht.getTenHieuThuoc());
                txtDiaChi.setText(ht.getDiaChi());
                txtMaHieuThuoc.setEnabled(false);
                btnThemHieuThuoc.setEnabled(false);
                btnXoaHieuThuoc.setEnabled(true);
                btnSuaHieuThuoc.setEnabled(true);
                flag = true;
                break;
            }
        }
        if(!flag){
            JOptionPane.showMessageDialog(null,"Hiệu Thuốc không tồn tại!!!");
        }
    }//GEN-LAST:event_btnTimHieuThuocActionPerformed

    private void btnThemHieuThuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemHieuThuocActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTableHieuThuoc.getModel();
        String [] data = new String[3];
        data [0] = txtMaHieuThuoc.getText();
        data [1] = txtTenHieuThuoc.getText();
        data [2] = txtDiaChi.getText();
        arrHieuThuoc.add( new HieuThuoc(txtMaHieuThuoc.getText(),txtTenHieuThuoc.getText(),txtDiaChi.getText()));
        txtMaHieuThuoc.setText("");
        txtTenHieuThuoc.setText("");
        txtDiaChi.setText("");
        model.addRow(data);
        jTableUser.setModel(model);
    }//GEN-LAST:event_btnThemHieuThuocActionPerformed

    private void btnSuaHieuThuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaHieuThuocActionPerformed
        arrHieuThuoc.get(selectedRowHieuThuoc).setMaHieuThuoc(txtMaHieuThuoc.getText());
        arrHieuThuoc.get(selectedRowHieuThuoc).setTenHieuThuoc(txtTenHieuThuoc.getText());
        arrHieuThuoc.get(selectedRowHieuThuoc).setDiaChi(txtDiaChi.getText());
        hienThiListHieuThuoc();
    }//GEN-LAST:event_btnSuaHieuThuocActionPerformed

    private void btnXoaHieuThuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaHieuThuocActionPerformed
        arrHieuThuoc.remove(getSelectedRowHieuThuoc());
        hienThiListHieuThuoc();
        clearAllForHieuThuoc();
    }//GEN-LAST:event_btnXoaHieuThuocActionPerformed

    private void btnClearHieuThuocFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearHieuThuocFrameActionPerformed
        clearAllForHieuThuoc();
    }//GEN-LAST:event_btnClearHieuThuocFrameActionPerformed

    private void txtMaHieuThuocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaHieuThuocFocusLost
            for(HieuThuoc ht : arrHieuThuoc){
            if(txtMaHieuThuoc.getText().equals(ht.getMaHieuThuoc())){
                JOptionPane.showMessageDialog(null,"Mã hiệu Thuốc đã được sử dụng!!!");
                txtMaHieuThuoc.setText("");
                txtMaHieuThuoc.requestFocus();
                break;
            }
        }
    }//GEN-LAST:event_txtMaHieuThuocFocusLost
>>>>>>> a5b34ce05276a293e1449f586d480346d51dbffb
    
    private void clearAllForThuoc(){
        btnThemThuoc.setEnabled(true);
        txtMaThuoc.setEnabled(true);
        btnSuaThuoc.setEnabled(false);
        btnXoaThuoc.setEnabled(false);
        txtMaThuoc.setText("");
        txtTenThuoc.setText("");
        txtDonViTinh.setText("");
        txtDonGia.setText("");
    }
    
    private void clearAllForUser(){
        txtUser.setEnabled(true);
        txtUser.setText("");
        txtPass.setText("");
        txtHoTenUser.setText("");
        txtDiaChiUser.setText("");
        txtSoDTUser.setText("");
        txtNgaySinhUser.setText("");
        txtThangSinhUser.setText("");
        txtNamSinhUser.setText("");
        cboType.setSelectedIndex(0);
        btnThem.setEnabled(true);
        btnXoa.setEnabled(false);
        btnSua.setEnabled(false);
    }
    
    private void clearAllForHieuThuoc(){
        btnThemHieuThuoc.setEnabled(true);
        txtMaHieuThuoc.setEnabled(true);
        btnSuaHieuThuoc.setEnabled(false);
        btnXoaHieuThuoc.setEnabled(false);
        txtMaHieuThuoc.setText("");
        txtTenHieuThuoc.setText("");
        txtDiaChi.setText("");
    }
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhatTT;
    private javax.swing.JButton btnCkearThuocFrame;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearHieuThuocFrame;
    private javax.swing.JButton btnClearHoaDon;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSapXep;
    private javax.swing.JButton btnSapXepHieuThuoc;
    private javax.swing.JButton btnSapXepThuoc;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnSuaHieuThuoc;
    private javax.swing.JButton btnSuaHoaDon;
    private javax.swing.JButton btnSuaThuoc;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThemHieuThuoc;
    private javax.swing.JButton btnThemHoaDon;
    private javax.swing.JButton btnThemThuoc;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnTimHieuThuoc;
    private javax.swing.JButton btnTimThuoc;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaHieuThuoc;
    private javax.swing.JButton btnXoaHoaDon;
    private javax.swing.JButton btnXoaThuoc;
    private javax.swing.JComboBox<String> cboSapXep;
    private javax.swing.JComboBox<String> cboSapXepHieuThuoc;
    private javax.swing.JComboBox<String> cboSapXepThuoc;
    private javax.swing.JComboBox<String> cboTimHieuThuoc;
    private javax.swing.JComboBox<String> cboTimThuoc;
    private javax.swing.JComboBox<String> cboType;
    private javax.swing.JComboBox<String> cboUsertypeCN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
<<<<<<< HEAD
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
=======
>>>>>>> a5b34ce05276a293e1449f586d480346d51dbffb
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTableHieuThuoc;
    private javax.swing.JTable jTableHoaDon;
    private javax.swing.JTable jTableThuoc;
    private javax.swing.JTable jTableUser;
    private javax.swing.JTabbedPane mainJTabbed;
    private javax.swing.JTextField txtCurrentUser;
<<<<<<< HEAD
    private javax.swing.JTextField txtDIaChiCN;
    private javax.swing.JTextField txtDiaChiUser;
=======
    private javax.swing.JTextField txtDiaChi;
>>>>>>> a5b34ce05276a293e1449f586d480346d51dbffb
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtDonViTinh;
    private javax.swing.JTextField txtGiaTriTim;
    private javax.swing.JTextField txtGiaTriTimThuoc;
    private javax.swing.JTextField txtHoTenCN;
    private javax.swing.JTextField txtHoTenUser;
    private javax.swing.JTextField txtHoaDonMaThuoc;
    private javax.swing.JTextField txtHoaDonTenThuoc;
    private javax.swing.JTextField txtMaHieuThuoc;
    private javax.swing.JTextField txtMaHoaDon;
    private javax.swing.JTextField txtMaThuoc;
    private javax.swing.JTextField txtNam;
    private javax.swing.JTextField txtNamSinhCN;
    private javax.swing.JTextField txtNamSinhUser;
    private javax.swing.JTextField txtNgay;
    private javax.swing.JTextField txtNgaySinhCN;
    private javax.swing.JTextField txtNgaySinhUser;
    private javax.swing.JTextField txtPass;
<<<<<<< HEAD
    private javax.swing.JPasswordField txtPasswordCN;
    private javax.swing.JTextField txtSDTCN;
    private javax.swing.JTextField txtSoDTUser;
    private javax.swing.JTextField txtTenThuoc;
    private javax.swing.JTextField txtThang;
    private javax.swing.JTextField txtThangSinhCN;
    private javax.swing.JTextField txtThangSinhUser;
=======
    private javax.swing.JTextField txtTenHieuThuoc;
    private javax.swing.JTextField txtTenThuoc;
    private javax.swing.JTextField txtThang;
    private javax.swing.JTextField txtTimHieuThuoc;
>>>>>>> a5b34ce05276a293e1449f586d480346d51dbffb
    private javax.swing.JTextField txtUser;
    private javax.swing.JTextField txtUsernameCN;
    // End of variables declaration//GEN-END:variables
}
