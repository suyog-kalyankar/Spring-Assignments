
import org.springframework.context.annotation.Scope;

/**
 * Created by Suyog Kalyankar on 8/16/2017.
 */

public class Hello
{
    String message;

    public void setMessage(String message)
    {
        this.message = message;
    }

    public void displayMessage()
    {
        System.out.println(this.message);
    }
}