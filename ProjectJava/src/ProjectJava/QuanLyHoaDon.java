/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectJava;

import java.util.ArrayList;

/**
 *
 * @author Cuong
 */
public class QuanLyHoaDon {
    private ArrayList<HoaDon> listHoaDon;
    private int index;
    
    public QuanLyHoaDon() {
        this.listHoaDon = new ArrayList<HoaDon>();
        this.listHoaDon = ReadWriteFile.layHoaDonTuFile("hoadon.txt");
        this.index = 0;
    }
    
    public ArrayList<HoaDon> getListHoaDon() {
        return this.listHoaDon;
    }

    public void setListSach(ArrayList<HoaDon> listHoaDon) {
        this.listHoaDon = listHoaDon;
    }
    
    public int getIndex() {
        return this.index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    public HoaDon getHoaDonHienTai() {
        return this.listHoaDon.get(index);
    }
    
    public void themHoaDon(HoaDon hd) {
        this.listHoaDon.add(hd);
        ReadWriteFile.ghiHoaDonVaoFile("hoadon.txt", listHoaDon);
    }
    
    public void next(){
        if(index == this.listHoaDon.size() -1){
            return;
        }
        index++;
    }
    
    public void prev(){
        if(index == 0){
            return;
        }
        index--;
    }
    
    public void xoaHoaDon(){
        this.listHoaDon.remove(index);
        ReadWriteFile.ghiHoaDonVaoFile("hoadon.txt", listHoaDon);
    }
}
