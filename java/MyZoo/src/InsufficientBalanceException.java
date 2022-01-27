public class InsufficientBalanceException extends RuntimeException{
    public InsufficientBalanceException(String message) {
        super(message);
    }
    public InsufficientBalanceException(){
        super("We can't make ends meet now.");
    }
}
