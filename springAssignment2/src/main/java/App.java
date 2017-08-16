import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Suyog Kalyankar on 8/15/2017.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        Hello hello = (Hello) applicationContext.getBean("hello");
        hello.displayMessage();
    }
}
