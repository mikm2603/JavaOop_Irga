package Exception;

import RecordClass.LoginRequest;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("irga",null);
        /*
        Method dibawah ini tidak bisa di panggil begitu saja. Karena method dibawah ini bisa menyebabkan error.
        Dan ketika ada method yang seperti dibawah ini, harus dibungkus dengan try catch exception.
        Karena jika tidak dibungkus try cacth, lalu terjadi exception/error, dan tidak di tangkap, maka otomatis
        program akan berhenti.
         */
//        ValidationUtil.validate(loginRequest);
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        }
        /*
        Catch disini memanggil class exception YANG SAMA seperti yang ada dalam class ValidationUtil dalam method
        validate()
         */
        /*
        Kita bisa memanggil 2 Exception Dengan |
        contoh :
        catch (ValidationException | NullPointerException e){
        namun kelemanhannya pesan errornya sama
         */
        catch (ValidationException e){
            /*
            Get message ini diambil dari constructor dari class Throwable, karena dalam class ValidationException yang
            di throws dalam class ValidationUtil ini memanggil constructor dari class Throwable dengan keyword super()
             */
            System.out.println("Data tidak valid : " + e.getMessage());
        } catch (NullPointerException e){
            System.out.println("Data null : " + e.getMessage());
        }
    }
}
