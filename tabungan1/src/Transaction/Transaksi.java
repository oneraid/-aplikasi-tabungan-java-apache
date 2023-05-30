
package Transaction;

import java.sql.Date;
import java.sql.*;
import static Connection.Koneksi.*;

public abstract class Transaksi {
    private String nim;
    private String nama;
    private Date date;
    
    public Transaksi(String pNim,String pNama,Date pDate){
        this.nim = pNim;
        this.nama = pNama;
        this.date = pDate;
    }
    
    public abstract void displayTransaksi();
    
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    } 
            
}
