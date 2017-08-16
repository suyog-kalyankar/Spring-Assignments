import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Suyog Kalyankar on 8/16/2017.
 */
@Configuration
public class AppConfig {
    @Bean(name = "helloBean")
    public Hello helloBean() {
        return new Hello();
    }
}
