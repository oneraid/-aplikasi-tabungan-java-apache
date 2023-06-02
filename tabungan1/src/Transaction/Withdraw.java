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
    
    public Withdraw(){
    }

    public String getId_tarik() {
        return id_tarik;
    }

    public void setId_tarik(String id_tarik) {
        this.id_tarik = id_tarik;
    }

    public int getWsaldo() {
        return wsaldo;
    }

    public void setWsaldo(int wsaldo) {
        this.wsaldo = wsaldo;
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
    
    public static void updateWsaldoMahasiswa(String nim, int tsaldoBaru) {
    try {
        String query = "UPDATE Mahasiswa SET tsaldo = tsaldo - ? WHERE nim = ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, tsaldoBaru);
        stmt.setString(2, nim);
        stmt.executeUpdate();
        System.out.println("Tsaldo mahasiswa dengan NIM " + nim + " berhasil diupdate menjadi " + tsaldoBaru);
        } catch (SQLException e) {
            System.out.println("Gagal mengupdate tsaldo mahasiswa dengan NIM " + nim);
            e.printStackTrace();
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
