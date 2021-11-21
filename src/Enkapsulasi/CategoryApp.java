package Enkapsulasi;

public class CategoryApp {
    public static void main(String[] args) {
        Category category = new Category();
//        System.out.println(category.id); Sudah tidak bisa, harus menggunakan getter
        System.out.println(category.getId());
        System.out.println(category.isElectronic());

//        category.id = "1"; Sudah tidak bisa, harus menggunakan sette
        category.setId("1");
        category.setElectronic(true);
        /*Set data di bawah ini akan di reject, karena sudah ada validasi bahwa setter hanya di lakukan
        ketika datanya masih null;
         */
        category.setId(null);
        //Sehingga ketika di print hasilnya 1
        System.out.println(category.getId());
        System.out.println(category.isElectronic());

        /*
        Konsep ini akan sangat berguna untuk mengamankan system
         */
    }
}
