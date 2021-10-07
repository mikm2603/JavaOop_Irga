package EnumClass;

public class Customer {
    String nama;
    Level level;
    JenisKelamin jenisKelamin;


    public Level getLevel() {
        return level;
    }
    public void setLevel(Level level) {
        this.level = level;
    }


    public JenisKelamin getJenisKelamin() {
        return jenisKelamin;
    }
    public void setJenisKelamin(JenisKelamin jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }


    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
}
