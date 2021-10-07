package Enkapsulasi;

public class Category {
    /*
    Semua atribut pada enkapsulasi diset private, agar tidak bisa di akses oleh class lain
     */
    /*
    Dalam ide ada auto generate getter setter, yaitu masuk pada menu code->generate->getter setter
     */
    private String id;
    private boolean electronic;

    /*
    Sedangkan method getter dan setter di set public agar bisa di akses oleh semua class
     */
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        //validasi, agar hanya bisa memasukan ketika null. Supaya ketika data sudah ada, tidak bisa di set
        if (this.id == null) {
            this.id = id;
        }
    }
    public boolean isElectronic(){
        return this.electronic;
    }
    public void setElectronic(boolean electronic){
        if (this.id !=null) {
            this.electronic = electronic;
        }
    }
}
