/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;
import static Connection.Koneksi.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ridhw
 */
public class Login {
    String username;
    String password;
    
    public Login( String pUsername, String pPassword){
        this.username = pUsername;
        this.password = pPassword;
    }
    
    public static void LoginAcc(JTextField pusername, JTextField ppasword) {
        try {
            String query = "select * from user where username= ? and password = ? ";
            pst = conn.prepareStatement(query);
            pst.setString(1, pusername.getText());
            pst.setString(2, ppasword.getText());
            rst = pst.executeQuery();
            if (rst.next()) {
                new AJframe.JmainMenu().setVisible(true);
                SwingUtilities.getWindowAncestor(pusername).dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Username atau password salah!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
