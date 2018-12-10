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
public class User {
    private String username;
    private String userpass;
    private int usertype;

    public User(String username, String userpass, int usertype) {
        this.username = username;
        this.userpass = userpass;
        this.usertype = usertype;
    }
    
    public User() {
        this.username = "";
        this.userpass = "";
        this.usertype = 0;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    public int getUsertype() {
        return usertype;
    }

    public void setUsertype(int usertype) {
        this.usertype = usertype;
    }
    
}
