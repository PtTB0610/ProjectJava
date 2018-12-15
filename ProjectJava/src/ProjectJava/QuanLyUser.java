/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectJava;

import java.util.ArrayList;

/**
 *
 * @author phatt
 */
public class QuanLyUser {
    private ArrayList<User> listUser;
    private int index;
    
    public QuanLyUser() {
        this.listUser = new ArrayList<User>();
        this.listUser = ReadWriteFile.layUserTuFile("user.txt");
        this.index = 0;
    }

    public ArrayList<User> getListUser() {
        return listUser;
    }

    public void setListSach(ArrayList<User> listSach) {
        this.listUser = listUser;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    public User getSachHienTai(){
        return listUser.get(index);
    }
    
    public void addSach(User user){
        listUser.add(user);
        ReadWriteFile.ghiUserVaoFile("user.txt", listUser);
    }
    
    public void next(){
        if(index == listUser.size() -1){
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
    
    public void xoaSach(){
        listUser.remove(index);
        ReadWriteFile.ghiUserVaoFile("user.txt", listUser);
    }
}
