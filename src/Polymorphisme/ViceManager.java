package Polymorphisme;

public class ViceManager extends Manager {
    ViceManager(String nama){
        super(nama);
    }
    void sayHello(String nama){
        System.out.println("Hai " + nama + " saya " + this.nama + " sebagai Vice Inheritence.Manager");
    }
}
