package RecordClass;

/*
Dalam pembuatan Record class, field tidak di buat dalam class { } seperti biasa. namun ini dibuat dalam () setelah nama
classnya. Jadi String username dan String password itu adalah sebuah field dari record class LoginRequest sekaligus
adalah sebuah constructor, jadi ketika kita menginstansiasi Record class LoginRequest, kita harus memasukan
constructor username dan password, jiak tidak error
 */
public record LoginRequest(String username, String password) {
    /*
    Seperti yang kita tahu, constructor akan ditambahkan otomatis di atas. Jika kita ingin membuat constructor tambahan,
    kita tidak bisa melakukan seperti ini :
    public LoginRequest(){
    }

    akan tetapi tanda() nya di hapus, jadinya seperti dibawah ini :
     */
    public LoginRequest{
        System.out.println("Constructor LoginRequest");
    }

    /*
    Jika kita ingin membuat constructor overloading, kita bisa membuatnya, namun syaratnya kita harus memanggil
    constructor utama dengan keyword this()
     */
    //Jika hal tersebut tidak di lakukan, maka otomatis kan error
    //Constructor 2
    public LoginRequest(String username){
        this(username,"");
    }

    public LoginRequest(){
        this("");
    }
    //Untuk emengakses field kita bisa langsung nama field seperti username, dan juga bisa menggunakan this
    void sayHello(){
        System.out.println("username: " + username + "password :" + this.password);
    }
    //Kita tidak bisa melakukan setter, karena defaultnya fieldnya sudah di set final, jika kita mencoba maka error
    /*
    void setUsername(String uname){
        username = uname;
    }
     */
}
