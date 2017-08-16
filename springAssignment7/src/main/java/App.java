import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

/**
 * Created by Suyog Kalyankar on 8/16/2017.
 */

public class App
{
    public static void main(String args[])
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Hello obj1 = (Hello) context.getBean("helloBean");

        obj1.setMessage("Contents of Hello's Prototype bean");
        obj1.displayMessage();

        Hello obj2 = (Hello) context.getBean("helloBean");
        obj2.displayMessage();

    }
}