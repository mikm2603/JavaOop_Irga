package AbstrakMethod;
//Class child dari animal jika tidak mendeklarasikan ulang(override) method run makan akan error
/*
Jika tidak ingin mendeklarasikan ulang, maka class child juga harus menjadi abstract juga
 */
public class Cat extends Animal{
    //Method override nya harus menggunakan public
    public void run(){
        System.out.println("Cat " + nama + " is running");
    }
}
