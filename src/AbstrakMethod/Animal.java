package AbstrakMethod;

public abstract class Animal {
    public String nama;
    /*
    Abstract method tidak boleh di deklarasikan dengan { }. jika di deklarasikan akan error
    public abstract void run(){

    } //Error

    method abstract harus public, karena akan di deklarasikan ulang
     */
    public abstract void run();

}
