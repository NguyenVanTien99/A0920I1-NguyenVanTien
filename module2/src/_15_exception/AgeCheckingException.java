package _15_exception;

public class AgeCheckingException extends Exception{
    public AgeCheckingException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Co loi nhap tuoi: " + super.getMessage();
    }
}
