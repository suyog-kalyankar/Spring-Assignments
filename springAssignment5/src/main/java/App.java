import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Suyog Kalyankar on 8/16/2017.
 */

public class App
{
    public static void main(String args[])
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Hello obj = (Hello) context.getBean("hello");
        obj.setMessage("Contents of Hello's Prototype bean");
        obj.displayMessage();

        Hello obj1 = (Hello) context.getBean("hello");
        obj1.displayMessage();





    }
}
