package Inheritence;

public class ManagerApp {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Muhamad Irga KHoirul Mahfis");
//        manager1.name = "Muhamad Irga Khoirul Mahfis";
        ViceManager wakilmanager1 = new ViceManager("Bill Gates");
//        wakilmanager1.name = "Bill Gates";
        manager1.sayHello("Budi");
        wakilmanager1.sayHello("Rudi");
        String jabatanManager = manager1.jabatan();
        String jabatan = wakilmanager1.jabatan();
        //Ketika menggunakan keyword super, maka yang di akses adalah method jabatan yang ada di kelas parrent
        String jabatanParrent = wakilmanager1.getParrentJabatan();

        System.out.println(jabatanManager);
        System.out.println(jabatan);
        System.out.println(jabatanParrent);
        System.out.println(wakilmanager1.getNamaManager());
    }
}
