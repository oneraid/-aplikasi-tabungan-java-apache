
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
    private String selected_nim;

    public MahasiswaController(Mahasiswa model, JMahasiswa view) {
        this.model = model;
        this.view = view;
    }
    
    
    public void show(){
        try {
            ResultSet result_data = Mahasiswa.getData();
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
        Mahasiswa.insertData(model);
    }
    
    public void update(){
        selected_nim = view.selected_nim;
        Mahasiswa.Data(selected_nim);
        
        model.setNim(view.pNim);
        model.setNama(view.pNama);
        model.setJenis_kelamin(view.pJenisKelamin);
        model.setJurusan(view.pJurusan);
        model.setTsaldo(view.pTSaldo);
        model.setStatus(view.pStatus);
        Mahasiswa.updateData(selected_nim,model);
    }
    
    public void delete(){
        selected_nim = view.selected_nim;
        Mahasiswa.Data(selected_nim);
        Mahasiswa.deleteData(selected_nim);
    }
    
    public void updatesaldo(){
        
        model.setNim(selected_nim);
    }
    
}
