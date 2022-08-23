package Six;

public class CustomNullException extends Exception{
    private String num;

    public CustomNullException(String message, String num) {
        super(message);
        this.num = num;
    }

}
