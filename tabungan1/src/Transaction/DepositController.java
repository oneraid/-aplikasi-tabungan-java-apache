
package Transaction;

import AJframe.JDeposit;
import java.sql.*;
import javax.swing.JLabel;

/**
 *
 * @author ridhw
 */
public class DepositController {
    private Deposit model;
    private JDeposit view;

    public DepositController(Deposit model, JDeposit view) {
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
        Deposit.InsertDeposit(model);
    }
        
    public Deposit getModel() {
    return model;
    }
    
    public void idtr(JLabel kodeTransaksi){
        Deposit.kodesetor(kodeTransaksi);
    }
    
    public void updatesaldo(String nim,int tsaldoBaru){
        model.updateDsaldoMahasiswa(nim, tsaldoBaru);
    }
    
}
