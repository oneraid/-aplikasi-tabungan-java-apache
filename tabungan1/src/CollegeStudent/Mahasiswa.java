
package CollegeStudent;
import java.sql.*;
import static Connection.Koneksi.*;
import javax.swing.*;

/**
 *
 * @author ridhw
 */
public class Mahasiswa extends Student{
    int tsaldo;
    String status;
        
//    public Mahasiswa(String pNim, String pNama, String pJenisKelamin, String pJurusan,int pTSaldo, String pStatus){
//        super(pNim,pNama,pJenisKelamin,pJurusan);
//        this.tsaldo = pTSaldo;
//        this.status = pStatus;
//    }
    
    public Mahasiswa(){
        
    }

    public int getTsaldo() {
        return tsaldo;
    }

    public void setTsaldo(int tsaldo) {
        this.tsaldo = tsaldo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    
    public static void insertData(Mahasiswa object){
    try {
        String sql = "INSERT INTO mahasiswa (nim, nama, jenis_kelamin, jurusan, tsaldo, status) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, object.getNim());
        stmt.setString(2, object.getNama());
        stmt.setString(3, object.getJenis_kelamin());
        stmt.setString(4, object.getJurusan());
        stmt.setInt(5, object.tsaldo);
        stmt.setString(6, object.status);
        stmt.executeUpdate();
        System.out.println("Success insert data");
    } catch (SQLException e) {
        System.out.println("Eror insert data: "+e.getMessage());
    }
    }
    
    public static ResultSet Data(String selected_nim){
        try{
            String sql = "SELECT * FROM mahasiswa WHERE nim = ? ";
            sql = String.format(sql, selected_nim);
            ResultSet rs = stmt.executeQuery(sql);
            if (!rs.next()){
                System.out.println("data not found");
                System.exit(0);
            }else{
                return rs;
            }
        }catch (SQLException e){
            System.out.println("Ereor : " + e.getMessage());
        }
        return null;
    }
    
    public static void updateData(String selected_nim, Mahasiswa object){
    try {
        String sql = "UPDATE mahasiswa SET nim = ?, nama = ?, jenis_kelamin = ?, jurusan = ?, tsaldo = ?, status = ? WHERE nim = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, object.getNim());
        stmt.setString(2, object.getNama());
        stmt.setString(3, object.getJenis_kelamin());
        stmt.setString(4, object.getJurusan());
        stmt.setInt(5, object.tsaldo);
        stmt.setString(6, object.status);
        stmt.setString(7, object.getNim());
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
    
    
    


    
}
