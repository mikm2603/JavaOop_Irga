package Polymorphisme;

public class Employee {
    String nama;
    Employee(String nama){
        this.nama = nama;
    }
    void sayHello(String nama){
        System.out.println("Hai " + nama + " saya " + this.nama + " sebagai Employee");
    }
}
