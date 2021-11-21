package Inheritence;

public class ViceManager extends Manager{
    /*
    memanggil constructor parrent dengan super()
     */
    ViceManager(String nama){
        super(nama);
    }

    //Method overriding, berbeda dengan overloading.
    //Method overriding yaitu mendeklarasikan ulang method yang ada di class induk
    //Efeknya adalah ketika kita memanggil methodnya, maka yang tampil adalah method yang ada di class child
    //contoh ketika Inheritence.ViceManager.sayHello. Maka yang akan keluar adalah output method yang ada di bawah ini,
    //Method yang ada di class induk otomatis tidak terbaca dan tidak di anggap, karena sudah di deklarasikan ulang
    void sayHello(String name){
        System.out.println("Hallo " + name + "My Name Is " + this.name + " Im Is Vice Manager");
    }
    //tapi kita bisa mengakses field/method yang ada di class induk dengan keyword super
    //contoh
    String jabatan(){
        return  "Wakil manager";
    }
    //Ini adalah memanggil method jabatan yang ada di kelas parrent, bukan yang ada di kelas child
    String getParrentJabatan(){
        return super.jabatan();
    }
    String getNamaManager(){
        return super.name;
    }
}
