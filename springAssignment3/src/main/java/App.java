/**
 * Created by Suyog Kalyankar on 8/15/2017.
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class App
{
    public static void main(String args[])
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Hello obj = (Hello) context.getBean("helloBean");

        obj.setMessage("Hello World !!!");
        obj.displayMessage();
    }
}
