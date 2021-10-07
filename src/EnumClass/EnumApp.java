package EnumClass;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setNama("Irga");
        //Cara menset datanya yaitu dengan NamaClassEnum.Value
        customer.setJenisKelamin(JenisKelamin.LakiLaki);
        customer.setLevel(Level.Premium);

        System.out.println(customer.getNama());
        System.out.println(customer.getJenisKelamin());
        System.out.println(customer.getLevel());
        //Kita bisa menggunakan methodnya dengan tanda .
        System.out.println(customer.getLevel().getDescription());

        //Konversi dari enum ke string, dengan method .name()
        String levelName = Level.Vip.name();
        System.out.println(levelName);
        //Konversi dari String ke enum
        //Nilai yang ada pada valueOf harus ada pada class enum, jika namanya salah maka akan error
        Level level =  Level.valueOf("Premium");
        System.out.println(level);
        //Mengambil semua value pada level
        System.out.println("=====PRINT LEVEL=====");
        for (var value : Level.values()){
            System.out.println(value);
        }
    }
}
