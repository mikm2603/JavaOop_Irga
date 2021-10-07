package AccessModifier.PackageLain;
//Import adalah untuk menggunakan class pada package yang berbeda
//Syaratnya class nya harus public, seperti class Product yang sudah diset sebagai public
import AccessModifier.PackageInti.Product;
//Untuk mengimport semua class pada package tertentu, maka cukup dengan *
//Contoh : import AccessModifier.PackageInti.*;
//Maka otomatis semua class yang ada di package tersebut akan di import

public class ProductApp {
    public static void main(String[] args) {
        /*
        Bisa mengakses constructor pada package yang berbeda karena pada class Product di kasih keyword
        public
         */
        Product product = new Product("Mackbook Pro",21000000);
        /*
        Tidak bisa di akses pada package yang berbeda, karena  di kasih keyword protected yang hanya bisa
        di akses pada package yang sama.
        Kalau ingin mengakses ubah keyword protected pada atribut nama dan price yang ada di class product
        dengan keyword public
        System.out.println(product.name);
        System.out.println(product.price);
        */
    }
}
