package Polymorphisme;

public class EmployeApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Joko");
        employee.sayHello("Budi");

        /*employee tipenya tetap Employee, tapi karena di deklarasikan sebagai new Inheritence.Manager maka pada saat
        method sayHello di panggil, maka yang di panggil adalah method punya class Inheritence.Manager. Walaupun tipe datanya
       Employee.
       Karena arti dari polymorphisme sendiri adalah perubahan bentuk.
       Yaitu perubahan dari satu object yang satu ke object yang lain.
         */
        employee = new Manager("Rudi");
        employee.sayHello("Budi");

        employee = new ViceManager("Tadi");
        employee.sayHello("Budi");

        sayHello(new Manager("Irga"));
        sayHello(new ViceManager("Kunto"));
        sayHello(new Employee("aji"));
    }
    /* Method ini menggunakan parameter Employee, sehingga class Inheritence.Manager dan Inheritence.ViceManager bisa menggunakannya.
    Karena Employe adalah Class tertinggi yang di exteds oleh class Inheritence.Manager, dan Class manager di extends oleh
    Inheritence.ViceManager. Intinya kalau parameter nya class tertinggi, maka bisa di akses juga oleh class yang menjadi
    turunannya.
    Manfaatnya adalah kita tidak perlu membuat banyak method dengan banyak parameter class. cukup satu class
    yang ada di paling atas.
     */
    static void sayHello(Employee employee){
        /*
        instanceof digunakan untuk mengecek apakah employee benar-benar berasal dari class Employee apa bukan.
         */
        /*
        Ini di letakan di if statement paling atas karena kalau misal ini diletakan di bawah if employee
        instance manager. maka selalu true. karena vice manager merupakan extends dari class manager. sehingga
        if nya akan tidak terbaca
         */
        if (employee instanceof ViceManager){
            /*Code di bawah ini adalah untuk melakukan konversi dari employee ke manager.
            Sebenarnya jika tidak dikonversipun method sudah jadi. tapi apabila ingin dikonversi ke tipe data
            Inheritence.ViceManager.
             */
            ViceManager vicemanager = (ViceManager) employee;
            System.out.println("Hai Vice Inheritence.Manager " + vicemanager.nama);
        }
        else if (employee instanceof Manager){
            /*Code di bawah ini adalah untuk melakukan konversi dari employee ke manager.
            Sebenarnya jika tidak dikonversipun method sudah jadi. tapi apabila ingin dikonversi ke tipe data
            Inheritence.Manager.
             */
            Manager manager = (Manager) employee;
            System.out.println("Hai Inheritence.Manager " + manager.nama);
        }
        //DIBAWAH INI AKAN TIDAK TERBACA KARENA TERTUTUP OLEH IF STATEMENT YANG ATAS
        
//        else if (employee instanceof Inheritence.ViceManager){
//            /*Code di bawah ini adalah untuk melakukan konversi dari employee ke manager.
//            Sebenarnya jika tidak dikonversipun method sudah jadi. tapi apabila ingin dikonversi ke tipe data
//            Inheritence.ViceManager.
//             */
//            Inheritence.ViceManager vicemanager = (Inheritence.ViceManager) employee;
//            System.out.println("Hai Vice Inheritence.Manager " + vicemanager.nama);
//        }
        else {
            System.out.println("Hai " + employee.nama);
        }
    }
}
