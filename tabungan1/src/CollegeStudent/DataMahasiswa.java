
package CollegeStudent;
import java.sql.*;
import static Connection.Koneksi.*;
import javax.swing.*;

/**
 *
 * @author ridhw
 */
public class DataMahasiswa {
    String nim;
    String nama;
    String jenis_kelamin;
    String jurusan;
    int tsaldo;
    String status;
        
    public DataMahasiswa(String pNim, String pNama, String pJenisKelamin, String pJurusan,int pTSaldo, String pStatus){
        this.nim = pNim;
        this.nama = pNama;
        this.jenis_kelamin = pJenisKelamin;
        this.jurusan = pJurusan;
        this.tsaldo = pTSaldo;
        this.status = pStatus;
    }
    
    public static ResultSet getData(){
     try {
       String sql = "SELECT * FROM mahasiswa";
       ResultSet rs = stmt.executeQuery(sql);
       return rs;
     } catch (SQLException e) {
       System.out.println("Gagal get data: "+e.getMessage());
     }
     return null;
    }

    
    public static void insertData(DataMahasiswa object){
    try {
        String sql = "INSERT INTO mahasiswa (nim, nama, jenis_kelamin, jurusan, tsaldo, status) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, object.nim);
        stmt.setString(2, object.nama);
        stmt.setString(3, object.jenis_kelamin);
        stmt.setString(4, object.jurusan);
        stmt.setInt(5, object.tsaldo);
        stmt.setString(6, object.status);
        stmt.executeUpdate();
        System.out.println("Sukses insert data");
    } catch (SQLException e) {
        System.out.println("Eror insert data: "+e.getMessage());
    }
    }
    
    public static void updateData(String selected_nim, DataMahasiswa object){
    try {
        String sql = "UPDATE mahasiswa SET nim = ?, nama = ?, jenis_kelamin = ?, jurusan = ?, tsaldo = ?, status = ? WHERE nim = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, object.nim);
        stmt.setString(2, object.nama);
        stmt.setString(3, object.jenis_kelamin);
        stmt.setString(4, object.jurusan);
        stmt.setInt(5, object.tsaldo);
        stmt.setString(6, object.status);
        stmt.setString(7, object.nim);
        stmt.executeUpdate();
        System.out.println("Sukses update data");
    } catch (SQLException e) {
        System.out.println("Eror update data: "+e.getMessage());
    }
    }
    
    
    public static void deleteData(String selected_nim){
    try {
        String sql = "DELETE FROM mahasiswa WHERE nim = '%s'";
        sql = String.format(sql, selected_nim);
        stmt.execute(sql);
        System.out.println("Sukses delete data");
    } catch (SQLException e) {
        System.out.println("Eror insert data: "+e.getMessage());
    }
    }
    
    public static void tampildata( JTextField textFieldNim, JLabel labelNama, JLabel labelJurusan, JLabel labelJeniskelamin, JLabel saldo){
        try {
            String query = "SELECT nama, jurusan, jenis_kelamin, tsaldo FROM mahasiswa WHERE nim = ?";
            pst = conn.prepareStatement(query);
            pst.setString(1, textFieldNim.getText());
            rst = pst.executeQuery();
            if (rst.next()) {
            labelNama.setText(rst.getString("nama"));
            labelJurusan.setText(rst.getString("jurusan"));
            labelJeniskelamin.setText(rst.getString("jenis_kelamin"));
            saldo.setText(rst.getString("tsaldo"));
            } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan ! ", "Message", JOptionPane.ERROR_MESSAGE);
            }
            System.out.println("Sukses menampilkan data");
        } catch (Exception e) {
            System.out.println("Erorr"+e.getMessage());
        }
        
    }
    
    public static void updateDsaldoMahasiswa(String nim, int tsaldoBaru) {
    try {
        String query = "UPDATE Mahasiswa SET tsaldo = tsaldo + ? WHERE nim = ?";
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


    
}
