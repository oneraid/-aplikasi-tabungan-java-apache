/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transaction;
import java.sql.*;
import static Connection.Koneksi.*;
import java.sql.PreparedStatement;
import javax.swing.JLabel;


public class Withdraw extends Transaksi{
    String id_tarik;
    int wsaldo;
    
    public Withdraw(String pIdTarik, String pNim, String pNama,Date pDate,  int pWSaldo){
        super(pNim, pNama, pDate);
        this.id_tarik = pIdTarik;
        this.wsaldo = pWSaldo;
    }
    
    public static ResultSet getData(){
     try {
       String sql = "SELECT * FROM t_tarik";
       ResultSet rs = stmt.executeQuery(sql);
       return rs;
     } catch (SQLException e) {
       System.out.println("Gagal get data: "+e.getMessage());
     }
     return null;
    }
    
    public static void InsertWithdraw( Withdraw object){
    try {
        String sql = "INSERT INTO t_tarik (id_tarik, nim, nama, tanggal, wsaldo) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, object.id_tarik);
        stmt.setString(2, object.getNim());
        stmt.setString(3, object.getNama());
        stmt.setDate(4, object.getDate());
        stmt.setInt(5, object.wsaldo);
        stmt.executeUpdate();
        System.out.println("Sukses update data");
    } catch (SQLException e) {
        System.out.println("Error Insert data: "+e.getMessage());
    }
    }
    
    public static void kodetarik(JLabel txkodetransaksi){
        try {
            String sql = "SELECT RIGHT(id_tarik, 2) + 1 AS next_id FROM t_tarik ORDER BY id_tarik DESC LIMIT 1";
        ResultSet rs = stmt.executeQuery(sql);
        
        if (rs.next()) {
            int nextId = rs.getInt("next_id");
            String no = String.format("%03d", nextId);
            txkodetransaksi.setText("WT" + no);
        } else {
            txkodetransaksi.setText("WT001");
        }
        
        } catch (Exception e) 
        {
            System.out.println("Eror : "+e.getMessage());
        }
    }
    
    @Override
    public void displayTransaksi() {
        System.out.println("Detail transaksi:");
        System.out.println("ID Setor: " + id_tarik);
        System.out.println("NIM: " + getNim());
        System.out.println("Nama: " + getNama());
        System.out.println("Tanggal: " + getDate());
        System.out.println("Dsaldo: " + wsaldo);
    }
    
}
