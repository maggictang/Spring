import advice.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static ApplicationContext context;

    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("spring.xml");

        CustomerService customerService = (CustomerService) context.getBean("customerService");
        customerService.printName();
        customerService.printUrl();
        try {
            customerService.printThrowException();
        } catch (Exception e) {

        }

        System.out.println("#####################");

        // 使用了AOP
        CustomerService customerServiceAop = (CustomerService) context.getBean("customerServiceProxy");
        customerServiceAop.printName();
        customerServiceAop.printUrl();
        try {
            customerServiceAop.printThrowException();
        } catch (Exception e) {

        }

    }
}
