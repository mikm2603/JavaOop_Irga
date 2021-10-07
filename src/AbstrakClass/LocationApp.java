package AbstrakClass;

public class LocationApp {
    public static void main(String[] args) {
    /*
    Kode di bawah ini akan error, karena Location merupakan class abstract.
    Maka dari itu Location hanya bisa diturunkan, tidak bisa di akses.
     */
    //Location location = new Location(); //Error
        /*
        Namun class childnya tetap bisa di akses
         */
        City city = new City();
        city.name = "Jakarta";
    }
}
