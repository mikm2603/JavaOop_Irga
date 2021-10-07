package Polymorphisme;

public class Manager extends Employee {
    Manager(String nama){
        super(nama);
    }
    void sayHello(String nama){
        System.out.println("Hai " + nama + " saya " + this.nama + " sebagai Inheritence.Manager");
    }
}
