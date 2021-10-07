package Exception;

import RecordClass.LoginRequest;

public class ValidationUtil {
    /*
    Kita harus menyebutkan errornya untuk apa, dalam hal ini ditunjukan bahwa errornya untuk class LoginRequest.
    Lalu throws (jenis errornya). Dalam hal ini yaitu ValidationException, ini adalah error untuk validasi
     */
    public static void validate(LoginRequest loginRequest) throws ValidationException,NullPointerException{
        if (loginRequest.username() == null){
            /*
            sama seperti di atas, kita juga harus menggunakan kata kunci throw lalu new NamaClassExceptionnya("message")
             */
            throw new NullPointerException("Username is null");
        }else if(loginRequest.username().isBlank()){
            throw new ValidationException("Username is blank");
        }
        else if (loginRequest.password() == null){
            throw new NullPointerException("Password is null");
        }else if(loginRequest.password().isBlank()){
            throw new ValidationException("Password is blank");
        }
    }
}
