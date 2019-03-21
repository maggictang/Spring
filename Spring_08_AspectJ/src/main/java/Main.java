import aspectj.ICustomerBo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
        ICustomerBo iCustomerBo = (ICustomerBo) appContext.getBean("customerBo");
        iCustomerBo.addCustomer();
        System.out.println("-------------------------");
        iCustomerBo.deleteCustomer();
    }
}
