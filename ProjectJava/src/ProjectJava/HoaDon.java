/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectJava;

/**
 *
 * @author Cuong
 */
public class HoaDon {
    private String maHoaDon;
    private Date ngayNhap;
    private Thuoc thuoc;
    
    public HoaDon() {
        this.maHoaDon = "";
        this.ngayNhap = new Date(0,0,0);
        this.thuoc = new Thuoc("","","",0.0);
    }
    
    public HoaDon(String maHoaDon, Date ngayNhap, Thuoc thuoc) {
        this.maHoaDon = maHoaDon;
        this.ngayNhap = ngayNhap;
        this.thuoc = thuoc;
    }
    
    public void setMaHoaDon (String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }
    
    public String getMaHoaDon () {
        return this.maHoaDon;
    }
    
    public void setNgayNhap (Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }
    
    public Date getNgayNhap () {
        return this.ngayNhap;
    }  
    
    public void setThuoc (Thuoc thuoc) {
        this.thuoc = thuoc;
    }
    
    public Thuoc getThuoc () {
        return this.thuoc;
    }  
}
