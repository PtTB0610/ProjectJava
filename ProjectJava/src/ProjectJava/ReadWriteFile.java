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
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadWriteFile {
    //Lấy Danh Sách User
    public static ArrayList<User> layUserTuFile(String file){
        ArrayList<User> listUser = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            try {
                while((line = br.readLine()) != null){
                    String [] temp = line.split(":");
                    User user = new User();
                    user.setUsername(temp[0]);
                    user.setUserpass(temp[1]);
                    user.setUsertype(Integer.parseInt(temp[2]));
                    listUser.add(user);
                }
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(ReadWriteFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadWriteFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listUser;
    }
    //Ghi Danh Sach User
    public static void ghiUserVaoFile(String file, ArrayList<User> listUser){
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(file));
            int i = 1;
            for(User sach : listUser){
                if(i == listUser.size()){
                pw.print(sach.getUsername() + ":" + sach.getUserpass() + ":" + sach.getUsertype());
                }else pw.print(sach.getUsername() + ":" + sach.getUserpass() + ":" + sach.getUsertype() + "\n");
                i++;
            }
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadWriteFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Đọc Danh Sách Thuốc
    public static ArrayList<Thuoc> layThuocTuFile(String file){
        ArrayList<Thuoc> listThuoc = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            try {
                while((line = br.readLine()) != null){
                    String [] temp = line.split(":");
                    Thuoc thuoc = new Thuoc();
                    thuoc.setMaThuoc(temp[0]);
                    thuoc.setTenThuoc(temp[1]);
                    thuoc.setDonViTinh(temp[2]);
                    thuoc.setDonGia(Double.parseDouble(temp[3]));
                    listThuoc.add(thuoc);
                }
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(ReadWriteFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadWriteFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listThuoc;
    }
    //Ghi Danh Sách Thuốc
    public static void ghiThuocVaoFile(String file, ArrayList<Thuoc> listThuoc){
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(file));
            int i = 1;
            for(Thuoc thuoc : listThuoc){
                if(i == listThuoc.size()){
                pw.print(thuoc.getMaThuoc() + ":" + thuoc.getTenThuoc()+ ":" + thuoc.getDonViTinh() + ":" + thuoc.getDonGia());
                }else pw.print(thuoc.getMaThuoc() + ":" + thuoc.getTenThuoc()+ ":" + thuoc.getDonViTinh() + ":" + thuoc.getDonGia() + "\n");
                i++;
            }
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadWriteFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /*
    Author Cuong
    */
    //Doc Danh Sach Hoa Don
    public static ArrayList<HoaDon> layHoaDonTuFile(String file){
        ArrayList<HoaDon> listHoaDon = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            try {
                while((line = br.readLine()) != null){
                    String [] temp = line.split(":");
                    HoaDon hoaDon = new HoaDon();
                    Date ngayNhap = new Date();
                    Thuoc thuoc = new Thuoc();
                    
                    hoaDon.setMaHoaDon(temp[0]);
                    
                    ngayNhap.setNgay(Integer.parseInt(temp[1]));
                    ngayNhap.setThang(Integer.parseInt(temp[2]));
                    ngayNhap.setNam(Integer.parseInt(temp[3]));
                    
                    hoaDon.setNgayNhap(ngayNhap);
                    
                    thuoc.setMaThuoc(temp[4]);
                    thuoc.setTenThuoc(temp[5]);
                    
                    hoaDon.setThuoc(thuoc);
                    
                    listHoaDon.add(hoaDon);
                }
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(ReadWriteFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadWriteFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listHoaDon;
    }
    //Ghi Danh Sach Hoa Don
    public static void ghiHoaDonVaoFile(String file, ArrayList<HoaDon> listHoaDon){
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(file));
            int i = 1;
            for(HoaDon hoaDon : listHoaDon){
                if(i == listHoaDon.size()){
                pw.print(hoaDon.getMaHoaDon() + ":" + 
                        hoaDon.getNgayNhap().getNgay()+ ":" + hoaDon.getNgayNhap().getThang()+ ":" + hoaDon.getNgayNhap().getNam()+ ":"+
                        hoaDon.getThuoc().getMaThuoc() + ":" + hoaDon.getThuoc().getTenThuoc());
                }else pw.print(hoaDon.getMaHoaDon() + ":" + 
                        hoaDon.getNgayNhap().getNgay()+ ":" + hoaDon.getNgayNhap().getThang()+ ":" + hoaDon.getNgayNhap().getNam()+ ":"+
                        hoaDon.getThuoc().getMaThuoc() + ":" + hoaDon.getThuoc().getTenThuoc() + "\n");
                i++;
            }
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadWriteFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
