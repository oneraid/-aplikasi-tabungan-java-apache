
package Transaction;
import java.sql.*;
import static Connection.Koneksi.*;
import java.sql.PreparedStatement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ridhw
 */
public class Deposit extends Transaksi{
    String id_setor;
    int dsaldo;
    
    public Deposit (String pIdsetor, String pNim, String pNama, Date pDate, int pDsaldo){
        super(pNim, pNama, pDate);
        this.id_setor = pIdsetor;
        this.dsaldo = pDsaldo;
    } 


    public String getId_setor() {
        return id_setor;
    }

    public void setId_setor(String id_setor) {
        this.id_setor = id_setor;
    }

    public int getDsaldo() {
        return dsaldo;
    }

    public void setDsaldo(int dsaldo) {
        this.dsaldo = dsaldo;
    }
    
    

    public ResultSet getData(){
        try {
            String sql = "SELECT * FROM t_setor";
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
        } catch (SQLException e) {
            System.out.println("Gagal get data: "+e.getMessage());
        }
        return null;
    }
    
    
    public static void InsertData( Deposit object){
    try {
        String sql = "INSERT INTO t_setor (id_setor, nim, nama, tanggal, dsaldo) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, object.id_setor);
        stmt.setString(2, object.getNim());
        stmt.setString(3, object.getNama());
        stmt.setDate(4, object.getDate());
        stmt.setInt(5, object.dsaldo);
        stmt.executeUpdate();
        System.out.println("Sukses update data");
    } catch (SQLException e) {
        System.out.println("Eror Insert data: "+e.getMessage());
    }
    }
    

    @Override
    public void codetx(JLabel kodeTransaksi){
        try {
            String sql = "SELECT RIGHT(id_setor, 2) + 1 AS next_id FROM t_setor ORDER BY id_setor DESC LIMIT 1";
        ResultSet rs = stmt.executeQuery(sql);
        
        if (rs.next()) {
            int nextId = rs.getInt("next_id");
            String no = String.format("%03d", nextId);
            kodeTransaksi.setText("DT" + no);
        } else {
            kodeTransaksi.setText("DT001");
        }
        
        } catch (Exception e) 
        {
            System.out.println("Eror : "+e.getMessage());
        }
    }
    
    
    @Override
    public void tampildata( JTextField textFieldNim, JLabel labelNama, JLabel labelJurusan, JLabel labelJeniskelamin, JLabel saldo){
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
    
    
    @Override
    public void updatesaldo(String nim, int tsaldoBaru) {
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
}
