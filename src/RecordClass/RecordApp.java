package RecordClass;

public class RecordApp {
    public static void main(String[] args) {
        /*
        Kita harus memasukan username dan password, karena sudah otomatis membuat constructor
         */
        LoginRequest loginRequest = new LoginRequest("mikmganz","rahasia");
        LoginRequest loginRequest2 = new LoginRequest();
        /*
        untuk method getter, kita tidak perlu membuat nya, karena otomatis sudah ada seperti yang sudah tertulis di
        keterangan. Namun memanggilnya bukan getUsername, akan tetapi langsung nama field nya yaitu username.
        Seperti contoh di bawah ini :
         */
        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        /*
        Record class juga sudah di lengkapi method toSting yang sudah di modif, jadi ketika kita memanggil objetnya
        maka otomatis akan dipanggil NamaClass[field1,field2]
        Seperti contoh di bawah ini
         */
        System.out.println(loginRequest);

    }
}
