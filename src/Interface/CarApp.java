package Interface;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        car.setName("Avanza");
        car.setJumlahBan(4);
        car.drive();
        car.getBrand();
        System.out.println(car.getJumlahBan());
    }
}
