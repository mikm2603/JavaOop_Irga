package AccessModifier.PackageInti;

public class Product {
    /*
    Ini hanya bisa di akses pada package yang sama karena di kasih keyword protected.
    agar class di package lain bisa mengakses product.nama, maka protected di ubah menjadi public
     */
    protected String nama;
    protected int price;
    /*
    Package no modifer/default (tidak ada keyword public, private, atau protected). Contoh :
    Product(String nama, int price){
        this.nama = nama;
        this.price = price;
    }
     */
    //Dikasi keyword public agar bisa di akses pada package yang berbeda
    public Product(String nama, int price){
        this.nama = nama;
        this.price = price;
    }

    //Kita bisa mengoverride method toString agar pada saat kita panggil classnya lebih mudah di baca
    public String toString(){
        return "Product name : " + this.nama + ", Price : "+this.price;
    }

    //Auto override untuk equals() agar lebih benar dalam membandingkan. Klik code->generate->equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        if (price != product.price) return false;
        return nama != null ? nama.equals(product.nama) : product.nama == null;
    }

    @Override
    public int hashCode() {
        int result = nama != null ? nama.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }
}
