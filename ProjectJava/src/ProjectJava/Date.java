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
public class Date {
    private int ngay;
    private int thang;
    private int nam;
    
    public Date() {
        this.ngay = 0;
        this.thang = 0;
        this.nam = 0;
    }
    
    public Date(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    
    public void setNgay(int ngay) {
        this.ngay = ngay;
    }
    
    public int getNgay() {
        return this.ngay;
    }
    
    public void setThang(int thang) {
        this.ngay = thang;
    }
    
    public int getThang() {
        return this.thang;
    }
    
    public void setNam(int nam) {
        this.ngay = nam;
    }
    
    public int getNam() {
        return this.nam;
    }
    public String toString(){
        return this.ngay + "/" + this.thang + "/" + this.nam;
    }
}
