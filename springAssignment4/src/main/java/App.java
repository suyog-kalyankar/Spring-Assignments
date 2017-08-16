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

        Hello helloObj = (Hello) context.getBean("hello");

        helloObj.setMessage("Contents of Hello's Singleton bean");
        helloObj.displayMessage();

        Hello helloObject = (Hello) context.getBean("hello");
        helloObject.displayMessage();



    }
}
