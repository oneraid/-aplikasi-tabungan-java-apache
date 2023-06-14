
package CollegeStudent;

import AJframe.JMahasiswa;
import java.sql.*;

/**
 *
 * @author ridhw
 */
public class MahasiswaController {
    private Mahasiswa model;
    private JMahasiswa view;
    private String selected;
    String pNim, pNama, pJenisKelamin, pJurusan, pStatus;
    int pTSaldo;
    
    Mahasiswa mahasiswa = new Mahasiswa(pNim, pNama, pJenisKelamin, pJurusan, pTSaldo, pStatus);

    public MahasiswaController(Mahasiswa model, JMahasiswa view) {
        this.model = model;
        this.view = view;
    }
    
    
    public void show(){
        try {
            ResultSet result_data = mahasiswa.getData();
            while (result_data.next()){
                Object[] obj = new Object[6];
                obj[0] = result_data.getString("nim");
                obj[1] = result_data.getString("nama");
                obj[2] = result_data.getString("jenis_kelamin");
                obj[3] = result_data.getString("jurusan");
                obj[4] = result_data.getString("tsaldo");
                obj[5] = result_data.getString("status");
                view.table_mahasiswa.addRow(obj);
            }
            
        } catch (Exception e) {
        }
        
    }
    
    public void insert(){
        model.setNim(view.pNim);
        model.setNama(view.pNama);
        model.setJenis_kelamin(view.pJenisKelamin);
        model.setJurusan(view.pJurusan);
        model.setTsaldo(view.pTSaldo);
        model.setStatus(view.pStatus);
        mahasiswa.insertData(model);
    }
    
    public void update(){
        selected = view.selected_nim;
        mahasiswa.Data(selected);
        
        model.setNim(view.pNim);
        model.setNama(view.pNama);
        model.setJenis_kelamin(view.pJenisKelamin);
        model.setJurusan(view.pJurusan);
        model.setTsaldo(view.pTSaldo);
        model.setStatus(view.pStatus);
        mahasiswa.updateData(selected,model);
    }
    
    public void delete(){
        selected = view.selected_nim;
        mahasiswa.Data(selected);
        mahasiswa.deleteData(selected);
    }
    
    
}
