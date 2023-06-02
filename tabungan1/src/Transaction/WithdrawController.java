
package Transaction;

import AJframe.Jwithdraw;
import java.sql.*;
import javax.swing.JLabel;

/**
 *
 * @author ridhw
 */
public class WithdrawController {
    private Withdraw model;
    private AJframe.Jwithdraw view;

    public WithdrawController(Withdraw model, Jwithdraw view) {
        this.model = model;
        this.view = view;
    }
    
    public void show(){
         try {
            ResultSet result_data = Deposit.getData();
            while (result_data.next()){
                Object[] obj = new Object[5];
                obj[0] = result_data.getString("id_setor");
                obj[1] = result_data.getString("nim");
                obj[2] = result_data.getString("nama");
                obj[3] = result_data.getString("tanggal");
                obj[4] = result_data.getString("wsaldo");
                view.table_withdraw.addRow(obj);
            }
        } catch (Exception e) {
        }
    }
    
    public void insert(){
        model.setId_tarik(view.pIdTarik);
        model.setNim(view.pNim);
        model.setNama(view.pNama);
        model.setDate(view.pDate);
        model.setWsaldo(view.pWSaldo);
        Withdraw.InsertWithdraw(model);
    }
        
    public Withdraw getModel() {
    return model;
    }
    
    public void idtr(JLabel kodeTransaksi){
        Withdraw.kodetarik(kodeTransaksi);
    }
    
    public void updatesaldo(String nim,int wsaldoBaru){
        model.updateWsaldoMahasiswa(nim, wsaldoBaru);
    }
    
    
    
}
