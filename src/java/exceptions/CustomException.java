
package exceptions;

/**
 *
 * @author jgc_
 */
public class CustomException extends Exception{
    String message;
    public CustomException(String message){
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }


}
