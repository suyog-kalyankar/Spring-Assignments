import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Suyog Kalyankar on 8/15/2017.
 */
public class App {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");

        Hello hello = (Hello) beanFactory.getBean("HelloBean");
        hello.displayMessage();
    }
}
