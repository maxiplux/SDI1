/**
 * User: franc
 * Date: 11/09/2018
 * Time: 1:57
 */
import cs544.sdi1.Greeting;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new
                ClassPathXmlApplicationContext("springconfig.xml");
        Greeting greetingService =
                context.getBean("greetingService", Greeting.class);
        greetingService.sayHello();
    }
}
