/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import static Connection.Koneksi.*;
import java.sql.*;

/**
 *
 * @author ridhw
 */
public class SignUp {
    String nama;
    String username;
    String password;
    
    public SignUp(String pNama, String pUsername, String pPassword){
        this.nama = pNama;
        this.username = pUsername;
        this.password = pPassword;
    }
    
    
    public static void DaftarAcc(SignUp object) {
        try {
        String sql = "INSERT INTO user(username, name, password) VALUES (?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, object.username);
        stmt.setString(2, object.nama);
        stmt.setString(3, object.password);
        stmt.executeUpdate();
        System.out.println("Sukses update data");
        } catch (Exception e) {
        System.out.println("Erorr "+e.getMessage());
    }
    }
    
    
}
