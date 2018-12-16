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
public class HieuThuoc {
    private String maHieuThuoc;
    private String tenHieuThuoc;
    private String diaChi;

    public HieuThuoc() {
        this.maHieuThuoc = "";
        this.tenHieuThuoc = "";
        this.diaChi = "";
    }

    public HieuThuoc(String maHieuThuoc, String tenHieuThuoc, String diaChi) {
        this.maHieuThuoc = maHieuThuoc;
        this.tenHieuThuoc = tenHieuThuoc;
        this.diaChi = diaChi;
    }

    /**
     * @return the maHieuThuoc
     */
    public String getMaHieuThuoc() {
        return maHieuThuoc;
    }

    /**
     * @param maHieuThuoc the maHieuThuoc to set
     */
    public void setMaHieuThuoc(String maHieuThuoc) {
        this.maHieuThuoc = maHieuThuoc;
    }

    /**
     * @return the tenHieuThuoc
     */
    public String getTenHieuThuoc() {
        return tenHieuThuoc;
    }

    /**
     * @param tenHieuThuoc the tenHieuThuoc to set
     */
    public void setTenHieuThuoc(String tenHieuThuoc) {
        this.tenHieuThuoc = tenHieuThuoc;
    }

    /**
     * @return the diaChi
     */
    public String getDiaChi() {
        return diaChi;
    }

    /**
     * @param diaChi the diaChi to set
     */
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
  
}
