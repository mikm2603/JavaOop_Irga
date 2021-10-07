package StaticKeyword;

import StaticKeyword.Util.MathUtil;

//IMPORT STATIC
/*
Untuk memanggil static method, class atau field, kita juga bisa menggunakan import
 */
import static StaticKeyword.Constant.*;

public class StaticApp {
    public static void main(String[] args) {

        //Cara mengakses static field
        /*
        tidak perlu membuat object constant terlebih dahulu, langsung panggil NamaClass.Field.
        Namun jika ingin tetap membuat objectnya juga bisa
         */
        System.out.println(APLICATION);
        //Ketika sudah menggunakan import, kita tidak perlu lagi memanggil Class Constant seperti dibawah ini
        System.out.println(Constant.VERSION);
//        Constant constant = new Constant();
//        System.out.println(constant.APLICATION);


        //Static method, memanggilnya cukup NamaClass.Method
        int StaticMethod = MathUtil.sum(1,2,3,4,5,6,7,8,9);
        System.out.println(StaticMethod);

        //Static inner class
        Country.City city = new Country.City();
        city.setName("Pasir Kidul");
        System.out.println(city.getName());

        //Mengakses static block
        System.out.println(Application.PROCESSORS);
        /*
        otomatis yang ada di static block akan di akses terlebih dahulu sebelum kelasnya di load, sehingga field processors
        sudah terlebih dahulu diisi sebelum class nya di load. sehingga tidak menimbulkan error, mengingat processors adalah
        final field yang harus di tentukan dulu nilainya.
         */
    }
}
