package VariableHiding;

public class Child extends Parrent {
    /*Ketika variable di kelas child di definisikan ulang, maka akan terjadi variable hiding. yaitu tertutupnya
    variable yang ada pada kelas parrent. jadi kalau misal di akses child.name maka yang akan keluar ini
    variable yang ada di kelas child, dan variable name yang ada di kelas parrent tertutup (hiding)
     */
    String name;
    /*
    beda dengan method, dalam method ada yang namanya method overriding. kalau dalam variable tidak ada.
    jadi sebenarnya jika ada nama variable yang sama dengan kelas parrent pada kelas child, hakikatnya
    ia adalah variable yang sama sekali tidak ada hubungannya.
     */
    void doIt(){
        System.out.println("Doit from child");
    }
    /*
    untuk mengakses varable name pada class parrent cukup dengan keyword super
     */
}
