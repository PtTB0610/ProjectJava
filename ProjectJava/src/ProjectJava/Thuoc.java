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
public class Thuoc {
    private String maThuoc;
    private String tenThuoc;
    private String donViTinh;
    private double donGia;

    public Thuoc() {
        this.maThuoc = "";
        this.tenThuoc = "";
        this.donViTinh = "";
        this.donGia = 0;
    }

    public Thuoc(String maThuoc, String tenThuoc, String donViTinh, double donGia) {
        this.maThuoc = maThuoc;
        this.tenThuoc = tenThuoc;
        this.donViTinh = donViTinh;
        this.donGia = donGia;
    }

    public String getMaThuoc() {
        return maThuoc;
    }

    public void setMaThuoc(String maThuoc) {
        this.maThuoc = maThuoc;
    }

    public String getTenThuoc() {
        return tenThuoc;
    }

    public void setTenThuoc(String tenThuoc) {
        this.tenThuoc = tenThuoc;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
}
