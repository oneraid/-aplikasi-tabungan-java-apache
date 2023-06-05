
package CollegeStudent;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ridhw
 */
public abstract class Student {
    private String nim;
    private String nama;
    private String jenis_kelamin;
    private String jurusan;
    
    public Student (){

    }

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

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    
    public abstract void insertData(Mahasiswa object);
    public abstract void updateData(String selected_nim, Mahasiswa object);
    public abstract void deleteData(String selected_nim);
 
}
