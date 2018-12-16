/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectJava;

/**
 *
 * @author phatt
 */
public class NhanVien {
    private String userName;
    private String hoTen;
    private String diaChi;
    private String soDT;
    private Date ngaySinh;

    public NhanVien() {
    }
  
    public NhanVien(String username, String hoTen, String diaChi, String soDT, Date ngaySinh) {
        this.userName = username;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDT = soDT;
        this.ngaySinh = ngaySinh;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
}
