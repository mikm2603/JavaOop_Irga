package AnonymousClass;

public class HelloWorldApp {
    public static void main(String[] args) {

        /*
        Class HelloWorld di sini bisa dibilang sebagai implementasi dari interface HelloWorld. Jadi secara otomatis ketika kita
        membuat object, kita harus membuat method override yang ada pada interface HelloWorld dan harus public. Jika tidak maka
        akan error
        */
        HelloWorld english = new HelloWorld(){
            public void sayHello(){
                System.out.println("Hello");
            }
            public void sayHello(String name){
                System.out.println("Hello " + name);
            }
        };

        /*
        Kelemahan pada anonymous class adalah jika ingin membuat object baru, maka kita tidak bisa me re usenya. Jadi harus membuat
        ulang seperti contoh dibawah ini
         */
        english.sayHello();
        english.sayHello("Irga");

        HelloWorld indonesia = new HelloWorld(){
            public void sayHello(){
                System.out.println("Halo");
            }
            public void sayHello(String name){
                System.out.println("Halo " + name);
            }
        };
        indonesia.sayHello();
        indonesia.sayHello("Irga");
    }
}
