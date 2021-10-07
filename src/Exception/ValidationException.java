package Exception;

public class ValidationException extends Throwable{
    public ValidationException(String message){
        //Memanggil constructor parrent, untuk melihat ctrl+b
        super(message);
    }
}
