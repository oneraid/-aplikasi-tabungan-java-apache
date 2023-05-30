
package Transaction;
import java.sql.*;
import static Connection.Koneksi.*;
import java.sql.PreparedStatement;
import javax.swing.JLabel;


public class Deposit extends Transaksi{
    String id_setor;
    int dsaldo;
    
    public Deposit (String pIdsetor, String pNim, String pNama, Date pDate, int pDsaldo){
        super(pNim, pNama, pDate);
        this.id_setor = pIdsetor;
        this.dsaldo = pDsaldo;
    } 
    
    public static ResultSet getData(){
     try {
       String sql = "SELECT * FROM t_setor";
       ResultSet rs = stmt.executeQuery(sql);
       return rs;
     } catch (SQLException e) {
       System.out.println("Gagal get data: "+e.getMessage());
     }
     return null;
    }
    
    public static void InsertDeposit( Deposit object){
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
    
    public static void kodesetor(JLabel txkodetransaksi){
        try {
            String sql = "SELECT RIGHT(id_setor, 2) + 1 AS next_id FROM t_setor ORDER BY id_setor DESC LIMIT 1";
        ResultSet rs = stmt.executeQuery(sql);
        
        if (rs.next()) {
            int nextId = rs.getInt("next_id");
            String no = String.format("%03d", nextId);
            txkodetransaksi.setText("DT" + no);
        } else {
            txkodetransaksi.setText("DT001");
        }
        
        } catch (Exception e) 
        {
            System.out.println("Eror : "+e.getMessage());
        }
    }
    
    @Override
    public void displayTransaksi() {
        System.out.println("Detail transaksi:");
        System.out.println("ID Setor: " + id_setor);
        System.out.println("NIM: " + getNim());
        System.out.println("Nama: " + getNama());
        System.out.println("Tanggal: " + getDate());
        System.out.println("Dsaldo: " + dsaldo);
    }
    
    
}