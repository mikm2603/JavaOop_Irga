package StaticKeyword;

public class Application {
    public static final int PROCESSORS;
    /*
    Kita bisa membuat static block dalam sebuah class. Static block ini akan di eksekusi sekali sebelum kelas ini di load
     */
    static {
        System.out.println("Mengakses class Aplicaton");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
