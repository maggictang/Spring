import advice.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    private static ApplicationContext context;

    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("spring.xml");
        CustomerService customerService = (CustomerService) context.getBean("customerService");
        customerService.printName();

    }
}
