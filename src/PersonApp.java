public class PersonApp {
    public static void main(String[] args) {
        Person irga = new Person("Muhamad Irga Khoirul Mahfis","26 Maret 2004");
        //Peng aplikasian constructor, jika hanya memasukan 1 parameter, nama
        Person zahra = new Person("Zahra Yumna Fakhriyyah");
        zahra.tgllLahir = "1 September 2004";
        //Pengaplikasian constructor, jika tidak memasukan parameter sama sekali.
        //Jadi intinya bisa lebih fleksible
        Person sukir = new Person();
        sukir.nama = "Sukirman Wibowo";
        sukir.tgllLahir = "1 Agustus 2005";
        System.out.println("Data diri");
        System.out.println("Nama : " + irga.nama);
        System.out.println("Tanggal Lahir : " + irga.tgllLahir);
        System.out.println("Nama : " + zahra.nama);
        System.out.println("Tanggal Lahir : " + zahra.tgllLahir);
        System.out.println("Nama : " + sukir.nama);
        System.out.println("Tanggal Lahir : " + sukir.tgllLahir);
        irga.sayhay("Rudi");
    }
}
