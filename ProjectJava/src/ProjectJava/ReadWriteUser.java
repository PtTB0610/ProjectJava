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

public class ReadWriteUser {
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
                Logger.getLogger(ReadWriteUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadWriteUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listUser;
    }
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
            Logger.getLogger(ReadWriteUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
