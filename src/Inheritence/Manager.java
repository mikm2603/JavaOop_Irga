package Inheritence;

public class Manager {
    String name;
    /*membuat constructor, maka child class juga haru membuat constructor yang memanggil constructor milik
    parret class, dengan super().
    Namun jika cunstructor parrent tidak memiliki parameter, tidak perlu memanggil&membuat cunstructor di class
    child.
    Kalau class parrent membuat 2 constructor, minimal class child harus memanggil salah satu
     */
    Manager(String nama){
        this.name = nama;
    }
    void sayHello(String name){
        System.out.println("Hello " + name + " my name is " + this.name);
    }
    String jabatan(){
        return "Manager";
    }
}
