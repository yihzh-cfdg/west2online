public class AnimalNotFoundException extends RuntimeException{
    public AnimalNotFoundException(String message) {
        super(message);
    }
    public AnimalNotFoundException(){
        super("There is no animal in our zoo.");
    }
}
