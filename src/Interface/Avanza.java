package Interface;
//Child pada interface tidak menggunakan extends, tapi menggunakan interface
/*
Avanza sudah mengimplements interface car, sedangkan car mengekstend unterface Brand. Otomatis class Avanza
juga harus mengimplents method yang ada di interface brand
 */
public class Avanza implements Car, IsMaintenance {
    private String name;
    private int jumlahBan;

    /*Method yang ada pada interface car wajib di override/dideklarasikan ulang/di implementasi pada class
    yang menjadi anak
     */
    public void setName(String nama){
        this.name = nama;
    }
    public void setJumlahBan(int jumlahBan){
        this.jumlahBan = jumlahBan;
    }
    public void drive(){
        System.out.println("Mengemudi " + this.name);

    }
    public int getJumlahBan(){
        return jumlahBan;
    }
    public String getBrand(){
        return "Toyota";
    }
    public boolean isMaintenance(){
        return false;
    }
}
