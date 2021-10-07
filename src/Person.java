public class Person {
    String nama; //variable utama
    String tgllLahir; //variable utama
    //Constructor digunakan untuk langsung member nilai pada saat object di buat.
    //Contoh : Person Irga = new Person("nama","tanggallahir");
    Person(String nama, String tgllLahir){
        //Ketika menggunakan keyword this, maka yang dimaksud adalah variable utamanya, bukan variable method.
        //this digunakan untuk mengatasi variable shadowing, atau terjadinya penamaan yang sama terhadap 2 variable
        this.nama = nama;
        this.tgllLahir = tgllLahir;
    }
    /*Kita bisa membuat banyak constructor agar lebih fleksible, jadi jika ada user yang hanya memasukan nama pada
    saat pembuatan object, atau tidak memasukan parameter sama sekali, maka tidak akan terjadi error.
     */
    Person(String nama){
        //this() dimaksudkan untuk mengakses constructor yang ada di atasnya.
        //bisa juga dengan this.nama = nama;
        this(nama, null);
    }
    Person(){
        this(null);
    }
    void sayhay(String namaorang){
        System.out.println("Hai " + namaorang + ", namaku " + nama);
    }
}
