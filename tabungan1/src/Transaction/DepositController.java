
package Transaction;

import AJframe.JDeposit;
import java.sql.*;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ridhw
 */
public class DepositController {
    private Deposit model;
    private JDeposit view;
    String pIdsetor, pNim, pNama;
    Date pDate;
    int pDsaldo; 
    Deposit deposit = new Deposit(pIdsetor, pNim, pNama, pDate, pDsaldo);

    public DepositController(Deposit model, JDeposit view) {
        this.model = model;
        this.view = view;
    }
    
    public void show(){
        try {
            ResultSet result_data = deposit.getData();
            while (result_data.next()){
                Object[] obj = new Object[5];
                obj[0] = result_data.getString("id_setor");
                obj[1] = result_data.getString("nim");
                obj[2] = result_data.getString("nama");
                obj[3] = result_data.getString("tanggal");
                obj[4] = result_data.getString("dsaldo");
                view.table_deposit.addRow(obj);
            }
        } catch (Exception e) {
        }
    }
    
    public void insert(){
        model.setId_setor(view.pIdsetor);
        model.setNim(view.pNim);
        model.setNama(view.pNama);
        model.setDate(view.pDate);
        model.setDsaldo(view.pDsaldo);
        Deposit.InsertData(model);
    }
        
    public Deposit getModel() {
    return model;
    }
    
    public void code(JLabel kodeTransaksi){
        deposit.codetx(kodeTransaksi);
    }
    
    public void updatesaldo(String nim,int tsaldoBaru){
        model.updatesaldo(nim, tsaldoBaru);
    }
    
    public void dataview ( JTextField textFieldNim, JLabel labelNama, JLabel labelJurusan, JLabel labelJeniskelamin, JLabel saldo){
        model.tampildata(textFieldNim, labelNama, labelJurusan, labelJeniskelamin, saldo);
    }
}
