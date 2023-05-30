/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;
import Connection.KoneksiError;
import java.sql.*;
/**
 *
 * @author ridhw
 */
public class Koneksi {
    public static Connection conn;
    public static Statement stmt;
    public static ResultSet rst;
    public static PreparedStatement pst;
            
            
    static String database =  "tabunganmahasiswa";
    static String port = "3306";
    static String url = "jdbc:mysql://localhost:" +port + "/" +database;
    static String user = "root";
    static String pass = "";
    
    public static void cekKoneksi(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,pass);
            stmt = conn.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            throw new KoneksiError("koneksi gagal ");
        }
    }
}
