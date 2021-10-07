package AccessModifier.PackageInti;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Macbook Pro",21000000);
        /*
        Bisa mengakses product.nama karena atribut nama di set sebagai protected. tapi kalau di set sebagai
        private, tidak akan bisa di akses.
         */
        System.out.println(product.nama);
        System.out.println(product.price);

        /*
        Ketika kita mengeprint class kita, maka method toString() akan di panggil. Default method to string adalah
        namakelas@stringacak. Jadi ini tidak informatif, maka dari itu kita override agar infonya informatif
         */
        System.out.println(product);
    }
}
