
package Transaction;

import AJframe.Jwithdraw;
import java.sql.*;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ridhw
 */
public class WithdrawController {
    private Withdraw model;
    private AJframe.Jwithdraw view;
    String pIdtarik, pNim, pNama; 
    int pWsaldo;
    Date pDate;
    Withdraw withdraw = new Withdraw(pIdtarik, pNim, pNama, pDate, pWsaldo);

    public WithdrawController(Withdraw model, Jwithdraw view) {
        this.model = model;
        this.view = view;
    }
    
    public void show(){
         try {
            ResultSet result_data = withdraw.getData();
            while (result_data.next()){
                Object[] obj = new Object[5];
                obj[0] = result_data.getString("id_tarik");
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
        model.setId_tarik(view.pIdtarik);
        model.setNim(view.pNim);
        model.setNama(view.pNama);
        model.setDate(view.pDate);
        model.setWsaldo(view.pWsaldo);
        Withdraw.InsertData(model);
    }
        
    public Withdraw getModel() {
    return model;
    }
    
    public void code(JLabel kodeTransaksi){
        withdraw.codetx(kodeTransaksi);
    }
    
    public void updatesaldo(String nim,int wsaldoBaru){
        model.updatesaldo(nim, wsaldoBaru);
    }
    
    public void dataview ( JTextField textFieldNim, JLabel labelNama, JLabel labelJurusan, JLabel labelJeniskelamin, JLabel saldo){
        model.tampildata(textFieldNim, labelNama, labelJurusan, labelJeniskelamin, saldo);
    }
    
}
