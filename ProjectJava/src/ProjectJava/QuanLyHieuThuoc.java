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
public class QuanLyHieuThuoc {
    private ArrayList<HieuThuoc> listHieuThuoc;
    private int index;
    
    public QuanLyHieuThuoc() {
        this.listHieuThuoc = new ArrayList<HieuThuoc>();
        this.listHieuThuoc = ReadWriteFile.layHieuThuocTuFile("hieuthuoc.txt");
        this.index = 0;
    }
    
    public ArrayList<HieuThuoc> getListHieuThuoc() {
        return this.listHieuThuoc;
    }

    public void setListSach(ArrayList<HieuThuoc> listHieuThuoc) {
        this.listHieuThuoc = listHieuThuoc;
    }
    
    public int getIndex() {
        return this.index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    public HieuThuoc getHieuThuocHienTai() {
        return this.listHieuThuoc.get(index);
    }
    
    public void themHieuThuoc(HieuThuoc ht) {
        this.listHieuThuoc.add(ht);
        ReadWriteFile.ghiHieuThuocVaoFile("hieuthuoc.txt", listHieuThuoc);
    }
    
    public void next(){
        if(index == this.listHieuThuoc.size() -1){
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
    
    public void xoaHieuThuoc(){
        this.listHieuThuoc.remove(index);
        ReadWriteFile.ghiHieuThuocVaoFile("hieuthuoc.txt", listHieuThuoc);
    }
}
